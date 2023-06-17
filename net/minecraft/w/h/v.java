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

class v
implements x {
    public cu a;
    public o b;

    public v(cg cg2, o o2) {
        this.a = new cu(cg2);
        this.b = o2;
    }

    public v(cu cu2, o o2) {
        this.a = cu2;
        this.b = o2;
    }

    @Override
    public void a(d d2, Random random) {
        cu cu2;
        cu cu3;
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        if (n2 < 0) {
            cu3 = new cu(w.bY);
            cu2 = new cu(this.a.a(), -n2, this.a.h());
        } else {
            cu3 = new cu(w.bY, n2, 0);
            cu2 = new cu(this.a.a(), 1, this.a.h());
        }
        d2.add(new b(cu3, cu2));
    }
}

