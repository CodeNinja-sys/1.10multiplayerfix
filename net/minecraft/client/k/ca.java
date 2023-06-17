/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.av;
import net.minecraft.client.k.bo;
import net.minecraft.client.r;

public abstract class ca
extends av {
    public ca(r r2, int n2, int n3, int n4, int n5, int n6) {
        super(r2, n2, n3, n4, n5, n6);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void d() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.e(n2).a(n2, n3, n4, this.i(), n5, n6, n7, this.f(n7) && this.c(n6, n7) == n2);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        this.e(n2).a(n2, n3, n4);
    }

    public boolean a(int n2, int n3, int n4) {
        int n5;
        if (this.f(n3) && (n5 = this.c(n2, n3)) >= 0) {
            int n6 = this.i + this.d / 2 - this.i() / 2 + 2;
            int n7 = this.f + 4 - this.m() + n5 * this.j + this.v;
            int n8 = n2 - n6;
            int n9 = n3 - n7;
            if (this.e(n5).a(n5, n2, n3, n4, n8, n9)) {
                this.c(false);
                return true;
            }
        }
        return false;
    }

    public boolean c(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.a(); ++i2) {
            int n5 = this.i + this.d / 2 - this.i() / 2 + 2;
            int n6 = this.f + 4 - this.m() + i2 * this.j + this.v;
            int n7 = n2 - n5;
            int n8 = n3 - n6;
            this.e(i2).b(i2, n2, n3, n4, n7, n8);
        }
        this.c(true);
        return false;
    }

    public abstract bo e(int var1);
}

