/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.mk;

class mn
implements bl {
    private final mk a;

    public mn(mk mk2) {
        this.a = mk2;
    }

    @Override
    public Object a(Object object) {
        return this.a.a(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof mn) {
            mn mn2 = (mn)object;
            return this.a.equals(mn2.a);
        }
        return false;
    }
}

