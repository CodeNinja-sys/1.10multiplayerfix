/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aau;
import com.a.a.d.bw;
import com.a.a.d.ew;
import com.a.a.d.iu;
import com.a.a.d.iv;
import com.a.a.d.iz;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.yx;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class it
extends jt
implements bw {
    private static final Map.Entry[] a = new Map.Entry[0];

    public static it i() {
        return ew.a;
    }

    public static it b(Object object, Object object2) {
        return new aau(object, object2);
    }

    public static it a(Object object, Object object2, Object object3, Object object4) {
        return new yx(it.d(object, object2), it.d(object3, object4));
    }

    public static it a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return new yx(it.d(object, object2), it.d(object3, object4), it.d(object5, object6));
    }

    public static it a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return new yx(it.d(object, object2), it.d(object3, object4), it.d(object5, object6), it.d(object7, object8));
    }

    public static it a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return new yx(it.d(object, object2), it.d(object3, object4), it.d(object5, object6), it.d(object7, object8), it.d(object9, object10));
    }

    public static iu j() {
        return new iu();
    }

    public static it a(Map map) {
        Map.Entry[] arrentry;
        if (map instanceof it && !(arrentry = (Map.Entry[])map).b()) {
            return arrentry;
        }
        arrentry = map.entrySet().toArray(a);
        switch (arrentry.length) {
            case 0: {
                return it.i();
            }
            case 1: {
                Map.Entry entry = arrentry[0];
                return it.b(entry.getKey(), entry.getValue());
            }
        }
        return new yx(arrentry);
    }

    it() {
    }

    public abstract it a();

    public lo k() {
        return this.a().g();
    }

    @Override
    public Object a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    Object l() {
        return new iv(this);
    }

    @Override
    public /* synthetic */ iz aU_() {
        return this.k();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.k();
    }

    @Override
    public /* synthetic */ bw aT_() {
        return this.a();
    }

    @Override
    public /* synthetic */ Set c() {
        return this.k();
    }
}

