/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.vt;
import com.a.a.d.vv;
import com.a.a.d.vw;
import com.a.a.d.vx;
import com.a.a.d.vy;
import com.a.a.d.vz;
import com.a.a.d.wa;
import com.a.a.d.wb;
import com.a.a.d.wc;
import com.a.a.d.yd;
import java.util.Comparator;
import java.util.Map;

public abstract class vu {
    private static final int a = 2;

    vu() {
    }

    abstract Map a();

    public vt b() {
        return this.a(2);
    }

    public vt a(int n2) {
        cl.a(n2, "expectedValuesPerKey");
        return new vv(this, n2);
    }

    public vt c() {
        return new vw(this);
    }

    public wb d() {
        return this.b(2);
    }

    public wb b(int n2) {
        cl.a(n2, "expectedValuesPerKey");
        return new vx(this, n2);
    }

    public wb e() {
        return this.c(2);
    }

    public wb c(int n2) {
        cl.a(n2, "expectedValuesPerKey");
        return new vy(this, n2);
    }

    public wc f() {
        return this.a(yd.d());
    }

    public wc a(Comparator comparator) {
        com.a.a.b.cl.a(comparator, (Object)"comparator");
        return new vz(this, comparator);
    }

    public wb a(Class class_) {
        com.a.a.b.cl.a(class_, (Object)"valueClass");
        return new wa(this, class_);
    }
}

