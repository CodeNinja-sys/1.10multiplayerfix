/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.l.b.b;
import net.minecraft.l.e;
import net.minecraft.l.h;
import net.minecraft.l.i;
import net.minecraft.l.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.h.ak;

public class f {
    public boolean a = false;
    private int e = -1;
    public b b;
    public ak c;
    private int f = 99999999;
    final /* synthetic */ k d;

    public f(k k2) {
        this.d = k2;
    }

    public void a() {
        Object object;
        if (this.a) {
            this.d.l.d(this.d.l.aU, this.d.l.aV, this.d.l.aW);
            object = new Random();
            int n2 = 2;
            int n3 = ((Random)object).nextInt(4) - 2;
            int n4 = ((Random)object).nextInt(4) - 2;
            this.a(new s(this.d.l.aU + (double)n2, this.d.l.aV + 1.5 + (double)n3, this.d.l.aW + (double)n4), this.d.l);
            s s2 = this.d.l.bL();
            for (int i2 = 0; i2 < 5; ++i2) {
                this.b(new s(this.d.l.aU + s2.b * 2.0, this.d.l.aV, this.d.l.aW + s2.d * 2.0));
            }
            if (this.e + 80 == this.d.m) {
                this.d.k.n();
            }
        }
        if (this.d.m == this.f + 100) {
            this.e = this.d.m;
            this.a = true;
            object = net.minecraft.l.e.a(this.d.l.aD(), 4.0f, 12.0f);
            object = new s(((s)object).b, net.minecraft.l.e.a(this.d.j, new cn[]{p.t}, (int)((s)object).b, (int)((s)object).d) + 1, ((s)object).d);
            this.d.l.d(((s)object).b, ((s)object).c, ((s)object).d);
            r.I.n.addAll(h.a(p.c, this.d.j, false, (int)((s)object).b - 1, (int)((s)object).c - 1, (int)((s)object).d - 1, (int)((s)object).b + 2, (int)((s)object).c - 1, (int)((s)object).d + 1));
            r.I.n.addAll(h.a(p.a, this.d.j, true, (int)((s)object).b - 1, (int)((s)object).c, (int)((s)object).d - 1, (int)((s)object).b + 2, (int)((s)object).c + 2, (int)((s)object).d + 1));
            i.a(5);
            k.g = true;
            if (k.d) {
                this.d.y.a(new int[]{k.a(this.d), 1, 1});
            } else {
                int[] arrn = new int[3];
                arrn[0] = k.a(this.d);
                arrn[2] = 1;
                this.d.y.a(arrn);
            }
        }
    }

    private void a(s s2, net.minecraft.w.a.b b2) {
        double d2 = s2.b - b2.aU;
        double d3 = s2.c - (b2.aV + (double)b2.ce_());
        double d4 = s2.d - b2.aW;
        double d5 = n.a(d2 * d2 + d4 * d4);
        float f2 = (float)(n.b(d4, d2) * 57.29577951308232) - 90.0f;
        float f3 = (float)(-(n.b(d3, d5) * 57.29577951308232));
        b2.bb = this.a(b2.bb, f3, 40.0f);
        b2.ba = this.a(b2.am, f2, 40.0f);
    }

    private float a(float f2, float f3, float f4) {
        float f5 = n.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    private void b(s s2) {
        r.I.s = true;
        this.b = new b(this.d.j, true);
        this.b.g = false;
        this.b.h = true;
        this.b.i = 0.0f;
        this.b.b(s2.b, s2.c, s2.d, 0.0f, 0.0f);
        this.b.a(this.d.j.C(new net.minecraft.u.b.b(this.b)), null);
        this.d.j.a(this.b);
    }

    private void c(s s2) {
        this.c = new ak(this.d.j);
        this.c.b(s2.b, s2.c, s2.d, 0.0f, 0.0f);
        this.c.a(this.d.j.C(new net.minecraft.u.b.b(this.c)), null);
        this.d.j.a(this.c);
    }

    public void a(s s2) {
        if (this.a(s2.b, s2.c, s2.d) == p.ab && this.a(s2.b, s2.c - 1.0, s2.d) == p.aV && this.a(s2.b, s2.c - 2.0, s2.d) == p.aW && this.a(s2.b, s2.c - 3.0, s2.d) == p.bT && this.a(s2.b, s2.c - 4.0, s2.d) == p.bT) {
            this.f = this.d.m;
        }
    }

    private cn a(double d2, double d3, double d4) {
        return this.d.j.n(new net.minecraft.u.b.b(d2, d3, d4)).c();
    }
}

