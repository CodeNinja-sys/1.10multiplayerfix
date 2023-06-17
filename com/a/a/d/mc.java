/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abn;
import com.a.a.d.mb;
import com.a.a.d.xd;
import java.io.Serializable;
import java.util.Comparator;

final class mc
implements Serializable {
    Comparator a;
    Object[] b;
    int[] c;

    mc(abn abn2) {
        this.a = abn2.comparator();
        int n2 = abn2.aS_().size();
        this.b = new Object[n2];
        this.c = new int[n2];
        int n3 = 0;
        for (xd xd2 : abn2.aS_()) {
            this.b[n3] = xd2.a();
            this.c[n3] = xd2.b();
            ++n3;
        }
    }

    Object a() {
        int n2 = this.b.length;
        mb mb2 = new mb(this.a);
        for (int i2 = 0; i2 < n2; ++i2) {
            mb2.c(this.b[i2], this.c[i2]);
        }
        return mb2.c();
    }
}

