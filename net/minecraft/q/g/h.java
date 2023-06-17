/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import com.a.b.k;
import com.a.b.r;
import java.lang.reflect.Type;
import net.minecraft.q.g.a;
import net.minecraft.q.g.l;
import net.minecraft.u.bc;

public class h {
    static final k a = new r().a((Type)((Object)h.class), (Object)new l()).i();
    public float b = 684.412f;
    public float c = 684.412f;
    public float d = 512.0f;
    public float e = 512.0f;
    public float f = 200.0f;
    public float g = 200.0f;
    public float h = 0.5f;
    public float i = 80.0f;
    public float j = 160.0f;
    public float k = 80.0f;
    public float l = 8.5f;
    public float m = 12.0f;
    public float n = 1.0f;
    public float o;
    public float p = 1.0f;
    public float q;
    public int r = 63;
    public boolean s = true;
    public boolean t = true;
    public int u = 8;
    public boolean v = true;
    public boolean w = true;
    public boolean x = true;
    public boolean y = true;
    public boolean z = true;
    public boolean A = true;
    public boolean B = true;
    public int C = 4;
    public boolean D = true;
    public int E = 80;
    public boolean F;
    public int G = -1;
    public int H = 4;
    public int I = 4;
    public int J = 33;
    public int K = 10;
    public int L;
    public int M = 256;
    public int N = 33;
    public int O = 8;
    public int P;
    public int Q = 256;
    public int R = 33;
    public int S = 10;
    public int T;
    public int U = 80;
    public int V = 33;
    public int W = 10;
    public int X;
    public int Y = 80;
    public int Z = 33;
    public int aa = 10;
    public int ab;
    public int ac = 80;
    public int ad = 17;
    public int ae = 20;
    public int af;
    public int ag = 128;
    public int ah = 9;
    public int ai = 20;
    public int aj;
    public int ak = 64;
    public int al = 9;
    public int am = 2;
    public int an;
    public int ao = 32;
    public int ap = 8;
    public int aq = 8;
    public int ar;
    public int as = 16;
    public int at = 8;
    public int au = 1;
    public int av;
    public int aw = 16;
    public int ax = 7;
    public int ay = 1;
    public int az = 16;
    public int aA = 16;

    public static h a(String string) {
        if (string.isEmpty()) {
            return new h();
        }
        try {
            return (h)bc.a(a, string, h.class);
        }
        catch (Exception exception) {
            return new h();
        }
    }

    public String toString() {
        return a.b(this);
    }

    public h() {
        this.a();
    }

