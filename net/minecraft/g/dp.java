/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.aq;
import net.minecraft.g.hu;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

class dp
implements Runnable {
    final /* synthetic */ hu a;
    private final /* synthetic */ k b;
    private final /* synthetic */ b c;

    dp(hu hu2, k k2, b b2) {
        this.a = hu2;
        this.b = k2;
        this.c = b2;
    }

    @Override
    public void run() {
        ap ap2 = this.b.q(this.c);
        if (ap2 instanceof aq) {
            ((aq)ap2).k();
            this.b.c(this.c, p.bY, 1, 0);
        }
    }
}

