/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.ai;
import net.minecraft.f.ap;
import net.minecraft.f.n;
import net.minecraft.f.q;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fr;
import net.minecraft.x.d.b.j;

public class h
extends ap {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final q e = new ai(this);

    @Override
    public e a(e e2) {
        super.a(e2);
        this.e.a(e2);
        e2.a("powered", this.f());
        e2.a("conditionMet", this.h());
        e2.a("auto", this.g());
        return e2;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.e.b(e2);
        this.a(e2.p("powered"));
        this.c(e2.p("conditionMet"));
        this.b(e2.p("auto"));
    }

    @Override
    public j bJ_() {
        if (this.i()) {
            this.d(false);
            e e2 = this.a(new e());
            return new j(this.l, 2, e2);
        }
        return null;
    }

    @Override
    public boolean bK_() {
        return true;
    }

    public q b() {
        return this.e;
    }

    public net.minecraft.n.ap e() {
        return this.e.g();
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean f() {
        return this.a;
    }

    public boolean g() {
        return this.b;
    }

    public void b(boolean bl2) {
        cn cn2;
        boolean bl3 = this.b;
        this.b = bl2;
        if (!bl3 && bl2 && !this.a && this.k != null && this.j() != net.minecraft.f.n.a && (cn2 = this.E()) instanceof fr) {
            net.minecraft.u.b.b b2 = this.D();
            fr fr2 = (fr)cn2;
            this.c = !this.k() || fr2.e(this.k, b2, this.k.n(b2));
            this.k.a(b2, cn2, cn2.a(this.k));
            if (this.c) {
                fr2.c(this.k, b2);
            }
        }
    }

    public boolean h() {
        return this.c;
    }

    public void c(boolean bl2) {
        this.c = bl2;
    }

    public boolean i() {
        return this.d;
    }

    public void d(boolean bl2) {
        this.d = bl2;
    }

    public n j() {
        cn cn2 = this.E();
        return cn2 == p.bX ? net.minecraft.f.n.c : (cn2 == p.dc ? net.minecraft.f.n.b : (cn2 == p.dd ? net.minecraft.f.n.a : net.minecraft.f.n.c));
    }

    public boolean k() {
        b b2 = this.k.n(this.D());
        return b2.c() instanceof fr ? (Boolean)b2.a(fr.b) : false;
    }

    @Override
    public void l() {
        this.n = null;
        super.l();
    }
}

