/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.de;
import net.minecraft.client.m.b;
import net.minecraft.client.r;
import net.minecraft.u.as;
import net.minecraft.u.bh;

public class s
implements as {
    private String a = "";
    private final r b;
    private String c = "";
    private long d = r.I();
    private boolean e;
    private final cv f;
    private final b g;

    public s(r r2) {
        this.b = r2;
        this.f = new cv(r2);
        this.g = new b(r2.e, r2.f, false);
        this.g.a(9728);
    }

    @Override
    public void b(String string) {
        this.e = false;
        this.d(string);
    }

    @Override
    public void a(String string) {
        this.e = true;
        this.d(string);
    }

    private void d(String string) {
        this.c = string;
        if (!this.b.E) {
            if (!this.e) {
                throw new bh();
            }
        } else {
            bd.k(256);
            bd.l(5889);
            bd.C();
            if (ay.i()) {
                int n2 = this.f.e();
                bd.a(0.0, this.f.a() * n2, this.f.b() * n2, 0.0, 100.0, 300.0);
            } else {
                cv cv2 = new cv(this.b);
                bd.a(0.0, cv2.c(), cv2.d(), 0.0, 100.0, 300.0);
            }
            bd.l(5888);
            bd.C();
            bd.c(0.0f, 0.0f, -200.0f);
        }
    }

    @Override
    public void c(String string) {
        if (!this.b.E) {
            if (!this.e) {
                throw new bh();
            }
        } else {
            this.d = 0L;
            this.a = string;
            this.a(-1);
            this.d = 0L;
        }
    }

    @Override
    public void a(int n2) {
        if (!this.b.E) {
            if (!this.e) {
                throw new bh();
            }
        } else {
            long l2 = r.I();
            if (l2 - this.d >= 100L) {
                this.d = l2;
                cv cv2 = new cv(this.b);
                int n3 = cv2.e();
                int n4 = cv2.a();
                int n5 = cv2.b();
                if (ay.i()) {
                    this.g.f();
                } else {
                    bd.k(256);
                }
                this.g.a(false);
                bd.l(5889);
                bd.C();
                bd.a(0.0, cv2.c(), cv2.d(), 0.0, 100.0, 300.0);
                bd.l(5888);
                bd.C();
                bd.c(0.0f, 0.0f, -200.0f);
                if (!ay.i()) {
                    bd.k(16640);
                }
                ci ci2 = ci.a();
                g g2 = ci2.c();
                this.b.N().a(de.y);
                float f2 = 32.0f;
                g2.a(7, net.minecraft.client.g.d.b.i);
                g2.b(0.0, (double)n5, 0.0).a(0.0, (float)n5 / 32.0f).b(64, 64, 64, 255).d();
                g2.b((double)n4, (double)n5, 0.0).a((float)n4 / 32.0f, (float)n5 / 32.0f).b(64, 64, 64, 255).d();
                g2.b((double)n4, 0.0, 0.0).a((float)n4 / 32.0f, 0.0).b(64, 64, 64, 255).d();
                g2.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 255).d();
                ci2.b();
                if (n2 >= 0) {
                    int n6 = 100;
                    int n7 = 2;
                    int n8 = n4 / 2 - 50;
                    int n9 = n5 / 2 + 16;
                    bd.w();
                    g2.a(7, net.minecraft.client.g.d.b.f);
                    g2.b((double)n8, (double)n9, 0.0).b(128, 128, 128, 255).d();
                    g2.b((double)n8, (double)(n9 + 2), 0.0).b(128, 128, 128, 255).d();
                    g2.b((double)(n8 + 100), (double)(n9 + 2), 0.0).b(128, 128, 128, 255).d();
                    g2.b((double)(n8 + 100), (double)n9, 0.0).b(128, 128, 128, 255).d();
                    g2.b((double)n8, (double)n9, 0.0).b(128, 255, 128, 255).d();
                    g2.b((double)n8, (double)(n9 + 2), 0.0).b(128, 255, 128, 255).d();
                    g2.b((double)(n8 + n2), (double)(n9 + 2), 0.0).b(128, 255, 128, 255).d();
                    g2.b((double)(n8 + n2), (double)n9, 0.0).b(128, 255, 128, 255).d();
                    ci2.b();
                    bd.v();
                }
                bd.l();
                bd.a(ad.l, bc.j, ad.e, bc.n);
                this.b.m.a(this.c, (float)((n4 - this.b.m.a(this.c)) / 2), (float)(n5 / 2 - 4 - 16), 0xFFFFFF);
                this.b.m.a(this.a, (float)((n4 - this.b.m.a(this.a)) / 2), (float)(n5 / 2 - 4 + 8), 0xFFFFFF);
                this.g.e();
                if (ay.i()) {
                    this.g.c(n4 * n3, n5 * n3);
                }
                this.b.i();
                try {
                    Thread.yield();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    @Override
    public void a() {
    }
}

