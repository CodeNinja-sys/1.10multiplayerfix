/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.d.cv;
import net.minecraft.d.c;
import net.minecraft.e.e;
import net.minecraft.w.l;
import org.apache.logging.log4j.d;

public class j
implements Comparable {
    private static final d a = org.apache.logging.log4j.c.c();
    private final c b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public j(c c2) {
        this(c2, 0, 0);
    }

    public j(c c2, int n2) {
        this(c2, n2, 0);
    }

    public j(c c2, int n2, int n3) {
        this(c2, n2, n3, false, true);
    }

    public j(c c2, int n2, int n3, boolean bl2, boolean bl3) {
        this.b = c2;
        this.c = n2;
        this.d = n3;
        this.f = bl2;
        this.h = bl3;
    }

    public j(j j2) {
        this.b = j2.b;
        this.c = j2.c;
        this.d = j2.d;
        this.f = j2.f;
        this.h = j2.h;
    }

    public void a(j j2) {
        if (this.b != j2.b) {
            a.f("This method should only be called for matching effects!");
        }
        if (j2.d > this.d) {
            this.d = j2.d;
            this.c = j2.c;
        } else if (j2.d == this.d && this.c < j2.c) {
            this.c = j2.c;
        } else if (!j2.f && this.f) {
            this.f = j2.f;
        }
        this.h = j2.h;
    }

    public c a() {
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

    public boolean a(l l2) {
        if (this.c > 0) {
            if (this.b.b(this.c, this.d)) {
                this.b(l2);
            }
            this.h();
        }
        return this.c > 0;
    }

    private int h() {
        return --this.c;
    }

    public void b(l l2) {
        if (this.c > 0) {
            this.b.a(l2, this.d);
        }
    }

    public String f() {
        return this.b.b();
    }

    public String toString() {
        String string = this.d > 0 ? String.valueOf(this.f()) + " x " + (this.d + 1) + ", Duration: " + this.c : String.valueOf(this.f()) + ", Duration: " + this.c;
        if (this.e) {
            string = String.valueOf(string) + ", Splash: true";
        }
        if (!this.h) {
            string = String.valueOf(string) + ", Particles: false";
        }
        return string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        j j2 = (j)object;
        return this.c == j2.c && this.d == j2.d && this.e == j2.e && this.f == j2.f && this.b.equals(j2.b);
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + (this.e ? 1 : 0);
        n2 = 31 * n2 + (this.f ? 1 : 0);
        return n2;
    }

    public e a(e e2) {
        e2.a("Id", (byte)net.minecraft.d.c.a(this.a()));
        e2.a("Amplifier", (byte)this.c());
        e2.a("Duration", this.b());
        e2.a("Ambient", this.d());
        e2.a("ShowParticles", this.e());
        return e2;
    }

    public static j b(e e2) {
        byte by2 = e2.f("Id");
        c c2 = net.minecraft.d.c.a(by2);
        if (c2 == null) {
            return null;
        }
        byte by3 = e2.f("Amplifier");
        int n2 = e2.h("Duration");
        boolean bl2 = e2.p("Ambient");
        boolean bl3 = true;
        if (e2.b("ShowParticles", 1)) {
            bl3 = e2.p("ShowParticles");
        }
        return new j(c2, n2, by3, bl2, bl3);
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public boolean g() {
        return this.g;
    }

    public int b(j j2) {
        int n2 = 32147;
        return !(this.b() > 32147 && j2.b() > 32147 || this.d() && j2.d()) ? cv.a().a(Boolean.valueOf(this.d()), Boolean.valueOf(j2.d())).a(this.b(), j2.b()).a(this.a().f(), j2.a().f()).b() : cv.a().a(Boolean.valueOf(this.d()), Boolean.valueOf(j2.d())).a(this.a().f(), j2.a().f()).b();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((j)object);
    }
}

