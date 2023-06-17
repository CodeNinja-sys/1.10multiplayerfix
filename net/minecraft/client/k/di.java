/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;

public class di
extends ch {
    public di(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    @Override
    public void c(r r2, int n2, int n3) {
        if (this.l) {
            r2.N().a(ch.d);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            int n4 = 106;
            if (bl2) {
                n4 += this.f;
            }
            this.a_(this.g, this.h, 0, n4, this.e, this.f);
        }
    }
}

