/*
 * Decompiled with CFR 0.150.
 */
public enum bmv {
    a("EntityHorse", "horse_white", dah.cp, dah.cw, dah.ct, bvm.F),
    b("Donkey", "donkey", dah.ax, dah.aB, dah.aA, bvm.F),
    c("Mule", "mule", dah.dD, dah.dF, dah.dE, bvm.F),
    d("ZombieHorse", "horse_zombie", dah.hF, dah.hH, dah.hG, bvm.G),
    e("SkeletonHorse", "horse_skeleton", dah.fv, dah.fx, dah.fw, bvm.H);

    private final du f;
    private final bpx g;
    private final bi h;
    private final bi i;
    private final bi j;
    private final bpx k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmv(bi bi2, bi bi3, bi bi4, bpx bpx2) {
        void var8_6;
        void var7_5;
        this.f = new du("entity." + (String)((Object)bi2) + ".name", new Object[0]);
        this.g = new bpx("textures/entity/horse/" + (String)((Object)bi3) + ".png");
        this.h = bpx2;
        this.i = bi4;
        this.j = var7_5;
        this.k = var8_6;
    }

    public bi a() {
        return this.i;
    }

    public bi b() {
        return this.h;
    }

    public bi c() {
        return this.j;
    }

    public du d() {
        return this.f;
    }

    public bpx e() {
        return this.g;
    }

    public boolean f() {
        return this == b || this == c;
    }

    public boolean g() {
        return this == b || this == c;
    }

    public boolean h() {
        return this == d || this == e;
    }

    public boolean i() {
        return !this.h() && this != c;
    }

    public boolean j() {
        return this == a;
    }

    public int k() {
        return this.ordinal();
    }

    public static bmv a(int n2) {
        return bmv.values()[n2];
    }

    public bpx l() {
        return this.k;
    }
}

