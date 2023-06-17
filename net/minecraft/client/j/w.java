/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.g;
import net.minecraft.client.g.v;
import net.minecraft.client.j.ak;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.bg;

public class w {
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
    private final ap v;
    public float o;
    public float p;
    public float q;

    public w(ap ap2, String string) {
        this.v = ap2;
        ap2.s.add(this);
        this.n = string;
        this.b(ap2.t, ap2.u);
    }

    public w(ap ap2) {
        this(ap2, null);
    }

    public w(ap ap2, int n2, int n3) {
        this(ap2);
        this.a(n2, n3);
    }

    public void a(w w2) {
        if (this.m == null) {
            this.m = ov.a();
        }
        this.m.add(w2);
    }

    public w a(int n2, int n3) {
        this.r = n2;
        this.s = n3;
        return this;
    }

    public w a(String string, float f2, float f3, float f4, int n2, int n3, int n4) {
        string = String.valueOf(this.n) + "." + string;
        ak ak2 = this.v.a(string);
        this.a(ak2.a, ak2.b);
        this.l.add(new bg(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f).a(string));
        return this;
    }

    public w a(float f2, float f3, float f4, int n2, int n3, int n4) {
        this.l.add(new bg(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f));
        return this;
    }

    public w a(float f2, float f3, float f4, int n2, int n3, int n4, boolean bl2) {
        this.l.add(new bg(this, this.r, this.s, f2, f3, f4, n2, n3, n4, 0.0f, bl2));
        return this;
    }

    public void a(float f2, float f3, float f4, int n2, int n3, int n4, float f5) {
        this.l.add(new bg(this, this.r, this.s, f2, f3, f4, n2, n3, n4, f5));
    }

    public void a(float f2, float f3, float f4) {
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public void a(float f2) {
        if (!this.k && this.j) {
            if (!this.t) {
                this.d(f2);
            }
            bd.c(this.o, this.p, this.q);
            if (this.f == 0.0f && this.g == 0.0f && this.h == 0.0f) {
                if (this.c == 0.0f && this.d == 0.0f && this.e == 0.0f) {
                    bd.p(this.u);
                    if (this.m != null) {
                        for (int i2 = 0; i2 < this.m.size(); ++i2) {
                            ((w)this.m.get(i2)).a(f2);
                        }
                    }
                } else {
                    bd.c(this.c * f2, this.d * f2, this.e * f2);
                    bd.p(this.u);
                    if (this.m != null) {
                        for (int i3 = 0; i3 < this.m.size(); ++i3) {
                            ((w)this.m.get(i3)).a(f2);
                        }
                    }
                    bd.c(-this.c * f2, -this.d * f2, -this.e * f2);
                }
            } else {
                bd.D();
                bd.c(this.c * f2, this.d * f2, this.e * f2);
                if (this.h != 0.0f) {
                    bd.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.g != 0.0f) {
                    bd.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.f != 0.0f) {
                    bd.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
                bd.p(this.u);
                if (this.m != null) {
                    for (int i4 = 0; i4 < this.m.size(); ++i4) {
                        ((w)this.m.get(i4)).a(f2);
                    }
                }
                bd.E();
            }
            bd.c(-this.o, -this.p, -this.q);
        }
    }

    public void b(float f2) {
        if (!this.k && this.j) {
            if (!this.t) {
                this.d(f2);
            }
            bd.D();
            bd.c(this.c * f2, this.d * f2, this.e * f2);
            if (this.g != 0.0f) {
                bd.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                bd.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            if (this.h != 0.0f) {
                bd.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            bd.p(this.u);
            bd.E();
        }
    }

    public void c(float f2) {
        if (!this.k && this.j) {
            if (!this.t) {
                this.d(f2);
            }
            if (this.f == 0.0f && this.g == 0.0f && this.h == 0.0f) {
                if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
                    bd.c(this.c * f2, this.d * f2, this.e * f2);
                }
            } else {
                bd.c(this.c * f2, this.d * f2, this.e * f2);
                if (this.h != 0.0f) {
                    bd.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
                }
                if (this.g != 0.0f) {
                    bd.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
                }
                if (this.f != 0.0f) {
                    bd.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void d(float f2) {
        this.u = net.minecraft.client.g.v.a(1);
        bd.f(this.u, 4864);
        g g2 = ci.a().c();
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((bg)this.l.get(i2)).a(g2, f2);
        }
        bd.H();
        this.t = true;
    }

    public w b(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        return this;
    }
}

