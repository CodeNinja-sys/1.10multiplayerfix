/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.w.e.af;
import net.minecraft.w.e.bo;
import net.minecraft.w.e.d;
import net.minecraft.w.e.p;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class ao
extends d {
    private static final UUID b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final h c = new h(b, "Attacking speed boost", 0.05, 0).a(false);
    private int d;
    private int e;
    private UUID f;

    public ao(net.minecraft.q.k k2) {
        super(k2);
        this.bD = true;
    }

    @Override
    public void a(l l2) {
        super.a(l2);
        if (l2 != null) {
            this.f = l2.cM();
        }
    }

    @Override
    protected void c() {
        this.p.a(1, new p(this));
        this.p.a(2, new bo(this));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(a).a(0.0);
        this.a(net.minecraft.w.d.d).a(0.23f);
        this.a(net.minecraft.w.d.e).a(5.0);
    }

    @Override
    public void cE_() {
        super.cE_();
    }

    @Override
    protected void e() {
        i i2 = this.a(net.minecraft.w.d.d);
        if (this.z()) {
            if (!this.ba() && !i2.a(c)) {
                i2.b(c);
            }
            --this.d;
        } else if (i2.a(c)) {
            i2.c(c);
        }
        if (this.e > 0 && --this.e == 0) {
            this.a(net.minecraft.a.f.hL, this.bE() * 2.0f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.d > 0 && this.f != null && this.be() == null) {
            b b2 = this.aQ.a(this.f);
            this.a(b2);
            this.ap = b2;
            this.aq = this.bf();
        }
        super.e();
    }

    @Override
    public boolean aq() {
        return this.aQ.R() != net.minecraft.q.l.a;
    }

    @Override
    public boolean ar() {
        return this.aQ.a(this.cT(), (n)this) && this.aQ.a((n)this, this.cT()).isEmpty() && !this.aQ.e(this.cT());
    }

    public static void d(a a2) {
        net.minecraft.w.f.a(a2, "PigZombie");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("Anger", (short)this.d);
        if (this.f != null) {
            e2.a("HurtBy", this.f.toString());
        } else {
            e2.a("HurtBy", "");
        }
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.d = e2.g("Anger");
        String string = e2.l("HurtBy");
        if (!string.isEmpty()) {
            this.f = UUID.fromString(string);
            b b2 = this.aQ.a(this.f);
            this.a(b2);
            if (b2 != null) {
                this.ap = b2;
                this.aq = this.bf();
            }
        }
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        n n3 = n2.j();
        if (n3 instanceof b) {
            this.b(n3);
        }
        return super.a(n2, f2);
    }

    private void b(n n2) {
        this.d = 400 + this.bx.nextInt(400);
        this.e = this.bx.nextInt(40);
        if (n2 instanceof l) {
            this.a((l)n2);
        }
    }

    public boolean z() {
        return this.d > 0;
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.hK;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.hN;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.hM;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.ak;
    }

    @Override
    public boolean a(b b2, ah ah2, cu cu2) {
        return false;
    }

    @Override
    protected void a(z z2) {
        this.a(net.minecraft.h.k.a, new cu(w.D));
    }

    @Override
    public ac a(z z2, ac ac2) {
        super.a(z2, ac2);
        this.a(net.minecraft.w.e.af.a);
        return ac2;
    }

    static /* synthetic */ void a(ao ao2, n n2) {
        ao2.b(n2);
    }
}

