/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.a;

import net.minecraft.g.a.a;
import net.minecraft.g.a.b;
import net.minecraft.g.a.c;
import net.minecraft.g.a.e;
import net.minecraft.g.a.f;
import net.minecraft.g.a.g;
import net.minecraft.g.a.i;

public class h {
    public static final h a = new c(net.minecraft.g.a.e.b);
    public static final h b = new h(net.minecraft.g.a.e.c);
    public static final h c = new h(net.minecraft.g.a.e.l);
    public static final h d = new h(net.minecraft.g.a.e.o).f();
    public static final h e = new h(net.minecraft.g.a.e.m).e();
    public static final h f = new h(net.minecraft.g.a.e.h).e();
    public static final h g = new h(net.minecraft.g.a.e.h).e().n();
    public static final h h = new f(net.minecraft.g.a.e.n).m();
    public static final h i = new f(net.minecraft.g.a.e.f).m();
    public static final h j = new h(net.minecraft.g.a.e.i).f().q().m();
    public static final h k = new i(net.minecraft.g.a.e.i).m();
    public static final h l = new i(net.minecraft.g.a.e.i).f().m().h();
    public static final h m = new h(net.minecraft.g.a.e.t);
    public static final h n = new h(net.minecraft.g.a.e.e).f();
    public static final h o = new c(net.minecraft.g.a.e.b).m();
    public static final h p = new h(net.minecraft.g.a.e.d);
    public static final h q = new i(net.minecraft.g.a.e.b).m();
    public static final h r = new i(net.minecraft.g.a.e.e).f();
    public static final h s = new h(net.minecraft.g.a.e.b).q().o();
    public static final h t = new h(net.minecraft.g.a.e.b).o();
    public static final h u = new h(net.minecraft.g.a.e.f).f().q();
    public static final h v = new h(net.minecraft.g.a.e.i).m();
    public static final h w = new h(net.minecraft.g.a.e.g).q().o();
    public static final h x = new h(net.minecraft.g.a.e.g).o();
    public static final h y = new i(net.minecraft.g.a.e.j).h().q().e().m();
    public static final h z = new h(net.minecraft.g.a.e.j).e();
    public static final h A = new h(net.minecraft.g.a.e.i).q().m();
    public static final h B = new h(net.minecraft.g.a.e.k);
    public static final h C = new h(net.minecraft.g.a.e.i).m();
    public static final h D = new h(net.minecraft.g.a.e.i).m();
    public static final h E = new a(net.minecraft.g.a.e.b).n();
    public static final h F = new h(net.minecraft.g.a.e.b).m();
    public static final h G = new g(net.minecraft.g.a.e.e).e().m();
    public static final h H = new h(net.minecraft.g.a.e.m).n();
    public static final h I = new h(net.minecraft.g.a.e.b).e().n();
    public static final h J = new c(net.minecraft.g.a.e.b);
    private boolean K;
    private boolean L;
    private boolean M;
    private final e N;
    private boolean O = true;
    private b P = net.minecraft.g.a.b.a;
    private boolean Q;

    public h(e e2) {
        this.N = e2;
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

    private h q() {
        this.M = true;
        return this;
    }

    protected h e() {
        this.O = false;
        return this;
    }

    protected h f() {
        this.K = true;
        return this;
    }

    public boolean g() {
        return this.K;
    }

    public h h() {
        this.L = true;
        return this;
    }

    public boolean i() {
        return this.L;
    }

    public boolean j() {
        return this.M ? false : this.c();
    }

    public boolean k() {
        return this.O;
    }

    public b l() {
        return this.P;
    }

    protected h m() {
        this.P = net.minecraft.g.a.b.b;
        return this;
    }

    protected h n() {
        this.P = net.minecraft.g.a.b.c;
        return this;
    }

    protected h o() {
        this.Q = true;
        return this;
    }

    public e p() {
        return this.N;
    }
}

