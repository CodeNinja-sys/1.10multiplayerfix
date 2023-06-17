/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class abd {
    public float a = 64.0f;
    public float b = 32.0f;
    private int r;
    private int s;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    private boolean t;
    private int u;
    public boolean i;
    public boolean j = true;
    public boolean k;
    public List l = ov.a();
    public List m;
    public final String n;
    private final axg v;
    public float o;
    public float p;
    public float q;

    public abd(axg axg2, String string) {
        this.v = axg2;
        axg2.o.add(this);
        this.n = string;
        this.b(axg2.p, axg2.q);
    }

    public abd(axg axg2) {
        this(axg2, null);
    }

    public abd(axg axg2, int n2, int n3) {
        this(axg2);
        this.a(n2, n3);
    }

    public void a(abd abd2) {
        if (this.m == null) {
            this.m = ov.a();
        }
        this.m.add(abd2);
    }

    public abd a(int n2, int n3) {
        this.r = n2;
        this.s = n3;
        return this;
    }

    public abd a(String string, float f2, float f3, float f4, int n2, int n3, int n4) {
        string = this.n + "." + string;
        bbz bbz2 = this.v.a(string);
        this.a(bbz2.a, bbz2.b);
        this.l.add(new ayd(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f).a(string));
        return this;
    }

    public abd a(float f2, float f3, float f4, int n2, int n3, int n4) {
        this.l.add(new ayd(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f));
        return this;
    }

    public abd a(float f2, float f3, float f4, int n2, int n3, int n4, boolean bl2) {
        this.l.add(new ayd(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f, bl2));
        return this;
    }

    public void a(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        this.l.add(new ayd(this, this.r, this.s, f2, f3, f4, n2, n3, n4, f5));
    }

    public void a(float f2, float f3, float f4) {
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void a(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        cja.c(this.o, this.p, this.q);
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            cja.D();
            cja.c(this.c * f2, this.d * f2, this.e * f2);
            if (this.h != 0.0f) {
                cja.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                cja.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                cja.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            cja.p(this.u);
            if (this.m != null) {
                for (int i2 = 0; i2 < this.m.size(); ++i2) {
                    ((abd)this.m.get(i2)).a(f2);
                }
            }
            cja.E();
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            cja.c(this.c * f2, this.d * f2, this.e * f2);
            cja.p(this.u);
            if (this.m != null) {
                for (int i3 = 0; i3 < this.m.size(); ++i3) {
                    ((abd)this.m.get(i3)).a(f2);
                }
            }
            cja.c(-this.c * f2, -this.d * f2, -this.e * f2);
        } else {
            cja.p(this.u);
            if (this.m != null) {
                for (int i4 = 0; i4 < this.m.size(); ++i4) {
                    ((abd)this.m.get(i4)).a(f2);
                }
            }
        }
        cja.c(-this.o, -this.p, -this.q);
    }

    public void b(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        cja.D();
        cja.c(this.c * f2, this.d * f2, this.e * f2);
        if (this.g != 0.0f) {
            cja.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
        }
        if (this.f != 0.0f) {
            cja.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
        }
        if (this.h != 0.0f) {
            cja.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
        }
        cja.p(this.u);
        cja.E();
    }

    public void c(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            cja.c(this.c * f2, this.d * f2, this.e * f2);
            if (this.h != 0.0f) {
                cja.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                cja.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                cja.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            cja.c(this.c * f2, this.d * f2, this.e * f2);
        }
    }

    private void d(float f2) {
        this.u = avj.a(1);
        cja.f(this.u, 4864);
        bix bix2 = bha.a().c();
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((ayd)this.l.get(i2)).a(bix2, f2);
        }
        cja.H();
        this.t = true;
    }

    public abd b(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        return this;
    }
}

