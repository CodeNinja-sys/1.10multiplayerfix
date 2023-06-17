/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import com.a.a.b.cn;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bl;
import net.minecraft.g.c.a.i;
import net.minecraft.g.c.b;
import net.minecraft.g.cd;
import net.minecraft.g.el;
import net.minecraft.g.fl;
import net.minecraft.g.gd;
import net.minecraft.g.hy;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;

public class au
extends aj {
    private static final i a = i.a(p.m).a(gd.b, cn.a((Object)hy.a));
    private final b b = p.U.v().a(fl.e, (Comparable)((Object)el.b)).a(bl.b, (Comparable)((Object)cd.b));
    private final b c = p.A.v();
    private final b d = p.i.v();

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2;
        int n3;
        int n4;
        while (k2.c(b2) && b2.k() > 2) {
            b2 = b2.c();
        }
        if (!a.a(k2.n(b2))) {
            return false;
        }
        for (n4 = -2; n4 <= 2; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                if (!k2.c(b2.a(n4, -1, n3)) || !k2.c(b2.a(n4, -2, n3))) continue;
                return false;
            }
        }
        for (n4 = -1; n4 <= 0; ++n4) {
            for (n3 = -2; n3 <= 2; ++n3) {
                for (int i2 = -2; i2 <= 2; ++i2) {
                    k2.a(b2.a(n3, n4, i2), this.c, 2);
                }
            }
        }
        k2.a(b2, this.d, 2);
        for (ad ad2 : ag.a) {
            k2.a(b2.a(ad2), this.d, 2);
        }
        for (n2 = -2; n2 <= 2; ++n2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (n2 != -2 && n2 != 2 && i3 != -2 && i3 != 2) continue;
                k2.a(b2.a(n2, 1, i3), this.c, 2);
            }
        }
        k2.a(b2.a(2, 1, 0), this.b, 2);
        k2.a(b2.a(-2, 1, 0), this.b, 2);
        k2.a(b2.a(0, 1, 2), this.b, 2);
        k2.a(b2.a(0, 1, -2), this.b, 2);
        for (n2 = -1; n2 <= 1; ++n2) {
            for (int i4 = -1; i4 <= 1; ++i4) {
                if (n2 == 0 && i4 == 0) {
                    k2.a(b2.a(n2, 4, i4), this.c, 2);
                    continue;
                }
                k2.a(b2.a(n2, 4, i4), this.b, 2);
            }
        }
        for (n2 = 1; n2 <= 3; ++n2) {
            k2.a(b2.a(-1, n2, -1), this.c, 2);
            k2.a(b2.a(-1, n2, 1), this.c, 2);
            k2.a(b2.a(1, n2, -1), this.c, 2);
            k2.a(b2.a(1, n2, 1), this.c, 2);
        }
        return true;
    }
}

