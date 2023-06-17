/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class ctj
extends ko {
    private static final dbk a = blg.r.s().a(ff.a, (Comparable)((Object)zg.a));
    private static final dbk b = blg.t.s().a(dbo.e, (Comparable)((Object)zg.a)).a(aai.b, Boolean.valueOf(false));
    private final int c;
    private final boolean d;
    private final dbk e;
    private final dbk f;

    public ctj(boolean bl2) {
        this(bl2, 4, a, b, false);
    }

    public ctj(boolean bl2, int n2, dbk dbk2, dbk dbk3, boolean bl3) {
        super(bl2);
        this.c = n2;
        this.e = dbk2;
        this.f = dbk3;
        this.d = bl3;
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        cmz cmz3;
        Object object;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = random.nextInt(3) + this.c;
        boolean bl2 = true;
        if (cmz2.b() < 1 || cmz2.b() + n8 + 1 > 256) {
            return false;
        }
        for (int i2 = cmz2.b(); i2 <= cmz2.b() + 1 + n8; ++i2) {
            n7 = 1;
            if (i2 == cmz2.b()) {
                n7 = 0;
            }
            if (i2 >= cmz2.b() + 1 + n8 - 2) {
                n7 = 2;
            }
            pj pj2 = new pj();
            for (n6 = cmz2.a() - n7; n6 <= cmz2.a() + n7 && bl2; ++n6) {
                for (n5 = cmz2.c() - n7; n5 <= cmz2.c() + n7 && bl2; ++n5) {
                    if (i2 >= 0 && i2 < 256) {
                        if (this.a(iu2.n(pj2.a(n6, i2, n5)).t())) continue;
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
        bfa bfa2 = iu2.n(cmz2.h()).t();
        if (bfa2 != blg.c && bfa2 != blg.d && bfa2 != blg.ak || cmz2.b() >= 256 - n8 - 1) {
            return false;
        }
        this.a(iu2, cmz2.h());
        n7 = 3;
        boolean bl3 = false;
        for (n6 = cmz2.b() - 3 + n8; n6 <= cmz2.b() + n8; ++n6) {
            n5 = n6 - (cmz2.b() + n8);
            n4 = 1 - n5 / 2;
            for (int i3 = cmz2.a() - n4; i3 <= cmz2.a() + n4; ++i3) {
                n3 = i3 - cmz2.a();
                for (n2 = cmz2.c() - n4; n2 <= cmz2.c() + n4; ++n2) {
                    int n9 = n2 - cmz2.c();
                    if (Math.abs(n3) == n4 && Math.abs(n9) == n4 && (random.nextInt(2) == 0 || n5 == 0) || (object = iu2.n(cmz3 = new cmz(i3, n6, n2)).a()) != ahk.a && object != ahk.j && object != ahk.l) continue;
                    this.a(iu2, cmz3, this.f);
                }
            }
        }
        for (n6 = 0; n6 < n8; ++n6) {
            ahk ahk2 = iu2.n(cmz2.b(n6)).a();
            if (ahk2 != ahk.a && ahk2 != ahk.j && ahk2 != ahk.l) continue;
            this.a(iu2, cmz2.b(n6), this.e);
            if (!this.d || n6 <= 0) continue;
            if (random.nextInt(3) > 0 && iu2.c(cmz2.e(-1, n6, 0))) {
                this.a(iu2, cmz2.e(-1, n6, 0), ju.c);
            }
            if (random.nextInt(3) > 0 && iu2.c(cmz2.e(1, n6, 0))) {
                this.a(iu2, cmz2.e(1, n6, 0), ju.e);
            }
            if (random.nextInt(3) > 0 && iu2.c(cmz2.e(0, n6, -1))) {
                this.a(iu2, cmz2.e(0, n6, -1), ju.d);
            }
            if (random.nextInt(3) <= 0 || !iu2.c(cmz2.e(0, n6, 1))) continue;
            this.a(iu2, cmz2.e(0, n6, 1), ju.b);
        }
        if (this.d) {
            for (n6 = cmz2.b() - 3 + n8; n6 <= cmz2.b() + n8; ++n6) {
                int n10 = n6 - (cmz2.b() + n8);
                n4 = 2 - n10 / 2;
                pj pj3 = new pj();
                for (n3 = cmz2.a() - n4; n3 <= cmz2.a() + n4; ++n3) {
                    for (n2 = cmz2.c() - n4; n2 <= cmz2.c() + n4; ++n2) {
                        pj3.a(n3, n6, n2);
                        if (iu2.n(pj3).a() != ahk.j) continue;
                        cmz cmz4 = pj3.k();
                        cmz3 = pj3.l();
                        object = pj3.i();
                        cmz cmz5 = pj3.j();
                        if (random.nextInt(4) == 0 && iu2.n(cmz4).a() == ahk.a) {
                            this.b(iu2, cmz4, ju.c);
                        }
                        if (random.nextInt(4) == 0 && iu2.n(cmz3).a() == ahk.a) {
                            this.b(iu2, cmz3, ju.e);
                        }
                        if (random.nextInt(4) == 0 && iu2.n((cmz)object).a() == ahk.a) {
                            this.b(iu2, (cmz)object, ju.d);
                        }
                        if (random.nextInt(4) != 0 || iu2.n(cmz5).a() != ahk.a) continue;
                        this.b(iu2, cmz5, ju.b);
                    }
                }
            }
            if (random.nextInt(5) == 0 && n8 > 5) {
                for (n6 = 0; n6 < 2; ++n6) {
                    for (bqk bqk2 : afj.a) {
                        if (random.nextInt(4 - n6) != 0) continue;
                        bqk bqk3 = bqk2.e();
                        this.a(iu2, random.nextInt(3), cmz2.e(bqk3.h(), n8 - 5 + n6, bqk3.j()), bqk2);
                    }
                }
            }
        }
        return true;
    }

    private void a(iu iu2, int n2, cmz cmz2, bqk bqk2) {
        this.a(iu2, cmz2, blg.bN.s().a(cez.a, Integer.valueOf(n2)).a(cez.j, (Comparable)((Object)bqk2)));
    }

    private void a(iu iu2, cmz cmz2, ddi ddi2) {
        this.a(iu2, cmz2, blg.bn.s().a(ddi2, Boolean.valueOf(true)));
    }

    private void b(iu iu2, cmz cmz2, ddi ddi2) {
        this.a(iu2, cmz2, ddi2);
        cmz2 = cmz2.h();
        for (int i2 = 4; iu2.n(cmz2).a() == ahk.a && i2 > 0; --i2) {
            this.a(iu2, cmz2, ddi2);
            cmz2 = cmz2.h();
        }
    }
}

