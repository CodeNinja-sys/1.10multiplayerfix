/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ar;

public final class as {
    private final ar[] a;
    private int b;
    private int c;

    public as(int n2) {
        this.a = new ar[n2 + 1];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new ar();
        }
    }

    final synchronized void a(ar ar2) {
        this.a[this.c].a(ar2);
        this.c = this.a(this.c);
    }

    final synchronized boolean a() {
        return this.a(this.c) == this.b;
    }

    private final int a(int n2) {
        return (n2 + 1) % this.a.length;
    }

    public final synchronized boolean b(ar ar2) {
        if (this.b == this.c) {
            return false;
        }
        ar2.a(this.a[this.b]);
        this.b = this.a(this.b);
        return true;
    }
}

