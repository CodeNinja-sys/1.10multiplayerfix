/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import net.minecraft.client.g.a.p;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;

public class b {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public float[] i;
    public int j;

    public b(int n2, int n3, boolean bl2) {
        this.e = bl2;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new float[4];
        this.i[0] = 1.0f;
        this.i[1] = 1.0f;
        this.i[2] = 1.0f;
        this.i[3] = 0.0f;
        this.a(n2, n3);
    }

    public void a(int n2, int n3) {
        if (!ay.i()) {
            this.c = n2;
            this.d = n3;
        } else {
            bd.j();
            if (this.f >= 0) {
                this.a();
            }
            this.b(n2, n3);
            this.b();
            ay.h(ay.c, 0);
        }
    }

    public void a() {
        if (ay.i()) {
            this.d();
            this.e();
            if (this.h > -1) {
                ay.h(this.h);
                this.h = -1;
            }
            if (this.g > -1) {
                p.a(this.g);
                this.g = -1;
            }
            if (this.f > -1) {
                ay.h(ay.c, 0);
                ay.i(this.f);
                this.f = -1;
            }
        }
    }

    public void b(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.a = n2;
        this.b = n3;
        if (!ay.i()) {
            this.f();
        } else {
            this.f = ay.g();
            this.g = p.a();
            if (this.e) {
                this.h = ay.h();
            }
            this.a(9728);
            bd.i(this.g);
            bd.a(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, null);
            ay.h(ay.c, this.f);
            ay.a(ay.c, ay.e, 3553, this.g, 0);
            if (this.e) {
                ay.i(ay.d, this.h);
                ay.a(ay.d, 33190, this.a, this.b);
                ay.b(ay.c, ay.f, ay.d, this.h);
            }
            this.f();
            this.d();
        }
    }

    public void a(int n2) {
        if (ay.i()) {
            this.j = n2;
            bd.i(this.g);
            bd.b(3553, 10241, n2);
            bd.b(3553, 10240, n2);
            bd.b(3553, 10242, 10496);
            bd.b(3553, 10243, 10496);
            bd.i(0);
        }
    }

    public void b() {
        int n2 = ay.j(ay.c);
        if (n2 != ay.g) {
            if (n2 == ay.h) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
            }
            if (n2 == ay.i) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
            if (n2 == ay.j) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
            }
            if (n2 == ay.k) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n2);
        }
    }

    public void c() {
        if (ay.i()) {
            bd.i(this.g);
        }
    }

    public void d() {
        if (ay.i()) {
            bd.i(0);
        }
    }

    public void a(boolean bl2) {
        if (ay.i()) {
            ay.h(ay.c, this.f);
            if (bl2) {
                bd.b(0, 0, this.c, this.d);
            }
        }
    }

    public void e() {
        if (ay.i()) {
            ay.h(ay.c, 0);
        }
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.i[0] = f2;
        this.i[1] = f3;
        this.i[2] = f4;
        this.i[3] = f5;
    }

    public void c(int n2, int n3) {
        this.a(n2, n3, true);
    }

    public void a(int n2, int n3, boolean bl2) {
        if (ay.i()) {
            bd.a(true, true, true, false);
            bd.i();
            bd.a(false);
            bd.l(5889);
            bd.C();
            bd.a(0.0, n2, n3, 0.0, 1000.0, 3000.0);
            bd.l(5888);
            bd.C();
            bd.c(0.0f, 0.0f, -2000.0f);
            bd.b(0, 0, n2, n3);
            bd.v();
            bd.f();
            bd.c();
            if (bl2) {
                bd.k();
                bd.g();
            }
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.c();
            float f2 = n2;
            float f3 = n3;
            float f4 = (float)this.c / (float)this.a;
            float f5 = (float)this.d / (float)this.b;
            ci ci2 = ci.a();
            g g2 = ci2.c();
            g2.a(7, net.minecraft.client.g.d.b.i);
            g2.b(0.0, (double)f3, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
            g2.b((double)f2, (double)f3, 0.0).a(f4, 0.0).b(255, 255, 255, 255).d();
            g2.b((double)f2, 0.0, 0.0).a(f4, f5).b(255, 255, 255, 255).d();
            g2.b(0.0, 0.0, 0.0).a(0.0, f5).b(255, 255, 255, 255).d();
            ci2.b();
            this.d();
            bd.a(true);
            bd.a(true, true, true, true);
        }
    }

    public void f() {
        this.a(true);
        bd.a(this.i[0], this.i[1], this.i[2], this.i[3]);
        int n2 = 16384;
        if (this.e) {
            bd.a(1.0);
            n2 |= 0x100;
        }
        bd.k(n2);
        this.e();
    }
}

