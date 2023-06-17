/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class e
extends aj {
    private final cn a;
    private final int b;

    public e(cn cn2, int n2) {
        this.a = cn2;
        this.b = n2;
    }

    @Override
    public boolean a(k k2, Random random, b b2) {
        if (k2.n(b2).d() != h.h) {
            return false;
        }
        int n2 = random.nextInt(this.b - 2) + 2;
        int n3 = 2;
        for (int i2 = b2.cy_() - n2; i2 <= b2.cy_() + n2; ++i2) {
            for (int i3 = b2.l() - n2; i3 <= b2.l() + n2; ++i3) {
                int n4;
                int n5 = i2 - b2.cy_();
                if (n5 * n5 + (n4 = i3 - b2.l()) * n4 > n2 * n2) continue;
                for (int i4 = b2.k() - 2; i4 <= b2.k() + 2; ++i4) {
                    b b3 = new b(i2, i4, i3);
                    cn cn2 = k2.n(b3).c();
                    if (cn2 != p.d && cn2 != p.c) continue;
                    k2.a(b3, this.a.v(), 2);
                }
            }
        }
        return true;
    }
}

