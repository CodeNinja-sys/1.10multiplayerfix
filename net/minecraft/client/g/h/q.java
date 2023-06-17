/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.j;
import net.minecraft.e.a;
import net.minecraft.e.o;
import net.minecraft.m.cc;
import net.minecraft.m.cu;

class q
implements j {
    q() {
    }

    @Override
    public int a(cu cu2, int n2) {
        if (n2 != 1) {
            return -1;
        }
        a a2 = cc.a(cu2, "Colors");
        if (!(a2 instanceof o)) {
            return 0x8A8A8A;
        }
        int[] arrn = ((o)a2).f();
        if (arrn.length == 1) {
            return arrn[0];
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int[] arrn2 = arrn;
        int n6 = arrn.length;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7 = arrn2[i2];
            n3 += (n7 & 0xFF0000) >> 16;
            n4 += (n7 & 0xFF00) >> 8;
            n5 += (n7 & 0xFF) >> 0;
        }
        return (n3 /= arrn.length) << 16 | (n4 /= arrn.length) << 8 | (n5 /= arrn.length);
    }
}

