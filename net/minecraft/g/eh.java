/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.c;
import net.minecraft.v.d;

public class eh
extends cn {
    public static final g a = g.a("age", 0, 5);

    protected eh() {
        super(h.k);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.a(d.c);
        this.b(true);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!this.c(k2, b2)) {
            k2.b(b2, true);
        } else {
            int n2;
            net.minecraft.u.b.b b4 = b2.b();
            if (k2.c(b4) && b4.k() < 256 && (n2 = ((Integer)b3.a(a)).intValue()) < 5 && random.nextInt(1) == 0) {
                int n3;
                int n4;
                boolean bl2 = false;
                boolean bl3 = false;
                b b5 = k2.n(b2.c());
                cn cn2 = b5.c();
                if (cn2 == p.bH) {
                    bl2 = true;
                } else if (cn2 == p.cR) {
                    n4 = 1;
                    for (n3 = 0; n3 < 4; ++n3) {
                        cn cn3 = k2.n(b2.b(n4 + 1)).c();
                        if (cn3 != p.cR) {
                            if (cn3 != p.bH) break;
                            bl3 = true;
                            break;
                        }
                        ++n4;
                    }
                    n3 = 4;
                    if (bl3) {
                        ++n3;
                    }
                    if (n4 < 2 || random.nextInt(n3) >= n4) {
                        bl2 = true;
                    }
                } else if (b5.d() == h.a) {
                    bl2 = true;
                }
                if (bl2 && eh.b(k2, b4, null) && k2.c(b2.a(2))) {
                    k2.a(b2, p.cR.v(), 2);
                    this.a(k2, b4, n2);
                } else if (n2 < 4) {
                    n4 = random.nextInt(4);
                    n3 = 0;
                    if (bl3) {
                        ++n4;
                    }
                    for (int i2 = 0; i2 < n4; ++i2) {
                        ad ad2 = ag.a.a(random);
                        net.minecraft.u.b.b b6 = b2.a(ad2);
                        if (!k2.c(b6) || !k2.c(b6.c()) || !eh.b(k2, b6, ad2.e())) continue;
                        this.a(k2, b6, n2 + 1);
                        n3 = 1;
                    }
                    if (n3 != 0) {
                        k2.a(b2, p.cR.v(), 2);
                    } else {
                        this.d(k2, b2);
                    }
                } else if (n2 == 4) {
                    this.d(k2, b2);
                }
            }
        }
    }

    private void a(k k2, net.minecraft.u.b.b b2, int n2) {
        k2.a(b2, this.v().a(a, Integer.valueOf(n2)), 2);
        k2.b(1033, b2, 0);
    }

    private void d(k k2, net.minecraft.u.b.b b2) {
        k2.a(b2, this.v().a(a, Integer.valueOf(5)), 2);
        k2.b(1034, b2, 0);
    }

    private static boolean b(k k2, net.minecraft.u.b.b b2, ad ad2) {
        for (ad ad3 : ag.a) {
            if (ad3 == ad2 || k2.c(b2.a(ad3))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && this.c(k2, b2);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.c(k2, b3)) {
            k2.a(b3, (cn)this, 1);
        }
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2.c());
        cn cn2 = b3.c();
        if (cn2 != p.cR && cn2 != p.bH) {
            if (b3.d() == h.a) {
                int n2 = 0;
                for (ad ad2 : ag.a) {
                    b b4 = k2.n(b2.a(ad2));
                    cn cn3 = b4.c();
                    if (cn3 == p.cR) {
                        ++n2;
                        continue;
                    }
                    if (b4.d() == h.a) continue;
                    return false;
                }
                return n2 == 1;
            }
            return false;
        }
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        super.a(k2, b2, b3, b4, ap2, cu2);
        eh.a(k2, b3, new cu(cg.a(this)));
    }

    @Override
    protected cu j(b b2) {
        return null;
    }

    @Override
    public c bR_() {
        return c.c;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        super.b(k2, b2, b3);
    }

    public static void a(k k2, net.minecraft.u.b.b b2, Random random, int n2) {
        k2.a(b2, p.cR.v(), 2);
        eh.a(k2, b2, random, b2, n2, 0);
    }

    private static void a(k k2, net.minecraft.u.b.b b2, Random random, net.minecraft.u.b.b b3, int n2, int n3) {
        int n4;
        int n5 = random.nextInt(4) + 1;
        if (n3 == 0) {
            ++n5;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            net.minecraft.u.b.b b4 = b2.a(n4 + 1);
            if (!eh.b(k2, b4, null)) {
                return;
            }
            k2.a(b4, p.cR.v(), 2);
        }
        n4 = 0;
        if (n3 < 4) {
            int n6 = random.nextInt(4);
            if (n3 == 0) {
                ++n6;
            }
            for (int i2 = 0; i2 < n6; ++i2) {
                ad ad2 = ag.a.a(random);
                net.minecraft.u.b.b b5 = b2.a(n5).a(ad2);
                if (Math.abs(b5.cy_() - b3.cy_()) >= n2 || Math.abs(b5.l() - b3.l()) >= n2 || !k2.c(b5) || !k2.c(b5.c()) || !eh.b(k2, b5, ad2.e())) continue;
                n4 = 1;
                k2.a(b5, p.cR.v(), 2);
                eh.a(k2, b5, random, b3, n2, n3 + 1);
            }
        }
        if (n4 == 0) {
            k2.a(b2.a(n5), p.cS.v().a(a, Integer.valueOf(5)), 2);
        }
    }
}

