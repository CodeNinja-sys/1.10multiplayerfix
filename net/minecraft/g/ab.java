/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.b.e;
import net.minecraft.g.b.g;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.fi;
import net.minecraft.g.ft;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.g.a.ah;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.g.a.ar;
import net.minecraft.q.g.a.av;
import net.minecraft.q.g.a.q;
import net.minecraft.q.g.a.v;
import net.minecraft.q.g.a.x;
import net.minecraft.q.g.a.z;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class ab
extends ft
implements fi {
    public static final e a = net.minecraft.g.b.e.a("type", net.minecraft.g.b.class);
    public static final g b = g.a("stage", 0, 1);
    protected static final a c = new a(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected ab() {
        this.z(this.O.b().a(a, (Comparable)((Object)net.minecraft.g.b.a)).a(b, Integer.valueOf(0)));
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c;
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + "." + net.minecraft.g.b.a.d() + ".name");
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C) {
            super.a(k2, b2, b3, random);
            if (k2.j(b2.b()) >= 9 && random.nextInt(7) == 0) {
                this.c(k2, b2, b3, random);
            }
        }
    }

    public void c(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if ((Integer)b3.a(b) == 0) {
            k2.a(b2, b3.b(b), 4);
        } else {
            this.d(k2, b2, b3, random);
        }
    }

    public void d(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        b b4;
        q q2 = random.nextInt(10) == 0 ? new ar(true) : new x(true);
        int n2 = 0;
        int n3 = 0;
        boolean bl2 = false;
        switch ((net.minecraft.g.b)((Object)b3.a(a))) {
            case b: {
                block7: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(k2, b2, n2, n3, net.minecraft.g.b.b)) continue;
                        q2 = new av(false, random.nextBoolean());
                        bl2 = true;
                        break block7;
                    }
                }
                if (bl2) break;
                n2 = 0;
                n3 = 0;
                q2 = new v(true);
                break;
            }
            case c: {
                q2 = new ah(true, false);
                break;
            }
            case d: {
                b4 = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.d));
                b b5 = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.d)).a(bm.c, Boolean.valueOf(false));
                block9: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(k2, b2, n2, n3, net.minecraft.g.b.d)) continue;
                        q2 = new net.minecraft.q.g.a.k(true, 10, 20, b4, b5);
                        bl2 = true;
                        break block9;
                    }
                }
                if (bl2) break;
                n2 = 0;
                n3 = 0;
                q2 = new x(true, 4 + random.nextInt(7), b4, b5, false);
                break;
            }
            case e: {
                q2 = new net.minecraft.q.g.a.m(true);
                break;
            }
            case f: {
                block11: for (n2 = 0; n2 >= -1; --n2) {
                    for (n3 = 0; n3 >= -1; --n3) {
                        if (!this.a(k2, b2, n2, n3, net.minecraft.g.b.f)) continue;
                        q2 = new z(true);
                        bl2 = true;
                        break block11;
                    }
                }
                if (bl2) break;
                return;
            }
        }
        b4 = p.a.v();
        if (bl2) {
            k2.a(b2.a(n2, 0, n3), b4, 4);
            k2.a(b2.a(n2 + 1, 0, n3), b4, 4);
            k2.a(b2.a(n2, 0, n3 + 1), b4, 4);
            k2.a(b2.a(n2 + 1, 0, n3 + 1), b4, 4);
        } else {
            k2.a(b2, b4, 4);
        }
        if (!((aj)q2).a(k2, random, b2.a(n2, 0, n3))) {
            if (bl2) {
                k2.a(b2.a(n2, 0, n3), b3, 4);
                k2.a(b2.a(n2 + 1, 0, n3), b3, 4);
                k2.a(b2.a(n2, 0, n3 + 1), b3, 4);
                k2.a(b2.a(n2 + 1, 0, n3 + 1), b3, 4);
            } else {
                k2.a(b2, b3, 4);
            }
        }
    }

    private boolean a(k k2, net.minecraft.u.b.b b2, int n2, int n3, net.minecraft.g.b b3) {
        return this.a(k2, b2.a(n2, 0, n3), b3) && this.a(k2, b2.a(n2 + 1, 0, n3), b3) && this.a(k2, b2.a(n2, 0, n3 + 1), b3) && this.a(k2, b2.a(n2 + 1, 0, n3 + 1), b3);
    }

    public boolean a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.b b3) {
        b b4 = k2.n(b2);
        return b4.c() == this && b4.a(a) == b3;
    }

    @Override
    public int k(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (net.minecraft.g.b b2 : net.minecraft.g.b.values()) {
            list.add(new cu(cg2, 1, b2.b()));
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return (double)k2.p.nextFloat() < 0.45;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        this.c(k2, b2, b3, random);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)net.minecraft.g.b.a(n2 & 7))).a(b, Integer.valueOf((n2 & 8) >> 3));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((net.minecraft.g.b)((Object)b2.a(a))).b();
        return n2 |= (Integer)b2.a(b) << 3;
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }
}

