/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.w;

public class h {
    public w a;
    public w b;
    public w c;
    public w d;
    public float e = 0.0f;

    public h() {
        this.a = new w(0.0f, 0.0f, 0.0f);
        this.b = new w(0.0f, 0.0f, -1.0f);
        this.c = new w(0.0f, 1.0f, 0.0f);
        this.d = new w(0.0f, 0.0f, 0.0f);
        this.e = 0.0f;
    }

    public h(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = new w(f2, f3, f4);
        this.b = new w(f5, f6, f7);
        this.c = new w(f8, f9, f10);
        this.d = new w(0.0f, 0.0f, 0.0f);
        this.e = f11;
    }

    public h(w w2, w w3, w w4, float f2) {
        this.a = w2.a();
        this.b = w3.a();
        this.c = w4.a();
        this.d = new w(0.0f, 0.0f, 0.0f);
        this.e = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a.a = f2;
        this.a.b = f3;
        this.a.c = f4;
        this.b.a = f5;
        this.b.b = f6;
        this.b.c = f7;
        this.c.a = f8;
        this.c.b = f9;
        this.c.c = f10;
        this.e = f11;
    }

    public void a(w w2, w w3, w w4, float f2) {
        this.a.a = w2.a;
        this.a.b = w2.b;
        this.a.c = w2.c;
        this.b.a = w3.a;
        this.b.b = w3.b;
        this.b.c = w3.c;
        this.c.a = w4.a;
        this.c.b = w4.b;
        this.c.c = w4.c;
        this.e = f2;
    }

    public void a(h h2) {
        this.a.a = h2.a.a;
        this.a.b = h2.a.b;
        this.a.c = h2.a.c;
        this.b.a = h2.b.a;
        this.b.b = h2.b.b;
        this.b.c = h2.b.c;
        this.c.a = h2.c.a;
        this.c.b = h2.c.b;
        this.c.c = h2.c.c;
        this.e = h2.e;
    }

    public void a(float f2, float f3, float f4) {
        this.a.a = f2;
        this.a.b = f3;
        this.a.c = f4;
    }

    public void a(w w2) {
        this.a.a = w2.a;
        this.a.b = w2.b;
        this.a.c = w2.c;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b.a = f2;
        this.b.b = f3;
        this.b.c = f4;
        this.c.a = f5;
        this.c.b = f6;
        this.c.c = f7;
    }

    public void a(w w2, w w3) {
        this.b.a = w2.a;
        this.b.b = w2.b;
        this.b.c = w2.c;
        this.c.a = w3.a;
        this.c.b = w3.b;
        this.c.c = w3.c;
    }

    public void b(w w2) {
        this.d.a = w2.a;
        this.d.b = w2.b;
        this.d.c = w2.c;
    }

    public void b(float f2, float f3, float f4) {
        this.d.a = f2;
        this.d.b = f3;
        this.d.c = f4;
    }

    public void a(float f2) {
        this.e = f2;
        this.b.a = -1.0f * (float)Math.sin(this.e);
        this.b.c = -1.0f * (float)Math.cos(this.e);
    }
}

