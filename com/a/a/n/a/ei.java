/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.eg;
import com.a.a.n.a.ej;

class ei
extends eg {
    final double d;

    ei(ej ej2, double d2) {
        super(ej2, null);
        this.d = d2;
    }

    @Override
    void a(double d2, double d3) {
        double d4 = this.b;
        this.b = this.d * d2;
        this.a = d4 == 0.0 ? 0.0 : this.a * this.b / d4;
    }

    @Override
    long b(double d2, double d3) {
        return 0L;
    }
}

