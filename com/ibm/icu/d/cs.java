/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.cp;

public final class cs {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    private final boolean f;

    public cs(String string, String string2, long l2, long l3, int n2) {
        this(string, string2, l2, l3, n2, true);
    }

    public cs(String string, String string2, long l2, long l3, int n2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = l2;
        this.d = l3;
        this.e = n2;
        this.f = bl2;
    }

    public String toString() {
        return cp.a(this);
    }

    public boolean a() {
        return this.f;
    }
}

