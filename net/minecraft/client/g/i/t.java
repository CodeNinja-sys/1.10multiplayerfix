/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.i;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.u.b.n;
import net.minecraft.w.f.c;

public class t
extends i {
    public t(f f2) {
        super(f2);
    }

    protected void a(c c2, float f2, b b2) {
        int n2 = c2.g();
        if (n2 > -1 && (float)n2 - f2 + 1.0f < 10.0f) {
            float f3 = 1.0f - ((float)n2 - f2 + 1.0f) / 10.0f;
            f3 = n.a(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            bd.b(f4, f4, f4);
        }
        super.a(c2, f2, b2);
        if (n2 > -1 && n2 / 5 % 2 == 0) {
            j j2 = r.z().aa();
            bd.w();
            bd.f();
            bd.l();
            bd.a(ad.l, bc.c);
            bd.c(1.0f, 1.0f, 1.0f, (1.0f - ((float)n2 - f2 + 1.0f) / 100.0f) * 0.8f);
            bd.D();
            j2.a(p.W.v(), 1.0f);
            bd.E();
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.k();
            bd.e();
            bd.v();
        }
    }
}

