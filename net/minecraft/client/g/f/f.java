/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.f;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.f.c;
import net.minecraft.client.g.g;
import net.minecraft.client.h.d;
import net.minecraft.client.r;

public class f
implements c {
    private final r a;

    public f(r r2) {
        this.a = r2;
    }

    @Override
    public void a(float f2, long l2) {
        int n2;
        d d2 = this.a.j;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        double d3 = d2.br + (d2.aU - d2.br) * (double)f2;
        double d4 = d2.bs + (d2.aV - d2.bs) * (double)f2;
        double d5 = d2.bt + (d2.aW - d2.bt) * (double)f2;
        double d6 = 0.0 - d4;
        double d7 = 256.0 - d4;
        bd.w();
        bd.k();
        double d8 = (double)(d2.bH << 4) - d3;
        double d9 = (double)(d2.bJ << 4) - d5;
        bd.d(1.0f);
        g2.a(3, b.f);
        for (n2 = -16; n2 <= 32; n2 += 16) {
            for (int i2 = -16; i2 <= 32; i2 += 16) {
                g2.b(d8 + (double)n2, d6, d9 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.0f).d();
                g2.b(d8 + (double)n2, d6, d9 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                g2.b(d8 + (double)n2, d7, d9 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.5f).d();
                g2.b(d8 + (double)n2, d7, d9 + (double)i2).a(1.0f, 0.0f, 0.0f, 0.0f).d();
            }
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            g2.b(d8 + (double)n2, d6, d9).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8 + (double)n2, d6, d9).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + (double)n2, d7, d9).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + (double)n2, d7, d9).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8 + (double)n2, d6, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8 + (double)n2, d6, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + (double)n2, d7, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + (double)n2, d7, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        for (n2 = 2; n2 < 16; n2 += 2) {
            g2.b(d8, d6, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8, d6, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8, d7, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8, d7, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8 + 16.0, d6, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8 + 16.0, d6, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + 16.0, d7, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + 16.0, d7, d9 + (double)n2).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        for (n2 = 0; n2 <= 256; n2 += 2) {
            double d10 = (double)n2 - d4;
            g2.b(d8, d10, d9).a(1.0f, 1.0f, 0.0f, 0.0f).d();
            g2.b(d8, d10, d9).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8, d10, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + 16.0, d10, d9 + 16.0).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8 + 16.0, d10, d9).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8, d10, d9).a(1.0f, 1.0f, 0.0f, 1.0f).d();
            g2.b(d8, d10, d9).a(1.0f, 1.0f, 0.0f, 0.0f).d();
        }
        ci2.b();
        bd.d(2.0f);
        g2.a(3, b.f);
        for (n2 = 0; n2 <= 16; n2 += 16) {
            for (int i3 = 0; i3 <= 16; i3 += 16) {
                g2.b(d8 + (double)n2, d6, d9 + (double)i3).a(0.25f, 0.25f, 1.0f, 0.0f).d();
                g2.b(d8 + (double)n2, d6, d9 + (double)i3).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                g2.b(d8 + (double)n2, d7, d9 + (double)i3).a(0.25f, 0.25f, 1.0f, 1.0f).d();
                g2.b(d8 + (double)n2, d7, d9 + (double)i3).a(0.25f, 0.25f, 1.0f, 0.0f).d();
            }
        }
        for (n2 = 0; n2 <= 256; n2 += 16) {
            double d11 = (double)n2 - d4;
            g2.b(d8, d11, d9).a(0.25f, 0.25f, 1.0f, 0.0f).d();
            g2.b(d8, d11, d9).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            g2.b(d8, d11, d9 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            g2.b(d8 + 16.0, d11, d9 + 16.0).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            g2.b(d8 + 16.0, d11, d9).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            g2.b(d8, d11, d9).a(0.25f, 0.25f, 1.0f, 1.0f).d();
            g2.b(d8, d11, d9).a(0.25f, 0.25f, 1.0f, 0.0f).d();
        }
        ci2.b();
        bd.d(1.0f);
        bd.l();
        bd.v();
    }
}

