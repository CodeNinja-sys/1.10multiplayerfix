/*
 * Decompiled with CFR 0.150.
 */
public class bwp
implements Comparable {
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final boolean e;
    private final bvh f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final int j;
    private final boolean k;

    public bwp(cvn cvn2, String string, String string2, long l2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = cvn2.k();
        this.d = l2;
        this.f = cvn2.p();
        this.e = bl2;
        this.g = cvn2.r();
        this.h = cvn2.t();
        this.i = cvn2.L();
        this.j = cvn2.J();
        this.k = cvn2.K();
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public long e() {
        return this.c;
    }

    public int a(bwp bwp2) {
        if (this.c < bwp2.c) {
            return 1;
        }
        if (this.c > bwp2.c) {
            return -1;
        }
        return this.a.compareTo(bwp2.a);
    }

    public bvh f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public String i() {
        if (aco.b(this.i)) {
            return caf.a("selectWorld.versionUnknown");
        }
        return this.i;
    }

    public boolean j() {
        return this.k();
    }

    public boolean k() {
        return this.j > 510;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bwp)object);
    }
}

