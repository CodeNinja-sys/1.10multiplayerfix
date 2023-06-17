/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class awc {
    public static void a() {
        mb.a(bfq.class, "MSCorridor");
        mb.a(akh.class, "MSCrossing");
        mb.a(cdo.class, "MSRoom");
        mb.a(atu.class, "MSStairs");
    }

    private static cjv a(List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5, cfn cfn2) {
        int n6 = random.nextInt(100);
        if (n6 >= 80) {
            awx awx2 = akh.a(list, random, n2, n3, n4, bqk2);
            if (awx2 != null) {
                return new akh(n5, random, awx2, bqk2, cfn2);
            }
        } else if (n6 >= 70) {
            awx awx3 = atu.a(list, random, n2, n3, n4, bqk2);
            if (awx3 != null) {
                return new atu(n5, random, awx3, bqk2, cfn2);
            }
        } else {
            awx awx4 = bfq.a(list, random, n2, n3, n4, bqk2);
            if (awx4 != null) {
                return new bfq(n5, random, awx4, bqk2, cfn2);
            }
        }
        return null;
    }

    private static cjv b(pc pc2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        if (n5 > 8) {
            return null;
        }
        if (Math.abs(n2 - pc2.b().a) > 80 || Math.abs(n4 - pc2.b().c) > 80) {
            return null;
        }
        cfn cfn2 = ((cjv)pc2).a;
        cjv cjv2 = awc.a(list, random, n2, n3, n4, bqk2, n5 + 1, cfn2);
        if (cjv2 != null) {
            list.add(cjv2);
            cjv2.a(pc2, list, random);
        }
        return cjv2;
    }

    static /* synthetic */ cjv a(pc pc2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        return awc.b(pc2, list, random, n2, n3, n4, bqk2, n5);
    }
}

