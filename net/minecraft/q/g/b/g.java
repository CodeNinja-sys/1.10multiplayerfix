/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.q.ab;
import net.minecraft.q.g.a;
import net.minecraft.q.g.b.b;
import net.minecraft.q.g.b.c;
import net.minecraft.q.g.b.d;
import net.minecraft.q.g.b.e;
import net.minecraft.q.g.b.f;
import net.minecraft.q.g.b.i;
import net.minecraft.q.g.b.j;
import net.minecraft.q.g.b.k;
import net.minecraft.q.g.b.l;
import net.minecraft.q.g.b.m;
import net.minecraft.q.g.b.n;
import net.minecraft.q.g.b.o;
import net.minecraft.q.g.b.q;
import net.minecraft.q.g.b.r;
import net.minecraft.q.g.b.t;
import net.minecraft.q.g.b.u;
import net.minecraft.q.g.b.v;
import net.minecraft.q.g.b.w;
import net.minecraft.q.g.h;

public abstract class g {
    private long c;
    protected g a;
    private long d;
    protected long b;

    public static g[] a(long l2, ab ab2, String string) {
        Object object;
        int n2;
        g g2 = new w(1L);
        g2 = new k(2000L, g2);
        m m2 = new m(1L, g2);
        n n3 = new n(2001L, m2);
        m m3 = new m(2L, n3);
        m3 = new m(50L, m3);
        m3 = new m(70L, m3);
        d d2 = new d(2L, m3);
        t t2 = new t(2L, d2);
        m m4 = new m(3L, t2);
        net.minecraft.q.g.b.h h2 = new net.minecraft.q.g.b.h(2L, m4, l.a);
        h2 = new net.minecraft.q.g.b.h(2L, h2, l.b);
        h2 = new net.minecraft.q.g.b.h(3L, h2, l.c);
        n n4 = new n(2002L, h2);
        n4 = new n(2003L, n4);
        m m5 = new m(4L, n4);
        u u2 = new u(5L, m5);
        net.minecraft.q.g.b.a a2 = new net.minecraft.q.g.b.a(4L, u2);
        g g3 = n.a(1000L, a2, 0);
        int n5 = n2 = 4;
        if (ab2 == ab.f && !string.isEmpty()) {
            object = h.a(string).b();
            n2 = ((a)object).G;
            n5 = ((a)object).H;
        }
        if (ab2 == ab.d) {
            n2 = 6;
        }
        object = n.a(1000L, g3, 0);
        c c2 = new c(100L, (g)object);
        o o2 = new o(200L, g3, ab2, string);
        g g4 = n.a(1000L, o2, 2);
        v v2 = new v(1000L, g4);
        g g5 = n.a(1000L, c2, 2);
        g g6 = new e(1000L, v2, g5);
        g g7 = n.a(1000L, c2, 2);
        g7 = n.a(1000L, g7, n5);
        j j2 = new j(1L, g7);
        b b2 = new b(1000L, j2);
        g6 = new i(1001L, g6);
        for (int i2 = 0; i2 < n2; ++i2) {
            g6 = new n(1000 + i2, g6);
            if (i2 == 0) {
                g6 = new m(3L, g6);
            }
            if (i2 != 1 && n2 != 1) continue;
            g6 = new f(1000L, g6);
        }
        b b3 = new b(1000L, g6);
        r r2 = new r(100L, b3, b2);
        q q2 = new q(10L, r2);
        r2.a(l2);
        q2.a(l2);
        return new g[]{r2, q2, r2};
    }

    public g(long l2) {
        this.b = l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
    }

    public void a(long l2) {
        this.c = l2;
        if (this.a != null) {
            this.a.a(l2);
        }
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
    }

    public void a(long l2, long l3) {
        this.d = this.c;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
    }

    protected int a(int n2) {
        int n3 = (int)((this.d >> 24) % (long)n2);
        if (n3 < 0) {
            n3 += n2;
        }
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += this.c;
        return n3;
    }

    public abstract int[] a(int var1, int var2, int var3, int var4);

    protected static boolean a(int n2, int n3) {
        if (n2 == n3) {
            return true;
        }
        net.minecraft.q.b.q q2 = net.minecraft.q.b.q.b(n2);
        net.minecraft.q.b.q q3 = net.minecraft.q.b.q.b(n3);
        return q2 != null && q3 != null ? (q2 != net.minecraft.a.i.N && q2 != net.minecraft.a.i.O ? q2 == q3 || q2.a() == q3.a() : q3 == net.minecraft.a.i.N || q3 == net.minecraft.a.i.O) : false;
    }

    protected static boolean b(int n2) {
        net.minecraft.q.b.q q2 = net.minecraft.q.b.q.b(n2);
        return q2 == net.minecraft.a.i.a || q2 == net.minecraft.a.i.z || q2 == net.minecraft.a.i.l;
    }

    protected int a(int ... arrn) {
        return arrn[this.a(arrn.length)];
    }

    protected int b(int n2, int n3, int n4, int n5) {
        return n3 == n4 && n4 == n5 ? n3 : (n2 == n3 && n2 == n4 ? n2 : (n2 == n3 && n2 == n5 ? n2 : (n2 == n4 && n2 == n5 ? n2 : (n2 == n3 && n4 != n5 ? n2 : (n2 == n4 && n3 != n5 ? n2 : (n2 == n5 && n3 != n4 ? n2 : (n3 == n4 && n2 != n5 ? n3 : (n3 == n5 && n2 != n4 ? n3 : (n4 == n5 && n2 != n3 ? n4 : this.a(new int[]{n2, n3, n4, n5}))))))))));
    }
}

