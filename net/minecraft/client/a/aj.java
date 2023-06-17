/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.a.p;
import net.minecraft.client.a.bk;
import net.minecraft.client.a.cb;
import net.minecraft.client.a.cf;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dq;
import net.minecraft.q.k;
import net.minecraft.u.ac;

public class aj
implements cf {
    @Override
    public cb a(int n2, k k2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        b b2 = cn.e(arrn[0]);
        if (b2.c() != p.a && b2.l() == ac.a) {
            return null;
        }
        int n3 = r.z().ak().a(b2);
        if (b2.c() instanceof dq) {
            n3 = ((dq)b2.c()).l(b2);
        }
        float f2 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n3 & 0xFF) / 255.0f;
        return new bk(k2, d2, d3, d4, f2, f3, f4);
    }
}

