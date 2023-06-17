/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ds;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.dx;

public final class dl
extends ds {
    public dl(dt dt2) {
        super(dt2);
    }

    protected void a(CharSequence charSequence, dx dx2) {
        this.a.a(charSequence, 0, charSequence.length(), dx2);
    }

    protected void a(CharSequence charSequence, boolean bl2, dx dx2) {
        this.a.a(charSequence, bl2, dx2);
    }

    public int c(CharSequence charSequence) {
        return this.a.a(charSequence, 0, charSequence.length(), null);
    }

    public int a(int n2) {
        return this.a.d(this.a.a(n2)) ? 1 : 0;
    }

    public boolean b(int n2) {
        return this.a.a(n2, true);
    }

    public boolean c(int n2) {
        return this.a.a(n2, false);
    }

    public boolean d(int n2) {
        return this.a.n(n2);
    }
}

