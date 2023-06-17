/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.k.i;
import net.minecraft.q.a.b;
import net.minecraft.q.a.c;
import net.minecraft.q.a.f;
import net.minecraft.q.a.j;
import net.minecraft.q.a.n;
import net.minecraft.q.a.p;
import net.minecraft.q.a.q;
import net.minecraft.q.a.r;
import net.minecraft.q.a.s;
import net.minecraft.q.a.v;
import net.minecraft.q.ab;
import net.minecraft.q.aj;
import net.minecraft.q.am;
import net.minecraft.q.l;
import net.minecraft.q.w;

public class d {
    private String b;
    private int c;
    private boolean d;
    public static final l a = net.minecraft.q.l.c;
    private long e;
    private ab f = ab.b;
    private String g = "";
    private int h;
    private int i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private e o;
    private int p;
    private String q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private boolean v;
    private int w;
    private am x;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private l C;
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
    private final Map N = sz.a(w.class);
    private net.minecraft.q.j O = new net.minecraft.q.j();

    protected d() {
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.a, (net.minecraft.u.a.e)new j());
    }

    public d(e e2) {
        Object object;
        if (e2.b("Version", 10)) {
            object = e2.o("Version");
            this.b = ((e)object).l("Name");
            this.c = ((e)object).h("Id");
            this.d = ((e)object).p("Snapshot");
        }
        this.e = e2.i("RandomSeed");
        if (e2.b("generatorName", 8)) {
            object = e2.l("generatorName");
            this.f = ab.a((String)object);
            if (this.f == null) {
                this.f = ab.b;
            } else if (this.f.f()) {
                int n2 = 0;
                if (e2.b("generatorVersion", 99)) {
                    n2 = e2.h("generatorVersion");
                }
                this.f = this.f.a(n2);
            }
            if (e2.b("generatorOptions", 8)) {
                this.g = e2.l("generatorOptions");
            }
        }
        this.x = am.a(e2.h("GameType"));
        this.y = e2.b("MapFeatures", 99) ? e2.p("MapFeatures") : true;
        this.h = e2.h("SpawnX");
        this.i = e2.h("SpawnY");
        this.j = e2.h("SpawnZ");
        this.k = e2.i("Time");
        this.l = e2.b("DayTime", 99) ? e2.i("DayTime") : this.k;
        this.m = e2.i("LastPlayed");
        this.n = e2.i("SizeOnDisk");
        this.q = e2.l("LevelName");
        this.r = e2.h("version");
        this.s = e2.h("clearWeatherTime");
        this.u = e2.h("rainTime");
        this.t = e2.p("raining");
        this.w = e2.h("thunderTime");
        this.v = e2.p("thundering");
        this.z = e2.p("hardcore");
        this.B = e2.b("initialized", 99) ? e2.p("initialized") : true;
        if (e2.b("allowCommands", 99)) {
            this.A = e2.p("allowCommands");
        } else {
            boolean bl2 = this.A = this.x == am.c;
        }
        if (e2.b("Player", 10)) {
            this.o = e2.o("Player");
            this.p = this.o.h("Dimension");
        }
        if (e2.b("GameRules", 10)) {
            this.O.a(e2.o("GameRules"));
        }
        if (e2.b("Difficulty", 99)) {
            this.C = net.minecraft.q.l.a(e2.f("Difficulty"));
        }
        if (e2.b("DifficultyLocked", 1)) {
            this.D = e2.p("DifficultyLocked");
        }
        if (e2.b("BorderCenterX", 99)) {
            this.E = e2.k("BorderCenterX");
        }
        if (e2.b("BorderCenterZ", 99)) {
            this.F = e2.k("BorderCenterZ");
        }
        if (e2.b("BorderSize", 99)) {
            this.G = e2.k("BorderSize");
        }
        if (e2.b("BorderSizeLerpTime", 99)) {
            this.H = e2.i("BorderSizeLerpTime");
        }
        if (e2.b("BorderSizeLerpTarget", 99)) {
            this.I = e2.k("BorderSizeLerpTarget");
        }
        if (e2.b("BorderSafeZone", 99)) {
            this.J = e2.k("BorderSafeZone");
        }
        if (e2.b("BorderDamagePerBlock", 99)) {
            this.K = e2.k("BorderDamagePerBlock");
        }
        if (e2.b("BorderWarningBlocks", 99)) {
            this.L = e2.h("BorderWarningBlocks");
        }
        if (e2.b("BorderWarningTime", 99)) {
            this.M = e2.h("BorderWarningTime");
        }
        if (e2.b("DimensionData", 10)) {
            object = e2.o("DimensionData");
            for (String string : ((e)object).e()) {
                this.N.put(net.minecraft.q.w.a(Integer.parseInt(string)), ((e)object).o(string));
            }
        }
    }

    public d(aj aj2, String string) {
        this.a(aj2);
        this.q = string;
        this.C = a;
        this.B = false;
    }

    public void a(aj aj2) {
        this.e = aj2.d();
        this.x = aj2.e();
        this.y = aj2.g();
        this.z = aj2.f();
        this.f = aj2.h();
        this.g = aj2.j();
        this.A = aj2.i();
    }

    public d(d d2) {
        this.e = d2.e;
        this.f = d2.f;
        this.g = d2.g;
        this.x = d2.x;
        this.y = d2.y;
        this.h = d2.h;
        this.i = d2.i;
        this.j = d2.j;
        this.k = d2.k;
        this.l = d2.l;
        this.m = d2.m;
        this.n = d2.n;
        this.o = d2.o;
        this.p = d2.p;
        this.q = d2.q;
        this.r = d2.r;
        this.u = d2.u;
        this.t = d2.t;
        this.w = d2.w;
        this.v = d2.v;
        this.z = d2.z;
        this.A = d2.A;
        this.B = d2.B;
        this.O = d2.O;
        this.C = d2.C;
        this.D = d2.D;
        this.E = d2.E;
        this.F = d2.F;
        this.G = d2.G;
        this.H = d2.H;
        this.I = d2.I;
        this.J = d2.J;
        this.K = d2.K;
        this.M = d2.M;
        this.L = d2.L;
    }

    public e a(e e2) {
        if (e2 == null) {
            e2 = this.o;
        }
        e e3 = new e();
        this.a(e3, e2);
        return e3;
    }

    private void a(e e2, e e3) {
        e e4 = new e();
        e4.a("Name", "1.10 Multiplayer Fix");
        e4.a("Id", 510);
        e4.a("Snapshot", false);
        e2.a("Version", e4);
        e2.a("DataVersion", 510);
        e2.a("RandomSeed", this.e);
        e2.a("generatorName", this.f.a());
        e2.a("generatorVersion", this.f.d());
        e2.a("generatorOptions", this.g);
        e2.a("GameType", this.x.a());
        e2.a("MapFeatures", this.y);
        e2.a("SpawnX", this.h);
        e2.a("SpawnY", this.i);
        e2.a("SpawnZ", this.j);
        e2.a("Time", this.k);
        e2.a("DayTime", this.l);
        e2.a("SizeOnDisk", this.n);
        e2.a("LastPlayed", net.minecraft.c.a.aI());
        e2.a("LevelName", this.q);
        e2.a("version", this.r);
        e2.a("clearWeatherTime", this.s);
        e2.a("rainTime", this.u);
        e2.a("raining", this.t);
        e2.a("thunderTime", this.w);
        e2.a("thundering", this.v);
        e2.a("hardcore", this.z);
        e2.a("allowCommands", this.A);
        e2.a("initialized", this.B);
        e2.a("BorderCenterX", this.E);
        e2.a("BorderCenterZ", this.F);
        e2.a("BorderSize", this.G);
        e2.a("BorderSizeLerpTime", this.H);
        e2.a("BorderSafeZone", this.J);
        e2.a("BorderDamagePerBlock", this.K);
        e2.a("BorderSizeLerpTarget", this.I);
        e2.a("BorderWarningBlocks", (double)this.L);
        e2.a("BorderWarningTime", (double)this.M);
        if (this.C != null) {
            e2.a("Difficulty", (byte)this.C.a());
        }
        e2.a("DifficultyLocked", this.D);
        e2.a("GameRules", this.O.a());
        e e5 = new e();
        for (Map.Entry entry : this.N.entrySet()) {
            e5.a(String.valueOf(((w)((Object)entry.getKey())).a()), (a)entry.getValue());
        }
        e2.a("DimensionData", e5);
        if (e3 != null) {
            e2.a("Player", e3);
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

    public e h() {
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

    public void a(net.minecraft.u.b.b b2) {
        this.h = b2.cy_();
        this.i = b2.k();
        this.j = b2.l();
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

    public int l() {
        return this.s;
    }

    public void e(int n2) {
        this.s = n2;
    }

    public boolean m() {
        return this.v;
    }

    public void a(boolean bl2) {
        this.v = bl2;
    }

    public int n() {
        return this.w;
    }

    public void f(int n2) {
        this.w = n2;
    }

    public boolean o() {
        return this.t;
    }

    public void b(boolean bl2) {
        this.t = bl2;
    }

    public int p() {
        return this.u;
    }

    public void g(int n2) {
        this.u = n2;
    }

    public am q() {
        return this.x;
    }

    public boolean r() {
        return this.y;
    }

    public void c(boolean bl2) {
        this.y = bl2;
    }

    public void a(am am2) {
        this.x = am2;
    }

    public boolean s() {
        return this.z;
    }

    public void d(boolean bl2) {
        this.z = bl2;
    }

    public ab t() {
        return this.f;
    }

    public void a(ab ab2) {
        this.f = ab2;
    }

    public String u() {
        return this.g == null ? "" : this.g;
    }

    public boolean v() {
        return this.A;
    }

    public void e(boolean bl2) {
        this.A = bl2;
    }

    public boolean w() {
        return this.B;
    }

    public void f(boolean bl2) {
        this.B = bl2;
    }

    public net.minecraft.q.j x() {
        return this.O;
    }

    public double y() {
        return this.E;
    }

    public double z() {
        return this.F;
    }

    public double A() {
        return this.G;
    }

    public void a(double d2) {
        this.G = d2;
    }

    public long B() {
        return this.H;
    }

    public void c(long l2) {
        this.H = l2;
    }

    public double C() {
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

    public double D() {
        return this.J;
    }

    public void e(double d2) {
        this.J = d2;
    }

    public double E() {
        return this.K;
    }

    public void f(double d2) {
        this.K = d2;
    }

    public int F() {
        return this.L;
    }

    public int G() {
        return this.M;
    }

    public void h(int n2) {
        this.L = n2;
    }

    public void i(int n2) {
        this.M = n2;
    }

    public l H() {
        return this.C;
    }

    public void a(l l2) {
        this.C = l2;
    }

    public boolean I() {
        return this.D;
    }

    public void g(boolean bl2) {
        this.D = bl2;
    }

    public void a(i i2) {
        i2.a("Level seed", new r(this));
        i2.a("Level generator", new f(this));
        i2.a("Level generator options", new b(this));
        i2.a("Level spawn location", new q(this));
        i2.a("Level time", new n(this));
        i2.a("Level dimension", new p(this));
        i2.a("Level storage version", new s(this));
        i2.a("Level weather", new v(this));
        i2.a("Level game mode", new c(this));
    }

    public e a(w w2) {
        e e2 = (e)this.N.get((Object)w2);
        return e2 == null ? new e() : e2;
    }

    public void a(w w2, e e2) {
        this.N.put(w2, e2);
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

    static /* synthetic */ ab a(d d2) {
        return d2.f;
    }

    static /* synthetic */ boolean b(d d2) {
        return d2.y;
    }

    static /* synthetic */ String c(d d2) {
        return d2.g;
    }

    static /* synthetic */ int d(d d2) {
        return d2.h;
    }

    static /* synthetic */ int e(d d2) {
        return d2.i;
    }

    static /* synthetic */ int f(d d2) {
        return d2.j;
    }

    static /* synthetic */ long g(d d2) {
        return d2.k;
    }

    static /* synthetic */ long h(d d2) {
        return d2.l;
    }

    static /* synthetic */ int i(d d2) {
        return d2.p;
    }

    static /* synthetic */ int j(d d2) {
        return d2.r;
    }

    static /* synthetic */ int k(d d2) {
        return d2.u;
    }

    static /* synthetic */ boolean l(d d2) {
        return d2.t;
    }

    static /* synthetic */ int m(d d2) {
        return d2.w;
    }

    static /* synthetic */ boolean n(d d2) {
        return d2.v;
    }

    static /* synthetic */ am o(d d2) {
        return d2.x;
    }

    static /* synthetic */ boolean p(d d2) {
        return d2.z;
    }

    static /* synthetic */ boolean q(d d2) {
        return d2.A;
    }
}

