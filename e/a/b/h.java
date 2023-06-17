/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.a;
import e.a.b.c;
import e.a.d;
import e.a.n;
import e.a.p;
import e.a.u;
import e.a.w;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;

public class h
extends u {
    protected e.a.b.a F;
    public e.a.h G;
    private float H;

    public h(e.a.h h2, boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        super(bl2, bl3, bl4, string, d2, n2, f2, f3, f4, n3, f5, bl5);
        this.F = (e.a.b.a)this.s;
        this.H = 0.0f;
        this.a = c.class;
        this.G = h2;
        this.g();
    }

    public h(e.a.h h2, u u2, n n2) {
        super(u2, n2);
        this.F = (e.a.b.a)this.s;
        this.H = 0.0f;
        this.a = c.class;
        this.G = h2;
        this.g();
    }

    public h(e.a.h h2, AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        super(audioFormat, bl2, string, f2, f3, f4, n2, f5);
        this.F = (e.a.b.a)this.s;
        this.H = 0.0f;
        this.a = c.class;
        this.G = h2;
        this.g();
    }

    public void a() {
        super.a();
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        super.a(bl2, bl3, bl4, string, d2, n2, f2, f3, f4, n3, f5, bl5);
        if (this.F != null) {
            this.F.a(bl4);
        }
        this.g();
    }

    public void f() {
        this.g();
    }

    public void b(float f2, float f3, float f4) {
        super.b(f2, f3, f4);
        this.g();
    }

    public void a(float f2, float f3, float f4) {
        super.a(f2, f3, f4);
        this.g();
    }

    public void g() {
        this.y();
        this.z();
        this.A();
    }

    public void b(float f2) {
        super.b(f2);
        this.A();
    }

    public void a(int n2) {
        super.a(n2);
        this.y();
    }

    public void a(float f2) {
        super.a(f2);
        this.y();
    }

    public void a(a a2) {
        boolean bl2;
        if (!this.s()) {
            if (this.g) {
                this.h = true;
            }
            return;
        }
        if (a2 == null) {
            this.d("Unable to play source, because channel was null");
            return;
        }
        boolean bl3 = bl2 = this.s != a2;
        if (this.s != null && this.s.c != this) {
            bl2 = true;
        }
        boolean bl4 = this.v();
        boolean bl5 = this.u();
        super.a(a2);
        this.F = (e.a.b.a)this.s;
        if (bl2) {
            if (this.F != null) {
                this.F.a(this.g);
            }
            if (!this.f) {
                if (this.t == null) {
                    this.d("No sound buffer to play");
                    return;
                }
                this.F.a(this.t);
            }
        }
        this.g();
        if (bl5 || !this.t()) {
            if (this.f && !bl4) {
                this.z = true;
            }
            this.s.g();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean l() {
        if (this.u == null) {
            return false;
        }
        boolean bl2 = false;
        LinkedList<byte[]> linkedList = this.y;
        synchronized (linkedList) {
            if (this.w == null || this.w.isEmpty()) {
                bl2 = true;
            }
        }
        linkedList = new LinkedList<byte[]>();
        if (this.v != null && !bl2) {
            this.u = this.v;
            this.v = null;
            Object object = this.y;
            synchronized (object) {
                while (!this.w.isEmpty()) {
                    this.t = (n)this.w.remove(0);
                    if (this.t == null || this.t.a == null) continue;
                    linkedList.add(this.t.a);
                }
            }
        } else {
            this.u.a(this.j.b());
            for (int i2 = 0; i2 < e.a.p.m(); ++i2) {
                this.t = this.u.b();
                if (this.t == null || this.t.a == null) break;
                linkedList.add(this.t.a);
            }
            this.F.b(this.u.f());
        }
        this.g();
        this.s.a(linkedList);
        this.z = false;
        return true;
    }

    public void y() {
        float f2 = this.k.a - this.G.a.a;
        float f3 = this.k.b - this.G.a.b;
        float f4 = this.k.c - this.G.a.c;
        this.r = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
        switch (this.l) {
            case 2: {
                if (this.r <= 0.0f) {
                    this.o = 1.0f;
                    break;
                }
                if (this.r >= this.m) {
                    this.o = 0.0f;
                    break;
                }
                this.o = 1.0f - this.r / this.m;
                break;
            }
            case 1: {
                if (this.r <= 0.0f) {
                    this.o = 1.0f;
                    break;
                }
                float f5 = 5.0E-4f;
                float f6 = this.m * this.r * this.r * f5;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                this.o = 1.0f / (1.0f + f6);
                break;
            }
            default: {
                this.o = 1.0f;
            }
        }
        if (this.o > 1.0f) {
            this.o = 1.0f;
        }
        if (this.o < 0.0f) {
            this.o = 0.0f;
        }
        this.o *= this.p * e.a.p.e() * Math.abs(this.A) * this.B;
        if (this.s != null && this.s.c == this && this.F != null) {
            this.F.b(this.o);
        }
    }

    public void z() {
        w w2 = this.G.c.a(this.G.b);
        w2.c();
        float f2 = this.k.b(this.k.d(this.G.a), w2);
        float f3 = this.k.b(this.k.d(this.G.a), this.G.b);
        w2 = null;
        float f4 = (float)Math.atan2(f2, f3);
        this.H = (float)(-Math.sin(f4));
        if (this.s != null && this.s.c == this && this.F != null) {
            if (this.l == 0) {
                this.F.a(0.0f);
            } else {
                this.F.a(this.H);
            }
        }
    }

    public void A() {
        if (this.s != null && this.s.c == this && this.F != null) {
            if (e.a.p.g() == 0.0f) {
                this.F.c(this.q);
            } else {
                float f2 = 343.3f;
                w w2 = this.n;
                w w3 = this.G.d;
                float f3 = e.a.p.h();
                float f4 = e.a.p.g();
                w w4 = this.G.a.d(this.k);
                float f5 = w4.b(w3) / w4.b();
                float f6 = w4.b(w2) / w4.b();
                f6 = this.a(f6, f2 / f4);
                float f7 = this.q * (f2 * f3 - f4 * (f5 = this.a(f5, f2 / f4))) / (f2 * f3 - f4 * f6);
                if (f7 < 0.5f) {
                    f7 = 0.5f;
                } else if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                this.F.c(f7);
            }
        }
    }

    public float a(float f2, float f3) {
        if (f2 < f3) {
            return f2;
        }
        return f3;
    }
}

