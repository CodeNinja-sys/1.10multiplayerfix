/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

abstract class bis
extends pc {
    public bis() {
    }

    protected bis(int n2) {
        super(n2);
    }

    @Override
    protected void b(bvp bvp2) {
    }

    @Override
    protected void a(bvp bvp2) {
    }

    private int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (byt byt2 : list) {
            if (byt2.d > 0 && byt2.c < byt2.d) {
                bl2 = true;
            }
            n2 += byt2.b;
        }
        return bl2 ? n2 : -1;
    }

    private bis a(ud ud2, List list, List list2, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        int n6 = this.a(list);
        boolean bl2 = n6 > 0 && n5 <= 30;
        int n7 = 0;
        block0: while (n7 < 5 && bl2) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (byt byt2 : list) {
                if ((n8 -= byt2.b) >= 0) continue;
                if (!byt2.a(n5) || byt2 == ud2.a && !byt2.e) continue block0;
                bis bis2 = buh.a(byt2, list2, random, n2, n3, n4, bqk2, n5);
                if (bis2 == null) continue;
                ++byt2.c;
                ud2.a = byt2;
                if (!byt2.a()) {
                    list.remove(byt2);
                }
                return bis2;
            }
        }
        return bhv.a(list2, random, n2, n3, n4, bqk2, n5);
    }

    private pc a(ud ud2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5, boolean bl2) {
        bis bis2;
        if (Math.abs(n2 - ud2.b().a) > 112 || Math.abs(n4 - ud2.b().c) > 112) {
            return bhv.a(list, random, n2, n3, n4, bqk2, n5);
        }
        List list2 = ud2.b;
        if (bl2) {
            list2 = ud2.c;
        }
        if ((bis2 = this.a(ud2, list2, list, random, n2, n3, n4, bqk2, n5 + 1)) != null) {
            list.add(bis2);
            ud2.d.add(bis2);
        }
        return bis2;
    }

    protected pc a(ud ud2, List list, Random random, int n2, int n3, boolean bl2) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return this.a(ud2, list, random, this.l.a + n2, this.l.b + n3, this.l.c - 1, bqk2, this.c(), bl2);
                }
                case d: {
                    return this.a(ud2, list, random, this.l.a + n2, this.l.b + n3, this.l.f + 1, bqk2, this.c(), bl2);
                }
                case e: {
                    return this.a(ud2, list, random, this.l.a - 1, this.l.b + n3, this.l.c + n2, bqk2, this.c(), bl2);
                }
                case f: {
                    return this.a(ud2, list, random, this.l.d + 1, this.l.b + n3, this.l.c + n2, bqk2, this.c(), bl2);
                }
            }
        }
        return null;
    }

    protected pc b(ud ud2, List list, Random random, int n2, int n3, boolean bl2) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return this.a(ud2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c(), bl2);
                }
                case d: {
                    return this.a(ud2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c(), bl2);
                }
                case e: {
                    return this.a(ud2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c(), bl2);
                }
                case f: {
                    return this.a(ud2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c(), bl2);
                }
            }
        }
        return null;
    }

    protected pc c(ud ud2, List list, Random random, int n2, int n3, boolean bl2) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return this.a(ud2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c(), bl2);
                }
                case d: {
                    return this.a(ud2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c(), bl2);
                }
                case e: {
                    return this.a(ud2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c(), bl2);
                }
                case f: {
                    return this.a(ud2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c(), bl2);
                }
            }
        }
        return null;
    }

    protected static boolean a(awx awx2) {
        return awx2 != null && awx2.b > 10;
    }
}

