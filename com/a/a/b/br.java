/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cl;
import java.io.Serializable;

class br
implements bl,
Serializable {
    private final bl a;
    private final bl b;
    private static final long c = 0L;

    public br(bl bl2, bl bl3) {
        this.a = (bl)cl.a(bl2);
        this.b = (bl)cl.a(bl3);
    }

    @Override
    public Object a(Object object) {
        return this.a.a(this.b.a(object));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof br) {
            br br2 = (br)object;
            return this.b.equals(br2.b) && this.a.equals(br2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public String toString() {
        return this.a + "(" + this.b + ")";
    }
}

