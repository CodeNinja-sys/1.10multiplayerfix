/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import com.a.a.d.jl;
import com.a.a.d.lf;
import java.io.Serializable;

class lk
implements Serializable {
    private final jl a;
    private final ep b;

    lk(jl jl2, ep ep2) {
        this.a = jl2;
        this.b = ep2;
    }

    Object a() {
        return new lf(this.a).a(this.b);
    }
}

