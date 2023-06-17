/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.dp;
import net.minecraft.q.f.k;
import net.minecraft.q.v;

class hu
implements Runnable {
    private final /* synthetic */ net.minecraft.q.k a;
    private final /* synthetic */ net.minecraft.u.b.b b;

    hu(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        this.a = k2;
        this.b = b2;
    }

    @Override
    public void run() {
        k k2 = this.a.e(this.b);
        for (int i2 = this.b.k() - 1; i2 >= 0; --i2) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.b.cy_(), i2, this.b.l());
            if (!k2.c(b2)) break;
            b b3 = this.a.n(b2);
            if (b3.c() != p.bY) continue;
            ((v)this.a).a(new dp(this, this.a, b2));
        }
    }
}

