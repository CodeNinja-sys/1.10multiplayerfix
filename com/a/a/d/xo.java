/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.xd;

abstract class xo
implements xd {
    xo() {
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            return this.b() == xd2.b() && cc.a(this.a(), xd2.a());
        }
        return false;
    }

    @Override
    public int hashCode() {
        Object object = this.a();
        return (object == null ? 0 : object.hashCode()) ^ this.b();
    }

    @Override
    public String toString() {
        String string = String.valueOf(this.a());
        int n2 = this.b();
        return n2 == 1 ? string : string + " x " + n2;
    }
}

