/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.cl;
import java.io.Serializable;

final class bm
extends aw
implements Serializable {
    private static final long a = 0L;
    private final bl b;
    private final aw c;

    bm(bl bl2, aw aw2) {
        this.b = (bl)cl.a(bl2);
        this.c = (aw)cl.a(aw2);
    }

    @Override
    protected boolean b(Object object, Object object2) {
        return this.c.a(this.b.a(object), this.b.a(object2));
    }

    @Override
    protected int b(Object object) {
        return this.c.a(this.b.a(object));
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bm) {
            bm bm2 = (bm)object;
            return this.b.equals(bm2.b) && this.c.equals(bm2.c);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return this.c + ".onResultOf(" + this.b + ")";
    }
}

