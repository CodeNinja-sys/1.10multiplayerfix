/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.yd;
import com.c.a.e;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ba;
import net.minecraft.client.k.de;
import net.minecraft.client.k.z;
import net.minecraft.client.l.g;
import net.minecraft.client.r;
import net.minecraft.j.d;
import net.minecraft.j.j;
import net.minecraft.j.l;
import net.minecraft.q.am;
import net.minecraft.u.b.n;
import net.minecraft.u.d.a;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;

public class cd
extends de {
    private static final yd a = yd.a(new ba(null));
    private final r b;
    private final z c;
    private a d;
    private a e;
    private long f;
    private boolean g;

    public cd(r r2, z z2) {
        this.b = r2;
        this.c = z2;
    }

    public String a(net.minecraft.client.l.r r2) {
        return r2.k() != null ? r2.k().d() : net.minecraft.j.d.a(r2.i(), r2.a().b());
    }

    public void a(boolean bl2) {
        if (bl2 && !this.g) {
            this.f = r.I();
        }
        this.g = bl2;
    }

    public void a(int n2, net.minecraft.j.r r2, j j2) {
        int n3;
        Object object2;
        boolean bl2;
        int n4;
        int n5;
        g g2 = this.b.j.d;
        List list = a.a(g2.c());
        int n6 = 0;
        int n7 = 0;
        for (net.minecraft.client.l.r r3 : list) {
            n5 = this.b.m.a(this.a(r3));
            n6 = Math.max(n6, n5);
            if (j2 == null || j2.e() == l.b) continue;
            n5 = this.b.m.a(" " + r2.c(r3.a().b(), j2).b());
            n7 = Math.max(n7, n5);
        }
        list = list.subList(0, Math.min(list.size(), 80));
        int n8 = n4 = list.size();
        n5 = 1;
        while (n8 > 20) {
            n8 = (n4 + ++n5 - 1) / n5;
        }
        boolean bl3 = bl2 = this.b.D() || this.b.v().b().d();
        int n9 = j2 != null ? (j2.e() == l.b ? 90 : n7) : 0;
        int n10 = Math.min(n5 * ((bl2 ? 9 : 0) + n6 + n9 + 13), n2 - 50) / n5;
        int n11 = n2 / 2 - (n10 * n5 + (n5 - 1) * 5) / 2;
        int n12 = 10;
        int n13 = n10 * n5 + (n5 - 1) * 5;
        List list2 = null;
        if (this.e != null) {
            list2 = this.b.m.c(this.e.d(), n2 - 50);
            for (Object object2 : list2) {
                n13 = Math.max(n13, this.b.m.a((String)object2));
            }
        }
        object2 = null;
        if (this.d != null) {
            object2 = this.b.m.c(this.d.d(), n2 - 50);
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object object3 = (String)iterator.next();
                n13 = Math.max(n13, this.b.m.a((String)object3));
            }
        }
        if (list2 != null) {
            cd.a(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + list2.size() * this.b.m.a, Integer.MIN_VALUE);
            for (Object object3 : list2) {
                n3 = this.b.m.a((String)object3);
                this.b.m.a((String)object3, (float)(n2 / 2 - n3 / 2), (float)n12, -1);
                n12 += this.b.m.a;
            }
            ++n12;
        }
        cd.a(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + n8 * 9, Integer.MIN_VALUE);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n14;
            int n15;
            Object object4;
            int n16 = i2 / n8;
            n3 = i2 % n8;
            int n17 = n11 + n16 * n10 + n16 * 5;
            int n18 = n12 + n3 * 9;
            cd.a(n17, n18, n17 + n10, n18 + 8, 0x20FFFFFF);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.d();
            bd.l();
            bd.a(ad.l, bc.j, ad.e, bc.n);
            if (i2 >= list.size()) continue;
            net.minecraft.client.l.r r4 = (net.minecraft.client.l.r)list.get(i2);
            e e2 = r4.a();
            if (bl2) {
                object4 = this.b.h.a(e2.a());
                n15 = object4 != null && ((b)object4).a(net.minecraft.w.a.j.a) && ("Dinnerbone".equals(e2.b()) || "Grumm".equals(e2.b())) ? 1 : 0;
                this.b.N().a(r4.f());
                n14 = 8 + (n15 != 0 ? 8 : 0);
                int n19 = 8 * (n15 != 0 ? -1 : 1);
                de.a(n17, n18, 8.0f, n14, 8, n19, 8, 8, 64.0f, 64.0f);
                if (object4 != null && ((b)object4).a(net.minecraft.w.a.j.g)) {
                    int n20 = 8 + (n15 != 0 ? 8 : 0);
                    int n21 = 8 * (n15 != 0 ? -1 : 1);
                    de.a(n17, n18, 40.0f, n20, 8, n21, 8, 8, 64.0f, 64.0f);
                }
                n17 += 9;
            }
            object4 = this.a(r4);
            if (r4.b() == am.e) {
                this.b.m.a((Object)((Object)o.u) + (String)object4, (float)n17, (float)n18, -1862270977);
            } else {
                this.b.m.a((String)object4, (float)n17, (float)n18, -1);
            }
            if (j2 != null && r4.b() != am.e && (n14 = (n15 = n17 + n6 + 1) + n9) - n15 > 5) {
                this.a(j2, n18, e2.b(), n15, n14, r4);
            }
            this.a(n10, n17 - (bl2 ? 9 : 0), n18, r4);
        }
        if (object2 != null) {
            n12 = n12 + n8 * 9 + 1;
            cd.a(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + object2.size() * this.b.m.a, Integer.MIN_VALUE);
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                n3 = this.b.m.a(string);
                this.b.m.a(string, (float)(n2 / 2 - n3 / 2), (float)n12, -1);
                n12 += this.b.m.a;
            }
        }
    }

    protected void a(int n2, int n3, int n4, net.minecraft.client.l.r r2) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.N().a(A);
        boolean bl2 = false;
        int n5 = r2.c() < 0 ? 5 : (r2.c() < 150 ? 0 : (r2.c() < 300 ? 1 : (r2.c() < 600 ? 2 : (r2.c() < 1000 ? 3 : 4))));
        this.B += 100.0f;
        this.a_(n3 + n2 - 11, n4, 0, 176 + n5 * 8, 10, 8);
        this.B -= 100.0f;
    }

    private void a(j j2, int n2, String string, int n3, int n4, net.minecraft.client.l.r r2) {
        int n5 = j2.a().c(string, j2).b();
        if (j2.e() == l.b) {
            boolean bl2;
            this.b.N().a(A);
            if (this.f == r2.p()) {
                if (n5 < r2.l()) {
                    r2.a(r.I());
                    r2.b((long)(this.c.d() + 20));
                } else if (n5 > r2.l()) {
                    r2.a(r.I());
                    r2.b((long)(this.c.d() + 10));
                }
            }
            if (r.I() - r2.n() > 1000L || this.f != r2.p()) {
                r2.b(n5);
                r2.c(n5);
                r2.a(r.I());
            }
            r2.c(this.f);
            r2.b(n5);
            int n6 = n.f((float)Math.max(n5, r2.m()) / 2.0f);
            int n7 = Math.max(n.f((float)(n5 / 2)), Math.max(n.f((float)(r2.m() / 2)), 10));
            boolean bl3 = bl2 = r2.o() > (long)this.c.d() && (r2.o() - (long)this.c.d()) / 3L % 2L == 1L;
            if (n6 > 0) {
                float f2 = Math.min((float)(n4 - n3 - 4) / (float)n7, 9.0f);
                if (f2 > 3.0f) {
                    int n8;
                    for (n8 = n6; n8 < n7; ++n8) {
                        this.a((float)n3 + (float)n8 * f2, (float)n2, bl2 ? 25 : 16, 0, 9, 9);
                    }
                    for (n8 = 0; n8 < n6; ++n8) {
                        this.a((float)n3 + (float)n8 * f2, (float)n2, bl2 ? 25 : 16, 0, 9, 9);
                        if (bl2) {
                            if (n8 * 2 + 1 < r2.m()) {
                                this.a((float)n3 + (float)n8 * f2, (float)n2, 70, 0, 9, 9);
                            }
                            if (n8 * 2 + 1 == r2.m()) {
                                this.a((float)n3 + (float)n8 * f2, (float)n2, 79, 0, 9, 9);
                            }
                        }
                        if (n8 * 2 + 1 < n5) {
                            this.a((float)n3 + (float)n8 * f2, (float)n2, n8 >= 10 ? 160 : 52, 0, 9, 9);
                        }
                        if (n8 * 2 + 1 != n5) continue;
                        this.a((float)n3 + (float)n8 * f2, (float)n2, n8 >= 10 ? 169 : 61, 0, 9, 9);
                    }
                } else {
                    float f3 = n.a((float)n5 / 20.0f, 0.0f, 1.0f);
                    int n9 = (int)((1.0f - f3) * 255.0f) << 16 | (int)(f3 * 255.0f) << 8;
                    String string2 = "" + (float)n5 / 2.0f;
                    if (n4 - this.b.m.a(String.valueOf(string2) + "hp") >= n3) {
                        string2 = String.valueOf(string2) + "hp";
                    }
                    this.b.m.a(string2, (float)((n4 + n3) / 2 - this.b.m.a(string2) / 2), (float)n2, n9);
                }
            }
        } else {
            String string3 = "" + (Object)((Object)o.o) + n5;
            this.b.m.a(string3, (float)(n4 - this.b.m.a(string3)), (float)n2, 0xFFFFFF);
        }
    }

    public void a(a a2) {
        this.d = a2;
    }

    public void b(a a2) {
        this.e = a2;
    }

    public void a() {
        this.e = null;
        this.d = null;
    }
}

