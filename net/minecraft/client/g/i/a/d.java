/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.p;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bj;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.au;
import net.minecraft.client.g.j;
import net.minecraft.client.j.t;
import net.minecraft.client.r;
import net.minecraft.w.h.w;

public class d
implements s {
    private final au a;

    public d(au au2) {
        this.a = au2;
    }

    public void a(w w2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!w2.ba() && !w2.cD()) {
            j j2 = r.z().aa();
            this.a.a(f.b);
            bd.p();
            bd.a(bj.a);
            bd.D();
            bd.b(1.0f, -1.0f, 1.0f);
            bd.c(0.2f, 0.35f, 0.5f);
            bd.b(42.0f, 0.0f, 1.0f, 0.0f);
            bd.D();
            bd.c(-0.5f, -0.5f, 0.5f);
            j2.a(p.Q.v(), 1.0f);
            bd.E();
            bd.D();
            bd.c(0.1f, 0.0f, -0.6f);
            bd.b(42.0f, 0.0f, 1.0f, 0.0f);
            bd.c(-0.5f, -0.5f, 0.5f);
            j2.a(p.Q.v(), 1.0f);
            bd.E();
            bd.E();
            bd.D();
            ((t)this.a.f()).a.c(0.0625f);
            bd.b(1.0f, -1.0f, 1.0f);
            bd.c(0.0f, 0.7f, -0.2f);
            bd.b(12.0f, 0.0f, 1.0f, 0.0f);
            bd.c(-0.5f, -0.5f, 0.5f);
            j2.a(p.Q.v(), 1.0f);
            bd.E();
            bd.a(bj.b);
            bd.q();
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

