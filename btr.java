/*
 * Decompiled with CFR 0.150.
 */
public class btr {
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

    public btr(int n2, int n3, boolean bl2) {
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
        if (!cjg.i()) {
            this.c = n2;
            this.d = n3;
            return;
        }
        cja.j();
        if (this.f >= 0) {
            this.a();
        }
        this.b(n2, n3);
        this.b();
        cjg.h(cjg.c, 0);
    }

    public void a() {
        if (!cjg.i()) {
            return;
        }
        this.d();
        this.e();
        if (this.h > -1) {
            cjg.h(this.h);
            this.h = -1;
        }
        if (this.g > -1) {
            anq.a(this.g);
            this.g = -1;
        }
        if (this.f > -1) {
            cjg.h(cjg.c, 0);
            cjg.i(this.f);
            this.f = -1;
        }
    }

    public void b(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.a = n2;
        this.b = n3;
        if (!cjg.i()) {
            this.f();
            return;
        }
        this.f = cjg.g();
        this.g = anq.a();
        if (this.e) {
            this.h = cjg.h();
        }
        this.a(9728);
        cja.i(this.g);
        cja.a(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, null);
        cjg.h(cjg.c, this.f);
        cjg.a(cjg.c, cjg.e, 3553, this.g, 0);
        if (this.e) {
            cjg.i(cjg.d, this.h);
            cjg.a(cjg.d, 33190, this.a, this.b);
            cjg.b(cjg.c, cjg.f, cjg.d, this.h);
        }
        this.f();
        this.d();
    }

    public void a(int n2) {
        if (cjg.i()) {
            this.j = n2;
            cja.i(this.g);
            cja.b(3553, 10241, n2);
            cja.b(3553, 10240, n2);
            cja.b(3553, 10242, 10496);
            cja.b(3553, 10243, 10496);
            cja.i(0);
        }
    }

    public void b() {
        int n2 = cjg.j(cjg.c);
        if (n2 == cjg.g) {
            return;
        }
        if (n2 == cjg.h) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
        }
        if (n2 == cjg.i) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
        }
        if (n2 == cjg.j) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
        }
        if (n2 == cjg.k) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
        }
        throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n2);
    }

    public void c() {
        if (cjg.i()) {
            cja.i(this.g);
        }
    }

    public void d() {
        if (cjg.i()) {
            cja.i(0);
        }
    }

    public void a(boolean bl2) {
        if (cjg.i()) {
            cjg.h(cjg.c, this.f);
            if (bl2) {
                cja.b(0, 0, this.c, this.d);
            }
        }
    }

    public void e() {
        if (cjg.i()) {
            cjg.h(cjg.c, 0);
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
        if (!cjg.i()) {
            return;
        }
        cja.a(true, true, true, false);
        cja.i();
        cja.a(false);
        cja.l(5889);
        cja.C();
        cja.a(0.0, n2, n3, 0.0, 1000.0, 3000.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -2000.0f);
        cja.b(0, 0, n2, n3);
        cja.v();
        cja.f();
        cja.c();
        if (bl2) {
            cja.k();
            cja.g();
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c();
        float f2 = n2;
        float f3 = n3;
        float f4 = (float)this.c / (float)this.a;
        float f5 = (float)this.d / (float)this.b;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)f3, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        bix2.b((double)f2, (double)f3, 0.0).a(f4, 0.0).b(255, 255, 255, 255).d();
        bix2.b((double)f2, 0.0, 0.0).a(f4, f5).b(255, 255, 255, 255).d();
        bix2.b(0.0, 0.0, 0.0).a(0.0, f5).b(255, 255, 255, 255).d();
        bha2.b();
        this.d();
        cja.a(true);
        cja.a(true, true, true, true);
    }

    public void f() {
        this.a(true);
        cja.a(this.i[0], this.i[1], this.i[2], this.i[3]);
        int n2 = 16384;
        if (this.e) {
            cja.a(1.0);
            n2 |= 0x100;
        }
        cja.k(n2);
        this.e();
    }
}