    public void a() {
        this.b = 684.412f;
        this.c = 684.412f;
        this.d = 512.0f;
        this.e = 512.0f;
        this.f = 200.0f;
        this.g = 200.0f;
        this.h = 0.5f;
        this.i = 80.0f;
        this.j = 160.0f;
        this.k = 80.0f;
        this.l = 8.5f;
        this.m = 12.0f;
        this.n = 1.0f;
        this.o = 0.0f;
        this.p = 1.0f;
        this.q = 0.0f;
        this.r = 63;
        this.s = true;
        this.t = true;
        this.u = 8;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = 4;
        this.D = true;
        this.E = 80;
        this.F = false;
        this.G = -1;
        this.H = 4;
        this.I = 4;
        this.J = 33;
        this.K = 10;
        this.L = 0;
        this.M = 256;
        this.N = 33;
        this.O = 8;
        this.P = 0;
        this.Q = 256;
        this.R = 33;
        this.S = 10;
        this.T = 0;
        this.U = 80;
        this.V = 33;
        this.W = 10;
        this.X = 0;
        this.Y = 80;
        this.Z = 33;
        this.aa = 10;
        this.ab = 0;
        this.ac = 80;
        this.ad = 17;
        this.ae = 20;
        this.af = 0;
        this.ag = 128;
        this.ah = 9;
        this.ai = 20;
        this.aj = 0;
        this.ak = 64;
        this.al = 9;
        this.am = 2;
        this.an = 0;
        this.ao = 32;
        this.ap = 8;
        this.aq = 8;
        this.ar = 0;
        this.as = 16;
        this.at = 8;
        this.au = 1;
        this.av = 0;
        this.aw = 16;
        this.ax = 7;
        this.ay = 1;
        this.az = 16;
        this.aA = 16;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            h h2 = (h)object;
            return this.aa != h2.aa ? false : (this.ac != h2.ac ? false : (this.ab != h2.ab ? false : (this.Z != h2.Z ? false : (Float.compare(h2.l, this.l) != 0 ? false : (Float.compare(h2.o, this.o) != 0 ? false : (Float.compare(h2.n, this.n) != 0 ? false : (Float.compare(h2.q, this.q) != 0 ? false : (Float.compare(h2.p, this.p) != 0 ? false : (this.H != h2.H ? false : (this.ae != h2.ae ? false : (this.ag != h2.ag ? false : (this.af != h2.af ? false : (this.ad != h2.ad ? false : (Float.compare(h2.b, this.b) != 0 ? false : (Float.compare(h2.h, this.h) != 0 ? false : (Float.compare(h2.f, this.f) != 0 ? false : (Float.compare(h2.g, this.g) != 0 ? false : (this.au != h2.au ? false : (this.aw != h2.aw ? false : (this.av != h2.av ? false : (this.at != h2.at ? false : (this.W != h2.W ? false : (this.Y != h2.Y ? false : (this.X != h2.X ? false : (this.V != h2.V ? false : (this.K != h2.K ? false : (this.M != h2.M ? false : (this.L != h2.L ? false : (this.J != h2.J ? false : (this.u != h2.u ? false : (this.G != h2.G ? false : (this.am != h2.am ? false : (this.ao != h2.ao ? false : (this.an != h2.an ? false : (this.al != h2.al ? false : (this.S != h2.S ? false : (this.U != h2.U ? false : (this.T != h2.T ? false : (this.R != h2.R ? false : (this.O != h2.O ? false : (this.Q != h2.Q ? false : (this.P != h2.P ? false : (this.N != h2.N ? false : (Float.compare(h2.c, this.c) != 0 ? false : (this.ai != h2.ai ? false : (this.ak != h2.ak ? false : (this.aj != h2.aj ? false : (this.ah != h2.ah ? false : (this.az != h2.az ? false : (this.ay != h2.ay ? false : (this.ax != h2.ax ? false : (this.aA != h2.aA ? false : (this.E != h2.E ? false : (Float.compare(h2.e, this.e) != 0 ? false : (Float.compare(h2.i, this.i) != 0 ? false : (Float.compare(h2.j, this.j) != 0 ? false : (Float.compare(h2.k, this.k) != 0 ? false : (this.aq != h2.aq ? false : (this.as != h2.as ? false : (this.ar != h2.ar ? false : (this.ap != h2.ap ? false : (this.I != h2.I ? false : (this.r != h2.r ? false : (Float.compare(h2.m, this.m) != 0 ? false : (Float.compare(h2.d, this.d) != 0 ? false : (this.s != h2.s ? false : (this.t != h2.t ? false : (this.D != h2.D ? false : (this.F != h2.F ? false : (this.x != h2.x ? false : (this.A != h2.A ? false : (this.v != h2.v ? false : (this.y != h2.y ? false : (this.z != h2.z ? false : (this.w != h2.w ? false : (this.B != h2.B ? false : this.C == h2.C))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b == 0.0f ? 0 : Float.floatToIntBits(this.b);
        n2 = 31 * n2 + (this.c == 0.0f ? 0 : Float.floatToIntBits(this.c));
        n2 = 31 * n2 + (this.d == 0.0f ? 0 : Float.floatToIntBits(this.d));
        n2 = 31 * n2 + (this.e == 0.0f ? 0 : Float.floatToIntBits(this.e));
        n2 = 31 * n2 + (this.f == 0.0f ? 0 : Float.floatToIntBits(this.f));
        n2 = 31 * n2 + (this.g == 0.0f ? 0 : Float.floatToIntBits(this.g));
        n2 = 31 * n2 + (this.h == 0.0f ? 0 : Float.floatToIntBits(this.h));
        n2 = 31 * n2 + (this.i == 0.0f ? 0 : Float.floatToIntBits(this.i));
        n2 = 31 * n2 + (this.j == 0.0f ? 0 : Float.floatToIntBits(this.j));
        n2 = 31 * n2 + (this.k == 0.0f ? 0 : Float.floatToIntBits(this.k));
        n2 = 31 * n2 + (this.l == 0.0f ? 0 : Float.floatToIntBits(this.l));
        n2 = 31 * n2 + (this.m == 0.0f ? 0 : Float.floatToIntBits(this.m));
        n2 = 31 * n2 + (this.n == 0.0f ? 0 : Float.floatToIntBits(this.n));
        n2 = 31 * n2 + (this.o == 0.0f ? 0 : Float.floatToIntBits(this.o));
        n2 = 31 * n2 + (this.p == 0.0f ? 0 : Float.floatToIntBits(this.p));
        n2 = 31 * n2 + (this.q == 0.0f ? 0 : Float.floatToIntBits(this.q));
        n2 = 31 * n2 + this.r;
        n2 = 31 * n2 + (this.s ? 1 : 0);
        n2 = 31 * n2 + (this.t ? 1 : 0);
        n2 = 31 * n2 + this.u;
        n2 = 31 * n2 + (this.v ? 1 : 0);
        n2 = 31 * n2 + (this.w ? 1 : 0);
        n2 = 31 * n2 + (this.x ? 1 : 0);
        n2 = 31 * n2 + (this.y ? 1 : 0);
        n2 = 31 * n2 + (this.z ? 1 : 0);
        n2 = 31 * n2 + (this.A ? 1 : 0);
        n2 = 31 * n2 + (this.B ? 1 : 0);
        n2 = 31 * n2 + this.C;
        n2 = 31 * n2 + (this.D ? 1 : 0);
        n2 = 31 * n2 + this.E;
        n2 = 31 * n2 + (this.F ? 1 : 0);
        n2 = 31 * n2 + this.G;
        n2 = 31 * n2 + this.H;
        n2 = 31 * n2 + this.I;
        n2 = 31 * n2 + this.J;
        n2 = 31 * n2 + this.K;
        n2 = 31 * n2 + this.L;
        n2 = 31 * n2 + this.M;
        n2 = 31 * n2 + this.N;
        n2 = 31 * n2 + this.O;
        n2 = 31 * n2 + this.P;
        n2 = 31 * n2 + this.Q;
        n2 = 31 * n2 + this.R;
        n2 = 31 * n2 + this.S;
        n2 = 31 * n2 + this.T;
        n2 = 31 * n2 + this.U;
        n2 = 31 * n2 + this.V;
        n2 = 31 * n2 + this.W;
        n2 = 31 * n2 + this.X;
        n2 = 31 * n2 + this.Y;
        n2 = 31 * n2 + this.Z;
        n2 = 31 * n2 + this.aa;
        n2 = 31 * n2 + this.ab;
        n2 = 31 * n2 + this.ac;
        n2 = 31 * n2 + this.ad;
        n2 = 31 * n2 + this.ae;
        n2 = 31 * n2 + this.af;
        n2 = 31 * n2 + this.ag;
        n2 = 31 * n2 + this.ah;
        n2 = 31 * n2 + this.ai;
        n2 = 31 * n2 + this.aj;
        n2 = 31 * n2 + this.ak;
        n2 = 31 * n2 + this.al;
        n2 = 31 * n2 + this.am;
        n2 = 31 * n2 + this.an;
        n2 = 31 * n2 + this.ao;
        n2 = 31 * n2 + this.ap;
        n2 = 31 * n2 + this.aq;
        n2 = 31 * n2 + this.ar;
        n2 = 31 * n2 + this.as;
        n2 = 31 * n2 + this.at;
        n2 = 31 * n2 + this.au;
        n2 = 31 * n2 + this.av;
        n2 = 31 * n2 + this.aw;
        n2 = 31 * n2 + this.ax;
        n2 = 31 * n2 + this.ay;
        n2 = 31 * n2 + this.az;
        n2 = 31 * n2 + this.aA;
        return n2;
    }

    public a b() {
        return new a(this, null);
    }
}

