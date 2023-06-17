/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.b;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.cf;
import net.minecraft.m.cg;
import net.minecraft.q.k;

public class as
implements cf {
    @Override
    public cb a(int n2, k k2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        int n3 = arrn.length > 1 ? arrn[1] : 0;
        return new b(k2, d2, d3, d4, d5, d6, d7, cg.c(arrn[0]), n3);
    }
}

