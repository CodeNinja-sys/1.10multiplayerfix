/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.ak;
import com.a.a.b.aw;
import com.a.a.b.bl;
import com.a.a.b.cb;
import com.a.a.b.cn;
import com.a.a.d.abm;
import com.a.a.d.acu;
import com.a.a.d.agi;
import com.a.a.d.bw;
import com.a.a.d.cl;
import com.a.a.d.cm;
import com.a.a.d.jc;
import com.a.a.d.jd;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.nj;
import com.a.a.d.qj;
import com.a.a.d.ql;
import com.a.a.d.ta;
import com.a.a.d.tb;
import com.a.a.d.tc;
import com.a.a.d.td;
import com.a.a.d.te;
import com.a.a.d.tf;
import com.a.a.d.tg;
import com.a.a.d.th;
import com.a.a.d.ti;
import com.a.a.d.tj;
import com.a.a.d.tk;
import com.a.a.d.tl;
import com.a.a.d.tm;
import com.a.a.d.to;
import com.a.a.d.tr;
import com.a.a.d.tv;
import com.a.a.d.tw;
import com.a.a.d.ty;
import com.a.a.d.ud;
import com.a.a.d.uf;
import com.a.a.d.uh;
import com.a.a.d.ul;
import com.a.a.d.um;
import com.a.a.d.uo;
import com.a.a.d.uq;
import com.a.a.d.ur;
import com.a.a.d.ut;
import com.a.a.d.uu;
import com.a.a.d.uv;
import com.a.a.d.uy;
import com.a.a.d.uz;
import com.a.a.d.va;
import com.a.a.d.yd;
import com.a.a.d.yj;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

public final class sz {
    static final cb a = cm.a.c("=");

    private sz() {
    }

    static bl a() {
        return tr.a;
    }

    static bl b() {
        return tr.b;
    }

    static Iterator a(Iterator iterator) {
        return nj.a(iterator, sz.a());
    }

    static Iterator b(Iterator iterator) {
        return nj.a(iterator, sz.b());
    }

    static agi a(agi agi2) {
        return new ta(agi2);
    }

    public static jt a(Map map) {
        if (map instanceof jd) {
            jd jd2 = (jd)map;
            return jd2;
        }
        if (map.isEmpty()) {
            return jt.m();
        }
        for (Map.Entry entry : map.entrySet()) {
            com.a.a.b.cl.a(entry.getKey());
            com.a.a.b.cl.a(entry.getValue());
        }
        return jd.a(new EnumMap(map));
    }

    public static HashMap c() {
        return new HashMap();
    }

    public static HashMap a(int n2) {
        return new HashMap(sz.b(n2));
    }

    static int b(int n2) {
        if (n2 < 3) {
            cl.a(n2, "expectedSize");
            return n2 + 1;
        }
        if (n2 < 0x40000000) {
            return n2 + n2 / 3;
        }
        return Integer.MAX_VALUE;
    }

    public static HashMap b(Map map) {
        return new HashMap(map);
    }

    public static LinkedHashMap d() {
        return new LinkedHashMap();
    }

    public static LinkedHashMap c(Map map) {
        return new LinkedHashMap(map);
    }

    public static ConcurrentMap e() {
        return new ql().e();
    }

    public static TreeMap f() {
        return new TreeMap();
    }

    public static TreeMap a(SortedMap sortedMap) {
        return new TreeMap(sortedMap);
    }

    public static TreeMap a(Comparator comparator) {
        return new TreeMap(comparator);
    }

    public static EnumMap a(Class class_) {
        return new EnumMap((Class)com.a.a.b.cl.a(class_));
    }

    public static EnumMap d(Map map) {
        return new EnumMap(map);
    }

    public static IdentityHashMap g() {
        return new IdentityHashMap();
    }

    public static qj a(Map map, Map map2) {
        if (map instanceof SortedMap) {
            SortedMap sortedMap = (SortedMap)map;
            abm abm2 = sz.a(sortedMap, map2);
            return abm2;
        }
        return sz.a(map, map2, aw.b());
    }

