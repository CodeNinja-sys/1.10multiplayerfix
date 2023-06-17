/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.client.r;
import net.minecraft.l.a;
import net.minecraft.l.b.b;
import net.minecraft.l.h;
import net.minecraft.l.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class o {
    public s a;
    private net.minecraft.q.k d;
    private net.minecraft.w.a.b e;
    private int f = 0;
    public boolean b = false;
    private boolean g = false;
    private b h;
    private boolean i = false;
    final /* synthetic */ k c;

    public o(k k2, net.minecraft.w.a.b b2, net.minecraft.q.k k3) {
        this.c = k2;
        this.d = k3;
        this.e = b2;
        this.a = b2.aD();
        this.a = new s((float)Math.round(this.a.b - 0.5) + 0.5f, Math.round(this.a.c - 0.5), (float)Math.round(this.a.d - 0.5) + 0.5f);
        k.g = true;
        this.a(this.a);
        k2.y.a(new int[3]);
    }

    public void a() {
        this.b();
        if (this.f == 25) {
            this.c.u = true;
            this.b(new s(this.a.b + 8.0, this.a.c, this.a.d));
        }
        if (this.f == 100) {
            this.h.h = false;
        }
        if (this.h != null && !this.a(this.h.aD(), new s(this.a.b - 2.0, this.a.c - 2.0, this.a.d - 2.0), new s(this.a.b + 9.0, this.a.c + 2.0, this.a.d + 2.0))) {
            this.h.d(this.a.b + 8.0, this.a.c, this.a.d);
        }
        if (this.h != null) {
            this.h.I().a(r.I.l.aU, r.I.l.aV + (double)r.I.l.ce_(), r.I.l.aW, 10.0f, 40.0f);
        }
        if (this.h != null && !this.i && !this.g && this.h.m(this.e) < 4.0f) {
            new a(this, null).start();
            try {
                Thread.sleep(5000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        ++this.f;
    }

    private boolean a(s s2, s s3, s s4) {
        return s2.b > s3.b && s2.c > s3.c && s2.d > s3.d && s2.b < s4.b && s2.c < s4.c && s2.d < s4.d;
    }

    public void a(s s2) {
        int n2 = (int)Math.round(s2.b - 0.5);
        int n3 = (int)Math.round(s2.c - 0.5);
        int n4 = (int)Math.round(s2.d - 0.5);
        r.I.n.addAll(net.minecraft.l.h.a(p.d, this.d, false, n2 - 1, n3 - 1, n4 - 1, n2 + 9, n3 - 1, n4 + 1));
        r.I.n.addAll(net.minecraft.l.h.a(p.a, this.d, true, n2 - 1, n3, n4 - 1, n2 + 9, n3 + 2, n4 + 1));
    }

    private void b(s s2) {
        r.I.s = true;
        this.h = new b(this.d, true);
        this.h.g = false;
        this.h.h = true;
        this.h.i = 0.4f;
        this.h.b(s2.b, s2.c, s2.d, 0.0f, 0.0f);
        this.h.a(this.d.C(new net.minecraft.u.b.b(this.h)), null);
        this.d.a(this.h);
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

    public void b() {
        this.e.d(this.a.b, this.a.c, this.a.d);
        if (!this.b) {
            this.a(new s(this.a.b + 8.0, this.a.c + 1.5, this.a.d), this.e);
        } else {
            Random random = new Random();
            int n2 = 2;
            int n3 = random.nextInt(4) - 2;
            int n4 = random.nextInt(4) - 2;
            this.a(new s(this.a.b + (double)n2, this.a.c + 1.5 + (double)n3, this.a.d + (double)n4), this.e);
        }
    }

    static /* synthetic */ void a(o o2, boolean bl2) {
        o2.i = bl2;
    }

    static /* synthetic */ void b(o o2, boolean bl2) {
        o2.g = bl2;
    }

    static /* synthetic */ b a(o o2) {
        return o2.h;
    }

    static /* synthetic */ k b(o o2) {
        return o2.c;
    }
}

