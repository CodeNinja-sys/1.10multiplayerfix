/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ccv {
    public static void a() {
        mb.a(sw.class, "ViBH");
        mb.a(cyo.class, "ViDF");
        mb.a(ale.class, "ViF");
        mb.a(xk.class, "ViL");
        mb.a(cts.class, "ViPH");
        mb.a(jr.class, "ViSH");
        mb.a(bji.class, "ViSmH");
        mb.a(bfb.class, "ViST");
        mb.a(ccq.class, "ViS");
        mb.a(yj.class, "ViStart");
        mb.a(xu.class, "ViSR");
        mb.a(qr.class, "ViTRH");
        mb.a(dgn.class, "ViW");
    }

    public static List a(Random random, int n2) {
        ArrayList arrayList = ov.a();
        arrayList.add(new del(jr.class, 4, cmk.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new del(bfb.class, 20, cmk.a(random, 0 + n2, 1 + n2)));
        arrayList.add(new del(sw.class, 20, cmk.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new del(bji.class, 3, cmk.a(random, 2 + n2, 5 + n2 * 3)));
        arrayList.add(new del(cts.class, 15, cmk.a(random, 0 + n2, 2 + n2)));
        arrayList.add(new del(cyo.class, 3, cmk.a(random, 1 + n2, 4 + n2)));
        arrayList.add(new del(ale.class, 3, cmk.a(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new del(ccq.class, 15, cmk.a(random, 0, 1 + n2)));
        arrayList.add(new del(qr.class, 8, cmk.a(random, 0 + n2, 3 + n2 * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((del)iterator.next()).d != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (del del2 : list) {
            if (del2.d > 0 && del2.c < del2.d) {
                bl2 = true;
            }
            n2 += del2.b;
        }
        return bl2 ? n2 : -1;
    }

    private static ced a(yj yj2, del del2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        Class class_ = del2.a;
        ced ced2 = null;
        if (class_ == jr.class) {
            ced2 = jr.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bfb.class) {
            ced2 = bfb.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == sw.class) {
            ced2 = sw.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bji.class) {
            ced2 = bji.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == cts.class) {
            ced2 = cts.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == cyo.class) {
            ced2 = cyo.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == ale.class) {
            ced2 = ale.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == ccq.class) {
            ced2 = ccq.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == qr.class) {
            ced2 = qr.a(yj2, list, random, n2, n3, n4, bqk2, n5);
        }
        return ced2;
    }

    private static ced c(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        int n6 = ccv.a(yj2.d);
        if (n6 <= 0) {
            return null;
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (del del2 : yj2.d) {
                if ((n8 -= del2.b) >= 0) continue;
                if (!del2.a(n5) || del2 == yj2.c && yj2.d.size() > 1) continue block0;
                ced ced2 = ccv.a(yj2, del2, list, random, n2, n3, n4, bqk2, n5);
                if (ced2 == null) continue;
                ++del2.c;
                yj2.c = del2;
                if (!del2.a()) {
                    yj2.d.remove(del2);
                }
                return ced2;
            }
        }
        awx awx2 = xk.a(yj2, list, random, n2, n3, n4, bqk2);
        if (awx2 != null) {
            return new xk(yj2, n5, random, awx2, bqk2);
        }
        return null;
    }

    private static pc d(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - yj2.b().a) > 112 || Math.abs(n4 - yj2.b().c) > 112) {
            return null;
        }
        ced ced2 = ccv.c(yj2, list, random, n2, n3, n4, bqk2, n5 + 1);
        if (ced2 != null) {
            list.add(ced2);
            yj2.e.add(ced2);
            return ced2;
        }
        return null;
    }

    private static pc e(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        if (n5 > 3 + yj2.b) {
            return null;
        }
        if (Math.abs(n2 - yj2.b().a) > 112 || Math.abs(n4 - yj2.b().c) > 112) {
            return null;
        }
        awx awx2 = xu.a(yj2, list, random, n2, n3, n4, bqk2);
        if (awx2 != null && awx2.b > 10) {
            xu xu2 = new xu(yj2, n5, random, awx2, bqk2);
            list.add(xu2);
            yj2.f.add(xu2);
            return xu2;
        }
        return null;
    }

    static /* synthetic */ pc a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        return ccv.d(yj2, list, random, n2, n3, n4, bqk2, n5);
    }

    static /* synthetic */ pc b(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        return ccv.e(yj2, list, random, n2, n3, n4, bqk2, n5);
    }
}

