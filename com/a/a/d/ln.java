/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.lf;
import com.a.a.d.yl;
import java.io.Serializable;

final class ln
implements Serializable {
    private final jl a;

    ln(jl jl2) {
        this.a = jl2;
    }

    Object a() {
        if (this.a.isEmpty()) {
            return lf.c();
        }
        if (this.a.equals(jl.a(yl.c()))) {
            return lf.d();
        }
        return new lf(this.a);
    }
}

