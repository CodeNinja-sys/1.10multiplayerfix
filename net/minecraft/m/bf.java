/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.ip;
import com.a.a.d.mq;
import com.a.a.d.xe;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.e;
import net.minecraft.g.bo;
import net.minecraft.g.c.b;
import net.minecraft.g.db;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.m.cu;
import net.minecraft.m.t;
import net.minecraft.q.a.a;
import net.minecraft.q.a.y;
import net.minecraft.q.k;
import net.minecraft.u.b.g;
import net.minecraft.u.b.n;

public class bf
extends t {
    protected bf() {
        this.a(true);
    }

    public static y a(int n2, k k2) {
        String string = "map_" + n2;
        y y2 = (y)k2.a(y.class, string);
        if (y2 == null) {
            y2 = new y(string);
            k2.a(string, y2);
        }
        return y2;
    }

    public y a(cu cu2, k k2) {
        String string = "map_" + cu2.h();
        y y2 = (y)k2.a(y.class, string);
        if (y2 == null && !k2.C) {
            cu2.b(k2.b("map"));
            string = "map_" + cu2.h();
            y2 = new y(string);
            y2.e = (byte)3;
            y2.a(k2.F().b(), k2.F().d(), y2.e);
            y2.c = (byte)k2.q.a().a();
            y2.d();
            k2.a(string, y2);
        }
        return y2;
    }

    public void a(k k2, net.minecraft.w.n n2, y y2) {
        if (k2.q.a().a() == y2.c && n2 instanceof net.minecraft.w.a.b) {
            int n3 = 1 << y2.e;
            int n4 = y2.a;
            int n5 = y2.b;
            int n6 = n.c(n2.aU - (double)n4) / n3 + 64;
            int n7 = n.c(n2.aW - (double)n5) / n3 + 64;
            int n8 = 128 / n3;
            if (k2.q.n()) {
                n8 /= 2;
            }
            a a2 = y2.a((net.minecraft.w.a.b)n2);
            ++a2.b;
            boolean bl2 = false;
            for (int i2 = n6 - n8 + 1; i2 < n6 + n8; ++i2) {
                if ((i2 & 0xF) != (a2.b & 0xF) && !bl2) continue;
                bl2 = false;
                double d2 = 0.0;
                for (int i3 = n7 - n8 - 1; i3 < n7 + n8; ++i3) {
                    byte by2;
                    e e2;
                    int n9;
                    int n10;
                    if (i2 < 0 || i3 < -1 || i2 >= 128 || i3 >= 128) continue;
                    int n11 = i2 - n6;
                    int n12 = i3 - n7;
                    boolean bl3 = n11 * n11 + n12 * n12 > (n8 - 2) * (n8 - 2);
                    int n13 = (n4 / n3 + i2 - 64) * n3;
                    int n14 = (n5 / n3 + i3 - 64) * n3;
                    ip ip2 = ip.g();
                    net.minecraft.q.f.k k3 = k2.e(new net.minecraft.u.b.b(n13, 0, n14));
                    if (k3.f()) continue;
                    int n15 = n13 & 0xF;
                    int n16 = n14 & 0xF;
                    int n17 = 0;
                    double d3 = 0.0;
                    if (k2.q.n()) {
                        int n18 = n13 + n14 * 231871;
                        if (((n18 = n18 * n18 * 31287121 + n18 * 11) >> 20 & 1) == 0) {
                            ip2.a(p.d.v().a(eg.a, (Comparable)((Object)ic.a)).j(), 10);
                        } else {
                            ip2.a(p.b.v().a(bo.a, (Comparable)((Object)db.a)).j(), 100);
                        }
                        d3 = 100.0;
                    } else {
                        g g2 = new g();
                        for (int i4 = 0; i4 < n3; ++i4) {
                            for (n10 = 0; n10 < n3; ++n10) {
                                int n19 = k3.b(i4 + n15, n10 + n16) + 1;
                                b b2 = p.a.v();
                                if (n19 > 1) {
                                    while ((b2 = k3.a(g2.b(i4 + n15, --n19, n10 + n16))).j() == net.minecraft.g.a.e.b && n19 > 0) {
                                    }
                                    if (n19 > 0 && b2.d().d()) {
                                        b b3;
                                        n9 = n19 - 1;
                                        do {
                                            b3 = k3.a(i4 + n15, n9--, n10 + n16);
                                            ++n17;
                                        } while (n9 > 0 && b3.d().d());
                                    }
                                }
                                d3 += (double)n19 / (double)(n3 * n3);
                                ip2.add(b2.j());
                            }
                        }
                    }
                    n17 /= n3 * n3;
                    double d4 = (d3 - d2) * 4.0 / (double)(n3 + 4) + ((double)(i2 + i3 & 1) - 0.5) * 0.4;
                    n10 = 1;
                    if (d4 > 0.6) {
                        n10 = 2;
                    }
                    if (d4 < -0.6) {
                        n10 = 0;
                    }
                    if ((e2 = (e)mq.d((Iterable)xe.d(ip2), net.minecraft.g.a.e.b)) == net.minecraft.g.a.e.n) {
                        d4 = (double)n17 * 0.1 + (double)(i2 + i3 & 1) * 0.2;
                        n10 = 1;
                        if (d4 < 0.5) {
                            n10 = 2;
                        }
                        if (d4 > 0.9) {
                            n10 = 0;
                        }
                    }
                    d2 = d3;
                    if (i3 < 0 || n11 * n11 + n12 * n12 >= n8 * n8 || bl3 && (i2 + i3 & 1) == 0 || (by2 = y2.f[i2 + i3 * 128]) == (n9 = (int)((byte)(e2.M * 4 + n10)))) continue;
                    y2.f[i2 + i3 * 128] = n9;
                    y2.a(i2, i3);
                    bl2 = true;
                }
            }
        }
    }

    @Override
    public void a(cu cu2, k k2, net.minecraft.w.n n2, int n3, boolean bl2) {
        if (!k2.C) {
            y y2 = this.a(cu2, k2);
            if (n2 instanceof net.minecraft.w.a.b) {
                net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)n2;
                y2.a(b2, cu2);
            }
            if (bl2 || n2 instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)n2).bD() == cu2) {
                this.a(k2, n2, y2);
            }
        }
    }

    @Override
    public net.minecraft.x.p a(cu cu2, k k2, net.minecraft.w.a.b b2) {
        return this.a(cu2, k2).a(cu2, k2, b2);
    }

    @Override
    public void b(cu cu2, k k2, net.minecraft.w.a.b b2) {
        net.minecraft.e.e e2 = cu2.o();
        if (e2 != null) {
            if (e2.b("map_scale_direction", 99)) {
                bf.a(cu2, k2, e2.h("map_scale_direction"));
                e2.q("map_scale_direction");
            } else if (e2.p("map_tracking_position")) {
                bf.b(cu2, k2);
                e2.q("map_tracking_position");
            }
        }
    }

    protected static void a(cu cu2, k k2, int n2) {
        y y2 = w.bk.a(cu2, k2);
        cu2.b(k2.b("map"));
        y y3 = new y("map_" + cu2.h());
        y3.e = (byte)n.a(y2.e + n2, 0, 4);
        y3.d = y2.d;
        y3.a(y2.a, y2.b, y3.e);
        y3.c = y2.c;
        y3.d();
        k2.a("map_" + cu2.h(), y3);
    }

    protected static void b(cu cu2, k k2) {
        y y2 = w.bk.a(cu2, k2);
        cu2.b(k2.b("map"));
        y y3 = new y("map_" + cu2.h());
        y3.d = true;
        y3.a = y2.a;
        y3.b = y2.b;
        y3.e = y2.e;
        y3.c = y2.c;
        y3.d();
        k2.a("map_" + cu2.h(), y3);
    }

    @Override
    public void a(cu cu2, net.minecraft.w.a.b b2, List list, boolean bl2) {
        y y2 = this.a(cu2, b2.aQ);
        if (bl2) {
            if (y2 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << y2.e));
                list.add("(Level " + y2.e + "/" + 4 + ")");
            }
        }
    }
}

