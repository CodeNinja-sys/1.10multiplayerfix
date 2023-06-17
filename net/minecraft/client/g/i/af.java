/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.p;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.l;
import net.minecraft.u.bp;
import net.minecraft.w.e.bi;

public class af
extends n {
    private static final bp a = new bp("textures/entity/creeper/creeper.png");

    public af(f f2) {
        super(f2, new l(), 0.5f);
        this.a(new p(this));
    }

    protected void a(bi bi2, float f2) {
        float f3 = bi2.q(f2);
        float f4 = 1.0f + net.minecraft.u.b.n.a(f3 * 100.0f) * f3 * 0.01f;
        f3 = net.minecraft.u.b.n.a(f3, 0.0f, 1.0f);
        f3 *= f3;
        f3 *= f3;
        float f5 = (1.0f + f3 * 0.4f) * f4;
        float f6 = (1.0f + f3 * 0.1f) / f4;
        bd.b(f5, f6, f5);
    }

    protected int a(bi bi2, float f2, float f3) {
        float f4 = bi2.q(f3);
        if ((int)(f4 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n2 = (int)(f4 * 0.2f * 255.0f);
        n2 = net.minecraft.u.b.n.a(n2, 0, 255);
        return n2 << 24 | 0x30FFFFFF;
    }

    protected bp a(bi bi2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((bi)n2);
    }
}

