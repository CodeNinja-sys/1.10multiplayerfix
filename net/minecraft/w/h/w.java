/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.f;
import net.minecraft.w.f.ae;
import net.minecraft.w.h.ab;
import net.minecraft.w.l;

public class w
extends ab {
    public w(k k2) {
        super(k2);
        this.d(0.9f, 1.4f);
        this.a = net.minecraft.a.p.bw;
    }

    public static void a(a a2) {
        f.a(a2, "MushroomCow");
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.B && this.dn() >= 0 && !b2.J.d) {
            if (--cu2.b == 0) {
                b2.a(ah2, new cu(net.minecraft.a.w.C));
            } else if (!b2.q.c(new cu(net.minecraft.a.w.C))) {
                b2.a(new cu(net.minecraft.a.w.C), false);
            }
            return true;
        }
        if (cu2 != null && cu2.a() == net.minecraft.a.w.bl && this.dn() >= 0) {
            this.aa();
            this.aQ.a(net.minecraft.u.aj.b, this.aU, this.aV + (double)(this.bm / 2.0f), this.aW, 0.0, 0.0, 0.0, new int[0]);
            if (!this.aQ.C) {
                ab ab2 = new ab(this.aQ);
                ab2.b(this.aU, this.aV, this.aW, this.ba, this.bb);
                ab2.h(this.bo());
                ab2.ak = this.ak;
                if (this.bO_()) {
                    ab2.g(this.cP());
                }
                this.aQ.a(ab2);
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.aQ.a(new ae(this.aQ, this.aU, this.aV + (double)this.bm, this.aW, new cu(net.minecraft.a.p.Q)));
                }
                cu2.a(1, (l)b2);
                this.a(net.minecraft.a.f.dC, 1.0f, 1.0f);
            }
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    public w a(ah ah2) {
        return new w(this.aQ);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.J;
    }

    @Override
    public /* synthetic */ ab c(ah ah2) {
        return this.a(ah2);
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

