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

class k
implements x {
    public cu a;
    public o b;
    public cu c;
    public o d;

    public k(cg cg2, o o2, cg cg3, o o3) {
        this.a = new cu(cg2);
        this.b = o2;
        this.c = new cu(cg3);
        this.d = o3;
    }

    @Override
    public void a(d d2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        int n3 = 1;
        if (this.d != null) {
            n3 = this.d.a(random);
        }
        d2.add(new b(new cu(this.a.a(), n2, this.a.h()), new cu(w.bY), new cu(this.c.a(), n3, this.c.h())));
    }
}

