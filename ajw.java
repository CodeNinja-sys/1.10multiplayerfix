/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class ajw {
    private final List a = ov.a();
    private double b;
    private double c;
    private double d;
    private double e = this.d = 6.0E7;
    private long f;
    private long g;
    private int h = 29999984;
    private double i = 0.2;
    private double j = 5.0;
    private int k = 15;
    private int l = 5;

    public boolean a(cmz cmz2) {
        return (double)(cmz2.a() + 1) > this.b() && (double)cmz2.a() < this.d() && (double)(cmz2.c() + 1) > this.c() && (double)cmz2.c() < this.e();
    }

    public boolean a(zz zz2) {
        return (double)zz2.e() > this.b() && (double)zz2.c() < this.d() && (double)zz2.f() > this.c() && (double)zz2.d() < this.e();
    }

    public boolean a(cxt cxt2) {
        return cxt2.d > this.b() && cxt2.a < this.d() && cxt2.f > this.c() && cxt2.c < this.e();
    }

    public double a(cpk cpk2) {
        return this.a(cpk2.aU, cpk2.aW);
    }

    public double a(double d2, double d3) {
        double d4 = d3 - this.c();
        double d5 = this.e() - d3;
        double d6 = d2 - this.b();
        double d7 = this.d() - d2;
        double d8 = Math.min(d6, d7);
        d8 = Math.min(d8, d4);
        return Math.min(d8, d5);
    }

    public bqj a() {
        if (this.e < this.d) {
            return bqj.b;
        }
        if (this.e > this.d) {
            return bqj.a;
        }
        return bqj.c;
    }

    public double b() {
        double d2 = this.f() - this.h() / 2.0;
        if (d2 < (double)(-this.h)) {
            d2 = -this.h;
        }
        return d2;
    }

    public double c() {
        double d2 = this.g() - this.h() / 2.0;
        if (d2 < (double)(-this.h)) {
            d2 = -this.h;
        }
        return d2;
    }

    public double d() {
        double d2 = this.f() + this.h() / 2.0;
        if (d2 > (double)this.h) {
            d2 = this.h;
        }
        return d2;
    }

    public double e() {
        double d2 = this.g() + this.h() / 2.0;
        if (d2 > (double)this.h) {
            d2 = this.h;
        }
        return d2;
    }

    public double f() {
        return this.b;
    }

    public double g() {
        return this.c;
    }

    public void b(double d2, double d3) {
        this.b = d2;
        this.c = d3;
        for (adj adj2 : this.k()) {
            adj2.a(this, d2, d3);
        }
    }

    public double h() {
        if (this.a() != bqj.c) {
            double d2 = (float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g);
            if (d2 >= 1.0) {
                this.a(this.e);
            } else {
                return this.d + (this.e - this.d) * d2;
            }
        }
        return this.d;
    }

    public long i() {
        if (this.a() == bqj.c) {
            return 0L;
        }
        return this.f - System.currentTimeMillis();
    }

    public double j() {
        return this.e;
    }

    public void a(double d2) {
        this.d = d2;
        this.e = d2;
        this.g = this.f = System.currentTimeMillis();
        for (adj adj2 : this.k()) {
            adj2.a(this, d2);
        }
    }

    public void a(double d2, double d3, long l2) {
        this.d = d2;
        this.e = d3;
        this.g = System.currentTimeMillis();
        this.f = this.g + l2;
        for (adj adj2 : this.k()) {
            adj2.a(this, d2, d3, l2);
        }
    }

    protected List k() {
        return ov.a((Iterable)this.a);
    }

    public void a(adj adj2) {
        this.a.add(adj2);
    }

    public void a(int n2) {
        this.h = n2;
    }

    public int l() {
        return this.h;
    }

    public double m() {
        return this.j;
    }

    public void b(double d2) {
        this.j = d2;
        for (adj adj2 : this.k()) {
            adj2.c(this, d2);
        }
    }

    public double n() {
        return this.i;
    }

    public void c(double d2) {
        this.i = d2;
        for (adj adj2 : this.k()) {
            adj2.b(this, d2);
        }
    }

    public double o() {
        if (this.f == this.g) {
            return 0.0;
        }
        return Math.abs(this.d - this.e) / (double)(this.f - this.g);
    }

    public int p() {
        return this.k;
    }

    public void b(int n2) {
        this.k = n2;
        for (adj adj2 : this.k()) {
            adj2.a(this, n2);
        }
    }

    public int q() {
        return this.l;
    }

    public void c(int n2) {
        this.l = n2;
        for (adj adj2 : this.k()) {
            adj2.b(this, n2);
        }
    }
}

