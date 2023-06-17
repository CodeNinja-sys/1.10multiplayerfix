/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.q.g.a.x;
import net.minecraft.q.k;

public class af
extends x {
    private final b a;
    private final b b;

    public af(b b2, b b3) {
        super(false);
        this.b = b2;
        this.a = b3;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        Object object = k2.n(b2);
        while ((object.d() == h.a || object.d() == h.j) && b2.k() > 0) {
            b2 = b2.c();
            object = k2.n(b2);
        }
        object = k2.n(b2).c();
        if (object == p.d || object == p.c) {
            b2 = b2.b();
            this.a(k2, b2, this.b);
            for (int i2 = b2.k(); i2 <= b2.k() + 2; ++i2) {
                int n2 = i2 - b2.k();
                int n3 = 2 - n2;
                for (int i3 = b2.cy_() - n3; i3 <= b2.cy_() + n3; ++i3) {
                    int n4 = i3 - b2.cy_();
                    for (int i4 = b2.l() - n3; i4 <= b2.l() + n3; ++i4) {
                        net.minecraft.u.b.b b3;
                        h h2;
                        int n5 = i4 - b2.l();
                        if (Math.abs(n4) == n3 && Math.abs(n5) == n3 && random.nextInt(2) == 0 || (h2 = k2.n(b3 = new net.minecraft.u.b.b(i3, i2, i4)).d()) != h.a && h2 != h.j) continue;
                        this.a(k2, b3, this.a);
                    }
                }
            }
        }
        return true;
    }
}

