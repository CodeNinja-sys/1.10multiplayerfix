/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.am;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.cf;

public class k
implements cf {
    @Override
    public cb a(int n2, net.minecraft.q.k k2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        am am2 = new am(k2, d2, d3, d4, d5, d6, d7);
        am2.a(144);
        float f2 = k2.p.nextFloat() * 0.5f + 0.35f;
        am2.a(1.0f * f2, 0.0f * f2, 1.0f * f2);
        return am2;
    }
}

