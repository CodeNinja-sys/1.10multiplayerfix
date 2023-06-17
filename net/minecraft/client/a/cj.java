/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.bm;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.cf;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.ac;

public class cj
implements cf {
    @Override
    public cb a(int n2, k k2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        b b2 = cn.e(arrn[0]);
        return b2.l() == ac.a ? null : new bm(k2, d2, d3, d4, d5, d6, d7, b2).c();
    }
}

