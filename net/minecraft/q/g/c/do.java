/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import net.minecraft.u.ad;

class do {
    int a;
    do[] b = new do[6];
    boolean[] c = new boolean[6];
    boolean d;
    boolean e;
    int f;

    public do(int n2) {
        this.a = n2;
    }

    public void a(ad ad2, do do_) {
        this.b[ad2.b()] = do_;
        do_.b[ad2.e().b()] = this;
    }

    public void a() {
        for (int i2 = 0; i2 < 6; ++i2) {
            this.c[i2] = this.b[i2] != null;
        }
    }

    public boolean a(int n2) {
        if (this.e) {
            return true;
        }
        this.f = n2;
        for (int i2 = 0; i2 < 6; ++i2) {
            if (this.b[i2] == null || !this.c[i2] || this.b[i2].f == n2 || !this.b[i2].a(n2)) continue;
            return true;
        }
        return false;
    }

    public boolean b() {
        return this.a >= 75;
    }

    public int c() {
        int n2 = 0;
        for (int i2 = 0; i2 < 6; ++i2) {
            if (!this.c[i2]) continue;
            ++n2;
        }
        return n2;
    }
}

