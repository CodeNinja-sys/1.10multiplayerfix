/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.yd;
import java.io.Serializable;

final class ch
extends yd
implements Serializable {
    final bl a;
    final yd b;
    private static final long e = 0L;

    ch(bl bl2, yd yd2) {
        this.a = (bl)cl.a(bl2);
        this.b = (yd)cl.a(yd2);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.b.compare(this.a.a(object), this.a.a(object2));
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ch) {
            ch ch2 = (ch)object;
            return this.a.equals(ch2.a) && this.b.equals(ch2.b);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

