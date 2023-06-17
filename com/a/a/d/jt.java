/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.it;
import com.a.a.d.iz;
import com.a.a.d.jd;
import com.a.a.d.ju;
import com.a.a.d.jv;
import com.a.a.d.jz;
import com.a.a.d.kb;
import com.a.a.d.ke;
import com.a.a.d.kh;
import com.a.a.d.lo;
import com.a.a.d.lr;
import com.a.a.d.lw;
import com.a.a.d.sz;
import com.a.a.d.zf;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public abstract class jt
implements Serializable,
Map {
    private static final Map.Entry[] a = new Map.Entry[0];
    private transient lo b;
    private transient lo c;
    private transient iz d;
    private transient lr e;

    public static jt m() {
        return it.i();
    }

    public static jt c(Object object, Object object2) {
        return it.b(object, object2);
    }

    public static jt b(Object object, Object object2, Object object3, Object object4) {
        return new zf(jt.d(object, object2), jt.d(object3, object4));
    }

    public static jt b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return new zf(jt.d(object, object2), jt.d(object3, object4), jt.d(object5, object6));
    }

    public static jt b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return new zf(jt.d(object, object2), jt.d(object3, object4), jt.d(object5, object6), jt.d(object7, object8));
    }

    public static jt b(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return new zf(jt.d(object, object2), jt.d(object3, object4), jt.d(object5, object6), jt.d(object7, object8), jt.d(object9, object10));
    }

    static kb d(Object object, Object object2) {
        cl.a(object, object2);
        return new kb(object, object2);
    }

    public static ju n() {
        return new ju();
    }

    static void a(boolean bl2, String string, Map.Entry entry, Map.Entry entry2) {
        if (!bl2) {
            throw new IllegalArgumentException("Multiple entries with same " + string + ": " + entry + " and " + entry2);
        }
    }

    public static jt b(Map map) {
        Map.Entry[] arrentry;
        if (map instanceof jt && !(map instanceof lw)) {
            arrentry = (Map.Entry[])map;
            if (!arrentry.b()) {
                return arrentry;
            }
        } else if (map instanceof EnumMap) {
            return jt.a(map);
        }
        arrentry = map.entrySet().toArray(a);
        switch (arrentry.length) {
            case 0: {
                return jt.m();
            }
            case 1: {
                Map.Entry entry = arrentry[0];
                return jt.c(entry.getKey(), entry.getValue());
            }
        }
        return new zf(arrentry);
    }

    private static jt a(Map map) {
        return jt.c((EnumMap)map);
    }

    private static jt c(Map map) {
        EnumMap enumMap = new EnumMap(map);
        for (Map.Entry entry : enumMap.entrySet()) {
            cl.a(entry.getKey(), entry.getValue());
        }
        return jd.a(enumMap);
    }

    jt() {
    }

    public final Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.aU_().contains(object);
    }

    public abstract Object get(Object var1);

    public lo e() {
        lo lo2 = this.b;
        return lo2 == null ? (this.b = this.d()) : lo2;
    }

    abstract lo d();

    public lo g() {
        lo lo2 = this.c;
        return lo2 == null ? (this.c = this.aV_()) : lo2;
    }

    lo aV_() {
        return new ke(this);
    }

    public iz aU_() {
        iz iz2 = this.d;
        return iz2 == null ? (this.d = new kh(this)) : iz2;
    }

    public lr f() {
        lr lr2 = this.e;
        return lr2 == null ? (this.e = this.a()) : lr2;
    }

    private lr a() {
        jt jt2 = this.i();
        return new lr(jt2, jt2.size(), null);
    }

    private jt i() {
        return new jv(this);
    }

    @Override
    public boolean equals(Object object) {
        return sz.f(this, object);
    }

    abstract boolean b();

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    public String toString() {
        return sz.e(this);
    }

    Object l() {
        return new jz(this);
    }

    public /* synthetic */ Set entrySet() {
        return this.e();
    }

    public /* synthetic */ Collection values() {
        return this.aU_();
    }

    public /* synthetic */ Set keySet() {
        return this.g();
    }
}

