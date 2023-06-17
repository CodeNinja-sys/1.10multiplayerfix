/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.xc;
import com.a.a.d.xd;

abstract class xr
extends aan {
    xr() {
    }

    abstract xc a();

    @Override
    public boolean contains(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            if (xd2.b() <= 0) {
                return false;
            }
            int n2 = this.a().a(xd2.a());
            return n2 == xd2.b();
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof xd) {
            xd xd2 = (xd)object;
            Object object2 = xd2.a();
            int n2 = xd2.b();
            if (n2 != 0) {
                xc xc2 = this.a();
                return xc2.a(object2, n2, 0);
            }
        }
        return false;
    }

    @Override
    public void clear() {
        this.a().clear();
    }
}

