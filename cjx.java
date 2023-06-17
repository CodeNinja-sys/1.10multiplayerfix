/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;

public class cjx
implements Comparable {
    public static final cjx d = new cjx(0, 0, 0);
    private final int a;
    private final int b;
    private final int c;

    public cjx(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public cjx(double d2, double d3, double d4) {
        this(cmk.c(d2), cmk.c(d3), cmk.c(d4));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cjx)) {
            return false;
        }
        cjx cjx2 = (cjx)object;
        if (this.a() != cjx2.a()) {
            return false;
        }
        if (this.b() != cjx2.b()) {
            return false;
        }
        return this.c() == cjx2.c();
    }

    public int hashCode() {
        return (this.b() + this.c() * 31) * 31 + this.a();
    }

    public int e(cjx cjx2) {
        if (this.b() == cjx2.b()) {
            if (this.c() == cjx2.c()) {
                return this.a() - cjx2.a();
            }
            return this.c() - cjx2.c();
        }
        return this.b() - cjx2.b();
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public cjx b(cjx cjx2) {
        return new cjx(this.b() * cjx2.c() - this.c() * cjx2.b(), this.c() * cjx2.a() - this.a() * cjx2.c(), this.a() * cjx2.b() - this.b() * cjx2.a());
    }

    public double d(int n2, int n3, int n4) {
        double d2 = this.a() - n2;
        double d3 = this.b() - n3;
        double d4 = this.c() - n4;
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double d(double d2, double d3, double d4) {
        double d5 = (double)this.a() - d2;
        double d6 = (double)this.b() - d3;
        double d7 = (double)this.c() - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double e(double d2, double d3, double d4) {
        double d5 = (double)this.a() + 0.5 - d2;
        double d6 = (double)this.b() + 0.5 - d3;
        double d7 = (double)this.c() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double f(cjx cjx2) {
        return this.d((double)cjx2.a(), (double)cjx2.b(), (double)cjx2.c());
    }

    public String toString() {
        return cc.a((Object)this).a("x", this.a()).a("y", this.b()).a("z", this.c()).toString();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.e((cjx)object);
    }
}

