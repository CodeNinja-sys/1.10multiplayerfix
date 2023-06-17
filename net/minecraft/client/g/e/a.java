/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import net.minecraft.client.g.e.q;
import net.minecraft.client.g.e.r;
import net.minecraft.client.g.e.u;
import net.minecraft.client.g.g;
import net.minecraft.u.c;

class a
implements Runnable {
    final /* synthetic */ r a;
    private final /* synthetic */ c b;
    private final /* synthetic */ g c;
    private final /* synthetic */ q d;
    private final /* synthetic */ u e;
    private final /* synthetic */ double f;

    a(r r2, c c2, g g2, q q2, u u2, double d2) {
        this.a = r2;
        this.b = c2;
        this.c = g2;
        this.d = q2;
        this.e = u2;
        this.f = d2;
    }

    @Override
    public void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}

