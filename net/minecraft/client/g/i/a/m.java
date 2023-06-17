/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import java.util.Random;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.a.s;
import net.minecraft.w.d.a;

public class m
implements s {
    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (a2.y > 0) {
            ci ci2 = ci.a();
            g g2 = ci2.c();
            am.a();
            float f9 = ((float)a2.y + f4) / 200.0f;
            float f10 = 0.0f;
            if (f9 > 0.8f) {
                f10 = (f9 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            bd.w();
            bd.j(7425);
            bd.l();
            bd.a(ad.l, bc.e);
            bd.c();
            bd.p();
            bd.a(false);
            bd.D();
            bd.c(0.0f, -1.0f, -2.0f);
            int n2 = 0;
            while ((float)n2 < (f9 + f9 * f9) / 2.0f * 60.0f) {
                bd.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                bd.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                bd.b(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                bd.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                bd.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                bd.b(random.nextFloat() * 360.0f + f9 * 90.0f, 0.0f, 0.0f, 1.0f);
                float f11 = random.nextFloat() * 20.0f + 5.0f + f10 * 10.0f;
                float f12 = random.nextFloat() * 2.0f + 1.0f + f10 * 2.0f;
                g2.a(6, b.f);
                g2.b(0.0, 0.0, 0.0).b(255, 255, 255, (int)(255.0f * (1.0f - f10))).d();
                g2.b(-0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
                g2.b(0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
                g2.b(0.0, (double)f11, (double)(1.0f * f12)).b(255, 0, 255, 0).d();
                g2.b(-0.866 * (double)f12, (double)f11, (double)(-0.5f * f12)).b(255, 0, 255, 0).d();
                ci2.b();
                ++n2;
            }
            bd.E();
            bd.a(true);
            bd.q();
            bd.k();
            bd.j(7424);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.v();
            bd.d();
            am.b();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

