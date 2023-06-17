/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import com.a.a.d.aad;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.a.p;
import net.minecraft.c.b.a;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dj;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.b.g;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;
import net.minecraft.u.cd;
import net.minecraft.w.aa;
import net.minecraft.w.ac;
import net.minecraft.w.ag;
import net.minecraft.w.f;
import net.minecraft.w.z;

public final class c {
    private static final int a = (int)Math.pow(17.0, 2.0);
    private final Set b = aad.a();

    public int a(v v2, boolean bl2, boolean bl3, boolean bl4) {
        Object object;
        int n2;
        int n3;
        if (!bl2 && !bl3) {
            return 0;
        }
        this.b.clear();
        int n4 = 0;
        for (net.minecraft.w.a.b b2 : v2.g) {
            if (b2.a()) continue;
            int n5 = n.c(b2.aU / 16.0);
            int n6 = n.c(b2.aW / 16.0);
            int n7 = 8;
            for (int i2 = -8; i2 <= 8; ++i2) {
                for (n3 = -8; n3 <= 8; ++n3) {
                    Object object2;
                    n2 = i2 != -8 && i2 != 8 && n3 != -8 && n3 != 8 ? 0 : 1;
                    object = new m(i2 + n5, n3 + n6);
                    if (this.b.contains(object)) continue;
                    ++n4;
                    if (n2 != 0 || !v2.V().a((m)object) || (object2 = v2.af().b(((m)object).a, ((m)object).b)) == null || !((a)object2).e()) continue;
                    this.b.add(object);
                }
            }
        }
        int n8 = 0;
        net.minecraft.u.b.b b3 = v2.D();
        for (ag ag2 : ag.values()) {
            if (ag2.c() && !bl3 || !ag2.c() && !bl2 || ag2.d() && !bl4 || (n3 = v2.a(ag2.a())) > (n2 = ag2.b() * n4 / a)) continue;
            object = new g();
            block6: for (Object object2 : this.b) {
                net.minecraft.u.b.b b4 = c.a(v2, ((m)object2).a, ((m)object2).b);
                int n9 = b4.cy_();
                int n10 = b4.k();
                int n11 = b4.l();
                b b5 = v2.n(b4);
                if (b5.o()) continue;
                int n12 = 0;
                block7: for (int i3 = 0; i3 < 3; ++i3) {
                    int n13 = n9;
                    int n14 = n10;
                    int n15 = n11;
                    int n16 = 6;
                    am am2 = null;
                    ac ac2 = null;
                    int n17 = n.f(Math.random() * 4.0);
                    for (int i4 = 0; i4 < n17; ++i4) {
                        f f2;
                        ((g)object).b(n13 += v2.p.nextInt(6) - v2.p.nextInt(6), n14 += v2.p.nextInt(1) - v2.p.nextInt(1), n15 += v2.p.nextInt(6) - v2.p.nextInt(6));
                        float f3 = (float)n13 + 0.5f;
                        float f4 = (float)n15 + 0.5f;
                        if (v2.a(f3, (double)n14, f4, 24.0) || !(b3.e(f3, (double)n14, f4) >= 576.0)) continue;
                        if (am2 == null && (am2 = v2.a(ag2, (net.minecraft.u.b.b)object)) == null) continue block7;
                        if (!v2.a(ag2, am2, (net.minecraft.u.b.b)object) || !c.a(z.a(am2.a), v2, (net.minecraft.u.b.b)object)) continue;
                        try {
                            f2 = (f)am2.a.getConstructor(k.class).newInstance(v2);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n8;
                        }
                        f2.b(f3, n14, f4, v2.p.nextFloat() * 360.0f, 0.0f);
                        if (f2.aq() && f2.ar()) {
                            ac2 = f2.a(v2.C(new net.minecraft.u.b.b(f2)), ac2);
                            if (f2.ar()) {
                                ++n12;
                                v2.a(f2);
                            } else {
                                f2.aa();
                            }
                            if (n12 >= f2.az()) continue block6;
                        }
                        n8 += n12;
                    }
                }
            }
        }
        return n8;
    }

    private static net.minecraft.u.b.b a(k k2, int n2, int n3) {
        int n4;
        int n5;
        net.minecraft.q.f.k k3 = k2.a(n2, n3);
        int n6 = n.c(k3.e(new net.minecraft.u.b.b(n5 = n2 * 16 + k2.p.nextInt(16), 0, n4 = n3 * 16 + k2.p.nextInt(16))) + 1, 16);
        int n7 = k2.p.nextInt(n6 > 0 ? n6 : k3.g() + 16 - 1);
        return new net.minecraft.u.b.b(n5, n7, n4);
    }

    public static boolean a(b b2) {
        return b2.n() ? false : (b2.p() ? false : (b2.d().d() ? false : !dj.l(b2)));
    }

    public static boolean a(aa aa2, k k2, net.minecraft.u.b.b b2) {
        boolean bl2;
        if (!k2.V().a(b2)) {
            return false;
        }
        b b3 = k2.n(b2);
        if (aa2 == aa.c) {
            return b3.d().d() && k2.n(b2.c()).d().d() && !k2.n(b2.b()).o();
        }
        net.minecraft.u.b.b b4 = b2.c();
        if (!k2.n(b4).t()) {
            return false;
        }
        cn cn2 = k2.n(b4).c();
        boolean bl3 = bl2 = cn2 != p.h && cn2 != p.cv;
        return bl2 && c.a(b3) && c.a(k2.n(b2.b()));
    }

    public static void a(k k2, q q2, int n2, int n3, int n4, int n5, Random random) {
        List list = q2.a(ag.b);
        if (!list.isEmpty()) {
            while (random.nextFloat() < q2.c()) {
                am am2 = (am)cd.a(k2.p, list);
                int n6 = am2.b + random.nextInt(1 + am2.c - am2.b);
                ac ac2 = null;
                int n7 = n2 + random.nextInt(n4);
                int n8 = n3 + random.nextInt(n5);
                int n9 = n7;
                int n10 = n8;
                for (int i2 = 0; i2 < n6; ++i2) {
                    boolean bl2 = false;
                    for (int i3 = 0; !bl2 && i3 < 4; ++i3) {
                        net.minecraft.u.b.b b2 = k2.p(new net.minecraft.u.b.b(n7, 0, n8));
                        if (c.a(aa.a, k2, b2)) {
                            f f2;
                            try {
                                f2 = (f)am2.a.getConstructor(k.class).newInstance(k2);
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                continue;
                            }
                            f2.b((float)n7 + 0.5f, b2.k(), (float)n8 + 0.5f, random.nextFloat() * 360.0f, 0.0f);
                            k2.a(f2);
                            ac2 = f2.a(k2.C(new net.minecraft.u.b.b(f2)), ac2);
                            bl2 = true;
                        }
                        while ((n7 += random.nextInt(5) - random.nextInt(5)) < n2 || n7 >= n2 + n4 || (n8 += random.nextInt(5) - random.nextInt(5)) < n3 || n8 >= n3 + n4) {
                            n7 = n9 + random.nextInt(5) - random.nextInt(5);
                            n8 = n10 + random.nextInt(5) - random.nextInt(5);
                        }
                    }
                }
            }
        }
    }
}

