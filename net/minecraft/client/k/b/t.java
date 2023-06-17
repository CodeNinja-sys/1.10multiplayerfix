/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.m;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.u.bp;

class t
extends ch {
    private final bp a;
    private final int b;
    private final int c;
    private boolean n;

    protected t(int n2, int n3, int n4, bp bp2, int n5, int n6) {
        super(n2, n3, n4, 22, 22, "");
        this.a = bp2;
        this.b = n5;
        this.c = n6;
    }

    @Override
    public void c(r r2, int n2, int n3) {
        if (this.l) {
            r2.N().a(net.minecraft.client.k.b.m.f());
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.m = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            int n4 = 219;
            int n5 = 0;
            if (!this.k) {
                n5 += this.e * 2;
            } else if (this.n) {
                n5 += this.e * 1;
            } else if (this.m) {
                n5 += this.e * 3;
            }
            this.a_(this.g, this.h, n5, 219, this.e, this.f);
            if (!net.minecraft.client.k.b.m.f().equals(this.a)) {
                r2.N().a(this.a);
            }
            this.a_(this.g + 2, this.h + 2, this.b, this.c, 18, 18);
        }
    }

    public boolean a() {
        return this.n;
    }

    public void a(boolean bl2) {
        this.n = bl2;
    }
}

