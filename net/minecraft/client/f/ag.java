/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.util.List;
import net.minecraft.client.f.ad;
import net.minecraft.client.k.bu;

class ag
implements bu {
    final /* synthetic */ ad a;
    private final /* synthetic */ int b;

    ag(ad ad2, int n2) {
        this.a = ad2;
        this.b = n2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        List list = this.a.b.b(this.a);
        this.a.a.a(this.a.b);
        if (bl2) {
            list.remove(this.a);
            this.a.b.f().add(this.b, this.a);
        }
    }
}

