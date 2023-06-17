/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.br;
import net.minecraft.client.k.bu;

class dp
implements bu {
    final /* synthetic */ br a;

    dp(br br2) {
        this.a = br2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2) {
            br.a(this.a);
        } else {
            br.b(this.a).a(br.c(this.a));
        }
    }
}

