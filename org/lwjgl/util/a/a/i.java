/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.ac;
import org.lwjgl.util.a.a.af;
import org.lwjgl.util.a.a.b;
import org.lwjgl.util.a.a.c;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.h;
import org.lwjgl.util.a.a.j;
import org.lwjgl.util.a.a.l;
import org.lwjgl.util.a.a.m;
import org.lwjgl.util.a.a.n;
import org.lwjgl.util.a.a.v;
import org.lwjgl.util.a.d;
import org.lwjgl.util.a.e;
import org.lwjgl.util.a.f;

public class i
implements d {
    public static final int a = 100;
    private int q = 0;
    private g r;
    h b;
    double[] c = new double[3];
    double[] d = new double[3];
    double[] e = new double[3];
    private double s;
    int f;
    boolean g;
    c h;
    n i;
    j j;
    boolean k;
    boolean l;
    org.lwjgl.util.a.a.f m;
    private boolean t;
    int n;
    b[] o = new b[100];
    private Object u;
    private e v;
    private e w;
    private e x;
    private e y;
    private e z;
    private e A;
    private e B;
    private e C;
    private e D;
    private e E;
    private e F;
    private e G;
    private static final double H = 0.0;
    private static e I = new f();

    public i() {
        this.c[0] = 0.0;
        this.c[1] = 0.0;
        this.c[2] = 0.0;
        this.s = 0.0;
        this.f = 100130;
        this.k = false;
        this.l = false;
        this.v = I;
        this.w = I;
        this.x = I;
        this.y = I;
        this.z = I;
        this.A = I;
        this.B = I;
        this.C = I;
        this.D = I;
        this.E = I;
        this.F = I;
        this.G = I;
        this.u = null;
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            this.o[i2] = new b();
        }
    }

    public static d g() {
        return new i();
    }

    private void i() {
        if (this.b != null) {
            org.lwjgl.util.a.a.l.c(this.b);
        }
        this.q = 0;
        this.r = null;
        this.b = null;
    }

    private void d(int n2) {
        if (this.q != n2) {
            this.e(n2);
        }
    }

    private void e(int n2) {
        while (this.q != n2) {
            if (this.q < n2) {
                if (this.q == 0) {
                    this.c(100151);
                    this.a(null);
                    continue;
                }
                if (this.q != 1) continue;
                this.c(100152);
                this.b();
                continue;
            }
            if (this.q == 2) {
                this.c(100154);
                this.c();
                continue;
            }
            if (this.q != 1) continue;
            this.c(100153);
            this.i();
        }
    }

    public void a() {
        this.d(0);
    }

    public void a(int n2, double d2) {
        switch (n2) {
            case 100142: {
                if (d2 < 0.0 || d2 > 1.0) break;
                this.s = d2;
                return;
            }
            case 100140: {
                int n3 = (int)d2;
                if ((double)n3 != d2) break;
                switch (n3) {
                    case 100130: 
                    case 100131: 
                    case 100132: 
                    case 100133: 
                    case 100134: {
                        this.f = n3;
                        return;
                    }
                }
            }
            case 100141: {
                this.l = d2 != 0.0;
                return;
            }
            default: {
                this.c(100900);
                return;
            }
        }
        this.c(100901);
    }

    public void a(int n2, double[] arrd, int n3) {
        switch (n2) {
            case 100142: {
                assert (0.0 <= this.s && this.s <= 1.0);
                arrd[n3] = this.s;
                break;
            }
            case 100140: {
                assert (this.f == 100130 || this.f == 100131 || this.f == 100132 || this.f == 100133 || this.f == 100134);
                arrd[n3] = this.f;
                break;
            }
            case 100141: {
                assert (this.l || !this.l);
                arrd[n3] = this.l ? 1.0 : 0.0;
                break;
            }
            default: {
                arrd[n3] = 0.0;
                this.c(100900);
            }
        }
    }

    public void a(double d2, double d3, double d4) {
        this.c[0] = d2;
        this.c[1] = d3;
        this.c[2] = d4;
    }

    public void a(int n2, e e2) {
        switch (n2) {
            case 100100: {
                this.v = e2 == null ? I : e2;
                return;
            }
            case 100106: {
                this.B = e2 == null ? I : e2;
                return;
            }
            case 100104: {
                this.w = e2 == null ? I : e2;
                this.k = e2 != null;
                return;
            }
            case 100110: {
                this.v = e2 == null ? I : e2;
                this.C = this.v;
                this.k = e2 != null;
                return;
            }
            case 100101: {
                this.x = e2 == null ? I : e2;
                return;
            }
            case 100107: {
                this.D = e2 == null ? I : e2;
                return;
            }
            case 100102: {
                this.y = e2 == null ? I : e2;
                return;
            }
            case 100108: {
                this.E = e2 == null ? I : e2;
                return;
            }
            case 100103: {
                this.z = e2 == null ? I : e2;
                return;
            }
            case 100109: {
                this.F = e2 == null ? I : e2;
                return;
            }
            case 100105: {
                this.A = e2 == null ? I : e2;
                return;
            }
            case 100111: {
                this.G = e2 == null ? I : e2;
                return;
            }
        }
        this.c(100900);
    }

    private boolean a(double[] arrd, Object object) {
        g g2 = this.r;
        if (g2 == null) {
            g2 = org.lwjgl.util.a.a.l.a(this.b);
            if (g2 == null) {
                return false;
            }
            if (!org.lwjgl.util.a.a.l.b(g2, g2.b)) {
                return false;
            }
        } else {
            if (org.lwjgl.util.a.a.l.e(g2) == null) {
                return false;
            }
            g2 = g2.d;
        }
        g2.e.d = object;
        g2.e.e[0] = arrd[0];
        g2.e.e[1] = arrd[1];
        g2.e.e[2] = arrd[2];
        g2.h = 1;
        g2.b.h = -1;
        this.r = g2;
        return true;
    }

    private void b(double[] arrd, Object object) {
        if (this.o[this.n] == null) {
            this.o[this.n] = new b();
        }
        b b2 = this.o[this.n];
        b2.b = object;
        b2.a[0] = arrd[0];
        b2.a[1] = arrd[1];
        b2.a[2] = arrd[2];
        ++this.n;
    }

    private boolean j() {
        b[] arrb = this.o;
        this.b = org.lwjgl.util.a.a.l.a();
        if (this.b == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.n; ++i2) {
            b b2 = arrb[i2];
            if (this.a(b2.a, b2.b)) continue;
            return false;
        }
        this.n = 0;
        this.t = false;
        return true;
    }

    public void a(double[] arrd, int n2, Object object) {
        boolean bl2 = false;
        double[] arrd2 = new double[3];
        this.d(2);
        if (this.t) {
            if (!this.j()) {
                this.c(100902);
                return;
            }
            this.r = null;
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            double d2 = arrd[i2 + n2];
            if (d2 < -1.0E150) {
                d2 = -1.0E150;
                bl2 = true;
            }
            if (d2 > 1.0E150) {
                d2 = 1.0E150;
                bl2 = true;
            }
            arrd2[i2] = d2;
        }
        if (bl2) {
            this.c(100155);
        }
        if (this.b == null) {
            if (this.n < 100) {
                this.b(arrd2, object);
                return;
            }
            if (!this.j()) {
                this.c(100902);
                return;
            }
        }
        if (!this.a(arrd2, object)) {
            this.c(100902);
        }
    }

    public void a(Object object) {
        this.d(0);
        this.q = 1;
        this.n = 0;
        this.t = false;
        this.b = null;
        this.u = object;
    }

    public void b() {
        this.d(1);
        this.q = 2;
        this.r = null;
        if (this.n > 0) {
            this.t = true;
        }
    }

    public void c() {
        this.d(2);
        this.q = 1;
    }

    public void d() {
        try {
            this.d(1);
            this.q = 0;
            if (this.b == null) {
                if (!this.k && org.lwjgl.util.a.a.v.a(this)) {
                    this.u = null;
                    return;
                }
                if (!this.j()) {
                    throw new RuntimeException();
                }
            }
            org.lwjgl.util.a.a.m.b(this);
            if (!ac.f(this)) {
                throw new RuntimeException();
            }
            h h2 = this.b;
            if (!this.g) {
                boolean bl2 = true;
                bl2 = this.l ? af.a(h2, 1, true) : af.a(h2);
                if (!bl2) {
                    throw new RuntimeException();
                }
                org.lwjgl.util.a.a.l.d(h2);
                if (this.v != I || this.y != I || this.x != I || this.w != I || this.B != I || this.E != I || this.D != I || this.C != I) {
                    if (this.l) {
                        org.lwjgl.util.a.a.v.b(this, h2);
                    } else {
                        org.lwjgl.util.a.a.v.a(this, h2);
                    }
                }
            }
            org.lwjgl.util.a.a.l.c(h2);
            this.u = null;
            h2 = null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.c(100902);
        }
    }

    public void e() {
        this.a(null);
        this.b();
    }

    public void a(int n2) {
        this.c();
        this.b();
    }

    public void f() {
        this.c();
        this.d();
    }

    void b(int n2) {
        if (this.B != I) {
            this.B.a(n2, this.u);
        } else {
            this.v.a(n2);
        }
    }

    void b(Object object) {
        if (this.D != I) {
            this.D.a(object, this.u);
        } else {
            this.x.a(object);
        }
    }

    void a(boolean bl2) {
        if (this.C != I) {
            this.C.a(bl2, this.u);
        } else {
            this.w.a(bl2);
        }
    }

    void h() {
        if (this.E != I) {
            this.E.b(this.u);
        } else {
            this.y.a();
        }
    }

    void a(double[] arrd, Object[] arrobject, float[] arrf, Object[] arrobject2) {
        if (this.G != I) {
            this.G.a(arrd, arrobject, arrf, arrobject2, this.u);
        } else {
            this.A.a(arrd, arrobject, arrf, arrobject2);
        }
    }

    void c(int n2) {
        if (this.F != I) {
            this.F.b(n2, this.u);
        } else {
            this.z.b(n2);
        }
    }
}

