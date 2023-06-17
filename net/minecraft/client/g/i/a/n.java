/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import java.util.Random;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.al;
import net.minecraft.client.j.bg;
import net.minecraft.client.j.w;
import net.minecraft.w.c.i;
import net.minecraft.w.l;

public class n
implements s {
    private final al a;

    public n(al al2) {
        this.a = al2;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int n2 = l2.bx();
        if (n2 > 0) {
            i i2 = new i(l2.aQ, l2.aU, l2.aV, l2.aW);
            Random random = new Random(l2.ca());
            am.a();
            for (int i3 = 0; i3 < n2; ++i3) {
                bd.D();
                w w2 = this.a.f().a(random);
                bg bg2 = (bg)w2.l.get(random.nextInt(w2.l.size()));
                w2.c(0.0625f);
                float f9 = random.nextFloat();
                float f10 = random.nextFloat();
                float f11 = random.nextFloat();
                float f12 = (bg2.a + (bg2.d - bg2.a) * f9) / 16.0f;
                float f13 = (bg2.b + (bg2.e - bg2.b) * f10) / 16.0f;
                float f14 = (bg2.c + (bg2.f - bg2.c) * f11) / 16.0f;
                bd.c(f12, f13, f14);
                f9 = f9 * 2.0f - 1.0f;
                f10 = f10 * 2.0f - 1.0f;
                f11 = f11 * 2.0f - 1.0f;
                float f15 = net.minecraft.u.b.n.c((f9 *= -1.0f) * f9 + (f11 *= -1.0f) * f11);
                i2.ba = (float)(Math.atan2(f9, f11) * 57.29577951308232);
                i2.bb = (float)(Math.atan2(f10 *= -1.0f, f15) * 57.29577951308232);
                i2.bc = i2.ba;
                i2.bd = i2.bb;
                double d2 = 0.0;
                double d3 = 0.0;
                double d4 = 0.0;
                this.a.c().a(i2, 0.0, 0.0, 0.0, 0.0f, f4, false);
                bd.E();
            }
            am.b();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

