/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.yd;
import java.io.Serializable;

final class yb
extends yd
implements Serializable {
    final yd a;
    private static final long b = 0L;

    yb(yd yd2) {
        this.a = yd2;
    }

    @Override
    public int compare(Object object, Object object2) {
        if (object == object2) {
            return 0;
        }
        if (object == null) {
            return 1;
        }
        if (object2 == null) {
            return -1;
        }
        return this.a.compare(object, object2);
    }

    @Override
    public yd a() {
        return this.a.a().b();
    }

    @Override
    public yd b() {
        return this.a.b();
    }

    @Override
    public yd c() {
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof yb) {
            yb yb2 = (yb)object;
            return this.a.equals(yb2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xC9177248;
    }

    public String toString() {
        return this.a + ".nullsLast()";
    }
}

