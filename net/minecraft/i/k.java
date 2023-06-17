/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.g;

public class k {
    private g[] a = new g[512];
    private int b;

    public g a(g g2) {
        if (g2.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            g[] arrg = new g[this.b << 1];
            System.arraycopy(this.a, 0, arrg, 0, this.b);
            this.a = arrg;
        }
        this.a[this.b] = g2;
        g2.d = this.b;
        this.a(this.b++);
        return g2;
    }

    public void a() {
        this.b = 0;
    }

    public g b() {
        g g2 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        g2.d = -1;
        return g2;
    }

    public void a(g g2, float f2) {
        float f3 = g2.g;
        g2.g = f2;
        if (f2 < f3) {
            this.a(g2.d);
        } else {
            this.b(g2.d);
        }
    }

    private void a(int n2) {
        g g2 = this.a[n2];
        float f2 = g2.g;
        while (n2 > 0) {
            int n3 = n2 - 1 >> 1;
            g g3 = this.a[n3];
            if (f2 >= g3.g) break;
            this.a[n2] = g3;
            g3.d = n2;
            n2 = n3;
        }
        this.a[n2] = g2;
        g2.d = n2;
    }

    private void b(int n2) {
        g g2 = this.a[n2];
        float f2 = g2.g;
        while (true) {
            float f3;
            g g3;
            int n3 = 1 + (n2 << 1);
            int n4 = n3 + 1;
            if (n3 >= this.b) break;
            g g4 = this.a[n3];
            float f4 = g4.g;
            if (n4 >= this.b) {
                g3 = null;
                f3 = Float.POSITIVE_INFINITY;
            } else {
                g3 = this.a[n4];
                f3 = g3.g;
            }
            if (f4 < f3) {
                if (f4 >= f2) break;
                this.a[n2] = g4;
                g4.d = n2;
                n2 = n3;
                continue;
            }
            if (f3 >= f2) break;
            this.a[n2] = g3;
            g3.d = n2;
            n2 = n4;
        }
        this.a[n2] = g2;
        g2.d = n2;
    }

    public boolean c() {
        return this.b == 0;
    }
}

