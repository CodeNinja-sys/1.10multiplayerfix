/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class dcp
extends ko {
    private static final dbk a = blg.r.s().a(ff.a, (Comparable)((Object)zg.a));
    private static final dbk b = blg.t.s().a(dbo.e, (Comparable)((Object)zg.a)).a(dbo.b, Boolean.valueOf(false));

    public dcp() {
        super(false);
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        cmz cmz3;
        int n2;
        int n3;
        int n4;
        int n5 = random.nextInt(4) + 5;
        while (iu2.n(cmz2.h()).a() == ahk.h) {
            cmz2 = cmz2.h();
        }
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n5 + 1 > 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n5; ++i2) {
            n4 = 1;
            if (i2 == cmz2.b()) {
                n4 = 0;
            }
            if (i2 >= cmz2.b() + 1 + n5 - 2) {
                n4 = 3;
            }
            pj pj2 = new pj();
            for (n3 = cmz2.a() - n4; n3 <= cmz2.a() + n4 && bl2; ++n3) {
                for (n2 = cmz2.c() - n4; n2 <= cmz2.c() + n4 && bl2; ++n2) {
                    if (i2 >= 0 && i2 < 256) {
                        dbk dbk2 = iu2.n(pj2.a(n3, i2, n2));
                        bfa bfa2 = dbk2.t();
                        if (dbk2.a() == ahk.a || dbk2.a() == ahk.j) continue;
                        if (bfa2 == blg.j || bfa2 == blg.i) {
                            if (i2 <= cmz2.b()) continue;
                            bl2 = false;
                            continue;
                        }
                        bl2 = false;
                        continue;
                    }
                    bl2 = false;
                }
            }
        }
        if (!bl2) {
            return false;
        }
        bfa bfa3 = iu2.n(cmz2.h()).t();
        if (bfa3 != blg.c && bfa3 != blg.d || cmz2.b() >= 256 - n5 - 1) {
            return false;
        }
        this.a(iu2, cmz2.h());
        for (n4 = cmz2.b() - 3 + n5; n4 <= cmz2.b() + n5; ++n4) {
            int n6 = n4 - (cmz2.b() + n5);
            n3 = 2 - n6 / 2;
            for (n2 = cmz2.a() - n3; n2 <= cmz2.a() + n3; ++n2) {
                int n7 = n2 - cmz2.a();
                for (int i3 = cmz2.c() - n3; i3 <= cmz2.c() + n3; ++i3) {
                    int n8 = i3 - cmz2.c();
                    if (Math.abs(n7) == n3 && Math.abs(n8) == n3 && (random.nextInt(2) == 0 || n6 == 0) || iu2.n(cmz3 = new cmz(n2, n4, i3)).b()) continue;
                    this.a(iu2, cmz3, b);
                }
            }
        }
        for (n4 = 0; n4 < n5; ++n4) {
            dbk dbk3 = iu2.n(cmz2.b(n4));
            bfa bfa4 = dbk3.t();
            if (dbk3.a() != ahk.a && dbk3.a() != ahk.j && bfa4 != blg.i && bfa4 != blg.j) continue;
            this.a(iu2, cmz2.b(n4), a);
        }
        for (n4 = cmz2.b() - 3 + n5; n4 <= cmz2.b() + n5; ++n4) {
            int n9 = n4 - (cmz2.b() + n5);
            int n10 = 2 - n9 / 2;
            pj pj3 = new pj();
            for (int i4 = cmz2.a() - n10; i4 <= cmz2.a() + n10; ++i4) {
                for (int i5 = cmz2.c() - n10; i5 <= cmz2.c() + n10; ++i5) {
                    pj3.a(i4, n4, i5);
                    if (iu2.n(pj3).a() != ahk.j) continue;
                    cmz cmz4 = pj3.k();
                    cmz3 = pj3.l();
                    cmz cmz5 = pj3.i();
                    cmz cmz6 = pj3.j();
                    if (random.nextInt(4) == 0 && iu2.n(cmz4).a() == ahk.a) {
                        this.a(iu2, cmz4, ju.c);
                    }
                    if (random.nextInt(4) == 0 && iu2.n(cmz3).a() == ahk.a) {
                        this.a(iu2, cmz3, ju.e);
                    }
                    if (random.nextInt(4) == 0 && iu2.n(cmz5).a() == ahk.a) {
                        this.a(iu2, cmz5, ju.d);
                    }
                    if (random.nextInt(4) != 0 || iu2.n(cmz6).a() != ahk.a) continue;
                    this.a(iu2, cmz6, ju.b);
                }
            }
        }
        return true;
    }

    private void a(iu iu2, cmz cmz2, ddi ddi2) {
        dbk dbk2 = blg.bn.s().a(ddi2, Boolean.valueOf(true));
        this.a(iu2, cmz2, dbk2);
        cmz2 = cmz2.h();
        for (int i2 = 4; iu2.n(cmz2).a() == ahk.a && i2 > 0; --i2) {
            this.a(iu2, cmz2, dbk2);
            cmz2 = cmz2.h();
        }
    }
}

