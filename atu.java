/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class atu
extends cjv {
    public atu() {
    }

    public atu(int n2, Random random, awx awx2, bqk bqk2, cfn cfn2) {
        super(n2, cfn2);
        this.a(bqk2);
        this.l = awx2;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
    }

    public static awx a(List list, Random random, int n2, int n3, int n4, bqk bqk2) {
        awx awx2 = new awx(n2, n3 - 5, n4, n2, n3 + 2, n4);
        switch (bqk2) {
            default: {
                awx2.d = n2 + 2;
                awx2.c = n4 - 8;
                break;
            }
            case d: {
                awx2.d = n2 + 2;
                awx2.f = n4 + 8;
                break;
            }
            case e: {
                awx2.a = n2 - 8;
                awx2.f = n4 + 2;
                break;
            }
            case f: {
                awx2.d = n2 + 8;
                awx2.f = n4 + 2;
            }
        }
        if (pc.a(list, awx2) != null) {
            return null;
        }
        return awx2;
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        int n2 = this.c();
        bqk bqk2 = this.e();
        if (bqk2 != null) {
            switch (bqk2) {
                default: {
                    awc.a(pc2, list, random, this.l.a, this.l.b, this.l.c - 1, bqk.c, n2);
                    break;
                }
                case d: {
                    awc.a(pc2, list, random, this.l.a, this.l.b, this.l.f + 1, bqk.d, n2);
                    break;
                }
                case e: {
                    awc.a(pc2, list, random, this.l.a - 1, this.l.b, this.l.c, bqk.e, n2);
                    break;
                }
                case f: {
                    awc.a(pc2, list, random, this.l.d + 1, this.l.b, this.l.c, bqk.f, n2);
                }
            }
        }
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, 0, 5, 0, 2, 7, 1, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 0, 0, 7, 2, 2, 8, blg.a.s(), blg.a.s(), false);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a(iu2, awx2, 0, 5 - i2 - (i2 < 4 ? 1 : 0), 2 + i2, 2, 7 - i2, 2 + i2, blg.a.s(), blg.a.s(), false);
        }
        return true;
    }
}

