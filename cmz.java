/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cmz
extends cjx {
    private static final d a = org.apache.logging.log4j.c.c();
    public static final cmz e = new cmz(0, 0, 0);
    private static final int b;
    private static final int c;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final long i;
    private static final long j;
    private static final long k;

    public cmz(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public cmz(double d2, double d3, double d4) {
        super(d2, d3, d4);
    }

    public cmz(cpk cpk2) {
        this(cpk2.aU, cpk2.aV, cpk2.aW);
    }

    public cmz(amj amj2) {
        this(amj2.b, amj2.c, amj2.d);
    }

    public cmz(cjx cjx2) {
        this(cjx2.a(), cjx2.b(), cjx2.c());
    }

    public cmz f(double d2, double d3, double d4) {
        if (d2 == 0.0 && d3 == 0.0 && d4 == 0.0) {
            return this;
        }
        return new cmz((double)this.a() + d2, (double)this.b() + d3, (double)this.c() + d4);
    }

    public cmz e(int n2, int n3, int n4) {
        if (n2 == 0 && n3 == 0 && n4 == 0) {
            return this;
        }
        return new cmz(this.a() + n2, this.b() + n3, this.c() + n4);
    }

    public cmz g(cjx cjx2) {
        if (cjx2.a() == 0 && cjx2.b() == 0 && cjx2.c() == 0) {
            return this;
        }
        return new cmz(this.a() + cjx2.a(), this.b() + cjx2.b(), this.c() + cjx2.c());
    }

    public cmz h(cjx cjx2) {
        if (cjx2.a() == 0 && cjx2.b() == 0 && cjx2.c() == 0) {
            return this;
        }
        return new cmz(this.a() - cjx2.a(), this.b() - cjx2.b(), this.c() - cjx2.c());
    }

    public cmz g() {
        return this.b(1);
    }

    public cmz b(int n2) {
        return this.c(bqk.b, n2);
    }

    public cmz h() {
        return this.c(1);
    }

    public cmz c(int n2) {
        return this.c(bqk.a, n2);
    }

    public cmz i() {
        return this.d(1);
    }

    public cmz d(int n2) {
        return this.c(bqk.c, n2);
    }

    public cmz j() {
        return this.e(1);
    }

    public cmz e(int n2) {
        return this.c(bqk.d, n2);
    }

    public cmz k() {
        return this.f(1);
    }

    public cmz f(int n2) {
        return this.c(bqk.e, n2);
    }

    public cmz l() {
        return this.g(1);
    }

    public cmz g(int n2) {
        return this.c(bqk.f, n2);
    }

    public cmz c(bqk bqk2) {
        return this.c(bqk2, 1);
    }

    public cmz c(bqk bqk2, int n2) {
        if (n2 == 0) {
            return this;
        }
        return new cmz(this.a() + bqk2.h() * n2, this.b() + bqk2.i() * n2, this.c() + bqk2.j() * n2);
    }

    public cmz i(cjx cjx2) {
        return new cmz(this.b() * cjx2.c() - this.c() * cjx2.b(), this.c() * cjx2.a() - this.a() * cjx2.c(), this.a() * cjx2.b() - this.b() * cjx2.a());
    }

    public long m() {
        return ((long)this.a() & i) << h | ((long)this.b() & j) << g | ((long)this.c() & k) << 0;
    }

    public static cmz a(long l2) {
        int n2 = (int)(l2 << 64 - h - b >> 64 - b);
        int n3 = (int)(l2 << 64 - g - f >> 64 - f);
        int n4 = (int)(l2 << 64 - c >> 64 - c);
        return new cmz(n2, n3, n4);
    }

    public static Iterable a(cmz cmz2, cmz cmz3) {
        cmz cmz4 = new cmz(Math.min(cmz2.a(), cmz3.a()), Math.min(cmz2.b(), cmz3.b()), Math.min(cmz2.c(), cmz3.c()));
        cmz cmz5 = new cmz(Math.max(cmz2.a(), cmz3.a()), Math.max(cmz2.b(), cmz3.b()), Math.max(cmz2.c(), cmz3.c()));
        return new akv(cmz4, cmz5);
    }

    public cmz d() {
        return this;
    }

    public static Iterable b(cmz cmz2, cmz cmz3) {
        cmz cmz4 = new cmz(Math.min(cmz2.a(), cmz3.a()), Math.min(cmz2.b(), cmz3.b()), Math.min(cmz2.c(), cmz3.c()));
        cmz cmz5 = new cmz(Math.max(cmz2.a(), cmz3.a()), Math.max(cmz2.b(), cmz3.b()), Math.max(cmz2.c(), cmz3.c()));
        return new cyz(cmz4, cmz5);
    }

    @Override
    public /* synthetic */ cjx b(cjx cjx2) {
        return this.i(cjx2);
    }

    static /* synthetic */ d n() {
        return a;
    }

    static {
        c = b = 1 + cmk.e(cmk.c(30000000));
        f = 64 - b - c;
        g = 0 + c;
        h = g + f;
        i = (1L << b) - 1L;
        j = (1L << f) - 1L;
        k = (1L << c) - 1L;
    }
}

