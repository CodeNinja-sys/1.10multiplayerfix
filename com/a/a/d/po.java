/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.bw;
import com.a.a.d.ou;
import com.a.a.d.ov;
import com.a.a.d.pn;
import com.a.a.d.pp;
import com.a.a.d.pq;
import com.a.a.d.ps;
import com.a.a.d.pw;
import com.a.a.d.px;
import com.a.a.d.pz;
import com.a.a.d.qa;
import com.a.a.d.qb;
import com.a.a.d.qc;
import com.a.a.d.qf;
import com.a.a.d.qg;
import com.a.a.d.qi;
import com.a.a.d.vi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class po {
    private po() {
    }

    public static pn a() {
        return qi.a;
    }

    public static Map a(Map map, pn pn2) {
        return new qb(map, pn2);
    }

    public static vi a(vi vi2, pn pn2) {
        return new qc(vi2, pn2);
    }

    public static ou a(ou ou2, pn pn2) {
        return new qa(ou2, pn2);
    }

    public static aac a(aac aac2, pn pn2) {
        return new qf(aac2, pn2);
    }

    public static abs a(abs abs2, pn pn2) {
        return new qg(abs2, pn2);
    }

    private static Map.Entry c(Map.Entry entry, pn pn2) {
        cl.a(entry);
        cl.a(pn2);
        return new pp(entry, pn2);
    }

    private static Map.Entry d(Map.Entry entry, pn pn2) {
        cl.a(entry);
        cl.a(pn2);
        return new pq(entry, pn2);
    }

    private static Set c(Set set, pn pn2) {
        return new ps(set, pn2);
    }

    private static Collection b(Collection collection, pn pn2) {
        if (collection instanceof Set) {
            return po.d((Set)collection, pn2);
        }
        return new px(collection, pn2);
    }

    private static Set d(Set set, pn pn2) {
        return new pz(set, pn2);
    }

    public static bw a(bw bw2, pn pn2) {
        return new pw(bw2, null, pn2);
    }

    private static Collection b(Object object, Iterable iterable, pn pn2) {
        ArrayList arrayList = ov.a(iterable);
        for (Object e2 : arrayList) {
            pn2.a(object, e2);
        }
        return arrayList;
    }

    private static Map c(Map map, pn pn2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            pn2.a(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    static /* synthetic */ Set a(Set set, pn pn2) {
        return po.d(set, pn2);
    }

    static /* synthetic */ Map b(Map map, pn pn2) {
        return po.c(map, pn2);
    }

    static /* synthetic */ Set b(Set set, pn pn2) {
        return po.c(set, pn2);
    }

    static /* synthetic */ Collection a(Collection collection, pn pn2) {
        return po.b(collection, pn2);
    }

    static /* synthetic */ Collection a(Object object, Iterable iterable, pn pn2) {
        return po.b(object, iterable, pn2);
    }

    static /* synthetic */ Map.Entry a(Map.Entry entry, pn pn2) {
        return po.c(entry, pn2);
    }

    static /* synthetic */ Map.Entry b(Map.Entry entry, pn pn2) {
        return po.d(entry, pn2);
    }
}

