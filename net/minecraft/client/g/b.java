/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.util.BitSet;
import net.minecraft.client.g.av;
import net.minecraft.client.g.bb;
import net.minecraft.client.g.be;
import net.minecraft.client.g.cn;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.h;

class b {
    private final float[] b = new float[4];
    private final int[] c = new int[4];
    final /* synthetic */ cn a;

    b(cn cn2) {
        this.a = cn2;
    }

    public void a(n n2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, ad ad2, float[] arrf, BitSet bitSet) {
        int n3;
        float f2;
        int n4;
        float f3;
        int n5;
        float f4;
        int n6;
        float f5;
        net.minecraft.u.b.b b4 = bitSet.get(0) ? b3.a(ad2) : b3;
        h h2 = h.m();
        av av2 = av.a(ad2);
        h h3 = h.f(b4).c(av.a(av2)[0]);
        h h4 = h.f(b4).c(av.a(av2)[1]);
        h h5 = h.f(b4).c(av.a(av2)[2]);
        h h6 = h.f(b4).c(av.a(av2)[3]);
        int n7 = b2.a(n2, (net.minecraft.u.b.b)h3);
        int n8 = b2.a(n2, (net.minecraft.u.b.b)h4);
        int n9 = b2.a(n2, (net.minecraft.u.b.b)h5);
        int n10 = b2.a(n2, (net.minecraft.u.b.b)h6);
        float f6 = n2.n(h3).m();
        float f7 = n2.n(h4).m();
        float f8 = n2.n(h5).m();
        float f9 = n2.n(h6).m();
        boolean bl2 = n2.n(h2.g(h3).c(ad2)).h();
        boolean bl3 = n2.n(h2.g(h4).c(ad2)).h();
        boolean bl4 = n2.n(h2.g(h5).c(ad2)).h();
        boolean bl5 = n2.n(h2.g(h6).c(ad2)).h();
        if (!bl4 && !bl2) {
            f5 = f6;
            n6 = n7;
        } else {
            h h7 = h2.g(h3).c(av.a(av2)[2]);
            f5 = n2.n(h7).m();
            n6 = b2.a(n2, (net.minecraft.u.b.b)h7);
        }
        if (!bl5 && !bl2) {
            f4 = f6;
            n5 = n7;
        } else {
            h h8 = h2.g(h3).c(av.a(av2)[3]);
            f4 = n2.n(h8).m();
            n5 = b2.a(n2, (net.minecraft.u.b.b)h8);
        }
        if (!bl4 && !bl3) {
            f3 = f7;
            n4 = n8;
        } else {
            h h9 = h2.g(h4).c(av.a(av2)[2]);
            f3 = n2.n(h9).m();
            n4 = b2.a(n2, (net.minecraft.u.b.b)h9);
        }
        if (!bl5 && !bl3) {
            f2 = f7;
            n3 = n8;
        } else {
            h h10 = h2.g(h4).c(av.a(av2)[3]);
            f2 = n2.n(h10).m();
            n3 = b2.a(n2, (net.minecraft.u.b.b)h10);
        }
        int n11 = b2.a(n2, b3);
        if (bitSet.get(0) || !n2.n(b3.a(ad2)).s()) {
            n11 = b2.a(n2, b3.a(ad2));
        }
        float f10 = bitSet.get(0) ? n2.n(b4).m() : n2.n(b3).m();
        bb bb2 = bb.a(ad2);
        h2.n();
        h3.n();
        h4.n();
        h5.n();
        h6.n();
        if (bitSet.get(1) && av.b(av2)) {
            float f11 = (f9 + f6 + f4 + f10) * 0.25f;
            float f12 = (f8 + f6 + f5 + f10) * 0.25f;
            float f13 = (f8 + f7 + f3 + f10) * 0.25f;
            float f14 = (f9 + f7 + f2 + f10) * 0.25f;
            float f15 = arrf[be.a(av.c(av2)[0])] * arrf[be.a(av.c(av2)[1])];
            float f16 = arrf[be.a(av.c(av2)[2])] * arrf[be.a(av.c(av2)[3])];
            float f17 = arrf[be.a(av.c(av2)[4])] * arrf[be.a(av.c(av2)[5])];
            float f18 = arrf[be.a(av.c(av2)[6])] * arrf[be.a(av.c(av2)[7])];
            float f19 = arrf[be.a(av.d(av2)[0])] * arrf[be.a(av.d(av2)[1])];
            float f20 = arrf[be.a(av.d(av2)[2])] * arrf[be.a(av.d(av2)[3])];
            float f21 = arrf[be.a(av.d(av2)[4])] * arrf[be.a(av.d(av2)[5])];
            float f22 = arrf[be.a(av.d(av2)[6])] * arrf[be.a(av.d(av2)[7])];
            float f23 = arrf[be.a(av.e(av2)[0])] * arrf[be.a(av.e(av2)[1])];
            float f24 = arrf[be.a(av.e(av2)[2])] * arrf[be.a(av.e(av2)[3])];
            float f25 = arrf[be.a(av.e(av2)[4])] * arrf[be.a(av.e(av2)[5])];
            float f26 = arrf[be.a(av.e(av2)[6])] * arrf[be.a(av.e(av2)[7])];
            float f27 = arrf[be.a(av.f(av2)[0])] * arrf[be.a(av.f(av2)[1])];
            float f28 = arrf[be.a(av.f(av2)[2])] * arrf[be.a(av.f(av2)[3])];
            float f29 = arrf[be.a(av.f(av2)[4])] * arrf[be.a(av.f(av2)[5])];
            float f30 = arrf[be.a(av.f(av2)[6])] * arrf[be.a(av.f(av2)[7])];
            this.b[bb.a((bb)bb2)] = f11 * f15 + f12 * f16 + f13 * f17 + f14 * f18;
            this.b[bb.b((bb)bb2)] = f11 * f19 + f12 * f20 + f13 * f21 + f14 * f22;
            this.b[bb.c((bb)bb2)] = f11 * f23 + f12 * f24 + f13 * f25 + f14 * f26;
            this.b[bb.d((bb)bb2)] = f11 * f27 + f12 * f28 + f13 * f29 + f14 * f30;
            int n12 = this.a(n10, n7, n5, n11);
            int n13 = this.a(n9, n7, n6, n11);
            int n14 = this.a(n9, n8, n4, n11);
            int n15 = this.a(n10, n8, n3, n11);
            this.c[bb.a((bb)bb2)] = this.a(n12, n13, n14, n15, f15, f16, f17, f18);
            this.c[bb.b((bb)bb2)] = this.a(n12, n13, n14, n15, f19, f20, f21, f22);
            this.c[bb.c((bb)bb2)] = this.a(n12, n13, n14, n15, f23, f24, f25, f26);
            this.c[bb.d((bb)bb2)] = this.a(n12, n13, n14, n15, f27, f28, f29, f30);
        } else {
            float f31 = (f9 + f6 + f4 + f10) * 0.25f;
            float f32 = (f8 + f6 + f5 + f10) * 0.25f;
            float f33 = (f8 + f7 + f3 + f10) * 0.25f;
            float f34 = (f9 + f7 + f2 + f10) * 0.25f;
            this.c[bb.a((bb)bb2)] = this.a(n10, n7, n5, n11);
            this.c[bb.b((bb)bb2)] = this.a(n9, n7, n6, n11);
            this.c[bb.c((bb)bb2)] = this.a(n9, n8, n4, n11);
            this.c[bb.d((bb)bb2)] = this.a(n10, n8, n3, n11);
            this.b[bb.a((bb)bb2)] = f31;
            this.b[bb.b((bb)bb2)] = f32;
            this.b[bb.c((bb)bb2)] = f33;
            this.b[bb.d((bb)bb2)] = f34;
        }
    }

    private int a(int n2, int n3, int n4, int n5) {
        if (n2 == 0) {
            n2 = n5;
        }
        if (n3 == 0) {
            n3 = n5;
        }
        if (n4 == 0) {
            n4 = n5;
        }
        return n2 + n3 + n4 + n5 >> 2 & 0xFF00FF;
    }

    private int a(int n2, int n3, int n4, int n5, float f2, float f3, float f4, float f5) {
        int n6 = (int)((float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4 + (float)(n5 >> 16 & 0xFF) * f5) & 0xFF;
        int n7 = (int)((float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4 + (float)(n5 & 0xFF) * f5) & 0xFF;
        return n6 << 16 | n7;
    }

    static /* synthetic */ int[] a(b b2) {
        return b2.c;
    }

    static /* synthetic */ float[] b(b b2) {
        return b2.b;
    }
}

