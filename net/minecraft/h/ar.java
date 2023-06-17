/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.h.an;
import net.minecraft.h.aq;
import net.minecraft.h.g;
import net.minecraft.h.i;
import net.minecraft.h.m;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.o.j;
import net.minecraft.q.k;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ar
extends aq {
    private static final d b = org.apache.logging.log4j.c.c();
    private final y c = new m();
    private final y h = new an(this, "Repair", true, 2);
    private final k i;
    private final net.minecraft.u.b.b j;
    public int a;
    private int k;
    private String l;
    private final b m;

    public ar(a a2, k k2, b b2) {
        this(a2, k2, net.minecraft.u.b.b.c, b2);
    }

    public ar(a a2, k k2, net.minecraft.u.b.b b2, b b3) {
        int n2;
        this.j = b2;
        this.i = k2;
        this.m = b3;
        this.a(new r(this.h, 0, 27, 47));
        this.a(new r(this.h, 1, 76, 47));
        this.a(new g(this, this.c, 2, 134, 47, k2, b2));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(a2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(y y2) {
        super.a(y2);
        if (y2 == this.h) {
            this.b();
        }
    }

    public void b() {
        cu cu2 = this.h.a(0);
        this.a = 1;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (cu2 == null) {
            this.c.a(0, null);
            this.a = 0;
        } else {
            int n5;
            cu cu3 = cu2.j();
            cu cu4 = this.h.a(1);
            Map map = net.minecraft.o.f.a(cu3);
            n3 = n3 + cu2.A() + (cu4 == null ? 0 : cu4.A());
            this.k = 0;
            if (cu4 != null) {
                int n6 = n5 = cu4.a() == w.cn && !w.cn.h(cu4).c() ? 1 : 0;
                if (cu3.d() && cu3.a().a(cu2, cu4)) {
                    int n7;
                    int n8 = Math.min(cu3.g(), cu3.i() / 4);
                    if (n8 <= 0) {
                        this.c.a(0, null);
                        this.a = 0;
                        return;
                    }
                    for (n7 = 0; n8 > 0 && n7 < cu4.b; ++n7) {
                        int n9 = cu3.g() - n8;
                        cu3.b(n9);
                        ++n2;
                        n8 = Math.min(cu3.g(), cu3.i() / 4);
                    }
                    this.k = n7;
                } else {
                    int n10;
                    int n11;
                    if (!(n5 != 0 || cu3.a() == cu4.a() && cu3.d())) {
                        this.c.a(0, null);
                        this.a = 0;
                        return;
                    }
                    if (cu3.d() && n5 == 0) {
                        int n12 = cu2.i() - cu2.g();
                        int n13 = cu4.i() - cu4.g();
                        int n14 = n13 + cu3.i() * 12 / 100;
                        n11 = n12 + n14;
                        n10 = cu3.i() - n11;
                        if (n10 < 0) {
                            n10 = 0;
                        }
                        if (n10 < cu3.h()) {
                            cu3.b(n10);
                            n2 += 2;
                        }
                    }
                    Map map2 = net.minecraft.o.f.a(cu4);
                    for (j j2 : map2.keySet()) {
                        if (j2 == null) continue;
                        n11 = map.containsKey(j2) ? (Integer)map.get(j2) : 0;
                        n10 = (Integer)map2.get(j2);
                        n10 = n11 == n10 ? n10 + 1 : Math.max(n10, n11);
                        boolean bl2 = j2.a(cu2);
                        if (this.m.J.d || cu2.a() == w.cn) {
                            bl2 = true;
                        }
                        for (j j3 : map.keySet()) {
                            if (j3 == j2 || j2.a(j3)) continue;
                            bl2 = false;
                            ++n2;
                        }
                        if (!bl2) continue;
                        if (n10 > j2.a()) {
                            n10 = j2.a();
                        }
                        map.put(j2, n10);
                        int n15 = 0;
                        switch (j2.c()) {
                            case a: {
                                n15 = 1;
                                break;
                            }
                            case b: {
                                n15 = 2;
                                break;
                            }
                            case c: {
                                n15 = 4;
                                break;
                            }
                            case d: {
                                n15 = 8;
                            }
                        }
                        if (n5 != 0) {
                            n15 = Math.max(1, n15 / 2);
                        }
                        n2 += n15 * n10;
                    }
                }
            }
            if (am.c((CharSequence)this.l)) {
                if (cu2.s()) {
                    n4 = 1;
                    n2 += n4;
                    cu3.r();
                }
            } else if (!this.l.equals(cu2.q())) {
                n4 = 1;
                n2 += n4;
                cu3.a(this.l);
            }
            this.a = n3 + n2;
            if (n2 <= 0) {
                cu3 = null;
            }
            if (n4 == n2 && n4 > 0 && this.a >= 40) {
                this.a = 39;
            }
            if (this.a >= 40 && !this.m.J.d) {
                cu3 = null;
            }
            if (cu3 != null) {
                n5 = cu3.A();
                if (cu4 != null && n5 < cu4.A()) {
                    n5 = cu4.A();
                }
                if (n4 != n2 || n4 == 0) {
                    n5 = n5 * 2 + 1;
                }
                cu3.c(n5);
                net.minecraft.o.f.a(map, cu3);
            }
            this.c.a(0, cu3);
            this.a();
        }
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        i2.a((aq)this, 0, this.a);
    }

    @Override
    public void a(int n2, int n3) {
        if (n2 == 0) {
            this.a = n3;
        }
    }

    @Override
    public void b(b b2) {
        super.b(b2);
        if (!this.i.C) {
            for (int i2 = 0; i2 < this.h.e(); ++i2) {
                cu cu2 = this.h.b(i2);
                if (cu2 == null) continue;
                b2.a(cu2, false);
            }
        }
    }

    @Override
    public boolean a(b b2) {
        return this.i.n(this.j).c() != p.cf ? false : b2.h((double)this.j.cy_() + 0.5, (double)this.j.k() + 0.5, (double)this.j.l() + 0.5) <= 64.0;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 == 2) {
                if (!this.a(cu3, 3, 39, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (n2 != 0 && n2 != 1 ? n2 >= 3 && n2 < 39 && !this.a(cu3, 0, 2, false) : !this.a(cu3, 3, 39, false)) {
                return null;
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

    public void a(String string) {
        this.l = string;
        if (this.b(2).c()) {
            cu cu2 = this.b(2).b();
            if (am.c((CharSequence)string)) {
                cu2.r();
            } else {
                cu2.a(this.l);
            }
        }
        this.b();
    }

    static /* synthetic */ y a(ar ar2) {
        return ar2.h;
    }

    static /* synthetic */ int b(ar ar2) {
        return ar2.k;
    }
}

