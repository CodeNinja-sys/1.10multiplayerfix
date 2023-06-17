/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.a.i;
import net.minecraft.q.b.q;
import net.minecraft.q.g.c.b;
import net.minecraft.q.g.c.ch;
import net.minecraft.q.g.c.ck;
import net.minecraft.q.g.c.dd;
import net.minecraft.q.g.c.j;
import net.minecraft.q.k;

public class bp
extends j {
    public bp() {
    }

    public bp(k k2, Random random, int n2, int n3) {
        this(k2, random, n2, n3, k2.a(new net.minecraft.u.b.b(n2 * 16 + 8, 0, n3 * 16 + 8)));
    }

    public bp(k k2, Random random, int n2, int n3, q q2) {
        super(n2, n3);
        if (q2 != i.w && q2 != i.x) {
            if (q2 == i.h) {
                b b2 = new b(random, n2 * 16, n3 * 16);
                this.a.add(b2);
            } else if (q2 != i.d && q2 != i.s) {
                if (q2 == i.n || q2 == i.F) {
                    dd dd2 = new dd(random, n2 * 16, n3 * 16);
                    this.a.add(dd2);
                }
            } else {
                ch ch2 = new ch(random, n2 * 16, n3 * 16);
                this.a.add(ch2);
            }
        } else {
            ck ck2 = new ck(random, n2 * 16, n3 * 16);
            this.a.add(ck2);
        }
        this.c();
    }
}

