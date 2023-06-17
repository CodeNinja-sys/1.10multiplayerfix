/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.yd;
import com.c.a.e;
import java.util.Iterator;
import java.util.List;

public class bxc
extends alo {
    private static final yd a = yd.a(new kq(null));
    private final bxy b;
    private final bdt c;
    private cbg d;
    private cbg e;
    private long f;
    private boolean g;

    public bxc(bxy bxy2, bdt bdt2) {
        this.b = bxy2;
        this.c = bdt2;
    }

    public String a(bae bae2) {
        if (bae2.k() != null) {
            return bae2.k().j();
        }
        return ef.a(bae2.i(), bae2.a().b());
    }

    public void a(boolean bl2) {
        if (bl2 && !this.g) {
            this.f = bxy.K();
        }
        this.g = bl2;
    }

    public void a(int n2, bzt bzt2, bhi bhi2) {
        int n3;
        boolean bl2;
        int n4;
        int n5;
        ut ut2 = this.b.h.a;
        List list = a.a(ut2.c());
        int n6 = 0;
        int n7 = 0;
        for (bae bae2 : list) {
            n5 = this.b.k.a(this.a(bae2));
            n6 = Math.max(n6, n5);
            if (bhi2 == null || bhi2.e() == bmb.b) continue;
            n5 = this.b.k.a(" " + bzt2.c(bae2.a().b(), bhi2).b());
            n7 = Math.max(n7, n5);
        }
        list = list.subList(0, Math.min(list.size(), 80));
        int n8 = n4 = list.size();
        n5 = 1;
        while (n8 > 20) {
            n8 = (n4 + ++n5 - 1) / n5;
        }
        boolean bl3 = bl2 = this.b.F() || this.b.x().b().d();
        int n9 = bhi2 != null ? (bhi2.e() == bmb.b ? 90 : n7) : 0;
        int n10 = Math.min(n5 * ((bl2 ? 9 : 0) + n6 + n9 + 13), n2 - 50) / n5;
        int n11 = n2 / 2 - (n10 * n5 + (n5 - 1) * 5) / 2;
        int n12 = 10;
        int n13 = n10 * n5 + (n5 - 1) * 5;
        List list2 = null;
        if (this.e != null) {
            list2 = this.b.k.c(this.e.j(), n2 - 50);
            for (Iterator iterator : list2) {
                n13 = Math.max(n13, this.b.k.a((String)((Object)iterator)));
            }
        }
        Object object = null;
        if (this.d != null) {
            Iterator iterator;
            object = this.b.k.c(this.d.j(), n2 - 50);
            iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                n13 = Math.max(n13, this.b.k.a(string));
            }
        }
        if (list2 != null) {
            bxc.a(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + list2.size() * this.b.k.a, Integer.MIN_VALUE);
            for (String string : list2) {
                n3 = this.b.k.a(string);
                this.b.k.a(string, (float)(n2 / 2 - n3 / 2), (float)n12, -1);
                n12 += this.b.k.a;
            }
            ++n12;
        }
        bxc.a(n2 / 2 - n13 / 2 - 1, n12 - 1, n2 / 2 + n13 / 2 + 1, n12 + n8 * 9, Integer.MIN_VALUE);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n14;
            int n15;
            Object object2;
            int n16 = i2 / n8;
            n3 = i2 % n8;
            int n17 = n11 + n16 * n10 + n16 * 5;
            int n18 = n12 + n3 * 9;
            bxc.a(n17, n18, n17 + n10, n18 + 8, 0x20FFFFFF);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            cja.d();
            cja.l();
            cja.a(bjt.l, afi.j, bjt.e, afi.n);
            if (i2 >= list.size()) continue;
            bae bae3 = (bae)list.get(i2);
            e e2 = bae3.a();
            if (bl2) {
                object2 = this.b.f.a(e2.a());
                n15 = object2 != null && ((bdl)object2).a(bzk.a) && ("Dinnerbone".equals(e2.b()) || "Grumm".equals(e2.b())) ? 1 : 0;
                this.b.P().a(bae3.f());
                n14 = 8 + (n15 != 0 ? 8 : 0);
                int n19 = 8 * (n15 != 0 ? -1 : 1);
                alo.a(n17, n18, 8.0f, n14, 8, n19, 8, 8, 64.0f, 64.0f);
                if (object2 != null && ((bdl)object2).a(bzk.g)) {
                    int n20 = 8 + (n15 != 0 ? 8 : 0);
                    int n21 = 8 * (n15 != 0 ? -1 : 1);
                    alo.a(n17, n18, 40.0f, n20, 8, n21, 8, 8, 64.0f, 64.0f);
                }
                n17 += 9;
            }
            object2 = this.a(bae3);
            if (bae3.b() == bvh.e) {
                this.b.k.a((Object)((Object)aug.u) + (String)object2, (float)n17, (float)n18, -1862270977);
            } else {
                this.b.k.a((String)object2, (float)n17, (float)n18, -1);
            }
            if (bhi2 != null && bae3.b() != bvh.e && (n14 = (n15 = n17 + n6 + 1) + n9) - n15 > 5) {
                this.a(bhi2, n18, e2.b(), n15, n14, bae3);
            }
            this.a(n10, n17 - (bl2 ? 9 : 0), n18, bae3);
        }
        if (object != null) {
            bxc.a(n2 / 2 - n13 / 2 - 1, (n12 += n8 * 9 + 1) - 1, n2 / 2 + n13 / 2 + 1, n12 + object.size() * this.b.k.a, Integer.MIN_VALUE);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                n3 = this.b.k.a(string);
                this.b.k.a(string, (float)(n2 / 2 - n3 / 2), (float)n12, -1);
                n12 += this.b.k.a;
            }
        }
    }

    protected void a(int n2, int n3, int n4, bae bae2) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.P().a(p);
        boolean bl2 = false;
        int n5 = bae2.c() < 0 ? 5 : (bae2.c() < 150 ? 0 : (bae2.c() < 300 ? 1 : (bae2.c() < 600 ? 2 : (bae2.c() < 1000 ? 3 : 4))));
        this.q += 100.0f;
        this.c(n3 + n2 - 11, n4, 0, 176 + n5 * 8, 10, 8);
        this.q -= 100.0f;
    }

    private void a(bhi bhi2, int n2, String string, int n3, int n4, bae bae2) {
        int n5 = bhi2.a().c(string, bhi2).b();
        if (bhi2.e() == bmb.b) {
            boolean bl2;
            this.b.P().a(p);
            if (this.f == bae2.p()) {
                if (n5 < bae2.l()) {
                    bae2.a(bxy.K());
                    bae2.b((long)(this.c.d() + 20));
                } else if (n5 > bae2.l()) {
                    bae2.a(bxy.K());
                    bae2.b((long)(this.c.d() + 10));
                }
            }
            if (bxy.K() - bae2.n() > 1000L || this.f != bae2.p()) {
                bae2.b(n5);
                bae2.c(n5);
                bae2.a(bxy.K());
            }
            bae2.c(this.f);
            bae2.b(n5);
            int n6 = cmk.f((float)Math.max(n5, bae2.m()) / 2.0f);
            int n7 = Math.max(cmk.f((float)(n5 / 2)), Math.max(cmk.f((float)(bae2.m() / 2)), 10));
            boolean bl3 = bl2 = bae2.o() > (long)this.c.d() && (bae2.o() - (long)this.c.d()) / 3L % 2L == 1L;
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
                            if (n8 * 2 + 1 < bae2.m()) {
                                this.a((float)n3 + (float)n8 * f2, (float)n2, 70, 0, 9, 9);
                            }
                            if (n8 * 2 + 1 == bae2.m()) {
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
                    float f3 = cmk.a((float)n5 / 20.0f, 0.0f, 1.0f);
                    int n9 = (int)((1.0f - f3) * 255.0f) << 16 | (int)(f3 * 255.0f) << 8;
                    String string2 = "" + (float)n5 / 2.0f;
                    if (n4 - this.b.k.a(string2 + "hp") >= n3) {
                        string2 = string2 + "hp";
                    }
                    this.b.k.a(string2, (float)((n4 + n3) / 2 - this.b.k.a(string2) / 2), (float)n2, n9);
                }
            }
        } else {
            String string3 = (Object)((Object)aug.o) + "" + n5;
            this.b.k.a(string3, (float)(n4 - this.b.k.a(string3)), (float)n2, 0xFFFFFF);
        }
    }

    public void a(cbg cbg2) {
        this.d = cbg2;
    }

    public void b(cbg cbg2) {
        this.e = cbg2;
    }

    public void a() {
        this.e = null;
        this.d = null;
    }
}

