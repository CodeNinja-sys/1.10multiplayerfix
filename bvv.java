/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.UUID;

public class bvv
implements ds {
    private int a;
    private UUID b;
    private int c;
    private double d;
    private double e;
    private double f;
    private int g;
    private int h;
    private int i;
    private byte j;
    private byte k;
    private byte l;
    private bwm m;
    private List n;

    public bvv() {
    }

    public bvv(bga bga2) {
        this.a = bga2.bW();
        this.b = bga2.cx();
        this.c = (byte)vb.a(bga2);
        this.d = bga2.aU;
        this.e = bga2.aV;
        this.f = bga2.aW;
        this.j = (byte)(bga2.ba * 256.0f / 360.0f);
        this.k = (byte)(bga2.bb * 256.0f / 360.0f);
        this.l = (byte)(bga2.aj * 256.0f / 360.0f);
        double d2 = 3.9;
        double d3 = bga2.aX;
        double d4 = bga2.aY;
        double d5 = bga2.aZ;
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d5 < -3.9) {
            d5 = -3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        if (d5 > 3.9) {
            d5 = 3.9;
        }
        this.g = (int)(d3 * 8000.0);
        this.h = (int)(d4 * 8000.0);
        this.i = (int)(d5 * 8000.0);
        this.m = bga2.bY();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.g();
        this.c = si2.E() & 0xFF;
        this.d = si2.P();
        this.e = si2.P();
        this.f = si2.P();
        this.j = si2.E();
        this.k = si2.E();
        this.l = si2.E();
        this.g = si2.G();
        this.h = si2.G();
        this.i = si2.G();
        this.n = bwm.b(si2);
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.B(this.c & 0xFF);
        si2.a(this.d);
        si2.a(this.e);
        si2.a(this.f);
        si2.B(this.j);
        si2.B(this.k);
        si2.B(this.l);
        si2.C(this.g);
        si2.C(this.h);
        si2.C(this.i);
        this.m.a(si2);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public List a() {
        if (this.n == null) {
            this.n = this.m.c();
        }
        return this.n;
    }

    public int b() {
        return this.a;
    }

    public UUID c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }

    public double g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public byte k() {
        return this.j;
    }

    public byte l() {
        return this.k;
    }

    public byte m() {
        return this.l;
    }
}

