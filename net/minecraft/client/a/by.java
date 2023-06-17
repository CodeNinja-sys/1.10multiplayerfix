/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.f;
import net.minecraft.client.r;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class by
extends cb {
    private final n a;
    private final n b;
    private int L;
    private final int M;
    private final float N;
    private final f O = net.minecraft.client.r.z().ab();

    public by(k k2, n n2, n n3, float f2) {
        super(k2, n2.aU, n2.aV, n2.aW, n2.aX, n2.aY, n2.aZ);
        this.a = n2;
        this.b = n3;
        this.M = 3;
        this.N = f2;
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.L + f2) / (float)this.M;
        f8 *= f8;
        double d2 = this.a.aU;
        double d3 = this.a.aV;
        double d4 = this.a.aW;
        double d5 = this.b.br + (this.b.aU - this.b.br) * (double)f2;
        double d6 = this.b.bs + (this.b.aV - this.b.bs) * (double)f2 + (double)this.N;
        double d7 = this.b.bt + (this.b.aW - this.b.bt) * (double)f2;
        double d8 = d2 + (d5 - d2) * (double)f8;
        double d9 = d3 + (d6 - d3) * (double)f8;
        double d10 = d4 + (d7 - d4) * (double)f8;
        int n3 = this.a(f2);
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        ay.a(ay.r, n4, (float)n5);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.e();
        this.O.a(this.a, d8 -= H, d9 -= I, d10 -= J, this.a.ba, f2, false);
    }

    @Override
    public void b() {
        ++this.L;
        if (this.L == this.M) {
            this.h();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

