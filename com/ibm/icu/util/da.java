/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;

abstract class da {
    protected int d = 0;

    public abstract int hashCode();

    public boolean equals(Object object) {
        return this == object || this.getClass() == object.getClass();
    }

    public da a(cs cs2, CharSequence charSequence, int n2, int n3) {
        return this;
    }

    public da b(cs cs2) {
        return this;
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.d = n2;
        }
        return n2;
    }

    public abstract void a(cs var1);

    public final void a(int n2, int n3, cs cs2) {
        if (this.d < 0 && (this.d < n3 || n2 < this.d)) {
            this.a(cs2);
        }
    }

    public final int a() {
        return this.d;
    }
}

