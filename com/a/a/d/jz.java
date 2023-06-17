/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jt;
import com.a.a.d.ju;
import java.io.Serializable;
import java.util.Map;

class jz
implements Serializable {
    private final Object[] a;
    private final Object[] b;
    private static final long c = 0L;

    jz(jt jt2) {
        this.a = new Object[jt2.size()];
        this.b = new Object[jt2.size()];
        int n2 = 0;
        for (Map.Entry entry : jt2.e()) {
            this.a[n2] = entry.getKey();
            this.b[n2] = entry.getValue();
            ++n2;
        }
    }

    Object a() {
        ju ju2 = new ju();
        return this.a(ju2);
    }

    Object a(ju ju2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            ju2.b(this.a[i2], this.b[i2]);
        }
        return ju2.b();
    }
}

