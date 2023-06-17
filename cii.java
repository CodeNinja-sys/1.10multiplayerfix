/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class cii
extends ic {
    private cgd n;
    private cgd o;
    private final List p = ov.a();

    public cii() {
    }

    public cii(Random random, int n2, int n3, bqk bqk2) {
        super(0);
        Object object3;
        Object object22;
        this.a(bqk2);
        bqk bqk3 = this.e();
        this.l = bqk3.l() == ctv.c ? new awx(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1) : new awx(n2, 39, n3, n2 + 58 - 1, 61, n3 + 58 - 1);
        List list = this.a(random);
        this.n.d = true;
        this.p.add(new bnf(bqk3, this.n));
        this.p.add(new dq(bqk3, this.o, random));
        ArrayList arrayList = ov.a();
        arrayList.add(new bqs(null));
        arrayList.add(new anh(null));
        arrayList.add(new dgg(null));
        arrayList.add(new bjz(null));
        arrayList.add(new aep(null));
        arrayList.add(new azz(null));
        arrayList.add(new bgb(null));
        block0: for (cgd cgd2 : list) {
            if (cgd2.d || cgd2.b()) continue;
            for (Object object22 : arrayList) {
                if (!object22.a(cgd2)) continue;
                this.p.add(object22.a(bqk3, cgd2, random));
                continue block0;
            }
        }
        int n4 = this.l.b;
        int n5 = this.a(9, 22);
        int n6 = this.b(9, 22);
        for (Object object3 : this.p) {
            ((pc)object3).b().a(n5, n4, n6);
        }
        object22 = awx.a(this.a(1, 1), this.a(1), this.b(1, 1), this.a(23, 21), this.a(8), this.b(23, 21));
        object3 = awx.a(this.a(34, 1), this.a(1), this.b(34, 1), this.a(56, 21), this.a(8), this.b(56, 21));
        awx awx2 = awx.a(this.a(22, 22), this.a(13), this.b(22, 22), this.a(35, 35), this.a(17), this.b(35, 35));
        int n7 = random.nextInt();
        this.p.add(new aia(bqk3, (awx)object22, n7++));
        this.p.add(new aia(bqk3, (awx)object3, n7++));
        this.p.add(new bij(bqk3, awx2));
    }

    private List a(Random random) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        cgd[] arrcgd = new cgd[75];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 0;
                n5 = cii.a(n8, 0, n7);
                arrcgd[n5] = new cgd(n5);
            }
        }
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 4; ++n7) {
                n6 = 1;
                n5 = cii.a(n8, 1, n7);
                arrcgd[n5] = new cgd(n5);
            }
        }
        for (n8 = 1; n8 < 4; ++n8) {
            for (n7 = 0; n7 < 2; ++n7) {
                n6 = 2;
                n5 = cii.a(n8, 2, n7);
                arrcgd[n5] = new cgd(n5);
            }
        }
        this.n = arrcgd[g];
        for (n8 = 0; n8 < 5; ++n8) {
            for (n7 = 0; n7 < 5; ++n7) {
                for (n6 = 0; n6 < 3; ++n6) {
                    n5 = cii.a(n8, n6, n7);
                    if (arrcgd[n5] == null) continue;
                    for (bqk object : bqk.values()) {
                        int n9;
                        n4 = n8 + object.h();
                        n3 = n6 + object.i();
                        n2 = n7 + object.j();
                        if (n4 < 0 || n4 >= 5 || n2 < 0 || n2 >= 5 || n3 < 0 || n3 >= 3 || arrcgd[n9 = cii.a(n4, n3, n2)] == null) continue;
                        if (n2 == n7) {
                            arrcgd[n5].a(object, arrcgd[n9]);
                            continue;
                        }
                        arrcgd[n5].a(object.e(), arrcgd[n9]);
                    }
                }
            }
        }
        cgd cgd2 = new cgd(1003);
        cgd cgd3 = new cgd(1001);
        cgd cgd4 = new cgd(1002);
        arrcgd[h].a(bqk.b, cgd2);
        arrcgd[i].a(bqk.d, cgd3);
        arrcgd[j].a(bqk.d, cgd4);
        cgd2.d = true;
        cgd3.d = true;
        cgd4.d = true;
        this.n.e = true;
        this.o = arrcgd[cii.a(random.nextInt(4), 0, 2)];
        this.o.d = true;
        this.o.b[bqk.f.b()].d = true;
        this.o.b[bqk.c.b()].d = true;
        this.o.b[bqk.f.b()].b[bqk.c.b()].d = true;
        this.o.b[bqk.b.b()].d = true;
        this.o.b[bqk.f.b()].b[bqk.b.b()].d = true;
        this.o.b[bqk.c.b()].b[bqk.b.b()].d = true;
        this.o.b[bqk.f.b()].b[bqk.c.b()].b[bqk.b.b()].d = true;
        ArrayList arrayList = ov.a();
        for (cgd cgd5 : arrcgd) {
            if (cgd5 == null) continue;
            cgd5.a();
            arrayList.add(cgd5);
        }
        cgd2.a();
        Collections.shuffle(arrayList, random);
        int n10 = 1;
        for (cgd cgd5 : arrayList) {
            int n11 = 0;
            for (n4 = 0; n11 < 2 && n4 < 5; ++n4) {
                n3 = random.nextInt(6);
                if (!cgd5.c[n3]) continue;
                n2 = bqk.a(n3).e().b();
                cgd5.c[n3] = false;
                cgd5.b[n3].c[n2] = false;
                if (cgd5.a(n10++) && cgd5.b[n3].a(n10++)) {
                    ++n11;
                    continue;
                }
                cgd5.c[n3] = true;
                cgd5.b[n3].c[n2] = true;
            }
        }
        arrayList.add(cgd2);
        arrayList.add(cgd3);
        arrayList.add(cgd4);
        return arrayList;
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3 = Math.max(iu2.u(), 64) - this.l.b;
        this.a(iu2, awx2, 0, 0, 0, 58, n3, 58, false);
        this.a(false, 0, iu2, random, awx2);
        this.a(true, 33, iu2, random, awx2);
        this.b(iu2, random, awx2);
        this.c(iu2, random, awx2);
        this.d(iu2, random, awx2);
        this.e(iu2, random, awx2);
        this.f(iu2, random, awx2);
        this.g(iu2, random, awx2);
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
                        this.a(iu2, b, n5 + i2, 0, n6 + i3, awx2);
                        this.b(iu2, b, n5 + i2, -1, n6 + i3, awx2);
                    }
                }
                if (n2 == 0 || n2 == 6) {
                    ++n4;
                    continue;
                }
                n4 += 6;
            }
        }
        for (n2 = 0; n2 < 5; ++n2) {
            this.a(iu2, awx2, -1 - n2, 0 + n2 * 2, -1 - n2, -1 - n2, 23, 58 + n2, false);
            this.a(iu2, awx2, 58 + n2, 0 + n2 * 2, -1 - n2, 58 + n2, 23, 58 + n2, false);
            this.a(iu2, awx2, 0 - n2, 0 + n2 * 2, -1 - n2, 57 + n2, 23, -1 - n2, false);
            this.a(iu2, awx2, 0 - n2, 0 + n2 * 2, 58 + n2, 57 + n2, 23, 58 + n2, false);
        }
        for (ic ic2 : this.p) {
            if (!ic2.b().a(awx2)) continue;
            ic2.a(iu2, random, awx2);
        }
        return true;
    }

    private void a(boolean bl2, int n2, iu iu2, Random random, awx awx2) {
        int n3 = 24;
        if (this.a(awx2, n2, 0, n2 + 23, 20)) {
            int n4;
            int n5;
            this.a(iu2, awx2, n2 + 0, 0, 0, n2 + 24, 0, 20, a, a, false);
            this.a(iu2, awx2, n2 + 0, 1, 0, n2 + 24, 10, 20, false);
            for (n5 = 0; n5 < 4; ++n5) {
                this.a(iu2, awx2, n2 + n5, n5 + 1, n5, n2 + n5, n5 + 1, 20, b, b, false);
                this.a(iu2, awx2, n2 + n5 + 7, n5 + 5, n5 + 7, n2 + n5 + 7, n5 + 5, 20, b, b, false);
                this.a(iu2, awx2, n2 + 17 - n5, n5 + 5, n5 + 7, n2 + 17 - n5, n5 + 5, 20, b, b, false);
                this.a(iu2, awx2, n2 + 24 - n5, n5 + 1, n5, n2 + 24 - n5, n5 + 1, 20, b, b, false);
                this.a(iu2, awx2, n2 + n5 + 1, n5 + 1, n5, n2 + 23 - n5, n5 + 1, n5, b, b, false);
                this.a(iu2, awx2, n2 + n5 + 8, n5 + 5, n5 + 7, n2 + 16 - n5, n5 + 5, n5 + 7, b, b, false);
            }
            this.a(iu2, awx2, n2 + 4, 4, 4, n2 + 6, 4, 20, a, a, false);
            this.a(iu2, awx2, n2 + 7, 4, 4, n2 + 17, 4, 6, a, a, false);
            this.a(iu2, awx2, n2 + 18, 4, 4, n2 + 20, 4, 20, a, a, false);
            this.a(iu2, awx2, n2 + 11, 8, 11, n2 + 13, 8, 20, a, a, false);
            this.a(iu2, d, n2 + 12, 9, 12, awx2);
            this.a(iu2, d, n2 + 12, 9, 15, awx2);
            this.a(iu2, d, n2 + 12, 9, 18, awx2);
            n5 = n2 + (bl2 ? 19 : 5);
            int n6 = n2 + (bl2 ? 5 : 19);
            for (n4 = 20; n4 >= 5; n4 -= 3) {
                this.a(iu2, d, n5, 5, n4, awx2);
            }
            for (n4 = 19; n4 >= 7; n4 -= 3) {
                this.a(iu2, d, n6, 5, n4, awx2);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                int n7 = bl2 ? n2 + (24 - (17 - n4 * 3)) : n2 + 17 - n4 * 3;
                this.a(iu2, d, n7, 5, 5, awx2);
            }
            this.a(iu2, d, n6, 5, 5, awx2);
            this.a(iu2, awx2, n2 + 11, 1, 12, n2 + 13, 7, 12, a, a, false);
            this.a(iu2, awx2, n2 + 12, 1, 11, n2 + 12, 7, 13, a, a, false);
        }
    }

    private void b(iu iu2, Random random, awx awx2) {
        if (this.a(awx2, 22, 5, 35, 17)) {
            this.a(iu2, awx2, 25, 0, 0, 32, 8, 20, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(iu2, awx2, 24, 2, 5 + i2 * 4, 24, 4, 5 + i2 * 4, b, b, false);
                this.a(iu2, awx2, 22, 4, 5 + i2 * 4, 23, 4, 5 + i2 * 4, b, b, false);
                this.a(iu2, b, 25, 5, 5 + i2 * 4, awx2);
                this.a(iu2, b, 26, 6, 5 + i2 * 4, awx2);
                this.a(iu2, e, 26, 5, 5 + i2 * 4, awx2);
                this.a(iu2, awx2, 33, 2, 5 + i2 * 4, 33, 4, 5 + i2 * 4, b, b, false);
                this.a(iu2, awx2, 34, 4, 5 + i2 * 4, 35, 4, 5 + i2 * 4, b, b, false);
                this.a(iu2, b, 32, 5, 5 + i2 * 4, awx2);
                this.a(iu2, b, 31, 6, 5 + i2 * 4, awx2);
                this.a(iu2, e, 31, 5, 5 + i2 * 4, awx2);
                this.a(iu2, awx2, 27, 6, 5 + i2 * 4, 30, 6, 5 + i2 * 4, a, a, false);
            }
        }
    }

    private void c(iu iu2, Random random, awx awx2) {
        if (this.a(awx2, 15, 20, 42, 21)) {
            int n2;
            this.a(iu2, awx2, 15, 0, 21, 42, 0, 21, a, a, false);
            this.a(iu2, awx2, 26, 1, 21, 31, 3, 21, false);
            this.a(iu2, awx2, 21, 12, 21, 36, 12, 21, a, a, false);
            this.a(iu2, awx2, 17, 11, 21, 40, 11, 21, a, a, false);
            this.a(iu2, awx2, 16, 10, 21, 41, 10, 21, a, a, false);
            this.a(iu2, awx2, 15, 7, 21, 42, 9, 21, a, a, false);
            this.a(iu2, awx2, 16, 6, 21, 41, 6, 21, a, a, false);
            this.a(iu2, awx2, 17, 5, 21, 40, 5, 21, a, a, false);
            this.a(iu2, awx2, 21, 4, 21, 36, 4, 21, a, a, false);
            this.a(iu2, awx2, 22, 3, 21, 26, 3, 21, a, a, false);
            this.a(iu2, awx2, 31, 3, 21, 35, 3, 21, a, a, false);
            this.a(iu2, awx2, 23, 2, 21, 25, 2, 21, a, a, false);
            this.a(iu2, awx2, 32, 2, 21, 34, 2, 21, a, a, false);
            this.a(iu2, awx2, 28, 4, 20, 29, 4, 21, b, b, false);
            this.a(iu2, b, 27, 3, 21, awx2);
            this.a(iu2, b, 30, 3, 21, awx2);
            this.a(iu2, b, 26, 2, 21, awx2);
            this.a(iu2, b, 31, 2, 21, awx2);
            this.a(iu2, b, 25, 1, 21, awx2);
            this.a(iu2, b, 32, 1, 21, awx2);
            for (n2 = 0; n2 < 7; ++n2) {
                this.a(iu2, c, 28 - n2, 6 + n2, 21, awx2);
                this.a(iu2, c, 29 + n2, 6 + n2, 21, awx2);
            }
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, c, 28 - n2, 9 + n2, 21, awx2);
                this.a(iu2, c, 29 + n2, 9 + n2, 21, awx2);
            }
            this.a(iu2, c, 28, 12, 21, awx2);
            this.a(iu2, c, 29, 12, 21, awx2);
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(iu2, c, 22 - n2 * 2, 8, 21, awx2);
                this.a(iu2, c, 22 - n2 * 2, 9, 21, awx2);
                this.a(iu2, c, 35 + n2 * 2, 8, 21, awx2);
                this.a(iu2, c, 35 + n2 * 2, 9, 21, awx2);
            }
            this.a(iu2, awx2, 15, 13, 21, 42, 15, 21, false);
            this.a(iu2, awx2, 15, 1, 21, 15, 6, 21, false);
            this.a(iu2, awx2, 16, 1, 21, 16, 5, 21, false);
            this.a(iu2, awx2, 17, 1, 21, 20, 4, 21, false);
            this.a(iu2, awx2, 21, 1, 21, 21, 3, 21, false);
            this.a(iu2, awx2, 22, 1, 21, 22, 2, 21, false);
            this.a(iu2, awx2, 23, 1, 21, 24, 1, 21, false);
            this.a(iu2, awx2, 42, 1, 21, 42, 6, 21, false);
            this.a(iu2, awx2, 41, 1, 21, 41, 5, 21, false);
            this.a(iu2, awx2, 37, 1, 21, 40, 4, 21, false);
            this.a(iu2, awx2, 36, 1, 21, 36, 3, 21, false);
            this.a(iu2, awx2, 33, 1, 21, 34, 1, 21, false);
            this.a(iu2, awx2, 35, 1, 21, 35, 2, 21, false);
        }
    }

    private void d(iu iu2, Random random, awx awx2) {
        if (this.a(awx2, 21, 21, 36, 36)) {
            this.a(iu2, awx2, 21, 0, 22, 36, 0, 36, a, a, false);
            this.a(iu2, awx2, 21, 1, 22, 36, 23, 36, false);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.a(iu2, awx2, 21 + i2, 13 + i2, 21 + i2, 36 - i2, 13 + i2, 21 + i2, b, b, false);
                this.a(iu2, awx2, 21 + i2, 13 + i2, 36 - i2, 36 - i2, 13 + i2, 36 - i2, b, b, false);
                this.a(iu2, awx2, 21 + i2, 13 + i2, 22 + i2, 21 + i2, 13 + i2, 35 - i2, b, b, false);
                this.a(iu2, awx2, 36 - i2, 13 + i2, 22 + i2, 36 - i2, 13 + i2, 35 - i2, b, b, false);
            }
            this.a(iu2, awx2, 25, 16, 25, 32, 16, 32, a, a, false);
            this.a(iu2, awx2, 25, 17, 25, 25, 19, 25, b, b, false);
            this.a(iu2, awx2, 32, 17, 25, 32, 19, 25, b, b, false);
            this.a(iu2, awx2, 25, 17, 32, 25, 19, 32, b, b, false);
            this.a(iu2, awx2, 32, 17, 32, 32, 19, 32, b, b, false);
            this.a(iu2, b, 26, 20, 26, awx2);
            this.a(iu2, b, 27, 21, 27, awx2);
            this.a(iu2, e, 27, 20, 27, awx2);
            this.a(iu2, b, 26, 20, 31, awx2);
            this.a(iu2, b, 27, 21, 30, awx2);
            this.a(iu2, e, 27, 20, 30, awx2);
            this.a(iu2, b, 31, 20, 31, awx2);
            this.a(iu2, b, 30, 21, 30, awx2);
            this.a(iu2, e, 30, 20, 30, awx2);
            this.a(iu2, b, 31, 20, 26, awx2);
            this.a(iu2, b, 30, 21, 27, awx2);
            this.a(iu2, e, 30, 20, 27, awx2);
            this.a(iu2, awx2, 28, 21, 27, 29, 21, 27, a, a, false);
            this.a(iu2, awx2, 27, 21, 28, 27, 21, 29, a, a, false);
            this.a(iu2, awx2, 28, 21, 30, 29, 21, 30, a, a, false);
            this.a(iu2, awx2, 30, 21, 28, 30, 21, 29, a, a, false);
        }
    }

    private void e(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.a(awx2, 0, 21, 6, 58)) {
            this.a(iu2, awx2, 0, 0, 21, 6, 0, 57, a, a, false);
            this.a(iu2, awx2, 0, 1, 21, 6, 7, 57, false);
            this.a(iu2, awx2, 4, 4, 21, 6, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, b, b, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(iu2, d, 5, 5, n2, awx2);
            }
            this.a(iu2, d, 5, 5, 52, awx2);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, n2, n2 + 1, 21, n2, n2 + 1, 57 - n2, b, b, false);
            }
            this.a(iu2, awx2, 4, 1, 52, 6, 3, 52, a, a, false);
            this.a(iu2, awx2, 5, 1, 51, 5, 3, 53, a, a, false);
        }
        if (this.a(awx2, 51, 21, 58, 58)) {
            this.a(iu2, awx2, 51, 0, 21, 57, 0, 57, a, a, false);
            this.a(iu2, awx2, 51, 1, 21, 57, 7, 57, false);
            this.a(iu2, awx2, 51, 4, 21, 53, 4, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, 57 - n2, n2 + 1, 21, 57 - n2, n2 + 1, 57 - n2, b, b, false);
            }
            for (n2 = 23; n2 < 53; n2 += 3) {
                this.a(iu2, d, 52, 5, n2, awx2);
            }
            this.a(iu2, d, 52, 5, 52, awx2);
            this.a(iu2, awx2, 51, 1, 52, 53, 3, 52, a, a, false);
            this.a(iu2, awx2, 52, 1, 51, 52, 3, 53, a, a, false);
        }
        if (this.a(awx2, 0, 51, 57, 57)) {
            this.a(iu2, awx2, 7, 0, 51, 50, 0, 57, a, a, false);
            this.a(iu2, awx2, 7, 1, 51, 50, 10, 57, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, n2 + 1, n2 + 1, 57 - n2, 56 - n2, n2 + 1, 57 - n2, b, b, false);
            }
        }
    }

    private void f(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.a(awx2, 7, 21, 13, 50)) {
            this.a(iu2, awx2, 7, 0, 21, 13, 0, 50, a, a, false);
            this.a(iu2, awx2, 7, 1, 21, 13, 10, 50, false);
            this.a(iu2, awx2, 11, 8, 21, 13, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, n2 + 7, n2 + 5, 21, n2 + 7, n2 + 5, 54, b, b, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(iu2, d, 12, 9, n2, awx2);
            }
        }
        if (this.a(awx2, 44, 21, 50, 54)) {
            this.a(iu2, awx2, 44, 0, 21, 50, 0, 50, a, a, false);
            this.a(iu2, awx2, 44, 1, 21, 50, 10, 50, false);
            this.a(iu2, awx2, 44, 8, 21, 46, 8, 53, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, 50 - n2, n2 + 5, 21, 50 - n2, n2 + 5, 54, b, b, false);
            }
            for (n2 = 21; n2 <= 45; n2 += 3) {
                this.a(iu2, d, 45, 9, n2, awx2);
            }
        }
        if (this.a(awx2, 8, 44, 49, 54)) {
            this.a(iu2, awx2, 14, 0, 44, 43, 0, 50, a, a, false);
            this.a(iu2, awx2, 14, 1, 44, 43, 10, 50, false);
            for (n2 = 12; n2 <= 45; n2 += 3) {
                this.a(iu2, d, n2, 9, 45, awx2);
                this.a(iu2, d, n2, 9, 52, awx2);
                if (n2 != 12 && n2 != 18 && n2 != 24 && n2 != 33 && n2 != 39 && n2 != 45) continue;
                this.a(iu2, d, n2, 9, 47, awx2);
                this.a(iu2, d, n2, 9, 50, awx2);
                this.a(iu2, d, n2, 10, 45, awx2);
                this.a(iu2, d, n2, 10, 46, awx2);
                this.a(iu2, d, n2, 10, 51, awx2);
                this.a(iu2, d, n2, 10, 52, awx2);
                this.a(iu2, d, n2, 11, 47, awx2);
                this.a(iu2, d, n2, 11, 50, awx2);
                this.a(iu2, d, n2, 12, 48, awx2);
                this.a(iu2, d, n2, 12, 49, awx2);
            }
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(iu2, awx2, 8 + n2, 5 + n2, 54, 49 - n2, 5 + n2, 54, a, a, false);
            }
            this.a(iu2, awx2, 11, 8, 54, 46, 8, 54, b, b, false);
            this.a(iu2, awx2, 14, 8, 44, 43, 8, 53, a, a, false);
        }
    }

    private void g(iu iu2, Random random, awx awx2) {
        int n2;
        if (this.a(awx2, 14, 21, 20, 43)) {
            this.a(iu2, awx2, 14, 0, 21, 20, 0, 43, a, a, false);
            this.a(iu2, awx2, 14, 1, 22, 20, 14, 43, false);
            this.a(iu2, awx2, 18, 12, 22, 20, 12, 39, a, a, false);
            this.a(iu2, awx2, 18, 12, 21, 20, 12, 21, b, b, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, n2 + 14, n2 + 9, 21, n2 + 14, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(iu2, d, 19, 13, n2, awx2);
            }
        }
        if (this.a(awx2, 37, 21, 43, 43)) {
            this.a(iu2, awx2, 37, 0, 21, 43, 0, 43, a, a, false);
            this.a(iu2, awx2, 37, 1, 22, 43, 14, 43, false);
            this.a(iu2, awx2, 37, 12, 22, 39, 12, 39, a, a, false);
            this.a(iu2, awx2, 37, 12, 21, 39, 12, 21, b, b, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, 43 - n2, n2 + 9, 21, 43 - n2, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 23; n2 <= 39; n2 += 3) {
                this.a(iu2, d, 38, 13, n2, awx2);
            }
        }
        if (this.a(awx2, 15, 37, 42, 43)) {
            this.a(iu2, awx2, 21, 0, 37, 36, 0, 43, a, a, false);
            this.a(iu2, awx2, 21, 1, 37, 36, 14, 43, false);
            this.a(iu2, awx2, 21, 12, 37, 36, 12, 39, a, a, false);
            for (n2 = 0; n2 < 4; ++n2) {
                this.a(iu2, awx2, 15 + n2, n2 + 9, 43 - n2, 42 - n2, n2 + 9, 43 - n2, b, b, false);
            }
            for (n2 = 21; n2 <= 36; n2 += 3) {
                this.a(iu2, d, n2, 13, 38, awx2);
            }
        }
    }
}

