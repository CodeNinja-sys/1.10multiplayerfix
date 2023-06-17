/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.ct;
import net.minecraft.client.r;

class cr
extends ch {
    private final boolean a;

    public cr(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 12, 19, "");
        this.a = bl2;
    }

    @Override
    public void c(r r2, int n2, int n3) {
        if (this.l) {
            r2.N().a(ct.g());
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            int n4 = 0;
            int n5 = 176;
            if (!this.k) {
                n5 += this.e * 2;
            } else if (bl2) {
                n5 += this.e;
            }
            if (!this.a) {
                n4 += this.f;
            }
            this.a_(this.g, this.h, n5, n4, this.e, this.f);
        }
    }
}

