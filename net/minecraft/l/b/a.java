/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l.b;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.b.b;
import net.minecraft.l.b.d;
import net.minecraft.l.b.g;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.o.f;

class a
implements g {
    public cu a;
    public d b;

    public a(cg cg2, d d2) {
        this.a = new cu(cg2);
        this.b = d2;
    }

    @Override
    public void a(net.minecraft.b.d d2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        cu cu2 = new cu(w.bY, n2, 0);
        cu cu3 = new cu(this.a.a(), 1, this.a.h());
        cu3 = f.a(random, cu3, 5 + random.nextInt(15), false);
        d2.add(new b(cu2, cu3));
    }
}

