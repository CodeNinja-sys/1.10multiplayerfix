/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.co;
import java.io.Serializable;

class cr
implements cm,
Serializable {
    final cm a;
    final bl b;
    private static final long c = 0L;

    private cr(cm cm2, bl bl2) {
        this.a = (cm)cl.a(cm2);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public boolean a(Object object) {
        return this.a.a(this.b.a(object));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cr) {
            cr cr2 = (cr)object;
            return this.b.equals(cr2.b) && this.a.equals(cr2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public String toString() {
        return this.a.toString() + "(" + this.b.toString() + ")";
    }

    /* synthetic */ cr(cm cm2, bl bl2, co co2) {
        this(cm2, bl2);
    }
}

