/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.cv;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cko
implements Comparable {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bfv b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public cko(bfv bfv2) {
        this(bfv2, 0, 0);
    }

    public cko(bfv bfv2, int n2) {
        this(bfv2, n2, 0);
    }

    public cko(bfv bfv2, int n2, int n3) {
        this(bfv2, n2, n3, false, true);
    }

    public cko(bfv bfv2, int n2, int n3, boolean bl2, boolean bl3) {
        this.b = bfv2;
        this.c = n2;
        this.d = n3;
        this.f = bl2;
        this.h = bl3;
    }

    public cko(cko cko2) {
        this.b = cko2.b;
        this.c = cko2.c;
        this.d = cko2.d;
        this.f = cko2.f;
        this.h = cko2.h;
    }

    public void a(cko cko2) {
        if (this.b != cko2.b) {
            a.f("This method should only be called for matching effects!");
        }
        if (cko2.d > this.d) {
            this.d = cko2.d;
            this.c = cko2.c;
        } else if (cko2.d == this.d && this.c < cko2.c) {
            this.c = cko2.c;
        } else if (!cko2.f && this.f) {
            this.f = cko2.f;
        }
        this.h = cko2.h;
    }

    public bfv a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.h;
    }

    public boolean a(bga bga2) {
        if (this.c > 0) {
            if (this.b.b(this.c, this.d)) {
                this.b(bga2);
            }
            this.h();
        }
        return this.c > 0;
    }

    private int h() {
        return --this.c;
    }

    public void b(bga bga2) {
        if (this.c > 0) {
            this.b.a(bga2, this.d);
        }
    }

    public String f() {
        return this.b.b();
    }

    public String toString() {
        String string = this.d > 0 ? this.f() + " x " + (this.d + 1) + ", Duration: " + this.c : this.f() + ", Duration: " + this.c;
        if (this.e) {
            string = string + ", Splash: true";
        }
        if (!this.h) {
            string = string + ", Particles: false";
        }
        return string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cko) {
            cko cko2 = (cko)object;
            return this.c == cko2.c && this.d == cko2.d && this.e == cko2.e && this.f == cko2.f && this.b.equals(cko2.b);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + (this.e ? 1 : 0);
        n2 = 31 * n2 + (this.f ? 1 : 0);
        return n2;
    }

    public bvp a(bvp bvp2) {
        bvp2.a("Id", (byte)bfv.a(this.a()));
        bvp2.a("Amplifier", (byte)this.c());
        bvp2.a("Duration", this.b());
        bvp2.a("Ambient", this.d());
        bvp2.a("ShowParticles", this.e());
        return bvp2;
    }

    public static cko b(bvp bvp2) {
        byte by2 = bvp2.f("Id");
        bfv bfv2 = bfv.a(by2);
        if (bfv2 == null) {
            return null;
        }
        byte by3 = bvp2.f("Amplifier");
        int n2 = bvp2.h("Duration");
        boolean bl2 = bvp2.p("Ambient");
        boolean bl3 = true;
        if (bvp2.b("ShowParticles", 1)) {
            bl3 = bvp2.p("ShowParticles");
        }
        return new cko(bfv2, n2, by3, bl2, bl3);
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public boolean g() {
        return this.g;
    }

    public int b(cko cko2) {
        int n2 = 32147;
        if (this.b() > 32147 && cko2.b() > 32147 || this.d() && cko2.d()) {
            return cv.a().a(Boolean.valueOf(this.d()), Boolean.valueOf(cko2.d())).a(this.a().f(), cko2.a().f()).b();
        }
        return cv.a().a(Boolean.valueOf(this.d()), Boolean.valueOf(cko2.d())).a(this.b(), cko2.b()).a(this.a().f(), cko2.a().f()).b();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((cko)object);
    }
}

