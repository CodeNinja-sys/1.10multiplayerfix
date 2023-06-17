/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.cd;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;

public class bc
extends j {
    private aj c;

    public bc() {
    }

    public bc(k k2, Random random, int n2, int n3, aj aj2) {
        super(n2, n3);
        this.c = aj2;
        cd cd2 = new cd(0, random, (n2 << 4) + 2, (n3 << 4) + 2, this.c);
        this.a.add(cd2);
        cd2.a(cd2, this.a, random);
        this.c();
        if (aj2 == aj.b) {
            int n4 = -5;
            int n5 = k2.x() - this.b.e + this.b.d() / 2 - -5;
            this.b.a(0, n5, 0);
            for (r r2 : this.a) {
                r2.a(0, n5, 0);
            }
        } else {
            this.a(k2, random, 10);
        }
    }
}

