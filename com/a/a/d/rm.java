/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.re;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.sw;

final class rm
extends re {
    @Override
    rz a(sa sa2, Object object, int n2, rz rz2) {
        return new sw(sa2.g, object, n2, rz2);
    }

    @Override
    rz a(sa sa2, rz rz2, rz rz3) {
        rz rz4 = super.a(sa2, rz2, rz3);
        this.a(rz2, rz4);
        this.b(rz2, rz4);
        return rz4;
    }
}

