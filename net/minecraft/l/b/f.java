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

class f
implements g {
    public cu a;
    public d b;
    public cu c;
    public d d;

    public f(cg cg2, d d2, cg cg3, d d3) {
        this.a = new cu(cg2);
        this.b = d2;
        this.c = new cu(cg3);
        this.d = d3;
    }

    @Override
    public void a(net.minecraft.b.d d2, Random random) {
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

