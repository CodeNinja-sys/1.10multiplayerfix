/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.dc;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.w.b.az;
import net.minecraft.w.e.aj;

class bp
extends az {
    private final aj a;
    private ad b;
    private boolean c;

    public bp(aj aj2) {
        super(aj2, 1.0, 10);
        this.a = aj2;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (!this.a.aQ.G().b("mobGriefing")) {
            return false;
        }
        if (this.a.W() != null) {
            return false;
        }
        if (!this.a.N().l()) {
            return false;
        }
        Random random = this.a.bd();
        if (random.nextInt(10) == 0) {
            this.b = ad.a(random);
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a.aU, this.a.aV + 0.5, this.a.aW).a(this.b);
            b b3 = this.a.aQ.n(b2);
            if (dc.l(b3)) {
                this.c = true;
                return true;
            }
        }
        this.c = false;
        return super.e();
    }

    @Override
    public boolean a() {
        return this.c ? false : super.a();
    }

    @Override
    public void b() {
        if (!this.c) {
            super.b();
        } else {
            k k2 = this.a.aQ;
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a.aU, this.a.aV + 0.5, this.a.aW).a(this.b);
            b b3 = k2.n(b2);
            if (dc.l(b3)) {
                k2.a(b2, p.be.v().a(dc.a, (Comparable)((Object)net.minecraft.g.bp.a(b3))), 3);
                this.a.ag();
                this.a.aa();
            }
        }
    }
}

