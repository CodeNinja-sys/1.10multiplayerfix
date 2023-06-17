/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.bd;
import net.minecraft.client.k.bx;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;

public class cl
extends ch {
    private boolean a;

    public cl(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public void c(r r2, int n2, int n3) {
        if (this.l) {
            boolean bl2;
            r2.N().a(ch.d);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl3 = bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
            bx bx2 = this.a ? (!this.k ? bx.c : (bl2 ? bx.b : bx.a)) : (!this.k ? bx.f : (bl2 ? bx.e : bx.d));
            this.a_(this.g, this.h, bx2.a(), bx2.b(), this.e, this.f);
        }
    }
}

