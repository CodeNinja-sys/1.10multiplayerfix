/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class azj
implements ds {
    private int a;
    private UUID b;
    private double c;
    private double d;
    private double e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public azj() {
    }

    public azj(cpk cpk2, int n2) {
        this(cpk2, n2, 0);
    }

    public azj(cpk cpk2, int n2, int n3) {
        this.a = cpk2.bW();
        this.b = cpk2.cx();
        this.c = cpk2.aU;
        this.d = cpk2.aV;
        this.e = cpk2.aW;
        this.i = cmk.d(cpk2.bb * 256.0f / 360.0f);
        this.j = cmk.d(cpk2.ba * 256.0f / 360.0f);
        this.k = n2;
        this.l = n3;
        double d2 = 3.9;
        this.f = (int)(cmk.a(cpk2.aX, -3.9, 3.9) * 8000.0);
        this.g = (int)(cmk.a(cpk2.aY, -3.9, 3.9) * 8000.0);
        this.h = (int)(cmk.a(cpk2.aZ, -3.9, 3.9) * 8000.0);
    }

    public azj(cpk cpk2, int n2, int n3, cmz cmz2) {
        this(cpk2, n2, n3);
        this.c = cmz2.a();
        this.d = cmz2.b();
        this.e = cmz2.c();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.g();
        this.k = si2.E();
        this.c = si2.P();
        this.d = si2.P();
        this.e = si2.P();
        this.i = si2.E();
        this.j = si2.E();
        this.l = si2.K();
        this.f = si2.G();
        this.g = si2.G();
        this.h = si2.G();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.B(this.k);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
        si2.B(this.i);
        si2.B(this.j);
        si2.E(this.l);
        si2.C(this.f);
        si2.C(this.g);
        si2.C(this.h);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public UUID b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public void c(int n2) {
        this.h = n2;
    }

    public void d(int n2) {
        this.l = n2;
    }
}

