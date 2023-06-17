/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.vi;
import com.a.a.d.vk;
import com.a.a.d.vl;
import com.a.a.d.vm;
import com.a.a.d.vn;
import com.a.a.d.vu;
import com.a.a.d.yd;
import java.util.Comparator;

public abstract class vj {
    private static final int a = 8;

    private vj() {
    }

    public static vu a() {
        return vj.a(8);
    }

    public static vu a(int n2) {
        cl.a(n2, "expectedKeys");
        return new vk(n2);
    }

    public static vu b() {
        return vj.b(8);
    }

    public static vu b(int n2) {
        cl.a(n2, "expectedKeys");
        return new vl(n2);
    }

    public static vu c() {
        return vj.a(yd.d());
    }

    public static vu a(Comparator comparator) {
        com.a.a.b.cl.a(comparator);
        return new vm(comparator);
    }

    public static vu a(Class class_) {
        com.a.a.b.cl.a(class_);
        return new vn(class_);
    }

    public abstract vi d();

    public vi a(vi vi2) {
        vi vi3 = this.d();
        vi3.a(vi2);
        return vi3;
    }

    /* synthetic */ vj(vk vk2) {
        this();
    }
}