    public static qj a(Map map, Map map2, aw aw2) {
        com.a.a.b.cl.a(aw2);
        HashMap hashMap = sz.c();
        HashMap hashMap2 = new HashMap(map2);
        HashMap hashMap3 = sz.c();
        HashMap hashMap4 = sz.c();
        sz.a(map, map2, aw2, hashMap, hashMap2, hashMap3, hashMap4);
        return new ul(hashMap, hashMap2, hashMap3, hashMap4);
    }

    private static void a(Map map, Map map2, aw aw2, Map map3, Map map4, Map map5, Map map6) {
        for (Map.Entry entry : map.entrySet()) {
            Object k2 = entry.getKey();
            Object v2 = entry.getValue();
            if (map2.containsKey(k2)) {
                Object v3 = map4.remove(k2);
                if (aw2.a(v2, v3)) {
                    map5.put(k2, v2);
                    continue;
                }
                map6.put(k2, va.a(v2, v3));
                continue;
            }
            map3.put(k2, v2);
        }
    }

    private static Map g(Map map) {
        if (map instanceof SortedMap) {
            return Collections.unmodifiableSortedMap((SortedMap)map);
        }
        return Collections.unmodifiableMap(map);
    }

    public static abm a(SortedMap sortedMap, Map map) {
        com.a.a.b.cl.a(sortedMap);
        com.a.a.b.cl.a(map);
        Comparator comparator = sz.b(sortedMap.comparator());
        TreeMap treeMap = sz.a(comparator);
        TreeMap treeMap2 = sz.a(comparator);
        treeMap2.putAll(map);
        TreeMap treeMap3 = sz.a(comparator);
        TreeMap treeMap4 = sz.a(comparator);
        sz.a(sortedMap, map, aw.b(), treeMap, treeMap2, treeMap3, treeMap4);
        return new uq(treeMap, treeMap2, treeMap3, treeMap4);
    }

    static Comparator b(Comparator comparator) {
        if (comparator != null) {
            return comparator;
        }
        return yd.d();
    }

    public static Map a(Set set, bl bl2) {
        if (set instanceof SortedSet) {
            return sz.a((SortedSet)set, bl2);
        }
        return new tm(set, bl2);
    }

    public static SortedMap a(SortedSet sortedSet, bl bl2) {
        return yj.a(sortedSet, bl2);
    }

    static SortedMap b(SortedSet sortedSet, bl bl2) {
        return new uo(sortedSet, bl2);
    }

    public static NavigableMap a(NavigableSet navigableSet, bl bl2) {
        return new um(navigableSet, bl2);
    }

    static Iterator b(Set set, bl bl2) {
        return new td(set.iterator(), bl2);
    }

    private static Set c(Set set) {
        return new te(set);
    }

    private static SortedSet b(SortedSet sortedSet) {
        return new tf(sortedSet);
    }

    private static NavigableSet b(NavigableSet navigableSet) {
        return new tg(navigableSet);
    }

    public static jt a(Iterable iterable, bl bl2) {
        return sz.a(iterable.iterator(), bl2);
    }

