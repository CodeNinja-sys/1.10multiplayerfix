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

class h
implements g {
    public cg a;
    public d b;

    public h(cg cg2, d d2) {
        this.a = cg2;
        this.b = d2;
    }

    @Override
    public void a(net.minecraft.b.d d2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        d2.add(new b(new cu(this.a, n2, 0), w.bY));
    }
}

