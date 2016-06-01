define("echarts/chart/k", ["require", "../component/base", "./base", "../util/shape/Candle", "../component/axis", "../component/grid", "../component/dataZoom", "../config", "../util/ecData", "zrender/tool/util", "../chart"], function (e) {
    function t(e, t, a, o, s) {
        i.call(this, e, t, a, o, s), n.call(this), this.refresh(o)
    }

    var i = e("../component/base"), n = e("./base"), a = e("../util/shape/Candle");
    e("../component/axis"), e("../component/grid"), e("../component/dataZoom");
    var o = e("../config"), s = e("../util/ecData"), r = e("zrender/tool/util");
    return t.prototype = {
        type: o.CHART_TYPE_K, _buildShape: function () {
            var e = this.series;
            this.selectedMap = {};
            for (var t, i = {
                top: [],
                bottom: []
            }, n = 0, a = e.length; a > n; n++)e[n].type === o.CHART_TYPE_K && (e[n] = this.reformOption(e[n]), this.legendHoverLink = e[n].legendHoverLink || this.legendHoverLink, t = this.component.xAxis.getAxis(e[n].xAxisIndex), t.type === o.COMPONENT_TYPE_AXIS_CATEGORY && i[t.getPosition()].push(n));
            for (var s in i)i[s].length > 0 && this._buildSinglePosition(s, i[s]);
            this.addShapeList()
        }, _buildSinglePosition: function (e, t) {
            var i = this._mapData(t), n = i.locationMap, a = i.maxDataLength;
            if (0 !== a && 0 !== n.length) {
                this._buildHorizontal(t, a, n);
                for (var o = 0, s = t.length; s > o; o++)this.buildMark(t[o])
            }
        }, _mapData: function (e) {
            for (var t, i, n = this.series, a = this.component.legend, o = [], s = 0, r = 0, l = e.length; l > r; r++)t = n[e[r]], i = t.name, this.selectedMap[i] = a ? a.isSelected(i) : !0, this.selectedMap[i] && o.push(e[r]), s = Math.max(s, t.data.length);
            return {locationMap: o, maxDataLength: s}
        }, _buildHorizontal: function (e, t, i) {
            for (var n, a, o, s, r, l, h, d, m, c, p = this.series, u = {}, V = 0, U = i.length; U > V; V++) {
                n = i[V], a = p[n], o = a.xAxisIndex || 0, s = this.component.xAxis.getAxis(o), h = a.barWidth || Math.floor(s.getGap() / 2), c = a.barMaxWidth, c && h > c && (h = c), r = a.yAxisIndex || 0, l = this.component.yAxis.getAxis(r), u[n] = [];
                for (var g = 0, y = t; y > g && null != s.getNameByIndex(g); g++)d = a.data[g], m = null != d ? null != d.value ? d.value : d : "-", "-" !== m && 4 == m.length && u[n].push([s.getCoordByIndex(g), h, l.getCoord(m[0]), l.getCoord(m[1]), l.getCoord(m[2]), l.getCoord(m[3]), g, s.getNameByIndex(g)])
            }
            this._buildKLine(e, u)
        }, _buildKLine: function (e, t) {
            for (var i, n, a, s, r, l, h, d, m, c, p, u, V, U, g, y, f, _ = this.series, b = 0, x = e.length; x > b; b++)if (f = e[b], p = _[f], U = t[f], this._isLarge(U) && (U = this._getLargePointList(U)), p.type === o.CHART_TYPE_K && null != U) {
                u = p, i = this.query(u, "itemStyle.normal.lineStyle.width"), n = this.query(u, "itemStyle.normal.lineStyle.color"), a = this.query(u, "itemStyle.normal.lineStyle.color0"), s = this.query(u, "itemStyle.normal.color"), r = this.query(u, "itemStyle.normal.color0"), l = this.query(u, "itemStyle.emphasis.lineStyle.width"), h = this.query(u, "itemStyle.emphasis.lineStyle.color"), d = this.query(u, "itemStyle.emphasis.lineStyle.color0"), m = this.query(u, "itemStyle.emphasis.color"), c = this.query(u, "itemStyle.emphasis.color0");
                for (var k = 0, L = U.length; L > k; k++)g = U[k], V = p.data[g[6]], u = V, y = g[3] < g[2], this.shapeList.push(this._getCandle(f, g[6], g[7], g[0], g[1], g[2], g[3], g[4], g[5], y ? this.query(u, "itemStyle.normal.color") || s : this.query(u, "itemStyle.normal.color0") || r, this.query(u, "itemStyle.normal.lineStyle.width") || i, y ? this.query(u, "itemStyle.normal.lineStyle.color") || n : this.query(u, "itemStyle.normal.lineStyle.color0") || a, y ? this.query(u, "itemStyle.emphasis.color") || m || s : this.query(u, "itemStyle.emphasis.color0") || c || r, this.query(u, "itemStyle.emphasis.lineStyle.width") || l || i, y ? this.query(u, "itemStyle.emphasis.lineStyle.color") || h || n : this.query(u, "itemStyle.emphasis.lineStyle.color0") || d || a))
            }
        }, _isLarge: function (e) {
            return e[0][1] < .5
        }, _getLargePointList: function (e) {
            for (var t = this.component.grid.getWidth(), i = e.length, n = [], a = 0; t > a; a++)n[a] = e[Math.floor(i / t * a)];
            return n
        }, _getCandle: function (e, t, i, n, o, r, l, h, d, m, c, p, u, V, U) {
            var g = this.series, y = {
                zlevel: this._zlevelBase,
                clickable: this.deepQuery([g[e].data[t], g[e]], "clickable"),
                style: {x: n, y: [r, l, h, d], width: o, color: m, strokeColor: p, lineWidth: c, brushType: "both"},
                highlightStyle: {color: u, strokeColor: U, lineWidth: V},
                _seriesIndex: e
            };
            return s.pack(y, g[e], e, g[e].data[t], t, i), y = new a(y)
        }, getMarkCoord: function (e, t) {
            var i = this.series[e], n = this.component.xAxis.getAxis(i.xAxisIndex), a = this.component.yAxis.getAxis(i.yAxisIndex);
            return ["string" != typeof t.xAxis && n.getCoordByIndex ? n.getCoordByIndex(t.xAxis || 0) : n.getCoord(t.xAxis || 0), "string" != typeof t.yAxis && a.getCoordByIndex ? a.getCoordByIndex(t.yAxis || 0) : a.getCoord(t.yAxis || 0)]
        }, refresh: function (e) {
            e && (this.option = e, this.series = e.series), this.backupShapeList(), this._buildShape()
        }, addDataAnimation: function (e) {
            for (var t = this.series, i = {}, n = 0, a = e.length; a > n; n++)i[e[n][0]] = e[n];
            for (var o, r, l, h, d, m, n = 0, a = this.shapeList.length; a > n; n++)if (d = this.shapeList[n]._seriesIndex, i[d] && !i[d][3] && "candle" === this.shapeList[n].type) {
                if (m = s.get(this.shapeList[n], "dataIndex"), h = t[d], i[d][2] && m === h.data.length - 1) {
                    this.zr.delShape(this.shapeList[n].id);
                    continue
                }
                if (!i[d][2] && 0 === m) {
                    this.zr.delShape(this.shapeList[n].id);
                    continue
                }
                r = this.component.xAxis.getAxis(h.xAxisIndex || 0).getGap(), o = i[d][2] ? r : -r, l = 0, this.zr.animate(this.shapeList[n].id, "").when(500, {position: [o, l]}).start()
            }
        }
    }, r.inherits(t, n), r.inherits(t, i), e("../chart").define("k", t), t
});