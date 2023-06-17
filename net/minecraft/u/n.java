/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.q.t;
import net.minecraft.u.b.s;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.p;
import net.minecraft.u.q;
import net.minecraft.w.a.b;
import net.minecraft.w.c.f;

public class n {
    public static n a = new n("inFire").n();
    public static n b = new n("lightningBolt");
    public static n c = new n("onFire").k().n();
    public static n d = new n("lava").n();
    public static n e = new n("hotFloor").n();
    public static n f = new n("inWall").k();
    public static n g = new n("drown").k();
    public static n h = new n("starve").k().m();
    public static n i = new n("cactus");
    public static n j = new n("fall").k();
    public static n k = new n("flyIntoWall").k();
    public static n l = new n("outOfWorld").k().l();
    public static n m = new n("generic").k();
    public static n n = new n("magic").k().t();
    public static n o = new n("wither").k();
    public static n p = new n("anvil");
    public static n q = new n("fallingBlock");
    public static n r = new n("dragonBreath").k();
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

    public static n a(net.minecraft.w.l l2) {
        return new p("mob", l2);
    }

    public static n a(net.minecraft.w.n n2, net.minecraft.w.l l2) {
        return new q("mob", n2, l2);
    }

    public static n a(b b2) {
        return new p("player", b2);
    }

    public static n a(f f2, net.minecraft.w.n n2) {
        return new q("arrow", f2, n2).b();
    }

    public static n a(net.minecraft.w.c.q q2, net.minecraft.w.n n2) {
        return n2 == null ? new q("onFire", q2, q2).n().b() : new q("fireball", q2, n2).n().b();
    }

    public static n a(net.minecraft.w.n n2, net.minecraft.w.n n3) {
        return new q("thrown", n2, n3).b();
    }

    public static n b(net.minecraft.w.n n2, net.minecraft.w.n n3) {
        return new q("indirectMagic", n2, n3).k().t();
    }

    public static n a(net.minecraft.w.n n2) {
        return new p("thorns", n2).w().t();
    }

    public static n a(t t2) {
        return t2 != null && t2.c() != null ? new p("explosion.player", t2.c()).q().d() : new n("explosion").q().d();
    }

    public static n b(net.minecraft.w.l l2) {
        return l2 != null ? new p("explosion.player", l2).q().d() : new n("explosion").q().d();
    }

    public boolean a() {
        return this.y;
    }

    public n b() {
        this.y = true;
        return this;
    }

    public boolean c() {
        return this.B;
    }

    public n d() {
        this.B = true;
        return this;
    }

    public boolean e() {
        return this.t;
    }

    public float f() {
        return this.w;
    }

    public boolean g() {
        return this.u;
    }

    public boolean h() {
        return this.v;
    }

    protected n(String string) {
        this.s = string;
    }

    public net.minecraft.w.n i() {
        return this.j();
    }

    public net.minecraft.w.n j() {
        return null;
    }

    protected n k() {
        this.t = true;
        this.w = 0.0f;
        return this;
    }

    protected n l() {
        this.u = true;
        return this;
    }

    protected n m() {
        this.v = true;
        this.w = 0.0f;
        return this;
    }

    protected n n() {
        this.x = true;
        return this;
    }

    public a c(net.minecraft.w.l l2) {
        net.minecraft.w.l l3 = l2.bv();
        String string = "death.attack." + this.s;
        String string2 = String.valueOf(string) + ".player";
        return l3 != null && net.minecraft.u.d.b.a.c(string2) ? new l(string2, l2.aK(), l3.aK()) : new l(string, l2.aK());
    }

    public boolean o() {
        return this.x;
    }

    public String p() {
        return this.s;
    }

    public n q() {
        this.z = true;
        return this;
    }

    public boolean r() {
        return this.z;
    }

    public boolean s() {
        return this.A;
    }

    public n t() {
        this.A = true;
        return this;
    }

    public boolean u() {
        net.minecraft.w.n n2 = this.j();
        return n2 instanceof b && ((b)n2).J.d;
    }

    public s v() {
        return null;
    }
}

