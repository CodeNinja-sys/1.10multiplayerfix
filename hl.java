/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class hl
extends ko {
    private Random k;
    private iu l;
    private cmz m = cmz.e;
    int a;
    int b;
    double c = 0.618;
    double d = 0.381;
    double e = 1.0;
    double f = 1.0;
    int g = 1;
    int h = 12;
    int i = 4;
    List j;

    public hl(boolean bl2) {
        super(bl2);
    }

    void a() {
        int n2;
        int n3;
        this.b = (int)((double)this.a * this.c);
        if (this.b >= this.a) {
            this.b = this.a - 1;
        }
        if ((n3 = (int)(1.382 + Math.pow(this.f * (double)this.a / 13.0, 2.0))) < 1) {
            n3 = 1;
        }
        int n4 = this.m.b() + this.b;
        this.j = ov.a();
        this.j.add(new caz(this.m.b(n2), n4));
        for (n2 = this.a - this.i; n2 >= 0; --n2) {
            float f2 = this.a(n2);
            if (f2 < 0.0f) continue;
            for (int i2 = 0; i2 < n3; ++i2) {
                cmz cmz2;
                double d2;
                double d3;
                double d4 = this.e * (double)f2 * ((double)this.k.nextFloat() + 0.328);
                double d5 = d4 * Math.sin(d3 = (double)(this.k.nextFloat() * 2.0f) * Math.PI) + 0.5;
                cmz cmz3 = this.m.f(d5, n2 - 1, d2 = d4 * Math.cos(d3) + 0.5);
                if (this.a(cmz3, cmz2 = cmz3.b(this.i)) != -1) continue;
                int n5 = this.m.a() - cmz3.a();
                int n6 = this.m.c() - cmz3.c();
                double d6 = (double)cmz3.b() - Math.sqrt(n5 * n5 + n6 * n6) * this.d;
                int n7 = d6 > (double)n4 ? n4 : (int)d6;
                cmz cmz4 = new cmz(this.m.a(), n7, this.m.c());
                if (this.a(cmz4, cmz3) != -1) continue;
                this.j.add(new caz(cmz3, cmz4.b()));
            }
        }
    }

    void a(cmz cmz2, float f2, dbk dbk2) {
        int n2 = (int)((double)f2 + 0.618);
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                cmz cmz3;
                ahk ahk2;
                if (!(Math.pow((double)Math.abs(i2) + 0.5, 2.0) + Math.pow((double)Math.abs(i3) + 0.5, 2.0) <= (double)(f2 * f2)) || (ahk2 = this.l.n(cmz3 = cmz2.e(i2, 0, i3)).a()) != ahk.a && ahk2 != ahk.j) continue;
                this.a(this.l, cmz3, dbk2);
            }
        }
    }

    float a(int n2) {
        if ((float)n2 < (float)this.a * 0.3f) {
            return -1.0f;
        }
        float f2 = (float)this.a / 2.0f;
        float f3 = f2 - (float)n2;
        float f4 = cmk.c(f2 * f2 - f3 * f3);
        if (f3 == 0.0f) {
            f4 = f2;
        } else if (Math.abs(f3) >= f2) {
            return 0.0f;
        }
        return f4 * 0.5f;
    }

    float b(int n2) {
        if (n2 < 0 || n2 >= this.i) {
            return -1.0f;
        }
        if (n2 == 0 || n2 == this.i - 1) {
            return 2.0f;
        }
        return 3.0f;
    }

    void a(cmz cmz2) {
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a(cmz2.b(i2), this.b(i2), blg.t.s().a(aai.b, Boolean.valueOf(false)));
        }
    }

    void a(cmz cmz2, cmz cmz3, bfa bfa2) {
        cmz cmz4 = cmz3.e(-cmz2.a(), -cmz2.b(), -cmz2.c());
        int n2 = this.b(cmz4);
        float f2 = (float)cmz4.a() / (float)n2;
        float f3 = (float)cmz4.b() / (float)n2;
        float f4 = (float)cmz4.c() / (float)n2;
        for (int i2 = 0; i2 <= n2; ++i2) {
            cmz cmz5 = cmz2.f(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            fy fy2 = this.b(cmz2, cmz5);
            this.a(this.l, cmz5, bfa2.s().a(bue.b, (Comparable)((Object)fy2)));
        }
    }

    private int b(cmz cmz2) {
        int n2 = cmk.a(cmz2.a());
        int n3 = cmk.a(cmz2.b());
        int n4 = cmk.a(cmz2.c());
        if (n4 > n2 && n4 > n3) {
            return n4;
        }
        if (n3 > n2) {
            return n3;
        }
        return n2;
    }

    private fy b(cmz cmz2, cmz cmz3) {
        int n2;
        fy fy2 = fy.b;
        int n3 = Math.abs(cmz3.a() - cmz2.a());
        int n4 = Math.max(n3, n2 = Math.abs(cmz3.c() - cmz2.c()));
        if (n4 > 0) {
            if (n3 == n4) {
                fy2 = fy.a;
            } else if (n2 == n4) {
                fy2 = fy.c;
            }
        }
        return fy2;
    }

    void b() {
        for (caz caz2 : this.j) {
            this.a(caz2);
        }
    }

    boolean c(int n2) {
        return (double)n2 >= (double)this.a * 0.2;
    }

    void c() {
        cmz cmz2 = this.m;
        cmz cmz3 = this.m.b(this.b);
        bfa bfa2 = blg.r;
        this.a(cmz2, cmz3, bfa2);
        if (this.g == 2) {
            this.a(cmz2.l(), cmz3.l(), bfa2);
            this.a(cmz2.l().j(), cmz3.l().j(), bfa2);
            this.a(cmz2.j(), cmz3.j(), bfa2);
        }
    }

    void d() {
        for (caz caz2 : this.j) {
            int n2 = caz2.e();
            cmz cmz2 = new cmz(this.m.a(), n2, this.m.c());
            if (cmz2.equals(caz2) || !this.c(n2 - this.m.b())) continue;
            this.a(cmz2, (cmz)caz2, blg.r);
        }
    }

    int a(cmz cmz2, cmz cmz3) {
        cmz cmz4 = cmz3.e(-cmz2.a(), -cmz2.b(), -cmz2.c());
        int n2 = this.b(cmz4);
        float f2 = (float)cmz4.a() / (float)n2;
        float f3 = (float)cmz4.b() / (float)n2;
        float f4 = (float)cmz4.c() / (float)n2;
        if (n2 == 0) {
            return -1;
        }
        for (int i2 = 0; i2 <= n2; ++i2) {
            cmz cmz5 = cmz2.f(0.5f + (float)i2 * f2, 0.5f + (float)i2 * f3, 0.5f + (float)i2 * f4);
            if (this.a(this.l.n(cmz5).t())) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void e() {
        this.i = 5;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        this.l = iu2;
        this.m = cmz2;
        this.k = new Random(random.nextLong());
        if (this.a == 0) {
            this.a = 5 + this.k.nextInt(this.h);
        }
        if (!this.f()) {
            return false;
        }
        this.a();
        this.b();
        this.c();
        this.d();
        return true;
    }

    private boolean f() {
        bfa bfa2 = this.l.n(this.m.h()).t();
        if (bfa2 != blg.d && bfa2 != blg.c && bfa2 != blg.ak) {
            return false;
        }
        int n2 = this.a(this.m, this.m.b(this.a - 1));
        if (n2 == -1) {
            return true;
        }
        if (n2 < 6) {
            return false;
        }
        this.a = n2;
        return true;
    }
}

