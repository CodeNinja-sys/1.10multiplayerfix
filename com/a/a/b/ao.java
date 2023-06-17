/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.al;
import com.a.a.b.bl;
import com.a.a.b.cl;
import java.io.Serializable;

final class ao
extends ak
implements Serializable {
    private final bl a;
    private final bl b;

    private ao(bl bl2, bl bl3) {
        this.a = (bl)cl.a(bl2);
        this.b = (bl)cl.a(bl3);
    }

    @Override
    protected Object c(Object object) {
        return this.a.a(object);
    }

    @Override
    protected Object b(Object object) {
        return this.b.a(object);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ao) {
            ao ao2 = (ao)object;
            return this.a.equals(ao2.a) && this.b.equals(ao2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        return "Converter.from(" + this.a + ", " + this.b + ")";
    }

    /* synthetic */ ao(bl bl2, bl bl3, al al2) {
        this(bl2, bl3);
    }
}

