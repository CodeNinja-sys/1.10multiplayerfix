/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class at
extends aj {
    private final cn a;
    private final int b;

    public at(cn cn2, int n2) {
        super(false);
        this.a = cn2;
        this.b = n2;
    }

    @Override
    public boolean a(k k2, Random random, b b2) {
        while (true) {
            cn cn2;
            if (b2.k() <= 3 || !k2.c(b2.c()) && ((cn2 = k2.n(b2.c()).c()) == p.c || cn2 == p.d || cn2 == p.b)) {
                if (b2.k() <= 3) {
                    return false;
                }
                int n2 = this.b;
                for (int i2 = 0; n2 >= 0 && i2 < 3; ++i2) {
                    int n3 = n2 + random.nextInt(2);
                    int n4 = n2 + random.nextInt(2);
                    int n5 = n2 + random.nextInt(2);
                    float f2 = (float)(n3 + n4 + n5) * 0.333f + 0.5f;
                    for (b b3 : net.minecraft.u.b.b.a(b2.a(-n3, -n4, -n5), b2.a(n3, n4, n5))) {
                        if (!(b3.i(b2) <= (double)(f2 * f2))) continue;
                        k2.a(b3, this.a.v(), 4);
                    }
                    b2 = b2.a(-(n2 + 1) + random.nextInt(2 + n2 * 2), 0 - random.nextInt(2), -(n2 + 1) + random.nextInt(2 + n2 * 2));
                }
                return true;
            }
            b2 = b2.c();
        }
    }
}

