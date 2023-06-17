/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ds;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.dx;

public final class dm
extends ds {
    public dm(dt dt2) {
        super(dt2);
    }

    protected void a(CharSequence charSequence, dx dx2) {
        this.a.b(charSequence, 0, charSequence.length(), dx2);
    }

    protected void a(CharSequence charSequence, boolean bl2, dx dx2) {
        this.a.b(charSequence, bl2, dx2);
    }

    public int c(CharSequence charSequence) {
        return this.a.b(charSequence, 0, charSequence.length(), null);
    }

    public int a(int n2) {
        return this.a.d(this.a.a(n2)) ? 1 : 0;
    }

    public boolean b(int n2) {
        return this.a.p(n2);
    }

    public boolean c(int n2) {
        return this.a.q(n2);
    }

    public boolean d(int n2) {
        return this.a.r(n2);
    }
}

