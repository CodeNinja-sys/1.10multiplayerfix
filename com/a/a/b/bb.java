/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import com.a.a.b.ax;
import com.a.a.b.cl;
import java.io.Serializable;

public final class bb
implements Serializable {
    private final aw a;
    private final Object b;
    private static final long c = 0L;

    private bb(aw aw2, Object object) {
        this.a = (aw)cl.a(aw2);
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bb) {
            bb bb2 = (bb)object;
            if (this.a.equals(bb2.a)) {
                aw aw2 = this.a;
                return aw2.a(this.b, bb2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a.a(this.b);
    }

    public String toString() {
        return this.a + ".wrap(" + this.b + ")";
    }

    /* synthetic */ bb(aw aw2, Object object, ax ax2) {
        this(aw2, object);
    }
}

