/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.da;

class de
extends da {
    protected boolean a;
    protected int b;
    static final /* synthetic */ boolean c;

    public de() {
    }

    public de(int n2) {
        this.a = true;
        this.b = n2;
    }

    public final void b(int n2) {
        if (!c && this.a) {
            throw new AssertionError();
        }
        this.a = true;
        this.b = n2;
    }

    private void c(int n2) {
        this.a = true;
        this.b = n2;
    }

    public int hashCode() {
        int n2 = 0x111111;
        if (this.a) {
            n2 = n2 * 37 + this.b;
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        de de2 = (de)object;
        return this.a == de2.a && (!this.a || this.b == de2.b);
    }

    public da a(cs cs2, CharSequence charSequence, int n2, int n3) {
        if (n2 == charSequence.length()) {
            throw new IllegalArgumentException("Duplicate string.");
        }
        de de2 = cs.a(cs2, charSequence, n2, n3);
        de2.b(this.b);
        return de2;
    }

    public void a(cs cs2) {
        this.d = cs2.a(this.b, true);
    }

    static /* synthetic */ void a(de de2, int n2) {
        de2.c(n2);
    }

    static {
        c = !cs.class.desiredAssertionStatus();
    }
}

