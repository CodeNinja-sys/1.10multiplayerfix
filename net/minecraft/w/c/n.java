/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import java.util.List;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;

public final class n {
    public static o a(net.minecraft.w.n n2, boolean bl2, boolean bl3, net.minecraft.w.n n3) {
        double d2 = n2.aU;
        double d3 = n2.aV;
        double d4 = n2.aW;
        double d5 = n2.aX;
        double d6 = n2.aY;
        double d7 = n2.aZ;
        k k2 = n2.aQ;
        s s2 = new s(d2, d3, d4);
        s s3 = new s(d2 + d5, d3 + d6, d4 + d7);
        o o2 = k2.a(s2, s3, false, true, false);
        if (bl2) {
            if (o2 != null) {
                s3 = new s(o2.c.b, o2.c.c, o2.c.d);
            }
            net.minecraft.w.n n4 = null;
            List list = k2.b(n2, n2.cT().a(d5, d6, d7).b(1.0));
            double d8 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d9;
                a a2;
                o o3;
                net.minecraft.w.n n5 = (net.minecraft.w.n)list.get(i2);
                if (!n5.cg_() || !bl3 && n5.x(n3) || n5.bv || (o3 = (a2 = n5.cT().b(0.3f)).b(s2, s3)) == null || !((d9 = s2.g(o3.c)) < d8) && d8 != 0.0) continue;
                n4 = n5;
                d8 = d9;
            }
            if (n4 != null) {
                o2 = new o(n4);
            }
        }
        return o2;
    }

    public static final void a(net.minecraft.w.n n2, float f2) {
        double d2 = n2.aX;
        double d3 = n2.aY;
        double d4 = n2.aZ;
        float f3 = net.minecraft.u.b.n.a(d2 * d2 + d4 * d4);
        n2.ba = (float)(net.minecraft.u.b.n.b(d4, d2) * 57.29577951308232) + 90.0f;
        n2.bb = (float)(net.minecraft.u.b.n.b((double)f3, d3) * 57.29577951308232) - 90.0f;
        while (n2.bb - n2.bd < -180.0f) {
            n2.bd -= 360.0f;
        }
        while (n2.bb - n2.bd >= 180.0f) {
            n2.bd += 360.0f;
        }
        while (n2.ba - n2.bc < -180.0f) {
            n2.bc -= 360.0f;
        }
        while (n2.ba - n2.bc >= 180.0f) {
            n2.bc += 360.0f;
        }
        n2.bb = n2.bd + (n2.bb - n2.bd) * f2;
        n2.ba = n2.bc + (n2.ba - n2.bc) * f2;
    }
}

