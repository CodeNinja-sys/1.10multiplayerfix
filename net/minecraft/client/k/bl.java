/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.av;
import net.minecraft.client.k.da;

class bl
extends av {
    final /* synthetic */ da a;

    public bl(da da2) {
        this.a = da2;
        super(da2.n, da2.p, da2.q, 80, da2.q - 40, da2.u.a + 1);
    }

    @Override
    protected int a() {
        return da.a(this.a).size();
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
        this.a.u.a((String)da.a(this.a).get(n2), 10, n4, 0xFFFFFF);
        this.a.u.a((String)da.b(this.a).get(n2), 230, n4, 0xFFFFFF);
    }

    @Override
    protected int j() {
        return this.d - 10;
    }
}

