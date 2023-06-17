/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.c.a.a;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.i;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;

public class ay
extends de
implements i {
    private static final bp b = new bp("textures/gui/widgets.png");
    public static final bp a = new bp("textures/gui/spectator_widgets.png");
    private final r c;
    private long d;
    private j e;

    public ay(r r2) {
        this.c = r2;
    }

    public void a(int n2) {
        this.d = r.I();
        if (this.e != null) {
            this.e.b(n2);
        } else {
            this.e = new j(this);
        }
    }

    private float c() {
        long l2 = this.d - r.I() + 5000L;
        return n.a((float)l2 / 2000.0f, 0.0f, 1.0f);
    }

    public void a(cv cv2, float f2) {
        if (this.e != null) {
            float f3 = this.c();
            if (f3 <= 0.0f) {
                this.e.d();
            } else {
                int n2 = cv2.a() / 2;
                float f4 = this.B;
                this.B = -90.0f;
                float f5 = (float)cv2.b() - 22.0f * f3;
                a a2 = this.e.f();
                this.a(cv2, f3, n2, f5, a2);
                this.B = f4;
            }
        }
    }

    protected void a(cv cv2, float f2, int n2, float f3, a a2) {
        bd.A();
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(1.0f, 1.0f, 1.0f, f2);
        this.c.N().a(b);
        this.a(n2 - 91, f3, 0, 0, 182, 22);
        if (a2.a() >= 0) {
            this.a(n2 - 91 - 1 + a2.a() * 20, f3 - 1.0f, 0, 22, 24, 22);
        }
        am.c();
        for (int i2 = 0; i2 < 9; ++i2) {
            this.a(i2, cv2.a() / 2 - 90 + i2 * 20 + 2, f3 + 3.0f, f2, a2.a(i2));
        }
        am.a();
        bd.B();
        bd.k();
    }

    private void a(int n2, int n3, float f2, float f3, f f4) {
        this.c.N().a(a);
        if (f4 != j.a) {
            int n4 = (int)(f3 * 255.0f);
            bd.D();
            bd.c((float)n3, f2, 0.0f);
            float f5 = f4.cv_() ? 1.0f : 0.25f;
            bd.c(f5, f5, f5, f3);
            f4.a(f5, n4);
            bd.E();
            String string = String.valueOf(net.minecraft.client.b.a.a(this.c.w.an[n2].j()));
            if (n4 > 3 && f4.cv_()) {
                this.c.m.a(string, (float)(n3 + 19 - 2 - this.c.m.a(string)), f2 + 6.0f + 3.0f, 0xFFFFFF + (n4 << 24));
            }
        }
    }

    public void a(cv cv2) {
        int n2 = (int)(this.c() * 255.0f);
        if (n2 > 3 && this.e != null) {
            String string;
            f f2 = this.e.b();
            String string2 = string = f2 == j.a ? this.e.c().b().d() : f2.cu_().d();
            if (string != null) {
                int n3 = (cv2.a() - this.c.m.a(string)) / 2;
                int n4 = cv2.b() - 35;
                bd.D();
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                this.c.m.a(string, (float)n3, (float)n4, 0xFFFFFF + (n2 << 24));
                bd.k();
                bd.E();
            }
        }
    }

    @Override
    public void a(j j2) {
        this.e = null;
        this.d = 0L;
    }

    public boolean a() {
        return this.e != null;
    }

    public void b(int n2) {
        int n3;
        for (n3 = this.e.e() + n2; !(n3 < 0 || n3 > 8 || this.e.a(n3) != j.a && this.e.a(n3).cv_()); n3 += n2) {
        }
        if (n3 >= 0 && n3 <= 8) {
            this.e.b(n3);
            this.d = r.I();
        }
    }

    public void b() {
        this.d = r.I();
        if (this.a()) {
            int n2 = this.e.e();
            if (n2 != -1) {
                this.e.b(n2);
            }
        } else {
            this.e = new j(this);
        }
    }
}

