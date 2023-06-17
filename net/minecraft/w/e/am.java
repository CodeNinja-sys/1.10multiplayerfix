/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.bp;
import net.minecraft.g.c.b;
import net.minecraft.g.dc;
import net.minecraft.q.k;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.aj;

class am
extends bm {
    private final aj a;
    private int b;

    public am(aj aj2) {
        this.a = aj2;
    }

    public void f() {
        if (this.b == 0) {
            this.b = 20;
        }
    }

    @Override
    public boolean e() {
        return this.b > 0;
    }

    @Override
    public void d() {
        --this.b;
        if (this.b <= 0) {
            k k2 = this.a.aQ;
            Random random = this.a.bd();
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a);
            int n2 = 0;
            while (n2 <= 5 && n2 >= -5) {
                int n3 = 0;
                while (n3 <= 10 && n3 >= -10) {
                    int n4 = 0;
                    while (n4 <= 10 && n4 >= -10) {
                        net.minecraft.u.b.b b3 = b2.a(n3, n2, n4);
                        b b4 = k2.n(b3);
                        if (b4.c() == p.be) {
                            if (k2.G().b("mobGriefing")) {
                                k2.b(b3, true);
                            } else {
                                k2.a(b3, ((bp)((Object)b4.a(dc.a))).b(), 3);
                            }
                            if (random.nextBoolean()) {
                                return;
                            }
                        }
                        int n5 = n4 = n4 <= 0 ? 1 - n4 : 0 - n4;
                    }
                    int n6 = n3 = n3 <= 0 ? 1 - n3 : 0 - n3;
                }
                int n7 = n2 = n2 <= 0 ? 1 - n2 : 0 - n2;
            }
        }
    }
}

