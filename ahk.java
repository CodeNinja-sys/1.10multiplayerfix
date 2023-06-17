/*
 * Decompiled with CFR 0.150.
 */
public class ahk {
    public static final ahk a = new bqu(bif.b);
    public static final ahk b = new ahk(bif.c);
    public static final ahk c = new ahk(bif.l);
    public static final ahk d = new ahk(bif.o).f();
    public static final ahk e = new ahk(bif.m).e();
    public static final ahk f = new ahk(bif.h).e();
    public static final ahk g = new ahk(bif.h).e().n();
    public static final ahk h = new bug(bif.n).m();
    public static final ahk i = new bug(bif.f).m();
    public static final ahk j = new ahk(bif.i).f().q().m();
    public static final ahk k = new chf(bif.i).m();
    public static final ahk l = new chf(bif.i).f().m().h();
    public static final ahk m = new ahk(bif.t);
    public static final ahk n = new ahk(bif.e).f();
    public static final ahk o = new bqu(bif.b).m();
    public static final ahk p = new ahk(bif.d);
    public static final ahk q = new chf(bif.b).m();
    public static final ahk r = new chf(bif.e).f();
    public static final ahk s = new ahk(bif.b).q().o();
    public static final ahk t = new ahk(bif.b).o();
    public static final ahk u = new ahk(bif.f).f().q();
    public static final ahk v = new ahk(bif.i).m();
    public static final ahk w = new ahk(bif.g).q().o();
    public static final ahk x = new ahk(bif.g).o();
    public static final ahk y = new chf(bif.j).h().q().e().m();
    public static final ahk z = new ahk(bif.j).e();
    public static final ahk A = new ahk(bif.i).q().m();
    public static final ahk B = new ahk(bif.k);
    public static final ahk C = new ahk(bif.i).m();
    public static final ahk D = new ahk(bif.i).m();
    public static final ahk E = new gb(bif.b).n();
    public static final ahk F = new ahk(bif.b).m();
    public static final ahk G = new bnn(bif.e).e().m();
    public static final ahk H = new ahk(bif.m).n();
    public static final ahk I = new ahk(bif.b).e().n();
    public static final ahk J = new bqu(bif.b);
    private boolean K;
    private boolean L;
    private boolean M;
    private final bif N;
    private boolean O = true;
    private bez P = bez.a;
    private boolean Q;

    public ahk(bif bif2) {
        this.N = bif2;
    }

    public boolean d() {
        return false;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private ahk q() {
        this.M = true;
        return this;
    }

    protected ahk e() {
        this.O = false;
        return this;
    }

    protected ahk f() {
        this.K = true;
        return this;
    }

    public boolean g() {
        return this.K;
    }

    public ahk h() {
        this.L = true;
        return this;
    }

    public boolean i() {
        return this.L;
    }

    public boolean j() {
        if (this.M) {
            return false;
        }
        return this.c();
    }

    public boolean k() {
        return this.O;
    }

    public bez l() {
        return this.P;
    }

    protected ahk m() {
        this.P = bez.b;
        return this;
    }

    protected ahk n() {
        this.P = bez.c;
        return this;
    }

    protected ahk o() {
        this.Q = true;
        return this;
    }

    public bif p() {
        return this.N;
    }
}

