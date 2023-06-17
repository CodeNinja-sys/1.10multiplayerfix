/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ku;
import com.a.a.d.oi;
import com.a.a.d.xc;
import com.a.a.d.xd;
import java.io.Serializable;

class la
implements Serializable {
    final Object[] a;
    final int[] b;
    private static final long c = 0L;

    la(xc xc2) {
        int n2 = xc2.aS_().size();
        this.a = new Object[n2];
        this.b = new int[n2];
        int n3 = 0;
        for (xd xd2 : xc2.aS_()) {
            this.a[n3] = xd2.a();
            this.b[n3] = xd2.b();
            ++n3;
        }
    }

    Object a() {
        oi oi2 = oi.a(this.a.length);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            oi2.a(this.a[i2], this.b[i2]);
        }
        return ku.a((Iterable)oi2);
    }
}

