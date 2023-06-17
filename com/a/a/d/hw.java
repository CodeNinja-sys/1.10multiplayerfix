/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abx;
import com.a.a.d.adv;
import com.a.a.d.cl;
import com.a.a.d.hx;
import com.a.a.d.sz;
import java.util.HashMap;
import java.util.Map;

public class hw
extends abx {
    private static final long c = 0L;

    public static hw k() {
        return new hw(new HashMap(), new hx(0));
    }

    public static hw a(int n2, int n3) {
        cl.a(n3, "expectedCellsPerRow");
        HashMap hashMap = sz.a(n2);
        return new hw((Map)hashMap, new hx(n3));
    }

    public static hw b(adv adv2) {
        hw hw2 = hw.k();
        hw2.a(adv2);
        return hw2;
    }

    hw(Map map, hx hx2) {
        super(map, hx2);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return super.a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        return super.b(object);
    }

    @Override
    public boolean a(Object object) {
        return super.a(object);
    }

    @Override
    public boolean c(Object object) {
        return super.c(object);
    }

    @Override
    public Object b(Object object, Object object2) {
        return super.b(object, object2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public Object c(Object object, Object object2) {
        return super.c(object, object2);
    }
}

