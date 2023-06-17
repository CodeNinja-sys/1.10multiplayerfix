/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.f;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.f.c;
import net.minecraft.client.g.f.d;
import net.minecraft.client.g.f.e;
import net.minecraft.client.g.f.f;
import net.minecraft.client.g.f.g;
import net.minecraft.client.k.ce;
import net.minecraft.client.r;

public class b {
    public final c a;
    public final c b;
    public final c c;
    public final c d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public b(r r2) {
        this.a = new d(r2);
        this.b = new g(r2);
        this.c = new f(r2);
        this.d = new e(r2);
    }

    public boolean a() {
        return this.e || this.f || this.g;
    }

    public boolean b() {
        this.e = !this.e;
        return this.e;
    }

    public void a(float f2, long l2) {
        if (this.f) {
            this.a.a(f2, l2);
        }
        if (this.e && !r.z().al()) {
            this.c.a(f2, l2);
        }
        if (this.g) {
            this.b.a(f2, l2);
        }
        if (this.h) {
            this.d.a(f2, l2);
        }
    }

    public static void a(String string, double d2, double d3, double d4, float f2, int n2) {
        r r2 = r.z();
        if (r2.j != null && r2.ab() != null && r2.ab().g != null) {
            ce ce2 = r2.m;
            net.minecraft.client.h.d d5 = r2.j;
            double d6 = d5.br + (d5.aU - d5.br) * (double)f2;
            double d7 = d5.bs + (d5.aV - d5.bs) * (double)f2;
            double d8 = d5.bt + (d5.aW - d5.bt) * (double)f2;
            bd.D();
            bd.c((float)(d2 - d6), (float)(d3 - d7) + 0.07f, (float)(d4 - d8));
            bd.a(0.0f, 1.0f, 0.0f);
            bd.b(0.02f, -0.02f, 0.02f);
            net.minecraft.client.g.i.f f3 = r2.ab();
            bd.b(-f3.e, 0.0f, 1.0f, 0.0f);
            bd.b((float)(f3.g.as == 2 ? 1 : -1) * f3.f, 1.0f, 0.0f, 0.0f);
            bd.f();
            bd.v();
            bd.j();
            bd.a(true);
            bd.b(-1.0f, 1.0f, 1.0f);
            ce2.a(string, -ce2.a(string) / 2, 0, n2);
            bd.e();
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.E();
        }
    }
}

