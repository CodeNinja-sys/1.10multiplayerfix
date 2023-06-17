/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

abstract class aue
extends pc {
    protected bui d = bui.a;

    public aue() {
    }

    protected aue(int n2) {
        super(n2);
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("EntryDoor", this.d.name());
    }

    @Override
    protected void b(bvp bvp2) {
        this.d = bui.valueOf(bvp2.l("EntryDoor"));
    }

    protected void a(iu iu2, Random random, awx awx2, bui bui2, int n2, int n3, int n4) {
        switch (bui2) {
            case a: {
                this.a(iu2, awx2, n2, n3, n4, n2 + 3 - 1, n3 + 3 - 1, n4, blg.a.s(), blg.a.s(), false);
                break;
            }
            case b: {
                this.a(iu2, blg.bf.s(), n2, n3, n4, awx2);
                this.a(iu2, blg.bf.s(), n2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bf.s(), n2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 1, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3, n4, awx2);
                this.a(iu2, blg.ao.s(), n2 + 1, n3, n4, awx2);
                this.a(iu2, blg.ao.s().a(xt.e, (Comparable)((Object)em.a)), n2 + 1, n3 + 1, n4, awx2);
                break;
            }
            case c: {
                this.a(iu2, blg.a.s(), n2 + 1, n3, n4, awx2);
                this.a(iu2, blg.a.s(), n2 + 1, n3 + 1, n4, awx2);
                this.a(iu2, blg.bi.s(), n2, n3, n4, awx2);
                this.a(iu2, blg.bi.s(), n2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bi.s(), n2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bi.s(), n2 + 1, n3 + 2, n4, awx2);
                this.a(iu2, blg.bi.s(), n2 + 2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bi.s(), n2 + 2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bi.s(), n2 + 2, n3, n4, awx2);
                break;
            }
            case d: {
                this.a(iu2, blg.bf.s(), n2, n3, n4, awx2);
                this.a(iu2, blg.bf.s(), n2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bf.s(), n2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 1, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3 + 2, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3 + 1, n4, awx2);
                this.a(iu2, blg.bf.s(), n2 + 2, n3, n4, awx2);
                this.a(iu2, blg.aA.s(), n2 + 1, n3, n4, awx2);
                this.a(iu2, blg.aA.s().a(xt.e, (Comparable)((Object)em.a)), n2 + 1, n3 + 1, n4, awx2);
                this.a(iu2, blg.aG.s().a(rz.o, (Comparable)((Object)bqk.c)), n2 + 2, n3 + 1, n4 + 1, awx2);
                this.a(iu2, blg.aG.s().a(rz.o, (Comparable)((Object)bqk.d)), n2 + 2, n3 + 1, n4 - 1, awx2);
            }
        }
    }

    protected bui a(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return bui.a;
            }
            case 2: {
                return bui.b;
            }
            case 3: {
                return bui.c;
            }
            case 4: 
        }
        return bui.d;
    }

    protected pc a(afk afk2, List list, Random random, int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return bbj.a(afk2, list, random, this.l.a + n2, this.l.b + n3, this.l.c - 1, bqk2, this.c());
                }
                case d: {
                    return bbj.a(afk2, list, random, this.l.a + n2, this.l.b + n3, this.l.f + 1, bqk2, this.c());
                }
                case e: {
                    return bbj.a(afk2, list, random, this.l.a - 1, this.l.b + n3, this.l.c + n2, bqk2, this.c());
                }
                case f: {
                    return bbj.a(afk2, list, random, this.l.d + 1, this.l.b + n3, this.l.c + n2, bqk2, this.c());
                }
            }
        }
        return null;
    }

    protected pc b(afk afk2, List list, Random random, int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return bbj.a(afk2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c());
                }
                case d: {
                    return bbj.a(afk2, list, random, this.l.a - 1, this.l.b + n2, this.l.c + n3, bqk.e, this.c());
                }
                case e: {
                    return bbj.a(afk2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c());
                }
                case f: {
                    return bbj.a(afk2, list, random, this.l.a + n3, this.l.b + n2, this.l.c - 1, bqk.c, this.c());
                }
            }
        }
        return null;
    }

    protected pc c(afk afk2, List list, Random random, int n2, int n3) {
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                case c: {
                    return bbj.a(afk2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c());
                }
                case d: {
                    return bbj.a(afk2, list, random, this.l.d + 1, this.l.b + n2, this.l.c + n3, bqk.f, this.c());
                }
                case e: {
                    return bbj.a(afk2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c());
                }
                case f: {
                    return bbj.a(afk2, list, random, this.l.a + n3, this.l.b + n2, this.l.f + 1, bqk.d, this.c());
                }
            }
        }
        return null;
    }

    protected static boolean a(awx awx2) {
        return awx2 != null && awx2.b > 10;
    }
}

