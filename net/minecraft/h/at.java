/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.h.aq;
import net.minecraft.h.i;
import net.minecraft.h.j;
import net.minecraft.h.r;
import net.minecraft.h.t;
import net.minecraft.h.u;
import net.minecraft.h.y;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.bu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class at
extends aq {
    public y a = new t(this, "Enchant", true, 2);
    private final k j;
    private final net.minecraft.u.b.b k;
    private final Random l = new Random();
    public int b;
    public int[] c = new int[3];
    public int[] h = new int[]{-1, -1, -1};
    public int[] i = new int[]{-1, -1, -1};

    public at(a a2, k k2) {
        this(a2, k2, net.minecraft.u.b.b.c);
    }

    public at(a a2, k k2, net.minecraft.u.b.b b2) {
        int n2;
        this.j = k2;
        this.k = b2;
        this.b = a2.e.an();
        this.a(new j(this, this.a, 0, 15, 47));
        this.a(new u(this, this.a, 1, 35, 47));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(a2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 142));
        }
    }

    protected void c(i i2) {
        i2.a((aq)this, 0, this.c[0]);
        i2.a((aq)this, 1, this.c[1]);
        i2.a((aq)this, 2, this.c[2]);
        i2.a((aq)this, 3, this.b & 0xFFFFFFF0);
        i2.a((aq)this, 4, this.h[0]);
        i2.a((aq)this, 5, this.h[1]);
        i2.a((aq)this, 6, this.h[2]);
        i2.a((aq)this, 7, this.i[0]);
        i2.a((aq)this, 8, this.i[1]);
        i2.a((aq)this, 9, this.i[2]);
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        this.c(i2);
    }

    @Override
    public void a() {
        super.a();
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            i i3 = (i)this.g.get(i2);
            this.c(i3);
        }
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 >= 0 && n2 <= 2) {
            this.c[n2] = n3;
        } else if (n2 == 3) {
            this.b = n3;
        } else if (n2 >= 4 && n2 <= 6) {
            this.h[n2 - 4] = n3;
        } else if (n2 >= 7 && n2 <= 9) {
            this.i[n2 - 7] = n3;
        } else {
            super.a(n2, n3);
        }
    }

    @Override
    public void a(y y2) {
        if (y2 == this.a) {
            cu cu2 = y2.a(0);
            if (cu2 != null && cu2.v()) {
                if (!this.j.C) {
                    int n2;
                    int n3 = 0;
                    for (n2 = -1; n2 <= 1; ++n2) {
                        for (int i2 = -1; i2 <= 1; ++i2) {
                            if (n2 == 0 && i2 == 0 || !this.j.c(this.k.a(i2, 0, n2)) || !this.j.c(this.k.a(i2, 1, n2))) continue;
                            if (this.j.n(this.k.a(i2 * 2, 0, n2 * 2)).c() == p.X) {
                                ++n3;
                            }
                            if (this.j.n(this.k.a(i2 * 2, 1, n2 * 2)).c() == p.X) {
                                ++n3;
                            }
                            if (i2 == 0 || n2 == 0) continue;
                            if (this.j.n(this.k.a(i2 * 2, 0, n2)).c() == p.X) {
                                ++n3;
                            }
                            if (this.j.n(this.k.a(i2 * 2, 1, n2)).c() == p.X) {
                                ++n3;
                            }
                            if (this.j.n(this.k.a(i2, 0, n2 * 2)).c() == p.X) {
                                ++n3;
                            }
                            if (this.j.n(this.k.a(i2, 1, n2 * 2)).c() != p.X) continue;
                            ++n3;
                        }
                    }
                    this.l.setSeed(this.b);
                    for (n2 = 0; n2 < 3; ++n2) {
                        this.c[n2] = net.minecraft.o.f.a(this.l, n2, n3, cu2);
                        this.h[n2] = -1;
                        this.i[n2] = -1;
                        if (this.c[n2] >= n2 + 1) continue;
                        this.c[n2] = 0;
                    }
                    for (n2 = 0; n2 < 3; ++n2) {
                        List list;
                        if (this.c[n2] <= 0 || (list = this.a(cu2, n2, this.c[n2])) == null || list.isEmpty()) continue;
                        net.minecraft.o.k k2 = (net.minecraft.o.k)list.get(this.l.nextInt(list.size()));
                        this.h[n2] = net.minecraft.o.j.b(k2.a);
                        this.i[n2] = k2.b;
                    }
                    this.a();
                }
            } else {
                for (int i3 = 0; i3 < 3; ++i3) {
                    this.c[i3] = 0;
                    this.h[i3] = -1;
                    this.i[i3] = -1;
                }
            }
        }
    }

    @Override
    public boolean b(b b2, int n2) {
        cu cu2 = this.a.a(0);
        cu cu3 = this.a.a(1);
        int n3 = n2 + 1;
        if (!(cu3 != null && cu3.b >= n3 || b2.J.d)) {
            return false;
        }
        if (this.c[n2] > 0 && cu2 != null && (b2.K >= n3 && b2.K >= this.c[n2] || b2.J.d)) {
            if (!this.j.C) {
                boolean bl2;
                List list = this.a(cu2, n2, this.c[n2]);
                boolean bl3 = bl2 = cu2.a() == w.aS;
                if (list != null) {
                    b2.f(n3);
                    if (bl2) {
                        cu2.a(w.cn);
                    }
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        net.minecraft.o.k k2 = (net.minecraft.o.k)list.get(i2);
                        if (bl2) {
                            w.cn.a(cu2, k2);
                            continue;
                        }
                        cu2.a(k2.a, k2.b);
                    }
                    if (!b2.J.d) {
                        cu3.b -= n3;
                        if (cu3.b <= 0) {
                            this.a.a(1, null);
                        }
                    }
                    b2.a(o.Y);
                    this.a.C();
                    this.b = b2.an();
                    this.a(this.a);
                    this.j.a(null, this.k, net.minecraft.a.f.aL, bu.e, 1.0f, this.j.p.nextFloat() * 0.1f + 0.9f);
                }
            }
            return true;
        }
        return false;
    }

    private List a(cu cu2, int n2, int n3) {
        this.l.setSeed(this.b + n2);
        List list = net.minecraft.o.f.b(this.l, cu2, n3, false);
        if (cu2.a() == w.aS && list.size() > 1) {
            list.remove(this.l.nextInt(list.size()));
        }
        return list;
    }

    public int b() {
        cu cu2 = this.a.a(1);
        return cu2 == null ? 0 : cu2.b;
    }

    @Override
    public void b(b b2) {
        super.b(b2);
        if (!this.j.C) {
            for (int i2 = 0; i2 < this.a.e(); ++i2) {
                cu cu2 = this.a.b(i2);
                if (cu2 == null) continue;
                b2.a(cu2, false);
            }
        }
    }

    @Override
    public boolean a(b b2) {
        return this.j.n(this.k).c() != p.bC ? false : b2.h((double)this.k.cy_() + 0.5, (double)this.k.k() + 0.5, (double)this.k.l() + 0.5) <= 64.0;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 == 0) {
                if (!this.a(cu3, 2, 38, true)) {
                    return null;
                }
            } else if (n2 == 1) {
                if (!this.a(cu3, 2, 38, true)) {
                    return null;
                }
            } else if (cu3.a() == w.bd && cd.a(cu3.h()) == cd.l) {
                if (!this.a(cu3, 1, 2, true)) {
                    return null;
                }
            } else {
                if (((r)this.e.get(0)).c() || !((r)this.e.get(0)).a(cu3)) {
                    return null;
                }
                if (cu3.n() && cu3.b == 1) {
                    ((r)this.e.get(0)).d(cu3.j());
                    cu3.b = 0;
                } else if (cu3.b >= 1) {
                    ((r)this.e.get(0)).d(new cu(cu3.a(), 1, cu3.h()));
                    --cu3.b;
                }
            }
            if (cu3.b == 0) {
                r2.d(null);
            } else {
                r2.d();
            }
            if (cu3.b == cu2.b) {
                return null;
            }
            r2.a(b2, cu3);
        }
        return cu2;
    }
}

