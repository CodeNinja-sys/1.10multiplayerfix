/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.bd;
import net.minecraft.m.cu;
import net.minecraft.m.p;

public class ba
extends bd {
    private static final Set l = aad.a(net.minecraft.a.p.cs, net.minecraft.a.p.q, net.minecraft.a.p.e, net.minecraft.a.p.E, net.minecraft.a.p.ah, net.minecraft.a.p.ag, net.minecraft.a.p.T, net.minecraft.a.p.D, net.minecraft.a.p.R, net.minecraft.a.p.o, net.minecraft.a.p.aI, net.minecraft.a.p.S, net.minecraft.a.p.p, net.minecraft.a.p.y, net.minecraft.a.p.x, net.minecraft.a.p.aD, net.minecraft.a.p.Y, net.minecraft.a.p.aV, net.minecraft.a.p.cB, net.minecraft.a.p.av, net.minecraft.a.p.aC, net.minecraft.a.p.A, net.minecraft.a.p.cM, net.minecraft.a.p.b, net.minecraft.a.p.U, net.minecraft.a.p.aG, net.minecraft.a.p.az);

    protected ba(p p2) {
        super(1.0f, -2.8f, p2, l);
    }

    @Override
    public boolean a(b b2) {
        cn cn2 = b2.c();
        if (cn2 == net.minecraft.a.p.Z) {
            return this.d.d() == 3;
        }
        if (cn2 != net.minecraft.a.p.ah && cn2 != net.minecraft.a.p.ag) {
            if (cn2 != net.minecraft.a.p.bP && cn2 != net.minecraft.a.p.bT) {
                if (cn2 != net.minecraft.a.p.R && cn2 != net.minecraft.a.p.o) {
                    if (cn2 != net.minecraft.a.p.S && cn2 != net.minecraft.a.p.p) {
                        if (cn2 != net.minecraft.a.p.y && cn2 != net.minecraft.a.p.x) {
                            if (cn2 != net.minecraft.a.p.aC && cn2 != net.minecraft.a.p.aD) {
                                h h2 = b2.d();
                                return h2 == net.minecraft.g.a.h.e ? true : (h2 == net.minecraft.g.a.h.f ? true : h2 == net.minecraft.g.a.h.g);
                            }
                            return this.d.d() >= 2;
                        }
                        return this.d.d() >= 1;
                    }
                    return this.d.d() >= 1;
                }
                return this.d.d() >= 2;
            }
            return this.d.d() >= 2;
        }
        return this.d.d() >= 2;
    }

    @Override
    public float a(cu cu2, b b2) {
        h h2 = b2.d();
        return h2 != net.minecraft.g.a.h.f && h2 != net.minecraft.g.a.h.g && h2 != net.minecraft.g.a.h.e ? super.a(cu2, b2) : this.a;
    }
}

