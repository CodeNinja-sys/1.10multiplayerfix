/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class ajg
extends aue {
    protected int a;

    public ajg() {
    }

    public ajg(int n2, Random random, awx awx2, bqk bqk2) {
        super(n2);
        this.a(bqk2);
        this.d = this.a(random);
        this.l = awx2;
        this.a = random.nextInt(5);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Type", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.h("Type");
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        this.a((afk)pc2, list, random, 4, 1);
        this.b((afk)pc2, list, random, 1, 4);
        this.c((afk)pc2, list, random, 1, 4);
    }

    public static ajg a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, -4, -1, 0, 11, 7, 11, bqk2);
        if (!ajg.a(awx2) || pc.a(list, awx2) != null) {
            return null;
        }
        return new ajg(n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 0, 0, 10, 6, 10, true, random, bbj.c());
        this.a(iu2, random, awx2, this.d, 4, 1, 0);
        this.a(iu2, awx2, 4, 1, 10, 6, 3, 10, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 1, 4, 0, 3, 6, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 10, 1, 4, 10, 3, 6, blg.a.s(), blg.a.s(), false);
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                this.a(iu2, blg.bf.s(), 5, 1, 5, awx2);
                this.a(iu2, blg.bf.s(), 5, 2, 5, awx2);
                this.a(iu2, blg.bf.s(), 5, 3, 5, awx2);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.e)), 4, 3, 5, awx2);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.f)), 6, 3, 5, awx2);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.d)), 5, 3, 4, awx2);
                this.a(iu2, blg.aa.s().a(vl.a, (Comparable)((Object)bqk.c)), 5, 3, 6, awx2);
                this.a(iu2, blg.U.s(), 4, 1, 4, awx2);
                this.a(iu2, blg.U.s(), 4, 1, 5, awx2);
                this.a(iu2, blg.U.s(), 4, 1, 6, awx2);
                this.a(iu2, blg.U.s(), 6, 1, 4, awx2);
                this.a(iu2, blg.U.s(), 6, 1, 5, awx2);
                this.a(iu2, blg.U.s(), 6, 1, 6, awx2);
                this.a(iu2, blg.U.s(), 5, 1, 4, awx2);
                this.a(iu2, blg.U.s(), 5, 1, 6, awx2);
                break;
            }
            case 1: {
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.a(iu2, blg.bf.s(), 3, 1, 3 + i2, awx2);
                    this.a(iu2, blg.bf.s(), 7, 1, 3 + i2, awx2);
                    this.a(iu2, blg.bf.s(), 3 + i2, 1, 3, awx2);
                    this.a(iu2, blg.bf.s(), 3 + i2, 1, 7, awx2);
                }
                this.a(iu2, blg.bf.s(), 5, 1, 5, awx2);
                this.a(iu2, blg.bf.s(), 5, 2, 5, awx2);
                this.a(iu2, blg.bf.s(), 5, 3, 5, awx2);
                this.a(iu2, blg.i.s(), 5, 4, 5, awx2);
                break;
            }
            case 2: {
                int n2;
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(iu2, blg.e.s(), 1, 3, n2, awx2);
                    this.a(iu2, blg.e.s(), 9, 3, n2, awx2);
                }
                for (n2 = 1; n2 <= 9; ++n2) {
                    this.a(iu2, blg.e.s(), n2, 3, 1, awx2);
                    this.a(iu2, blg.e.s(), n2, 3, 9, awx2);
                }
                this.a(iu2, blg.e.s(), 5, 1, 4, awx2);
                this.a(iu2, blg.e.s(), 5, 1, 6, awx2);
                this.a(iu2, blg.e.s(), 5, 3, 4, awx2);
                this.a(iu2, blg.e.s(), 5, 3, 6, awx2);
                this.a(iu2, blg.e.s(), 4, 1, 5, awx2);
                this.a(iu2, blg.e.s(), 6, 1, 5, awx2);
                this.a(iu2, blg.e.s(), 4, 3, 5, awx2);
                this.a(iu2, blg.e.s(), 6, 3, 5, awx2);
                for (n2 = 1; n2 <= 3; ++n2) {
                    this.a(iu2, blg.e.s(), 4, n2, 4, awx2);
                    this.a(iu2, blg.e.s(), 6, n2, 4, awx2);
                    this.a(iu2, blg.e.s(), 4, n2, 6, awx2);
                    this.a(iu2, blg.e.s(), 6, n2, 6, awx2);
                }
                this.a(iu2, blg.aa.s(), 5, 3, 5, awx2);
                for (n2 = 2; n2 <= 8; ++n2) {
                    this.a(iu2, blg.f.s(), 2, 3, n2, awx2);
                    this.a(iu2, blg.f.s(), 3, 3, n2, awx2);
                    if (n2 <= 3 || n2 >= 7) {
                        this.a(iu2, blg.f.s(), 4, 3, n2, awx2);
                        this.a(iu2, blg.f.s(), 5, 3, n2, awx2);
                        this.a(iu2, blg.f.s(), 6, 3, n2, awx2);
                    }
                    this.a(iu2, blg.f.s(), 7, 3, n2, awx2);
                    this.a(iu2, blg.f.s(), 8, 3, n2, awx2);
                }
                dbk dbk2 = blg.au.s().a(def.a, (Comparable)((Object)bqk.e));
                this.a(iu2, dbk2, 9, 1, 3, awx2);
                this.a(iu2, dbk2, 9, 2, 3, awx2);
                this.a(iu2, dbk2, 9, 3, 3, awx2);
                this.a(iu2, awx2, random, 3, 4, 8, bvm.i);
            }
        }
        return true;
    }
}

