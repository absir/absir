/**
 * Copyright 2013 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2013-6-24 上午11:08:07
 */
package com.absir.aserv.system.helper;

import com.absir.core.base.IBase;
import com.absir.core.dyna.DynaBinder;
import com.absir.core.kernel.KernelLang.BreakException;
import com.absir.core.kernel.KernelLang.FilterTemplate;
import com.absir.core.kernel.KernelString;
import com.absir.core.kernel.KernelString.ImplodeBuilder;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings({"rawtypes", "unchecked"})
public class HelperString extends StringUtils {

    public static final FilterTemplate<Entry<Object, Integer>> NUMBER_FILTER_TEMPLATE = new FilterTemplate<Entry<Object, Integer>>() {

        @Override
        public boolean doWith(Entry<Object, Integer> template) throws BreakException {
            return template.getValue() == null || template.getValue() <= 0;
        }

    };

    private static final ImplodeBuilder PARAM_MAP_IMPLODE_BUILDER = new ImplodeBuilder() {

        @Override
        public Object glue(StringBuilder builder, Object glue, int index, Object value, Object target) {
            if (index == 0 && value != null && value instanceof IBase) {
                value = ((IBase) value).getId();
            }

            return value;
        }
    };

    public static String paramMap(Map<?, ?> paramMap) {
        if (paramMap == null) {
            return null;
        }

        return KernelString.implode(paramMap, PARAM_MAP_IMPLODE_BUILDER, null, ",");
    }

    public static <K, V> LinkedHashMap<K, V> paramMap(String str, Class<K> keyClass, Class<V> valueClass) {
        if (str == null) {
            return null;
        }

        String[] paramArray = HelperString.split(str, ',');
        LinkedHashMap<K, V> paramMap = new LinkedHashMap<K, V>();
        int length = paramArray.length;
        for (int i = 1; i < length; i += 2) {
            K key = DynaBinder.to(paramArray[i - 1], keyClass);
            if (key != null) {
                V val = DynaBinder.to(paramArray[i], valueClass);
                if (val != null) {
                    paramMap.put(key, val);
                }
            }
        }

        return paramMap;
    }

    public static <ID extends Serializable, K extends IBase<ID>, V> Map<ID, V> paramIdMap(String str, Class<K> keyClass, Class<V> valueClass, Map<ID, V> paramIdMap,
                                                                                          FilterTemplate<Entry<K, V>> filterTemplate) {
        if (str == null) {
            return null;
        }

        Map<K, V> paramMap = paramMap(str, keyClass, valueClass);
        if (paramIdMap == null) {
            paramIdMap = new LinkedHashMap<ID, V>();
        }

        try {
            for (Entry<K, V> entry : paramMap.entrySet()) {
                if (filterTemplate == null || !filterTemplate.doWith(entry)) {
                    paramIdMap.put(entry.getKey().getId(), entry.getValue());
                }
            }

        } catch (BreakException e) {
        }

        return paramIdMap;
    }

    public static <K extends IBase, M extends Map<? extends Serializable, Integer>> M paramIdNumberMap(String str, Class<K> keyClass, M paramIdMap) {
        return (M) paramIdMap(str, keyClass, Integer.class, (Map<Serializable, Integer>) paramIdMap, (FilterTemplate<Entry<K, Integer>>) (Object) NUMBER_FILTER_TEMPLATE);
    }
}
