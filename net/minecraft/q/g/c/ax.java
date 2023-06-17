/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.ag;
import net.minecraft.q.g.c.ba;
import net.minecraft.q.g.c.bd;
import net.minecraft.q.g.c.bj;
import net.minecraft.q.g.c.cp;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.dh;
import net.minecraft.q.g.c.dj;
import net.minecraft.q.g.c.dl;
import net.minecraft.q.g.c.do;
import net.minecraft.q.g.c.n;
import net.minecraft.q.g.c.r;
import net.minecraft.q.g.c.u;
import net.minecraft.q.g.c.w;
import net.minecraft.q.g.c.y;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;

public class ax
extends ag {
    private do n;
    private do o;
    private final List p = ov.a();

    public ax() {
    }

    public ax(Random random, int n2, int n3, ad ad2) {
        super(0);
        Object object2;
        this.a(ad2);
        ad ad3 = this.i();
        this.b = ad3.l() == ae.c ? new dc(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1) : new dc(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
        List list = this.a(random);
        this.n.d = true;
        this.p.add(new bd(ad3, this.n));
        this.p.add(new y(ad3, this.o, random));
        ArrayList arrayList = ov.a();
        arrayList.add(new dj(null));
        arrayList.add(new w(null));
        arrayList.add(new dh(null));
        arrayList.add(new u(null));
        arrayList.add(new bj(null));
        arrayList.add(new cp(null));
        arrayList.add(new dl(null));
        block0: for (do do_ : list) {
            if (do_.d || do_.b()) continue;
            for (Object object2 : arrayList) {
                if (!object2.a(do_)) continue;
                this.p.add(object2.a(ad3, do_, random));
                continue block0;
            }
        }
        int n4 = this.b.b;
        int n5 = this.a(9, 22);
        int n6 = this.b(9, 22);
        for (Object object2 : this.p) {
            ((r)object2).f().a(n5, n4, n6);
        }
        object2 = dc.a(this.a(1, 1), this.a(1), this.b(1, 1), this.a(23, 21), this.a(8), this.b(23, 21));
        dc dc2 = dc.a(this.a(34, 1), this.a(1), this.b(34, 1), this.a(56, 21), this.a(8), this.b(56, 21));
        dc dc3 = dc.a(this.a(22, 22), this.a(13), this.b(22, 22), this.a(35, 35), this.a(17), this.b(35, 35));
        int n7 = random.nextInt();
        this.p.add(new n(ad3, (dc)object2, n7++));
        this.p.add(new n(ad3, dc2, n7++));
        this.p.add(new ba(ad3, dc3));
    }

    /*
     * WARNING - void declaration
     */
    private List a(Random random) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        do[] arrdo = new do[75];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 0;
                n5 = ax.b(n8, 0, n7);
                arrdo[n5] = new do(n5);
            }
        }
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 1;
                n5 = ax.b(n8, 1, n7);
                arrdo[n5] = new do(n5);
            }
        }
        for (n8 = 1; n8 < 4; ++n8) {
            for (n7 = 0; n7 < 2; ++n7) {
                n6 = 2;
                n5 = ax.b(n8, 2, n7);
                arrdo[n5] = new do(n5);
            }
        }
        this.n = arrdo[i];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 5; ++n7) {
                for (n6 = 0; n6 < 3; ++n6) {
                    n5 = ax.b(n8, n6, n7);
                    if (arrdo[n5] == null) continue;
                    for (ad object : ad.values()) {
                        int n9;
                        n4 = n8 + object.h();
                        n3 = n6 + object.i();
                        n2 = n7 + object.j();
                        if (n4 < 0 || n4 >= 5 || n2 < 0 || n2 >= 5 || n3 < 0 || n3 >= 3 || arrdo[n9 = ax.b(n4, n3, n2)] == null) continue;
                        if (n2 == n7) {
                            arrdo[n5].a(object, arrdo[n9]);
                            continue;
                        }
                        arrdo[n5].a(object.e(), arrdo[n9]);
                    }
                }
            }
        }
        do do_ = new do(1003);
        do do_2 = new do(1001);
        do do_3 = new do(1002);
        arrdo[j].a(ad.b, do_);
        arrdo[k].a(ad.d, do_2);
        arrdo[l].a(ad.d, do_3);
        do_.d = true;
        do_2.d = true;
        do_3.d = true;
        this.n.e = true;
        this.o = arrdo[ax.b(random.nextInt(4), 0, 2)];
        this.o.d = true;
        this.o.b[ad.f.b()].d = true;
        this.o.b[ad.c.b()].d = true;
        this.o.b[ad.f.b()].b[ad.c.b()].d = true;
        this.o.b[ad.b.b()].d = true;
        this.o.b[ad.f.b()].b[ad.b.b()].d = true;
        this.o.b[ad.c.b()].b[ad.b.b()].d = true;
        this.o.b[ad.f.b()].b[ad.c.b()].b[ad.b.b()].d = true;
        ArrayList arrayList = ov.a();
        Object[] arrobject = arrdo;
        int n10 = arrdo.length;
        for (int i2 = 0; i2 < n10; ++i2) {
            Object object = arrobject[i2];
            if (object == null) continue;
            ((do)object).a();
            arrayList.add(object);
        }
        do_.a();
        Collections.shuffle(arrayList, random);
        boolean bl2 = true;
        for (do do_4 : arrayList) {
            int n11 = 0;
            for (n4 = 0; n11 < 2 && n4 < 5; ++n4) {
                void var7_15;
                n3 = random.nextInt(6);
                if (!do_4.c[n3]) continue;
                n2 = ad.a(n3).e().b();
                do_4.c[n3] = false;
                do_4.b[n3].c[n2] = false;
                if (do_4.a((int)var7_15++) && do_4.b[n3].a((int)var7_15++)) {
                    ++n11;
                    continue;
                }
                do_4.c[n3] = true;
                do_4.b[n3].c[n2] = true;
            }
        }
        arrayList.add(do_);
        arrayList.add(do_2);
        arrayList.add(do_3);
        return arrayList;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3 = Math.max(k2.x(), 64) - this.b.b;
        this.a(k2, dc2, 0, 0, 0, 58, n3, 58, false);
        this.a(false, 0, k2, random, dc2);
        this.a(true, 33, k2, random, dc2);
        this.b(k2, random, dc2);
        this.c(k2, random, dc2);
        this.d(k2, random, dc2);
        this.e(k2, random, dc2);
        this.f(k2, random, dc2);
        this.g(k2, random, dc2);
        for (n2 = 0; n2 < 7; ++n2) {
            int n4 = 0;
            while (n4 < 7) {
                if (n4 == 0 && n2 == 3) {
                    n4 = 6;
                }
                int n5 = n2 * 9;
                int n6 = n4 * 9;
                for (int i2 = 0; i2 < 4; ++i2) {
                    for (int i3 = 0; i3 < 4; ++i3) {
                        this.a(k2, d, n5 + i2, 0, n6 + i3, dc2);
                        this.b(k2, d, n5 + i2, -1, n6 + i3, dc2);
                    }
                }
                if (n2 != 0 && n2 != 6) {
                    n4 += 6;
                    continue;
                }
                ++n4;
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.a(k2, dc2, -1 - n2, 0 + n2 * 2, -1 - n2, -1 - n2, 23, 58 + n2, false);
            this.a(k2, dc2, 58 + n2, 0 + n2 * 2, -1 - n2, 58 + n2, 23, 58 + n2, false);
            this.a(k2, dc2, 0 - n2, 0 + n2 * 2, -1 - n2, 57 + n2, 23, -1 - n2, false);
            this.a(k2, dc2, 0 - n2, 0 + n2 * 2, 58 + n2, 57 + n2, 23, 58 + n2, false);
        }
        for (ag ag2 : this.p) {
            if (!ag2.f().a(dc2)) continue;
            ag2.a(k2, random, dc2);
        }
        return true;
    }

    private void a(boolean bl2, int n2, k k2, Random random, dc dc2) {
        int n3 = 24;
        if (this.a(dc2, n2, 0, n2 + 23, 20)) {
            int n4;
            int n5;
            this.a(k2, dc2, n2 + 0, 0, 0, n2 + 24, 0, 20, a, a, false);
            this.a(k2, dc2, n2 + 0, 1, 0, n2 + 24, 10, 20, false);
            for (n5 = 0; n5 < 4; ++n5) {
                this.a(k2, dc2, n2 + n5, n5 + 1, n5, n2 + n5, n5 + 1, 20, d, d, false);
                this.a(k2, dc2, n2 + n5 + 7, n5 + 5, n5 + 7, n2 + n5 + 7, n5 + 5, 20, d, d, false);
                this.a(k2, dc2, n2 + 17 - n5, n5 + 5, n5 + 7, n2 + 17 - n5, n5 + 5, 20, d, d, false);
                this.a(k2, dc2, n2 + 24 - n5, n5 + 1, n5, n2 + 24 - n5, n5 + 1, 20, d, d, false);
                this.a(k2, dc2, n2 + n5 + 1, n5 + 1, n5, n2 + 23 - n5, n5 + 1, n5, d, d, false);
                this.a(k2, dc2, n2 + n5 + 8, n5 + 5, n5 + 7, n2 + 16 - n5, n5 + 5, n5 + 7, d, d, false);
            }
            this.a(k2, dc2, n2 + 4, 4, 4, n2 + 6, 4, 20, a, a, false);
            this.a(k2, dc2, n2 + 7, 4, 4, n2 + 17, 4, 6, a, a, false);
            this.a(k2, dc2, n2 + 18, 4, 4, n2 + 20, 4, 20, a, a, false);
            this.a(k2, dc2, n2 + 11, 8, 11, n2 + 13, 8, 20, a, a, false);
            this.a(k2, f, n2 + 12, 9, 12, dc2);
            this.a(k2, f, n2 + 12, 9, 15, dc2);
            this.a(k2, f, n2 + 12, 9, 18, dc2);
            n5 = n2 + (bl2 ? 19 : 5);
            int n6 = n2 + (bl2 ? 5 : 19);
            for (n4 = 20; n4 >= 5; n4 -= 3) {
                this.a(k2, f, n5, 5, n4, dc2);
            }
            for (n4 = 19; n4 >= 7; n4 -= 3) {
                this.a(k2, f, n6, 5, n4, dc2);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                int n7 = bl2 ? n2 + (24 - (17 - n4 * 3)) : n2 + 17 - n4 * 3;
                this.a(k2, f, n7, 5, 5, dc2);
            }
            this.a(k2, f, n6, 5, 5, dc2);
            this.a(k2, dc2, n2 + 11, 1, 12, n2 + 13, 7, 12, a, a, false);
            this.a(k2, dc2, n2 + 12, 1, 11, n2 + 12, 7, 13, a, a, false);
        }
    }

    private void b(k k2, Random random, dc dc2) {
        if (this.a(dc2, 22, 5, 35, 17)) {
            this.a(k2, dc2, 25, 0, 0, 32, 8, 20, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(k2, dc2, 24, 2, 5 + i2 * 4, 24, 4, 5 + i2 * 4, d, d, false);
                this.a(k2, dc2, 22, 4, 5 + i2 * 4, 23, 4, 5 + i2 * 4, d, d, false);
                this.a(k2, d, 25, 5, 5 + i2 * 4, dc2);
                this.a(k2, d, 26, 6, 5 + i2 * 4, dc2);
                this.a(k2, g, 26, 5, 5 + i2 * 4, dc2);
                this.a(k2, dc2, 33, 2, 5 + i2 * 4, 33, 4, 5 + i2 * 4, d, d, false);
                this.a(k2, dc2, 34, 4, 5 + i2 * 4, 35, 4, 5 + i2 * 4, d, d, false);
                this.a(k2, d, 32, 5, 5 + i2 * 4, dc2);
                this.a(k2, d, 31, 6, 5 + i2 * 4, dc2);
                this.a(k2, g, 31, 5, 5 + i2 * 4, dc2);
                this.a(k2, dc2, 27, 6, 5 + i2 * 4, 30, 6, 5 + i2 * 4, a, a, false);
            }
        }
    }

    private void c(k k2, Random random, dc dc2) {
        if (this.a(dc2, 15, 20, 42, 21)) {
            int n2;
            this.a(k2, dc2, 15, 0, 21, 42, 0, 21, a, a, false);
            this.a(k2, dc2, 26, 1, 21, 31, 3, 21, false);
            this.a(k2, dc2, 21, 12, 21, 36, 12, 21, a, a, false);
            this.a(k2, dc2, 17, 11, 21, 40, 11, 21, a, a, false);
            this.a(k2, dc2, 16, 10, 21, 41, 10, 21, a, a, false);
            this.a(k2, dc2, 15, 7, 21, 42, 9, 21, a, a, false);
            this.a(k2, dc2, 16, 6, 21, 41, 6, 21, a, a, false);
            this.a(k2, dc2, 17, 5, 21, 40, 5, 21, a, a, false);
            this.a(k2, dc2, 21, 4, 21, 36, 4, 21, a, a, false);
            this.a(k2, dc2, 22, 3, 21, 26, 3, 21, a, a, false);
            this.a(k2, dc2, 31, 3, 21, 35, 3, 21, a, a, false);
            this.a(k2, dc2, 23, 2, 21, 25, 2, 21, a, a, false);
            this.a(k2, dc2, 32, 2, 21, 34, 2, 21, a, a, false);
            this.a(k2, dc2, 28, 4, 20, 29, 4, 21, d, d, false);
            this.a(k2, d, 27, 3, 21, dc2);
            this.a(k2, d, 30, 3, 21, dc2);
            this.a(k2, d, 26, 2, 21, dc2);
            this.a(k2, d, 31, 2, 21, dc2);
            this.a(k2, d, 25, 1, 21, dc2);
            this.a(k2, d, 32, 1, 21, dc2);
            for (n2 = 0; n2 < 7; ++n2) {
                this.a(k2, e, 28 - n2, 6 + n2, 21, dc2);
                this.a(k2, e, 29 + n2, 6 + n2, 21, dc2);
            }
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, e, 28 - n2, 9 + n2, 21, dc2);
                this.a(k2, e, 29 + n2, 9 + n2, 21, dc2);
            }
            this.a(k2, e, 28, 12, 21, dc2);
            this.a(k2, e, 29, 12, 21, dc2);
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(k2, e, 22 - n2 * 2, 8, 21, dc2);
                this.a(k2, e, 22 - n2 * 2, 9, 21, dc2);
                this.a(k2, e, 35 + n2 * 2, 8, 21, dc2);
                this.a(k2, e, 35 + n2 * 2, 9, 21, dc2);
            }
            this.a(k2, dc2, 15, 13, 21, 42, 15, 21, false);
            this.a(k2, dc2, 15, 1, 21, 15, 6, 21, false);
            this.a(k2, dc2, 16, 1, 21, 16, 5, 21, false);
            this.a(k2, dc2, 17, 1, 21, 20, 4, 21, false);
            this.a(k2, dc2, 21, 1, 21, 21, 3, 21, false);
            this.a(k2, dc2, 22, 1, 21, 22, 2, 21, false);
            this.a(k2, dc2, 23, 1, 21, 24, 1, 21, false);
            this.a(k2, dc2, 42, 1, 21, 42, 6, 21, false);
            this.a(k2, dc2, 41, 1, 21, 41, 5, 21, false);
            this.a(k2, dc2, 37, 1, 21, 40, 4, 21, false);
            this.a(k2, dc2, 36, 1, 21, 36, 3, 21, false);
            this.a(k2, dc2, 33, 1, 21, 34, 1, 21, false);
            this.a(k2, dc2, 35, 1, 21, 35, 2, 21, false);
        }
    }

    private void d(k k2, Random random, dc dc2) {
        if (this.a(dc2, 21, 21, 36, 36)) {
            this.a(k2, dc2, 21, 0, 22, 36, 0, 36, a, a, false);
            this.a(k2, dc2, 21, 1, 22, 36, 23, 36, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(k2, dc2, 21 + i2, 13 + i2, 21 + i2, 36 - i2, 13 + i2, 21 + i2, d, d, false);
                this.a(k2, dc2, 21 + i2, 13 + i2, 36 - i2, 36 - i2, 13 + i2, 36 - i2, d, d, false);
                this.a(k2, dc2, 21 + i2, 13 + i2, 22 + i2, 21 + i2, 13 + i2, 35 - i2, d, d, false);
                this.a(k2, dc2, 36 - i2, 13 + i2, 22 + i2, 36 - i2, 13 + i2, 35 - i2, d, d, false);
            }
            this.a(k2, dc2, 25, 16, 25, 32, 16, 32, a, a, false);
            this.a(k2, dc2, 25, 17, 25, 25, 19, 25, d, d, false);
            this.a(k2, dc2, 32, 17, 25, 32, 19, 25, d, d, false);
            this.a(k2, dc2, 25, 17, 32, 25, 19, 32, d, d, false);
            this.a(k2, dc2, 32, 17, 32, 32, 19, 32, d, d, false);
            this.a(k2, d, 26, 20, 26, dc2);
            this.a(k2, d, 27, 21, 27, dc2);
            this.a(k2, g, 27, 20, 27, dc2);
            this.a(k2, d, 26, 20, 31, dc2);
            this.a(k2, d, 27, 21, 30, dc2);
            this.a(k2, g, 27, 20, 30, dc2);
            this.a(k2, d, 31, 20, 31, dc2);
            this.a(k2, d, 30, 21, 30, dc2);
            this.a(k2, g, 30, 20, 30, dc2);
            this.a(k2, d, 31, 20, 26, dc2);
            this.a(k2, d, 30, 21, 27, dc2);
            this.a(k2, g, 30, 20, 27, dc2);
            this.a(k2, dc2, 28, 21, 27, 29, 21, 27, a, a, false);
            this.a(k2, dc2, 27, 21, 28, 27, 21, 29, a, a, false);
            this.a(k2, dc2, 28, 21, 30, 29, 21, 30, a, a, false);
            this.a(k2, dc2, 30, 21, 28, 30, 21, 29, a, a, false);
        }
    }

    private void e(k k2, Random random, dc dc2) {
        int n2;
        if (this.a(dc2, 0, 21, 6, 58)) {
            this.a(k2, dc2, 0, 0, 21, 6, 0, 57, a, a, false);
            this.a(k2, dc2, 0, 1, 21, 6, 7, 57, false);
            this.a(k2, dc2, 4, 4, 21, 6, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, d, d, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(k2, f, 5, 5, n2, dc2);
            }
            this.a(k2, f, 5, 5, 52, dc2);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, d, d, false);
            }
            this.a(k2, dc2, 4, 1, 52, 6, 3, 52, a, a, false);
            this.a(k2, dc2, 5, 1, 51, 5, 3, 53, a, a, false);
        }
        if (this.a(dc2, 51, 21, 58, 58)) {
            this.a(k2, dc2, 51, 0, 21, 57, 0, 57, a, a, false);
            this.a(k2, dc2, 51, 1, 21, 57, 7, 57, false);
            this.a(k2, dc2, 51, 4, 21, 53, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, 57 - n2, n2 + 1, 21, 57 - n2, n2 + 1, 57 - n2, d, d, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(k2, f, 52, 5, n2, dc2);
            }
            this.a(k2, f, 52, 5, 52, dc2);
            this.a(k2, dc2, 51, 1, 52, 53, 3, 52, a, a, false);
            this.a(k2, dc2, 52, 1, 51, 52, 3, 53, a, a, false);
        }
        if (this.a(dc2, 0, 51, 57, 57)) {
            this.a(k2, dc2, 7, 0, 51, 50, 0, 57, a, a, false);
            this.a(k2, dc2, 7, 1, 51, 50, 10, 57, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, d, d, false);
            }
        }
    }

    private void f(k k2, Random random, dc dc2) {
        int n2;
        if (this.a(dc2, 7, 21, 13, 50)) {
            this.a(k2, dc2, 7, 0, 21, 13, 0, 50, a, a, false);
            this.a(k2, dc2, 7, 1, 21, 13, 10, 50, false);
            this.a(k2, dc2, 11, 8, 21, 13, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, n2 + 7, n2 + 5, 21, n2 + 7, n2 + 5, 54, d, d, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(k2, f, 12, 9, n2, dc2);
            }
        }
        if (this.a(dc2, 44, 21, 50, 54)) {
            this.a(k2, dc2, 44, 0, 21, 50, 0, 50, a, a, false);
            this.a(k2, dc2, 44, 1, 21, 50, 10, 50, false);
            this.a(k2, dc2, 44, 8, 21, 46, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, 50 - n2, n2 + 5, 21, 50 - n2, n2 + 5, 54, d, d, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(k2, f, 45, 9, n2, dc2);
            }
        }
        if (this.a(dc2, 8, 44, 49, 54)) {
            this.a(k2, dc2, 14, 0, 44, 43, 0, 50, a, a, false);
            this.a(k2, dc2, 14, 1, 44, 43, 10, 50, false);
            for (n2 = 12; n2 <= 45; n2 += 3) {
                this.a(k2, f, n2, 9, 45, dc2);
                this.a(k2, f, n2, 9, 52, dc2);
                if (n2 != 12 && n2 != 18 && n2 != 24 && n2 != 33 && n2 != 39 && n2 != 45) continue;
                this.a(k2, f, n2, 9, 47, dc2);
                this.a(k2, f, n2, 9, 50, dc2);
                this.a(k2, f, n2, 10, 45, dc2);
                this.a(k2, f, n2, 10, 46, dc2);
                this.a(k2, f, n2, 10, 51, dc2);
                this.a(k2, f, n2, 10, 52, dc2);
                this.a(k2, f, n2, 11, 47, dc2);
                this.a(k2, f, n2, 11, 50, dc2);
                this.a(k2, f, n2, 12, 48, dc2);
                this.a(k2, f, n2, 12, 49, dc2);
            }
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(k2, dc2, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, a, a, false);
            }
            this.a(k2, dc2, 11, 8, 54, 46, 8, 54, d, d, false);
            this.a(k2, dc2, 14, 8, 44, 43, 8, 53, a, a, false);
        }
    }

    private void g(k k2, Random random, dc dc2) {
        int n2;
        if (this.a(dc2, 14, 21, 20, 43)) {
            this.a(k2, dc2, 14, 0, 21, 20, 0, 43, a, a, false);
            this.a(k2, dc2, 14, 1, 22, 20, 14, 43, false);
            this.a(k2, dc2, 18, 12, 22, 20, 12, 39, a, a, false);
            this.a(k2, dc2, 18, 12, 21, 20, 12, 21, d, d, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, n2 + 14, n2 + 9, 21, n2 + 14, n2 + 9, 43 - n2, d, d, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(k2, f, 19, 13, n2, dc2);
            }
        }
        if (this.a(dc2, 37, 21, 43, 43)) {
            this.a(k2, dc2, 37, 0, 21, 43, 0, 43, a, a, false);
            this.a(k2, dc2, 37, 1, 22, 43, 14, 43, false);
            this.a(k2, dc2, 37, 12, 22, 39, 12, 39, a, a, false);
            this.a(k2, dc2, 37, 12, 21, 39, 12, 21, d, d, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, 43 - n2, n2 + 9, 21, 43 - n2, n2 + 9, 43 - n2, d, d, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(k2, f, 38, 13, n2, dc2);
            }
        }
        if (this.a(dc2, 15, 37, 42, 43)) {
            this.a(k2, dc2, 21, 0, 37, 36, 0, 43, a, a, false);
            this.a(k2, dc2, 21, 1, 37, 36, 14, 43, false);
            this.a(k2, dc2, 21, 12, 37, 36, 12, 39, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(k2, dc2, 15 + n2, n2 + 9, 43 - n2, 42 - n2, n2 + 9, 43 - n2, d, d, false);
            }
            for (n2 = 21; n2 <= 36; n2 += 3) {
                this.a(k2, f, n2, 13, 38, dc2);
            }
        }
    }
}

