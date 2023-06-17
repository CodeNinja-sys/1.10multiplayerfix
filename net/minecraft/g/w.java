/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.f.ae;
import net.minecraft.f.ag;
import net.minecraft.f.ap;
import net.minecraft.f.k;
import net.minecraft.g.en;
import net.minecraft.g.hj;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.t.b;
import net.minecraft.t.i;
import net.minecraft.u.ad;

public class w
extends en {
    private final i e = new b();

    @Override
    protected i a(cu cu2) {
        return this.e;
    }

    @Override
    public ap a(net.minecraft.q.k k2, int n2) {
        return new ag();
    }

    @Override
    protected void b(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        hj hj2 = new hj(k2, b2);
        ae ae2 = (ae)hj2.g();
        if (ae2 != null) {
            int n2 = ae2.k();
            if (n2 < 0) {
                k2.b(1001, b2, 0);
            } else {
                cu cu2 = ae2.a(n2);
                if (cu2 != null) {
                    cu cu3;
                    ad ad2 = (ad)((Object)k2.n(b2).a(a));
                    net.minecraft.u.b.b b3 = b2.a(ad2);
                    y y2 = k.b(k2, b3.cy_(), (double)b3.k(), b3.l());
                    if (y2 == null) {
                        cu3 = this.e.a_(hj2, cu2);
                        if (cu3 != null && cu3.b <= 0) {
                            cu3 = null;
                        }
                    } else {
                        cu3 = k.a(y2, cu2.j().a(1), ad2.e());
                        if (cu3 == null) {
                            cu3 = cu2.j();
                            if (--cu3.b <= 0) {
                                cu3 = null;
                            }
                        } else {
                            cu3 = cu2.j();
                        }
                    }
                    ae2.a(n2, cu3);
                }
            }
        }
    }
}

