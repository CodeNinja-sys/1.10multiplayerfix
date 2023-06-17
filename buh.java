/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class buh {
    private static final byt[] a = new byt[]{new byt(bam.class, 30, 0, true), new byt(apt.class, 10, 4), new byt(aof.class, 10, 4), new byt(ayt.class, 10, 3), new byt(bfs.class, 5, 2), new byt(ra.class, 5, 1)};
    private static final byt[] b = new byt[]{new byt(dfz.class, 25, 0, true), new byt(cdm.class, 15, 5), new byt(bik.class, 5, 10), new byt(asv.class, 5, 10), new byt(cjs.class, 10, 3, true), new byt(xf.class, 7, 2), new byt(bxf.class, 5, 2)};

    public static void a() {
        mb.a(apt.class, "NeBCr");
        mb.a(bhv.class, "NeBEF");
        mb.a(bam.class, "NeBS");
        mb.a(cjs.class, "NeCCS");
        mb.a(xf.class, "NeCTB");
        mb.a(ra.class, "NeCE");
        mb.a(cdm.class, "NeSCSC");
        mb.a(asv.class, "NeSCLT");
        mb.a(dfz.class, "NeSC");
        mb.a(bik.class, "NeSCRT");
        mb.a(bxf.class, "NeCSR");
        mb.a(bfs.class, "NeMT");
        mb.a(aof.class, "NeRC");
        mb.a(ayt.class, "NeSR");
        mb.a(ud.class, "NeStart");
    }

    private static bis b(byt byt2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        Class class_ = byt2.a;
        bis bis2 = null;
        if (class_ == bam.class) {
            bis2 = bam.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == apt.class) {
            bis2 = apt.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == aof.class) {
            bis2 = aof.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == ayt.class) {
            bis2 = ayt.a(list, random, n2, n3, n4, n5, bqk2);
        } else if (class_ == bfs.class) {
            bis2 = bfs.a(list, random, n2, n3, n4, n5, bqk2);
        } else if (class_ == ra.class) {
            bis2 = ra.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == dfz.class) {
            bis2 = dfz.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bik.class) {
            bis2 = bik.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == asv.class) {
            bis2 = asv.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == cjs.class) {
            bis2 = cjs.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == xf.class) {
            bis2 = xf.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == cdm.class) {
            bis2 = cdm.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bxf.class) {
            bis2 = bxf.a(list, random, n2, n3, n4, bqk2, n5);
        }
        return bis2;
    }

    static /* synthetic */ bis a(byt byt2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        return buh.b(byt2, list, random, n2, n3, n4, bqk2, n5);
    }

    static /* synthetic */ byt[] b() {
        return a;
    }

    static /* synthetic */ byt[] c() {
        return b;
    }
}

