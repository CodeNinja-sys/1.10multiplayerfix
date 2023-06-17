/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.q;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.a.c;
import net.minecraft.u.ah;
import net.minecraft.w.f.b;
import net.minecraft.w.f.f;
import net.minecraft.w.f.i;
import net.minecraft.w.f.m;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

public class w
extends f {
    private static final g a = o.a(w.class, net.minecraft.x.a.q.d);
    private static final g b = o.a(w.class, net.minecraft.x.a.q.e);
    private final q c = new i(this);
    private int d;

    public w(k k2) {
        super(k2);
    }

    public w(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        f.a(a2, "MinecartCommandBlock");
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new b());
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.cc().a(a, "");
        this.cc().a(b, new net.minecraft.u.d.k(""));
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.c.b(e2);
        this.cc().b(a, this.g().c());
        this.cc().b(b, this.g().b());
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        this.c.a(e2);
    }

    @Override
    public m a() {
        return m.g;
    }

    @Override
    public net.minecraft.g.c.b c() {
        return p.bX.v();
    }

    public q g() {
        return this.c;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.by - this.d >= 4) {
            this.g().a(this.aQ);
            this.d = this.by;
        }
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, cu cu2, ah ah2) {
        this.c.a(b2);
        return false;
    }

    @Override
    public void a(g g2) {
        super.a(g2);
        if (b.equals(g2)) {
            try {
                this.c.b((net.minecraft.u.d.a)this.cc().a(b));
            }
            catch (Throwable throwable) {}
        } else if (a.equals(g2)) {
            this.c.a((String)this.cc().a(a));
        }
    }

    @Override
    public boolean cY() {
        return true;
    }

    static /* synthetic */ g i() {
        return a;
    }

    static /* synthetic */ g n() {
        return b;
    }
}