    public static jt a(Iterator iterator, bl bl2) {
        com.a.a.b.cl.a(bl2);
        LinkedHashMap linkedHashMap = sz.d();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            linkedHashMap.put(e2, bl2.a(e2));
        }
        return jt.b(linkedHashMap);
    }

    public static jt b(Iterable iterable, bl bl2) {
        return sz.b(iterable.iterator(), bl2);
    }

    public static jt b(Iterator iterator, bl bl2) {
        com.a.a.b.cl.a(bl2);
        ju ju2 = jt.n();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            ju2.b(bl2.a(e2), e2);
        }
        return ju2.b();
    }

    public static jt a(Properties properties) {
        ju ju2 = jt.n();
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            ju2.b(string, properties.getProperty(string));
        }
        return ju2.b();
    }

    public static Map.Entry a(Object object, Object object2) {
        return new jc(object, object2);
    }

    static Set a(Set set) {
        return new uy(Collections.unmodifiableSet(set));
    }

    static Map.Entry a(Map.Entry entry) {
        com.a.a.b.cl.a(entry);
        return new th(entry);
    }

    public static ak a(bw bw2) {
        return new to(bw2);
    }

    public static bw b(bw bw2) {
        return acu.a(bw2, null);
    }

    public static bw c(bw bw2) {
        return new uv(bw2, null);
    }

    public static Map a(Map map, bl bl2) {
        return sz.a(map, sz.a(bl2));
    }

    public static SortedMap a(SortedMap sortedMap, bl bl2) {
        return sz.a(sortedMap, sz.a(bl2));
    }

    public static NavigableMap a(NavigableMap navigableMap, bl bl2) {
        return sz.a(navigableMap, sz.a(bl2));
    }

    public static Map a(Map map, tv tv2) {
        if (map instanceof SortedMap) {
            return sz.a((SortedMap)map, tv2);
        }
        return new ur(map, tv2);
    }

    public static SortedMap a(SortedMap sortedMap, tv tv2) {
        return yj.a(sortedMap, tv2);
    }

    public static NavigableMap a(NavigableMap navigableMap, tv tv2) {
        return new ut(navigableMap, tv2);
    }

    static SortedMap b(SortedMap sortedMap, tv tv2) {
        return new uu(sortedMap, tv2);
    }

    static tv a(bl bl2) {
        com.a.a.b.cl.a(bl2);
        return new ti(bl2);
    }

    static bl a(tv tv2, Object object) {
        com.a.a.b.cl.a(tv2);
        return new tj(tv2, object);
    }

    static bl a(tv tv2) {
        com.a.a.b.cl.a(tv2);
        return new tk(tv2);
    }

    static Map.Entry a(tv tv2, Map.Entry entry) {
        com.a.a.b.cl.a(tv2);
        com.a.a.b.cl.a(entry);
        return new tb(entry, tv2);
    }

    static bl b(tv tv2) {
        com.a.a.b.cl.a(tv2);
        return new tc(tv2);
    }

    static com.a.a.b.cm a(com.a.a.b.cm cm2) {
        return cn.a(cm2, sz.a());
    }

    static com.a.a.b.cm b(com.a.a.b.cm cm2) {
        return cn.a(cm2, sz.b());
    }

    public static Map a(Map map, com.a.a.b.cm cm2) {
        if (map instanceof SortedMap) {
            return sz.a((SortedMap)map, cm2);
        }
        if (map instanceof bw) {
            return sz.a((bw)map, cm2);
        }
        com.a.a.b.cl.a(cm2);
        com.a.a.b.cm cm3 = sz.a(cm2);
        return map instanceof tl ? sz.a((tl)map, cm3) : new uh((Map)com.a.a.b.cl.a(map), cm2, cm3);
    }

    public static SortedMap a(SortedMap sortedMap, com.a.a.b.cm cm2) {
        return sz.c(sortedMap, sz.a(cm2));
    }

    public static NavigableMap a(NavigableMap navigableMap, com.a.a.b.cm cm2) {
        return sz.c(navigableMap, sz.a(cm2));
    }

    public static bw a(bw bw2, com.a.a.b.cm cm2) {
        com.a.a.b.cl.a(cm2);
        return sz.c(bw2, sz.a(cm2));
    }

    public static Map b(Map map, com.a.a.b.cm cm2) {
        if (map instanceof SortedMap) {
            return sz.b((SortedMap)map, cm2);
        }
        if (map instanceof bw) {
            return sz.b((bw)map, cm2);
        }
        return sz.c(map, sz.b(cm2));
    }

    public static SortedMap b(SortedMap sortedMap, com.a.a.b.cm cm2) {
        return sz.c(sortedMap, sz.b(cm2));
    }

    public static NavigableMap b(NavigableMap navigableMap, com.a.a.b.cm cm2) {
        return sz.c(navigableMap, sz.b(cm2));
    }

    public static bw b(bw bw2, com.a.a.b.cm cm2) {
        return sz.c(bw2, sz.b(cm2));
    }

    public static Map c(Map map, com.a.a.b.cm cm2) {
        if (map instanceof SortedMap) {
            return sz.c((SortedMap)map, cm2);
        }
        if (map instanceof bw) {
            return sz.c((bw)map, cm2);
        }
        com.a.a.b.cl.a(cm2);
        return map instanceof tl ? sz.a((tl)map, cm2) : new ty((Map)com.a.a.b.cl.a(map), cm2);
    }

    public static SortedMap c(SortedMap sortedMap, com.a.a.b.cm cm2) {
        return yj.a(sortedMap, cm2);
    }

    static SortedMap d(SortedMap sortedMap, com.a.a.b.cm cm2) {
        com.a.a.b.cl.a(cm2);
        return sortedMap instanceof uf ? sz.a((uf)sortedMap, cm2) : new uf((SortedMap)com.a.a.b.cl.a(sortedMap), cm2);
    }

    public static NavigableMap c(NavigableMap navigableMap, com.a.a.b.cm cm2) {
        com.a.a.b.cl.a(cm2);
        return navigableMap instanceof ud ? sz.a((ud)navigableMap, cm2) : new ud((NavigableMap)com.a.a.b.cl.a(navigableMap), cm2);
    }

    public static bw c(bw bw2, com.a.a.b.cm cm2) {
        com.a.a.b.cl.a(bw2);
        com.a.a.b.cl.a(cm2);
        return bw2 instanceof tw ? sz.a((tw)bw2, cm2) : new tw(bw2, cm2);
    }

    private static Map a(tl tl2, com.a.a.b.cm cm2) {
        return new ty(tl2.a, cn.a(tl2.b, cm2));
    }

    private static SortedMap a(uf uf2, com.a.a.b.cm cm2) {
        com.a.a.b.cm cm3 = cn.a(uf2.b, cm2);
        return new uf(uf2.c(), cm3);
    }

    private static NavigableMap a(ud ud2, com.a.a.b.cm cm2) {
        com.a.a.b.cm cm3 = cn.a(ud.a(ud2), cm2);
        return new ud(ud.b(ud2), cm3);
    }

    private static bw a(tw tw2, com.a.a.b.cm cm2) {
        com.a.a.b.cm cm3 = cn.a(tw2.b, cm2);
        return new tw(tw2.d(), cm3);
    }

    public static NavigableMap a(NavigableMap navigableMap) {
        com.a.a.b.cl.a(navigableMap);
        if (navigableMap instanceof uz) {
            return navigableMap;
        }
        return new uz(navigableMap);
    }

    private static Map.Entry e(Map.Entry entry) {
        return entry == null ? null : sz.a(entry);
    }

    public static NavigableMap b(NavigableMap navigableMap) {
        return acu.a(navigableMap);
    }

    static Object a(Map map, Object object) {
        com.a.a.b.cl.a(map);
        try {
            return map.get(object);
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    static boolean b(Map map, Object object) {
        com.a.a.b.cl.a(map);
        try {
            return map.containsKey(object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    static Object c(Map map, Object object) {
        com.a.a.b.cl.a(map);
        try {
            return map.remove(object);
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    static boolean d(Map map, Object object) {
        return nj.a(sz.a(map.entrySet().iterator()), object);
    }

    static boolean e(Map map, Object object) {
        return nj.a(sz.b(map.entrySet().iterator()), object);
    }

    static boolean a(Collection collection, Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(sz.a((Map.Entry)object));
    }

    static boolean b(Collection collection, Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(sz.a((Map.Entry)object));
    }

    static boolean f(Map map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            Map map2 = (Map)object;
            return map.entrySet().equals(map2.entrySet());
        }
        return false;
    }

    static String e(Map map) {
        StringBuilder stringBuilder = cm.a(map.size()).append('{');
        a.a(stringBuilder, map);
        return stringBuilder.append('}').toString();
    }

    static void b(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static Object b(Map.Entry entry) {
        return entry == null ? null : entry.getKey();
    }

    static Object c(Map.Entry entry) {
        return entry == null ? null : entry.getValue();
    }

    static /* synthetic */ Map f(Map map) {
        return sz.g(map);
    }

    static /* synthetic */ Set b(Set set) {
        return sz.c(set);
    }

    static /* synthetic */ SortedSet a(SortedSet sortedSet) {
        return sz.b(sortedSet);
    }

    static /* synthetic */ NavigableSet a(NavigableSet navigableSet) {
        return sz.b(navigableSet);
    }

    static /* synthetic */ Map.Entry d(Map.Entry entry) {
        return sz.e(entry);
    }
}

