/*
 * Decompiled with CFR 0.150.
 */
public final class atd {
    private final long a;
    private final bvh b;
    private final boolean c;
    private final boolean d;
    private final aaf e;
    private boolean f;
    private boolean g;
    private String h = "";

    public atd(long l2, bvh bvh2, boolean bl2, boolean bl3, aaf aaf2) {
        this.a = l2;
        this.b = bvh2;
        this.c = bl2;
        this.d = bl3;
        this.e = aaf2;
    }

    public atd(cvn cvn2) {
        this(cvn2.a(), cvn2.p(), cvn2.q(), cvn2.r(), cvn2.s());
    }

    public atd a() {
        this.g = true;
        return this;
    }

    public atd b() {
        this.f = true;
        return this;
    }

    public atd a(String string) {
        this.h = string;
        return this;
    }

    public boolean c() {
        return this.g;
    }

    public long d() {
        return this.a;
    }

    public bvh e() {
        return this.b;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.c;
    }

    public aaf h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public static bvh a(int n2) {
        return bvh.a(n2);
    }

    public String j() {
        return this.h;
    }
}

