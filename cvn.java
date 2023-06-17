/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.c.a;

public class cvn {
    private String b;
    private int c;
    private boolean d;
    public static final ct a = ct.c;
    private long e;
    private aaf f = aaf.b;
    private String g = "";
    private int h;
    private int i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private bvp o;
    private int p;
    private String q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private int w;
    private bvh x;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private ct C;
    private boolean D;
    private double E;
    private double F;
    private double G = 6.0E7;
    private long H;
    private double I;
    private double J = 5.0;
    private double K = 0.2;
    private int L = 5;
    private int M = 15;
    private final Map N = sz.a(cyy.class);
    private xx O = new xx();

    protected cvn() {
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.a, (cui)new cij());
    }

    public cvn(bvp bvp2) {
        Object object;
        if (bvp2.b("Version", 10)) {
            object = bvp2.o("Version");
            this.b = ((bvp)object).l("Name");
            this.c = ((bvp)object).h("Id");
            this.d = ((bvp)object).p("Snapshot");
        }
        this.e = bvp2.i("RandomSeed");
        if (bvp2.b("generatorName", 8)) {
            object = bvp2.l("generatorName");
            this.f = aaf.a((String)object);
            if (this.f == null) {
                this.f = aaf.b;
            } else if (this.f.f()) {
                int n2 = 0;
                if (bvp2.b("generatorVersion", 99)) {
                    n2 = bvp2.h("generatorVersion");
                }
                this.f = this.f.a(n2);
            }
            if (bvp2.b("generatorOptions", 8)) {
                this.g = bvp2.l("generatorOptions");
            }
        }
        this.x = bvh.a(bvp2.h("GameType"));
        this.y = bvp2.b("MapFeatures", 99) ? bvp2.p("MapFeatures") : true;
        this.h = bvp2.h("SpawnX");
        this.i = bvp2.h("SpawnY");
        this.j = bvp2.h("SpawnZ");
        this.k = bvp2.i("Time");
        this.l = bvp2.b("DayTime", 99) ? bvp2.i("DayTime") : this.k;
        this.m = bvp2.i("LastPlayed");
        this.n = bvp2.i("SizeOnDisk");
        this.q = bvp2.l("LevelName");
        this.r = bvp2.h("version");
        this.s = bvp2.h("clearWeatherTime");
        this.u = bvp2.h("rainTime");
        this.t = bvp2.p("raining");
        this.w = bvp2.h("thunderTime");
        this.v = bvp2.p("thundering");
        this.z = bvp2.p("hardcore");
        this.B = bvp2.b("initialized", 99) ? bvp2.p("initialized") : true;
        if (bvp2.b("allowCommands", 99)) {
            this.A = bvp2.p("allowCommands");
        } else {
            boolean bl2 = this.A = this.x == bvh.c;
        }
        if (bvp2.b("Player", 10)) {
            this.o = bvp2.o("Player");
            this.p = this.o.h("Dimension");
        }
        if (bvp2.b("GameRules", 10)) {
            this.O.a(bvp2.o("GameRules"));
        }
        if (bvp2.b("Difficulty", 99)) {
            this.C = ct.a(bvp2.f("Difficulty"));
        }
        if (bvp2.b("DifficultyLocked", 1)) {
            this.D = bvp2.p("DifficultyLocked");
        }
        if (bvp2.b("BorderCenterX", 99)) {
            this.E = bvp2.k("BorderCenterX");
        }
        if (bvp2.b("BorderCenterZ", 99)) {
            this.F = bvp2.k("BorderCenterZ");
        }
        if (bvp2.b("BorderSize", 99)) {
            this.G = bvp2.k("BorderSize");
        }
        if (bvp2.b("BorderSizeLerpTime", 99)) {
            this.H = bvp2.i("BorderSizeLerpTime");
        }
        if (bvp2.b("BorderSizeLerpTarget", 99)) {
            this.I = bvp2.k("BorderSizeLerpTarget");
        }
        if (bvp2.b("BorderSafeZone", 99)) {
            this.J = bvp2.k("BorderSafeZone");
        }
        if (bvp2.b("BorderDamagePerBlock", 99)) {
            this.K = bvp2.k("BorderDamagePerBlock");
        }
        if (bvp2.b("BorderWarningBlocks", 99)) {
            this.L = bvp2.h("BorderWarningBlocks");
        }
        if (bvp2.b("BorderWarningTime", 99)) {
            this.M = bvp2.h("BorderWarningTime");
        }
        if (bvp2.b("DimensionData", 10)) {
            object = bvp2.o("DimensionData");
            for (String string : ((bvp)object).b()) {
                this.N.put(cyy.a(Integer.parseInt(string)), ((bvp)object).o(string));
            }
        }
    }

    public cvn(atd atd2, String string) {
        this.a(atd2);
        this.q = string;
        this.C = a;
        this.B = false;
    }

    public void a(atd atd2) {
        this.e = atd2.d();
        this.x = atd2.e();
        this.y = atd2.g();
        this.z = atd2.f();
        this.f = atd2.h();
        this.g = atd2.j();
        this.A = atd2.i();
    }

    public cvn(cvn cvn2) {
        this.e = cvn2.e;
        this.f = cvn2.f;
        this.g = cvn2.g;
        this.x = cvn2.x;
        this.y = cvn2.y;
        this.h = cvn2.h;
        this.i = cvn2.i;
        this.j = cvn2.j;
        this.k = cvn2.k;
        this.l = cvn2.l;
        this.m = cvn2.m;
        this.n = cvn2.n;
        this.o = cvn2.o;
        this.p = cvn2.p;
        this.q = cvn2.q;
        this.r = cvn2.r;
        this.u = cvn2.u;
        this.t = cvn2.t;
        this.w = cvn2.w;
        this.v = cvn2.v;
        this.z = cvn2.z;
        this.A = cvn2.A;
        this.B = cvn2.B;
        this.O = cvn2.O;
        this.C = cvn2.C;
        this.D = cvn2.D;
        this.E = cvn2.E;
        this.F = cvn2.F;
        this.G = cvn2.G;
        this.H = cvn2.H;
        this.I = cvn2.I;
        this.J = cvn2.J;
        this.K = cvn2.K;
        this.M = cvn2.M;
        this.L = cvn2.L;
    }

    public bvp a(bvp bvp2) {
        if (bvp2 == null) {
            bvp2 = this.o;
        }
        bvp bvp3 = new bvp();
        this.a(bvp3, bvp2);
        return bvp3;
    }

    private void a(bvp bvp2, bvp bvp3) {
        bvp bvp4 = new bvp();
        bvp4.a("Name", "1.10");
        bvp4.a("Id", 510);
        bvp4.a("Snapshot", false);
        bvp2.a("Version", bvp4);
        bvp2.a("DataVersion", 510);
        bvp2.a("RandomSeed", this.e);
        bvp2.a("generatorName", this.f.a());
        bvp2.a("generatorVersion", this.f.d());
        bvp2.a("generatorOptions", this.g);
        bvp2.a("GameType", this.x.a());
        bvp2.a("MapFeatures", this.y);
        bvp2.a("SpawnX", this.h);
        bvp2.a("SpawnY", this.i);
        bvp2.a("SpawnZ", this.j);
        bvp2.a("Time", this.k);
        bvp2.a("DayTime", this.l);
        bvp2.a("SizeOnDisk", this.n);
        bvp2.a("LastPlayed", net.minecraft.c.a.av());
        bvp2.a("LevelName", this.q);
        bvp2.a("version", this.r);
        bvp2.a("clearWeatherTime", this.s);
        bvp2.a("rainTime", this.u);
        bvp2.a("raining", this.t);
        bvp2.a("thunderTime", this.w);
        bvp2.a("thundering", this.v);
        bvp2.a("hardcore", this.z);
        bvp2.a("allowCommands", this.A);
        bvp2.a("initialized", this.B);
        bvp2.a("BorderCenterX", this.E);
        bvp2.a("BorderCenterZ", this.F);
        bvp2.a("BorderSize", this.G);
        bvp2.a("BorderSizeLerpTime", this.H);
        bvp2.a("BorderSafeZone", this.J);
        bvp2.a("BorderDamagePerBlock", this.K);
        bvp2.a("BorderSizeLerpTarget", this.I);
        bvp2.a("BorderWarningBlocks", (double)this.L);
        bvp2.a("BorderWarningTime", (double)this.M);
        if (this.C != null) {
            bvp2.a("Difficulty", (byte)this.C.a());
        }
        bvp2.a("DifficultyLocked", this.D);
        bvp2.a("GameRules", this.O.a());
        bvp bvp5 = new bvp();
        for (Map.Entry entry : this.N.entrySet()) {
            bvp5.a(String.valueOf(((cyy)((Object)entry.getKey())).a()), (azt)entry.getValue());
        }
        bvp2.a("DimensionData", bvp5);
        if (bvp3 != null) {
            bvp2.a("Player", bvp3);
        }
    }

    public long a() {
        return this.e;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public long e() {
        return this.k;
    }

    public long f() {
        return this.l;
    }

    public long g() {
        return this.n;
    }

    public bvp h() {
        return this.o;
    }

    public void a(int n2) {
        this.h = n2;
    }

    public void b(int n2) {
        this.i = n2;
    }

    public void c(int n2) {
        this.j = n2;
    }

    public void a(long l2) {
        this.k = l2;
    }

    public void b(long l2) {
        this.l = l2;
    }

    public void a(cmz cmz2) {
        this.h = cmz2.a();
        this.i = cmz2.b();
        this.j = cmz2.c();
    }

    public String i() {
        return this.q;
    }

    public void a(String string) {
        this.q = string;
    }

    public int j() {
        return this.r;
    }

    public void d(int n2) {
        this.r = n2;
    }

    public long k() {
        return this.m;
    }

    public int y() {
        return this.s;
    }

    public void g(int n2) {
        this.s = n2;
    }

    public boolean l() {
        return this.v;
    }

    public void a(boolean bl2) {
        this.v = bl2;
    }

    public int m() {
        return this.w;
    }

    public void e(int n2) {
        this.w = n2;
    }

    public boolean n() {
        return this.t;
    }

    public void b(boolean bl2) {
        this.t = bl2;
    }

    public int o() {
        return this.u;
    }

    public void f(int n2) {
        this.u = n2;
    }

    public bvh p() {
        return this.x;
    }

    public boolean q() {
        return this.y;
    }

    public void f(boolean bl2) {
        this.y = bl2;
    }

    public void a(bvh bvh2) {
        this.x = bvh2;
    }

    public boolean r() {
        return this.z;
    }

    public void g(boolean bl2) {
        this.z = bl2;
    }

    public aaf s() {
        return this.f;
    }

    public void a(aaf aaf2) {
        this.f = aaf2;
    }

    public String z() {
        return this.g == null ? "" : this.g;
    }

    public boolean t() {
        return this.A;
    }

    public void c(boolean bl2) {
        this.A = bl2;
    }

    public boolean u() {
        return this.B;
    }

    public void d(boolean bl2) {
        this.B = bl2;
    }

    public xx v() {
        return this.O;
    }

    public double A() {
        return this.E;
    }

    public double B() {
        return this.F;
    }

    public double C() {
        return this.G;
    }

    public void a(double d2) {
        this.G = d2;
    }

    public long D() {
        return this.H;
    }

    public void c(long l2) {
        this.H = l2;
    }

    public double E() {
        return this.I;
    }

    public void b(double d2) {
        this.I = d2;
    }

    public void c(double d2) {
        this.F = d2;
    }

    public void d(double d2) {
        this.E = d2;
    }

    public double F() {
        return this.J;
    }

    public void e(double d2) {
        this.J = d2;
    }

    public double G() {
        return this.K;
    }

    public void f(double d2) {
        this.K = d2;
    }

    public int H() {
        return this.L;
    }

    public int I() {
        return this.M;
    }

    public void h(int n2) {
        this.L = n2;
    }

    public void i(int n2) {
        this.M = n2;
    }

    public ct w() {
        return this.C;
    }

    public void a(ct ct2) {
        this.C = ct2;
    }

    public boolean x() {
        return this.D;
    }

    public void e(boolean bl2) {
        this.D = bl2;
    }

    public void a(sx sx2) {
        sx2.a("Level seed", new jk(this));
        sx2.a("Level generator", new cgt(this));
        sx2.a("Level generator options", new ccp(this));
        sx2.a("Level spawn location", new bem(this));
        sx2.a("Level time", new aiq(this));
        sx2.a("Level dimension", new xd(this));
        sx2.a("Level storage version", new zt(this));
        sx2.a("Level weather", new cca(this));
        sx2.a("Level game mode", new cuo(this));
    }

    public bvp a(cyy cyy2) {
        bvp bvp2 = (bvp)this.N.get((Object)cyy2);
        if (bvp2 == null) {
            return new bvp();
        }
        return bvp2;
    }

    public void a(cyy cyy2, bvp bvp2) {
        this.N.put(cyy2, bvp2);
    }

    public int J() {
        return this.c;
    }

    public boolean K() {
        return this.d;
    }

    public String L() {
        return this.b;
    }

    static /* synthetic */ aaf a(cvn cvn2) {
        return cvn2.f;
    }

    static /* synthetic */ boolean b(cvn cvn2) {
        return cvn2.y;
    }

    static /* synthetic */ String c(cvn cvn2) {
        return cvn2.g;
    }

    static /* synthetic */ int d(cvn cvn2) {
        return cvn2.h;
    }

    static /* synthetic */ int e(cvn cvn2) {
        return cvn2.i;
    }

    static /* synthetic */ int f(cvn cvn2) {
        return cvn2.j;
    }

    static /* synthetic */ long g(cvn cvn2) {
        return cvn2.k;
    }

    static /* synthetic */ long h(cvn cvn2) {
        return cvn2.l;
    }

    static /* synthetic */ int i(cvn cvn2) {
        return cvn2.p;
    }

    static /* synthetic */ int j(cvn cvn2) {
        return cvn2.r;
    }

    static /* synthetic */ int k(cvn cvn2) {
        return cvn2.u;
    }

    static /* synthetic */ boolean l(cvn cvn2) {
        return cvn2.t;
    }

    static /* synthetic */ int m(cvn cvn2) {
        return cvn2.w;
    }

    static /* synthetic */ boolean n(cvn cvn2) {
        return cvn2.v;
    }

    static /* synthetic */ bvh o(cvn cvn2) {
        return cvn2.x;
    }

    static /* synthetic */ boolean p(cvn cvn2) {
        return cvn2.z;
    }

    static /* synthetic */ boolean q(cvn cvn2) {
        return cvn2.A;
    }
}

