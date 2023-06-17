/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agb;
import com.a.a.d.agc;
import com.a.a.d.agd;
import com.a.a.d.agf;
import com.a.a.d.agh;
import com.a.a.d.agi;
import com.a.a.d.gd;

public abstract class aga {
    public abstract Iterable c(Object var1);

    public final gd g(Object object) {
        cl.a(object);
        return new agb(this, object);
    }

    agi d(Object object) {
        return new agh(this, object);
    }

    public final gd h(Object object) {
        cl.a(object);
        return new agc(this, object);
    }

    agi e(Object object) {
        return new agf(this, object);
    }

    public final gd i(Object object) {
        cl.a(object);
        return new agd(this, object);
    }
}

