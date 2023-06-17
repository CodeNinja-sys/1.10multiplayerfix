/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.a.m;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.bc;
import net.minecraft.g.a.e;
import net.minecraft.q.a.y;
import net.minecraft.u.b.u;
import net.minecraft.u.bp;

class bn {
    private final y b;
    private final m c;
    private final bp d;
    private final int[] e;
    final /* synthetic */ bc a;

    private bn(bc bc2, y y2) {
        this.a = bc2;
        this.b = y2;
        this.c = new m(128, 128);
        this.e = this.c.b();
        this.d = bc.a(bc2).a("map/" + y2.i, this.c);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = 0;
        }
    }

    private void a() {
        for (int i2 = 0; i2 < 16384; ++i2) {
            int n2 = this.b.f[i2] & 0xFF;
            this.e[i2] = n2 / 4 == 0 ? (i2 + i2 / 128 & 1) * 8 + 16 << 24 : net.minecraft.g.a.e.a[n2 / 4].a(n2 & 3);
        }
        this.c.a();
    }

    private void a(boolean bl2) {
        boolean bl3 = false;
        boolean bl4 = false;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        float f2 = 0.0f;
        bc.a(this.a).a(this.d);
        bd.l();
        bd.a(ad.e, net.minecraft.client.g.bc.j, ad.o, net.minecraft.client.g.bc.e);
        bd.c();
        g2.a(7, net.minecraft.client.g.d.b.g);
        g2.b(0.0, 128.0, (double)-0.01f).a(0.0, 1.0).d();
        g2.b(128.0, 128.0, (double)-0.01f).a(1.0, 1.0).d();
        g2.b(128.0, 0.0, (double)-0.01f).a(1.0, 0.0).d();
        g2.b(0.0, 0.0, (double)-0.01f).a(0.0, 0.0).d();
        ci2.b();
        bd.d();
        bd.k();
        bc.a(this.a).a(bc.b());
        int n2 = 0;
        for (u u2 : this.b.h.values()) {
            if (bl2 && u2.a() != 1) continue;
            bd.D();
            bd.c(0.0f + (float)u2.b() / 2.0f + 64.0f, 0.0f + (float)u2.c() / 2.0f + 64.0f, -0.02f);
            bd.b((float)(u2.d() * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            bd.b(4.0f, 4.0f, 3.0f);
            bd.c(-0.125f, 0.125f, 0.0f);
            byte by2 = u2.a();
            float f3 = (float)(by2 % 4 + 0) / 4.0f;
            float f4 = (float)(by2 / 4 + 0) / 4.0f;
            float f5 = (float)(by2 % 4 + 1) / 4.0f;
            float f6 = (float)(by2 / 4 + 1) / 4.0f;
            g2.a(7, net.minecraft.client.g.d.b.g);
            float f7 = -0.001f;
            g2.b(-1.0, 1.0, (double)((float)n2 * -0.001f)).a(f3, f4).d();
            g2.b(1.0, 1.0, (double)((float)n2 * -0.001f)).a(f5, f4).d();
            g2.b(1.0, -1.0, (double)((float)n2 * -0.001f)).a(f5, f6).d();
            g2.b(-1.0, -1.0, (double)((float)n2 * -0.001f)).a(f3, f6).d();
            ci2.b();
            bd.E();
            ++n2;
        }
        bd.D();
        bd.c(0.0f, 0.0f, -0.04f);
        bd.b(1.0f, 1.0f, 1.0f);
        bd.E();
    }

    static /* synthetic */ void a(bn bn2) {
        bn2.a();
    }

    static /* synthetic */ void a(bn bn2, boolean bl2) {
        bn2.a(bl2);
    }

    /* synthetic */ bn(bc bc2, y y2, bn bn2) {
        this(bc2, y2);
    }

    static /* synthetic */ bp b(bn bn2) {
        return bn2.d;
    }
}

