/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.EnumSet;
import java.util.Random;
import java.util.Set;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.g.ga;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;

public class gc
extends ee {
    int b;

    protected gc(h h2) {
        super(h2);
    }

    private void f(k k2, net.minecraft.u.b.b b2, b b3) {
        k2.a(b2, gc.b(this.L).v().a(a, (Integer)b3.a(a)), 2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        int n2;
        int n3 = (Integer)b3.a(a);
        int n4 = 1;
        if (this.L == h.i && !k2.q.m()) {
            n4 = 2;
        }
        int n5 = this.a(k2);
        if (n3 > 0) {
            int n6 = -100;
            this.b = 0;
            for (ad ad2 : ag.a) {
                n6 = this.a(k2, b2.a(ad2), n6);
            }
            int n7 = n6 + n4;
            if (n7 >= 8 || n6 < 0) {
                n7 = -1;
            }
            if ((n2 = this.l(k2.n(b2.b()))) >= 0) {
                n7 = n2 >= 8 ? n2 : n2 + 8;
            }
            if (this.b >= 2 && this.L == h.h) {
                Object object = k2.n(b2.c());
                if (object.d().a()) {
                    n7 = 0;
                } else if (object.d() == this.L && (Integer)object.a(a) == 0) {
                    n7 = 0;
                }
            }
            if (this.L == h.i && n3 < 8 && n7 < 8 && n7 > n3 && random.nextInt(4) != 0) {
                n5 *= 4;
            }
            if (n7 == n3) {
                this.f(k2, b2, b3);
            } else {
                n3 = n7;
                if (n7 < 0) {
                    k2.f(b2);
                } else {
                    b3 = b3.a(a, Integer.valueOf(n7));
                    k2.a(b2, b3, 2);
                    k2.a(b2, (cn)this, n5);
                    k2.b(b2, this);
                }
            }
        } else {
            this.f(k2, b2, b3);
        }
        b b4 = k2.n(b2.c());
        if (this.h(k2, b2.c(), b4)) {
            if (this.L == h.i && k2.n(b2.c()).d() == h.h) {
                k2.b(b2.c(), p.b.v());
                this.d(k2, b2.c());
                return;
            }
            if (n3 >= 8) {
                this.a(k2, b2.c(), b4, n3);
            } else {
                this.a(k2, b2.c(), b4, n3 + 8);
            }
        } else if (n3 >= 0 && (n3 == 0 || this.g(k2, b2.c(), b4))) {
            Set set = this.c(k2, b2);
            n2 = n3 + n4;
            if (n3 >= 8) {
                n2 = 1;
            }
            if (n2 >= 8) {
                return;
            }
            for (Object object : set) {
                this.a(k2, b2.a((ad)object), k2.n(b2.a((ad)object)), n2);
            }
        }
    }

    private void a(k k2, net.minecraft.u.b.b b2, b b3, int n2) {
        if (this.h(k2, b2, b3)) {
            if (b3.d() != h.a) {
                if (this.L == h.i) {
                    this.d(k2, b2);
                } else {
                    b3.c().b(k2, b2, b3, 0);
                }
            }
            k2.a(b2, this.v().a(a, Integer.valueOf(n2)), 3);
        }
    }

    private int a(k k2, net.minecraft.u.b.b b2, int n2, ad ad2) {
        int n3 = 1000;
        for (ad ad3 : ag.a) {
            int n4;
            b b3;
            net.minecraft.u.b.b b4;
            if (ad3 == ad2 || this.g(k2, b4 = b2.a(ad3), b3 = k2.n(b4)) || b3.d() == this.L && (Integer)b3.a(a) <= 0) continue;
            if (!this.g(k2, b4.c(), b3)) {
                return n2;
            }
            if (n2 >= this.b(k2) || (n4 = this.a(k2, b4, n2 + 1, ad3.e())) >= n3) continue;
            n3 = n4;
        }
        return n3;
    }

    private int b(k k2) {
        return this.L == h.i && !k2.q.m() ? 2 : 4;
    }

    private Set c(k k2, net.minecraft.u.b.b b2) {
        int n2 = 1000;
        EnumSet<ad> enumSet = EnumSet.noneOf(ad.class);
        for (ad ad2 : ag.a) {
            b b3;
            net.minecraft.u.b.b b4 = b2.a(ad2);
            if (this.g(k2, b4, b3 = k2.n(b4)) || b3.d() == this.L && (Integer)b3.a(a) <= 0) continue;
            int n3 = this.g(k2, b4.c(), k2.n(b4.c())) ? this.a(k2, b4, 1, ad2.e()) : 0;
            if (n3 < n2) {
                enumSet.clear();
            }
            if (n3 > n2) continue;
            enumSet.add(ad2);
            n2 = n3;
        }
        return enumSet;
    }

    private boolean g(k k2, net.minecraft.u.b.b b2, b b3) {
        cn cn2 = k2.n(b2).c();
        return !(cn2 instanceof ga) && cn2 != p.an && cn2 != p.au && cn2 != p.aM ? (cn2.L != h.E && cn2.L != h.J ? cn2.L.c() : true) : true;
    }

    protected int a(k k2, net.minecraft.u.b.b b2, int n2) {
        int n3 = this.l(k2.n(b2));
        if (n3 < 0) {
            return n2;
        }
        if (n3 == 0) {
            ++this.b;
        }
        if (n3 >= 8) {
            n3 = 0;
        }
        return n2 >= 0 && n3 >= n2 ? n2 : n3;
    }

    private boolean h(k k2, net.minecraft.u.b.b b2, b b3) {
        h h2 = b3.d();
        return h2 != this.L && h2 != h.i && !this.g(k2, b2, b3);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.e(k2, b2, b3)) {
            k2.a(b2, (cn)this, this.a(k2));
        }
    }
}

