/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afm;
import com.a.a.d.afq;
import com.a.a.d.yl;
import com.a.a.d.yr;

final class afp
extends afm {
    final /* synthetic */ afm b;

    afp(afm afm2) {
        this.b = afm2;
        super(new afq(afm2.a), null);
    }

    @Override
    public void a(yl yl2) {
        this.b.b(yl2);
    }

    @Override
    public void b(yl yl2) {
        this.b.a(yl2);
    }

    @Override
    public boolean a(Comparable comparable) {
        return !this.b.a(comparable);
    }

    @Override
    public yr k() {
        return this.b;
    }
}

