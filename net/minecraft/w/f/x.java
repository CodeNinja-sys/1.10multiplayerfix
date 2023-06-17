/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.al;
import net.minecraft.f.k;
import net.minecraft.g.c.b;
import net.minecraft.h.aq;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.ah;
import net.minecraft.u.n;
import net.minecraft.u.r;
import net.minecraft.w.a.a;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.m;
import net.minecraft.w.f.v;

public class x
extends v
implements al {
    private boolean a = true;
    private int b = -1;
    private final net.minecraft.u.b.b c = net.minecraft.u.b.b.c;

    public x(net.minecraft.q.k k2) {
        super(k2);
    }

    public x(net.minecraft.q.k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    @Override
    public m a() {
        return m.f;
    }

    @Override
    public b c() {
        return p.cp.v();
    }

    @Override
    public int cC_() {
        return 1;
    }

    @Override
    public int e() {
        return 5;
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, cu cu2, ah ah2) {
        if (!this.aQ.C) {
            b2.a(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = !bl2;
        if (bl3 != this.D()) {
            this.c(bl3);
        }
    }

    public boolean D() {
        return this.a;
    }

    public void c(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public net.minecraft.q.k cD_() {
        return this.aQ;
    }

    @Override
    public double k() {
        return this.aU;
    }

    @Override
    public double m() {
        return this.aV + 0.5;
    }

    @Override
    public double n() {
        return this.aW;
    }

    @Override
    public void cE_() {
        super.cE_();
        if (!this.aQ.C && this.br() && this.D()) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
            if (b2.equals(this.c)) {
                --this.b;
            } else {
                this.g(0);
            }
            if (!this.F()) {
                this.g(0);
                if (this.E()) {
                    this.g(4);
                    this.C();
                }
            }
        }
    }

    public boolean E() {
        if (k.a(this)) {
            return true;
        }
        List list = this.aQ.a(ae.class, this.cT().b(0.25, 0.0, 0.25), r.a);
        if (!list.isEmpty()) {
            k.a(this, (ae)list.get(0));
        }
        return false;
    }

    @Override
    public void a(n n2) {
        super.a(n2);
        if (this.aQ.G().b("doEntityDrops")) {
            this.a(cg.a(p.cp), 1, 0.0f);
        }
    }

    public static void a(net.minecraft.u.a.a a2) {
        v.b(a2, "MinecartHopper");
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("TransferCooldown", this.b);
        e2.a("Enabled", this.a);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.b = e2.h("TransferCooldown");
        this.a = e2.e("Enabled") ? e2.p("Enabled") : true;
    }

    public void g(int n2) {
        this.b = n2;
    }

    public boolean F() {
        return this.b > 0;
    }

    @Override
    public String h() {
        return "minecraft:hopper";
    }

    @Override
    public aq a(a a2, net.minecraft.w.a.b b2) {
        return new net.minecraft.h.al(a2, this, b2);
    }
}

