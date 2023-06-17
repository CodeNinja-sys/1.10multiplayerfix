/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afm;
import com.a.a.d.afx;
import com.a.a.d.lf;
import com.a.a.d.yl;
import com.a.a.d.yr;

final class afw
extends afm {
    private final yl c;
    final /* synthetic */ afm b;

    afw(afm afm2, yl yl2) {
        this.b = afm2;
        super(new afx(yl.c(), yl2, afm2.a, null), null);
        this.c = yl2;
    }

    @Override
    public boolean c(yl yl2) {
        if (!this.c.j() && this.c.a(yl2)) {
            yl yl3 = afm.a(this.b, yl2);
            return yl3 != null && !yl3.c(this.c).j();
        }
        return false;
    }

    @Override
    public yl b(Comparable comparable) {
        if (!this.c.f(comparable)) {
            return null;
        }
        yl yl2 = this.b.b(comparable);
        return yl2 == null ? null : yl2.c(this.c);
    }

    @Override
    public void a(yl yl2) {
        cl.a(this.c.a(yl2), "Cannot add range %s to subRangeSet(%s)", new Object[]{yl2, this.c});
        super.a(yl2);
    }

    @Override
    public void b(yl yl2) {
        if (yl2.b(this.c)) {
            this.b.b(yl2.c(this.c));
        }
    }

    @Override
    public boolean a(Comparable comparable) {
        return this.c.f(comparable) && this.b.a(comparable);
    }

    @Override
    public void b() {
        this.b.b(this.c);
    }

    @Override
    public yr f(yl yl2) {
        if (yl2.a(this.c)) {
            return this;
        }
        if (yl2.b(this.c)) {
            return new afw(this, this.c.c(yl2));
        }
        return lf.c();
    }
}

