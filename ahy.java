/*
 * Decompiled with CFR 0.150.
 */
public class ahy {
    public static ahy a = new ahy("inFire").n();
    public static ahy b = new ahy("lightningBolt");
    public static ahy c = new ahy("onFire").k().n();
    public static ahy d = new ahy("lava").n();
    public static ahy e = new ahy("hotFloor").n();
    public static ahy f = new ahy("inWall").k();
    public static ahy g = new ahy("drown").k();
    public static ahy h = new ahy("starve").k().m();
    public static ahy i = new ahy("cactus");
    public static ahy j = new ahy("fall").k();
    public static ahy k = new ahy("flyIntoWall").k();
    public static ahy l = new ahy("outOfWorld").k().l();
    public static ahy m = new ahy("generic").k();
    public static ahy n = new ahy("magic").k().t();
    public static ahy o = new ahy("wither").k();
    public static ahy p = new ahy("anvil");
    public static ahy q = new ahy("fallingBlock");
    public static ahy r = new ahy("dragonBreath").k();
    private boolean t;
    private boolean u;
    private boolean v;
    private float w = 0.3f;
    private boolean x;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    public String s;

    public static ahy b(bga bga2) {
        return new bsg("mob", bga2);
    }

    public static ahy a(cpk cpk2, bga bga2) {
        return new ace("mob", cpk2, bga2);
    }

    public static ahy a(bdl bdl2) {
        return new bsg("player", bdl2);
    }

    public static ahy a(cwt cwt2, cpk cpk2) {
        return new ace("arrow", cwt2, cpk2).d();
    }

    public static ahy a(chw chw2, cpk cpk2) {
        if (cpk2 == null) {
            return new ace("onFire", chw2, chw2).n().d();
        }
        return new ace("fireball", chw2, cpk2).n().d();
    }

    public static ahy a(cpk cpk2, cpk cpk3) {
        return new ace("thrown", cpk2, cpk3).d();
    }

    public static ahy b(cpk cpk2, cpk cpk3) {
        return new ace("indirectMagic", cpk2, cpk3).k().t();
    }

    public static ahy a(cpk cpk2) {
        return new bsg("thorns", cpk2).w().t();
    }

    public static ahy a(yk yk2) {
        if (yk2 != null && yk2.c() != null) {
            return new bsg("explosion.player", yk2.c()).q().f();
        }
        return new ahy("explosion").q().f();
    }

    public static ahy c(bga bga2) {
        if (bga2 != null) {
            return new bsg("explosion.player", bga2).q().f();
        }
        return new ahy("explosion").q().f();
    }

    public boolean c() {
        return this.y;
    }

    public ahy d() {
        this.y = true;
        return this;
    }

    public boolean e() {
        return this.B;
    }

    public ahy f() {
        this.B = true;
        return this;
    }

    public boolean g() {
        return this.t;
    }

    public float h() {
        return this.w;
    }

    public boolean i() {
        return this.u;
    }

    public boolean j() {
        return this.v;
    }

    protected ahy(String string) {
        this.s = string;
    }

    public cpk a() {
        return this.b();
    }

    public cpk b() {
        return null;
    }

    protected ahy k() {
        this.t = true;
        this.w = 0.0f;
        return this;
    }

    protected ahy l() {
        this.u = true;
        return this;
    }

    protected ahy m() {
        this.v = true;
        this.w = 0.0f;
        return this;
    }

    protected ahy n() {
        this.x = true;
        return this;
    }

    public cbg a(bga bga2) {
        bga bga3 = bga2.bn();
        String string = "death.attack." + this.s;
        String string2 = string + ".player";
        if (bga3 != null && caf.c(string2)) {
            return new du(string2, bga2.v(), bga3.v());
        }
        return new du(string, bga2.v());
    }

    public boolean o() {
        return this.x;
    }

    public String p() {
        return this.s;
    }

    public ahy q() {
        this.z = true;
        return this;
    }

    public boolean r() {
        return this.z;
    }

    public boolean s() {
        return this.A;
    }

    public ahy t() {
        this.A = true;
        return this;
    }

    public boolean u() {
        cpk cpk2 = this.b();
        return cpk2 instanceof bdl && ((bdl)cpk2).G.d;
    }

    public amj v() {
        return null;
    }
}

