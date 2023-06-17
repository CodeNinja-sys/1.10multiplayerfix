/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.g.c.b;
import net.minecraft.g.fh;
import net.minecraft.g.gb;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class d
extends aj {
    private gb a;
    private b b;

    public d(gb gb2, fh fh2) {
        this.a(gb2, fh2);
    }

    public void a(gb gb2, fh fh2) {
        this.a = gb2;
        this.b = gb2.v().a(gb2.h(), (Comparable)((Object)fh2));
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            net.minecraft.u.b.b b3 = b2.a(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!k2.c(b3) || k2.q.n() && b3.k() >= 255 || !this.a.e(k2, b3, this.b)) continue;
            k2.a(b3, this.b, 2);
        }
        return true;
    }
}

