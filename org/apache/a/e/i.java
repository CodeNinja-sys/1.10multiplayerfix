/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import org.apache.a.e.h;

public class i {
    private int a;
    private boolean b;
    private int c = -1;
    private boolean d;
    private boolean e = true;

    i() {
    }

    public i a(int n2) {
        this.a = n2;
        return this;
    }

    public i a(boolean bl2) {
        this.b = bl2;
        return this;
    }

    public i b(int n2) {
        this.c = n2;
        return this;
    }

    public i b(boolean bl2) {
        this.d = bl2;
        return this;
    }

    public i c(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public h a() {
        return new h(this.a, this.b, this.c, this.d, this.e);
    }
}

