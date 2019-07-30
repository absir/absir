/**
 * Copyright 2013 ABSir's Studio
 * <p/>
 * All right reserved
 * <p/>
 * Create on 2013-3-5 下午2:31:23
 */
package com.absir.core.kernel;

import com.absir.core.util.UtilAbsir;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class KernelDyna {

    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);

    public static final Short SHORT_ZERO = Short.valueOf((short) 0);

    public static final Integer INTEGER_ZERO = Integer.valueOf((int) 0);

    public static final Integer INTEGER_ONE = Integer.valueOf((int) 1);

    public static final Long LONG_ZERO = Long.valueOf((long) 0);

    public static final Float FLOAT_ZERO = Float.valueOf((float) 0);

    public static final Double DOUBLE_ZERO = Double.valueOf((double) 0);

    public static final Boolean BOOLEAN_ZERO = Boolean.valueOf(false);

    public static final Character CHARACTER_ZERO = Character.valueOf((char) 0);

    public static final Date DATE_ZERO = new Date((long) 0);

    protected static final char[] DATE_CHARS = "-: /".toCharArray();

    private static final Map<String, DateFormat> dateFormatMap = new HashMap<String, DateFormat>();

    public static final DateFormat DATE_FORMAT = getSimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final DateFormat DATE_FORMAT_DAY = getSimpleDateFormat("yyyy-MM-dd");

    public static final DateFormat DATE_FORMAT_TIME = getSimpleDateFormat("HH:mm:ss");

    public static final DateFormat[] DATE_FORMAT_ARRAY = new DateFormat[]{DATE_FORMAT, DATE_FORMAT_DAY, DATE_FORMAT_TIME, DateFormat.getDateTimeInstance(),
            DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG), DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM),
            getSimpleDateFormat("EEE MMM d hh:mm:ss a z yyyy"), getSimpleDateFormat("EEE MMM d HH:mm:ss z yyyy"), getSimpleDateFormat("MM/dd/yy hh:mm:ss a"), getSimpleDateFormat("MM/dd/yy")};

    public static DateFormat getSimpleDateFormat(String dateFormat) {
        if (KernelString.isEmpty(dateFormat)) {
            dateFormat = "yyyy-MM-dd HH:mm:ss";
        }

        DateFormat format = dateFormatMap.get(dateFormat);
        if (format == null) {
            format = new SimpleDateFormat(dateFormat);
            dateFormatMap.put(dateFormat, format);
        }

        return format;
    }

    public static <T> T to(Object obj, Class<T> toClass) {
        if (obj == null) {
            return nullTo(toClass);
        }

        if (toClass.isAssignableFrom(obj.getClass())) {
            return (T) obj;
        }

        if (obj instanceof Number) {
            return numberTo((Number) obj, toClass);

        } else if (obj instanceof Date) {
            return dateTo((Date) obj, toClass);

        } else if (obj instanceof Enum) {
            return enumTo((Enum) obj, toClass);

        } else if (obj instanceof Boolean) {
            return boolTo((Boolean) obj, toClass);

        } else if (obj instanceof String) {
            return stringTo((String) obj, toClass);

        }

        return nullTo(toClass);
    }

    public static <T> T nullTo(Class<T> toClass) {
        if (toClass == byte.class) {
            return (T) BYTE_ZERO;

        } else if (toClass == short.class) {
            return (T) SHORT_ZERO;

        } else if (toClass == int.class) {
            return (T) INTEGER_ZERO;

        } else if (toClass == long.class) {
            return (T) LONG_ZERO;

        } else if (toClass == float.class) {
            return (T) FLOAT_ZERO;

        } else if (toClass == double.class) {
            return (T) DOUBLE_ZERO;

        } else if (toClass == boolean.class) {
            return (T) BOOLEAN_ZERO;

        } else if (toClass == char.class) {
            return (T) CHARACTER_ZERO;
        }

        return null;
    }

    public static <T> T numberTo(Number num, Class<T> toClass) {
        if (toClass == Byte.class || toClass == byte.class) {
            return (T) (Object) num.byteValue();

        } else if (toClass == Short.class || toClass == short.class) {
            return (T) (Object) num.shortValue();

        } else if (toClass == Integer.class || toClass == int.class) {
            return (T) (Object) num.intValue();

        } else if (toClass == Long.class || toClass == long.class) {
            return (T) (Object) num.longValue();

        } else if (toClass == Float.class || toClass == float.class) {
            return (T) (Object) num.floatValue();

        } else if (toClass == Double.class || toClass == double.class) {
            return (T) (Object) num.doubleValue();

        } else if (toClass == Boolean.class || toClass == boolean.class) {
            return (T) (Object) (num.byteValue() != 0);

        } else if (toClass == Character.class || toClass == char.class) {
            return (T) (Object) (char) num.byteValue();

        } else if (toClass == Date.class) {
            return (T) new Date(num.getClass() == Integer.class ? num.longValue() * 1000 : num.longValue());

        } else if (toClass.isAssignableFrom(String.class)) {
            return (T) num.toString();

        } else if (Enum.class.isAssignableFrom(toClass)) {
            return (T) toEnum(num, (Class<? extends Enum>) toClass);

        } else if (toClass == BigInteger.class) {
            return (T) BigInteger.valueOf(num.longValue());
        }

        return null;
    }

    public static <T> T dateTo(Date date, Class<T> toClass) {
        if (toClass == Byte.class || toClass == byte.class) {
            return (T) (Object) ((Long) date.getTime()).byteValue();

        } else if (toClass == Short.class || toClass == short.class) {
            return (T) (Object) ((Long) date.getTime()).shortValue();

        } else if (toClass == Integer.class || toClass == int.class) {
            return (T) (Object) ((int) (date.getTime() / 1000));

        } else if (toClass == Long.class || toClass == long.class) {
            return (T) (Object) date.getTime();

        } else if (toClass == Float.class || toClass == float.class) {
            return (T) (Object) ((Long) date.getTime()).floatValue();

        } else if (toClass == Double.class || toClass == double.class) {
            return (T) (Object) ((Long) date.getTime()).doubleValue();

        } else if (toClass == Boolean.class || toClass == boolean.class) {
            return (T) (Object) (((Long) date.getTime()).byteValue() != 0);

        } else if (toClass == Character.class || toClass == char.class) {
            return (T) (Object) (char) ((Long) date.getTime()).byteValue();

        } else if (toClass.isAssignableFrom(String.class)) {
            return (T) toString(date);

        } else if (toClass == BigInteger.class) {
            return (T) BigInteger.valueOf(date.getTime());
        }

        return null;
    }

    public static <T> T enumTo(Enum em, Class<T> toClass) {
        if (toClass == Byte.class || toClass == byte.class) {
            return (T) (Object) ((Integer) em.ordinal()).byteValue();

        } else if (toClass == Short.class || toClass == short.class) {
            return (T) (Object) ((Integer) em.ordinal()).shortValue();

        } else if (toClass == Integer.class || toClass == int.class) {
            return (T) (Object) em.ordinal();

        } else if (toClass == Long.class || toClass == long.class) {
            return (T) (Object) ((Integer) em.ordinal()).longValue();

        } else if (toClass == Float.class || toClass == float.class) {
            return (T) (Object) ((Integer) em.ordinal()).floatValue();

        } else if (toClass == Double.class || toClass == double.class) {
            return (T) (Object) ((Integer) em.ordinal()).doubleValue();

        } else if (toClass == Boolean.class || toClass == boolean.class) {
            return (T) (Object) (((Integer) em.ordinal()).byteValue() != 0);

        } else if (toClass == Character.class || toClass == char.class) {
            return (T) (Object) (char) ((Integer) em.ordinal()).byteValue();

        } else if (toClass.isAssignableFrom(String.class)) {
            return (T) toString(em);

        } else if (toClass == BigInteger.class) {
            return (T) BigInteger.valueOf(em.ordinal());
        }

        return null;
    }

    public static <T> T boolTo(Boolean bool, Class<T> toClass) {
        if (toClass == boolean.class) {
            return (T) (Object) (KernelLang.isBoolean(bool) ? Boolean.TRUE : Boolean.FALSE);
        }

        return numberTo(KernelLang.isBoolean(bool) ? INTEGER_ONE : INTEGER_ZERO, toClass);
    }

    public static String toString(Date date) {
        return toString(date, 0);
    }

    public static String toString(Date date, int type) {
        try {
            return DATE_FORMAT_ARRAY[type].format(date);

        } catch (Exception e) {
            return null;
        }
    }

    public static String toString(Enum em) {
        return em.name();
    }

    public static <T> T stringTo(String str, Class<T> toClass) {
        if (KernelString.empty(str)) {
            return nullTo(toClass);
        }

        return stringTo(str, toClass, null);
    }

    public static Object stringNull(String str, Class<?> toClass) {
        if (toClass == byte.class) {
            return toByte(str, null);

        } else if (toClass == short.class) {
            return toShort(str, null);

        } else if (toClass == int.class) {
            return toInteger(str, null);

        } else if (toClass == long.class) {
            return toLong(str, null);

        } else if (toClass == float.class) {
            return toFloat(str, null);

        } else if (toClass == double.class) {
            return toDouble(str, null);

        } else if (toClass == boolean.class) {
            return toBoolean(str, null);

        } else if (toClass == char.class) {
            return toCharacter(str, null);
        }

        return stringTo(str, toClass);
    }

    public static final boolean[] DYNAS_NULL = new boolean[]{};

    public static <T> T stringTo(String str, Class<T> toClass, boolean[] dynas) {
        if (toClass == byte.class) {
            return (T) toByte(str);

        } else if (toClass == Byte.class) {
            return (T) toByte(str, null);

        } else if (toClass == short.class) {
            return (T) toShort(str);

        } else if (toClass == Short.class) {
            return (T) toShort(str, null);

        } else if (toClass == int.class) {
            return (T) toInteger(str);

        } else if (toClass == Integer.class) {
            return (T) toInteger(str, null);

        } else if (toClass == long.class) {
            return (T) toLong(str);

        } else if (toClass == Long.class) {
            return (T) toLong(str, null);

        } else if (toClass == float.class) {
            return (T) toFloat(str);

        } else if (toClass == Float.class) {
            return (T) toFloat(str, null);

        } else if (toClass == double.class) {
            return (T) toDouble(str);

        } else if (toClass == Double.class) {
            return (T) toDouble(str, null);

        } else if (toClass == boolean.class) {
            return (T) toBoolean(str);

        } else if (toClass == Boolean.class) {
            return (T) toBoolean(str, null);

        } else if (toClass == char.class) {
            return (T) toCharacter(str);

        } else if (toClass == Character.class) {
            return (T) toBoolean(str, null);

        } else if (toClass == Date.class) {
            return (T) toDate(str, DATE_ZERO);

        } else if (toClass == Class.class) {
            return (T) KernelClass.forName(str);

        } else if (toClass.isEnum()) {
            return (T) toEnum(str, (Class<? extends Enum>) toClass);

        } else if (toClass == BigInteger.class) {
            return (T) toBigInteger(str, null);
        }

        if (dynas == DYNAS_NULL) {
            return (T) KernelLang.NULL_OBJECT;
        }

        if (dynas != null && dynas.length > 0) {
            dynas[0] = !dynas[0];
        }

        return null;
    }

    public static Byte toByte(String str) {
        return toByte(str, BYTE_ZERO);
    }

    public static Byte toByte(String str, Byte defaultValue) {
        try {
            return Byte.valueOf(str);

        } catch (Exception e) {
            try {
                return Float.valueOf(str).byteValue();

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Short toShort(String str) {
        return toShort(str, SHORT_ZERO);
    }

    public static Short toShort(String str, Short defaultValue) {
        try {
            return Short.valueOf(str);

        } catch (Exception e) {
            try {
                return Float.valueOf(str).shortValue();

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Integer toInteger(String str) {
        return toInteger(str, INTEGER_ZERO);
    }

    public static Integer toInteger(String str, Integer defaultValue) {
        str = str.trim();
        if (KernelString.indexOf(str, DATE_CHARS) > 0) {
            Date date = toDate(str);
            return date == null ? 0 : UtilAbsir.shortTime(date.getTime());
        }

        try {
            return Integer.valueOf(str);

        } catch (Exception e) {
            try {
                return Float.valueOf(str).intValue();

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Long toLong(String str) {
        return toLong(str, LONG_ZERO);
    }

    public static Long toLong(String str, Long defaultValue) {
        str = str.trim();
        if (KernelString.indexOf(str, DATE_CHARS) > 0) {
            Date date = toDate(str);
            return date == null ? 0 : date.getTime();
        }

        try {
            return Long.valueOf(str);

        } catch (Exception e) {
            try {
                return Float.valueOf(str).longValue();

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Float toFloat(String str) {
        return toFloat(str, FLOAT_ZERO);
    }

    public static Float toFloat(String str, Float defaultValue) {
        try {
            return Float.valueOf(str);

        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static Double toDouble(String str) {
        return toDouble(str, DOUBLE_ZERO);
    }

    public static Double toDouble(String str, Double defaultValue) {
        try {
            return Double.valueOf(str);

        } catch (Exception e) {
            return defaultValue;
        }
    }

    public static Boolean toBoolean(String str) {
        return toBoolean(str, BOOLEAN_ZERO);
    }

    public static Boolean toBoolean(String str, Boolean defaultValue) {
        try {
            return Float.valueOf(str).floatValue() != 0;

        } catch (Exception e) {
            try {
                return Boolean.valueOf(str);

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Character toCharacter(String str) {
        return toCharacter(str, CHARACTER_ZERO);
    }

    public static Character toCharacter(String str, Character defaultValue) {
        try {
            return Character.valueOf(str.charAt(0));

        } catch (Exception e) {
            try {
                return (char) Float.valueOf(str).floatValue();

            } catch (Exception ex) {
                return defaultValue;
            }
        }
    }

    public static Date toDate(Object obj) {
        return to(obj, Date.class);
    }

    public static Date toDate(String str) {
        return toDate(str, DATE_ZERO);
    }

    public static Date toDate(String str, Date defaultValue) {
        for (DateFormat dateFormat : DATE_FORMAT_ARRAY) {
            try {
                return dateFormat.parse(str);

            } catch (Exception e) {
            }
        }

        try {
            return new Date(Float.valueOf(str).longValue());

        } catch (Exception ex) {
            return defaultValue;
        }
    }

    public static Enum toEnum(String str, Class<? extends Enum> enumType) {
        try {
            return Enum.valueOf(enumType, str);

        } catch (Exception e) {
            try {
                if (IEnum.class.isAssignableFrom(enumType)) {
                    Object[] enums = enumType.getEnumConstants();
                    if (enums.length > 0) {
                        return ((IEnum) (enums[0])).fromId(str);
                    }

                    return null;
                }

                return toEnum(Float.valueOf(str), enumType);

            } catch (Exception ex) {
                return null;
            }
        }
    }

    public interface IEnum {

        Enum fromId(String id);
    }

    public static Enum toEnum(Number num, Class<? extends Enum> enumType) {
        try {
            return enumType.getEnumConstants()[num.intValue()];

        } catch (Exception e) {
            return null;
        }
    }

    public static BigInteger toBigInteger(String str, BigInteger defaultValue) {
        try {
            return new BigInteger(str);

        } catch (Exception e) {
            return defaultValue;
        }
    }
}
