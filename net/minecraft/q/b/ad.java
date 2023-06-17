/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.af;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.e.ao;
import net.minecraft.w.e.au;
import net.minecraft.w.e.bh;
import net.minecraft.w.e.bn;

public class ad
extends q {
    public ad(ab ab2) {
        super(ab2);
        this.x.clear();
        this.y.clear();
        this.z.clear();
        this.A.clear();
        this.x.add(new am(bn.class, 50, 4, 4));
        this.x.add(new am(ao.class, 100, 4, 4));
        this.x.add(new am(bh.class, 2, 4, 4));
        this.x.add(new am(au.class, 1, 4, 4));
        this.w = new af();
    }

    @Override
    public void a(k k2, Random random, b b2) {
        super.a(k2, random, b2);
    }
}

