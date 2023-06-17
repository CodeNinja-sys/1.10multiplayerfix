/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.b.b;
import net.minecraft.b.d;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.w.h.o;
import net.minecraft.w.h.x;

class i
implements x {
    public cu a;
    public o b;

    public i(cg cg2, o o2) {
        this.a = new cu(cg2);
        this.b = o2;
    }

    @Override
    public void a(d d2, Random random) {
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

