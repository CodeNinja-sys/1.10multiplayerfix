/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ay;
import com.a.a.b.az;
import com.a.a.b.ba;
import com.a.a.b.bb;
import com.a.a.b.bl;
import com.a.a.b.bm;
import com.a.a.b.cj;
import com.a.a.b.cm;

public abstract class aw {
    protected aw() {
    }

    public final boolean a(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object == null || object2 == null) {
            return false;
        }
        return this.b(object, object2);
    }

    protected abstract boolean b(Object var1, Object var2);

    public final int a(Object object) {
        if (object == null) {
            return 0;
        }
        return this.b(object);
    }

    protected abstract int b(Object var1);

    public final aw a(bl bl2) {
        return new bm(bl2, this);
    }

    public final bb c(Object object) {
        return new bb(this, object, null);
    }

    public final aw a() {
        return new cj(this);
    }

    public final cm d(Object object) {
        return new az(this, object);
    }

    public static aw b() {
        return ay.a;
    }

    public static aw c() {
        return ba.a;
    }
}

