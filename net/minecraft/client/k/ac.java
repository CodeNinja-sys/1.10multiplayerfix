/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dj;
import net.minecraft.client.r;

class ac
extends ch {
    private final boolean a;

    public ac(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 23, 13, "");
        this.a = bl2;
    }

    @Override
    public void c(r r2, int n2, int n3) {
        if (this.l) {
            boolean bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            r2.N().a(dj.f());
            int n4 = 0;
            int n5 = 192;
            if (bl2) {
                n4 += 23;
            }
            if (!this.a) {
                n5 += 13;
            }
            this.a_(this.g, this.h, n4, n5, 23, 13);
        }
    }
}

