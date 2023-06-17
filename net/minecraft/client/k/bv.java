/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.br;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.db;
import net.minecraft.q.a.w;

class bv
implements bu {
    final /* synthetic */ br a;

    bv(br br2) {
        this.a = br2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2) {
            br.b(this.a).a(new db());
            w w2 = br.b(this.a).g();
            w2.c();
            w2.c(br.d(this.a).a());
            br.e(this.a).b();
        }
        br.b(this.a).a(br.c(this.a));
    }
}

