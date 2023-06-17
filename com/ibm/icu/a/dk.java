/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ds;
import com.ibm.icu.a.dt;
import com.ibm.icu.a.dx;
import com.ibm.icu.d.fo;
import com.ibm.icu.d.gk;

public final class dk
extends ds {
    private final boolean b;

    public dk(dt dt2, boolean bl2) {
        super(dt2);
        this.b = bl2;
    }

    protected void a(CharSequence charSequence, dx dx2) {
        this.a.a(charSequence, 0, charSequence.length(), this.b, true, dx2);
    }

    protected void a(CharSequence charSequence, boolean bl2, dx dx2) {
        this.a.a(charSequence, bl2, this.b, dx2);
    }

    public boolean a(CharSequence charSequence) {
        return this.a.a(charSequence, 0, charSequence.length(), this.b, false, new dx(this.a, new StringBuilder(), 5));
    }

    public gk b(CharSequence charSequence) {
        int n2 = this.a.a(charSequence, 0, charSequence.length(), this.b, false);
        if ((n2 & 1) != 0) {
            return fo.r;
        }
        if (n2 >>> 1 == charSequence.length()) {
            return fo.q;
        }
        return fo.p;
    }

    public int c(CharSequence charSequence) {
        return this.a.a(charSequence, 0, charSequence.length(), this.b, true) >>> 1;
    }

    public int a(int n2) {
        return this.a.b(this.a.a(n2));
    }

    public boolean b(int n2) {
        return this.a.o(n2);
    }

    public boolean c(int n2) {
        return this.a.a(n2, this.b, false);
    }

    public boolean d(int n2) {
        return this.a.a(n2, this.b, true);
    }
}

