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
import net.minecraft.w.h.o;
import net.minecraft.w.h.x;

class g
implements x {
    public cg a;
    public o b;

    public g(cg cg2, o o2) {
        this.a = cg2;
        this.b = o2;
    }

    @Override
    public void a(d d2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        d2.add(new b(new cu(this.a, n2, 0), w.bY));
    }
}

