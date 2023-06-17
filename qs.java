/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.ov;
import java.util.List;

public class qs {
    private static final List a = ov.a();
    private static final List b = ov.a();
    private static final List c = ov.a();
    private static final cm d = new vx();

    public static boolean a(bhl bhl2) {
        return qs.b(bhl2) || qs.c(bhl2);
    }

    protected static boolean b(bhl bhl2) {
        int n2 = b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((boz)qs.b.get((int)i2)).b.a(bhl2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(bhl bhl2) {
        int n2 = a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((boz)qs.a.get((int)i2)).b.a(bhl2)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(bhl bhl2, bhl bhl3) {
        if (!d.a(bhl2)) {
            return false;
        }
        return qs.b(bhl2, bhl3) || qs.c(bhl2, bhl3);
    }

    protected static boolean b(bhl bhl2, bhl bhl3) {
        azg azg2 = bhl2.a();
        int n2 = b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            boz boz2 = (boz)b.get(i2);
            if (boz2.a != azg2 || !boz2.b.a(bhl3)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(bhl bhl2, bhl bhl3) {
        hy hy2 = anl.c(bhl2);
        int n2 = a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            boz boz2 = (boz)a.get(i2);
            if (boz2.a != hy2 || !boz2.b.a(bhl3)) continue;
            return true;
        }
        return false;
    }

    public static bhl d(bhl bhl2, bhl bhl3) {
        if (bhl3 != null) {
            boz boz2;
            int n2;
            hy hy2 = anl.c(bhl3);
            azg azg2 = bhl3.a();
            int n3 = b.size();
            for (n2 = 0; n2 < n3; ++n2) {
                boz2 = (boz)b.get(n2);
                if (boz2.a != azg2 || !boz2.b.a(bhl2)) continue;
                return anl.a(new bhl((azg)boz2.c), hy2);
            }
            n3 = a.size();
            for (n2 = 0; n2 < n3; ++n2) {
                boz2 = (boz)a.get(n2);
                if (boz2.a != hy2 || !boz2.b.a(bhl2)) continue;
                return anl.a(new bhl(azg2), (hy)boz2.c);
            }
        }
        return bhl3;
    }

    public static void a() {
        tj tj2 = new tj(hp.bF);
        tj tj3 = new tj(hp.cg);
        tj tj4 = new tj(hp.aE);
        tj tj5 = new tj(hp.bM);
        tj tj6 = new tj(hp.by);
        tj tj7 = new tj(hp.ba);
        tj tj8 = new tj(hp.bO);
        tj tj9 = new tj(hp.bf);
        tj tj10 = new tj(hp.bb, aty.d.a());
        tj tj11 = new tj(hp.bS);
        tj tj12 = new tj(hp.bL);
        tj tj13 = new tj(hp.bD);
        tj tj14 = new tj(hp.bN);
        qs.a(new tj(hp.bG));
        qs.a(new tj(hp.bH));
        qs.a(new tj(hp.bI));
        qs.a(hp.bG, new tj(hp.J), hp.bH);
        qs.a(hp.bH, new tj(hp.bK), hp.bI);
        qs.a(im.b, (cm)tj11, im.c);
        qs.a(im.b, (cm)tj13, im.c);
        qs.a(im.b, (cm)tj6, im.c);
        qs.a(im.b, (cm)tj14, im.c);
        qs.a(im.b, (cm)tj12, im.c);
        qs.a(im.b, (cm)tj9, im.c);
        qs.a(im.b, (cm)tj8, im.c);
        qs.a(im.b, (cm)tj7, im.d);
        qs.a(im.b, (cm)tj4, im.c);
        qs.a(im.b, (cm)tj2, im.e);
        qs.a(im.e, (cm)tj3, im.f);
        qs.a(im.f, (cm)tj4, im.g);
        qs.a(im.f, (cm)tj5, im.h);
        qs.a(im.g, (cm)tj5, im.i);
        qs.a(im.h, (cm)tj4, im.i);
        qs.a(im.e, (cm)tj8, im.m);
        qs.a(im.m, (cm)tj4, im.n);
        qs.a(im.e, (cm)tj6, im.j);
        qs.a(im.j, (cm)tj4, im.k);
        qs.a(im.j, (cm)tj7, im.l);
        qs.a(im.j, (cm)tj5, im.r);
        qs.a(im.k, (cm)tj5, im.s);
        qs.a(im.r, (cm)tj4, im.s);
        qs.a(im.o, (cm)tj5, im.r);
        qs.a(im.p, (cm)tj5, im.s);
        qs.a(im.e, (cm)tj9, im.o);
        qs.a(im.o, (cm)tj4, im.p);
        qs.a(im.o, (cm)tj7, im.q);
        qs.a(im.e, (cm)tj10, im.t);
        qs.a(im.t, (cm)tj4, im.u);
        qs.a(im.e, (cm)tj11, im.v);
        qs.a(im.v, (cm)tj7, im.w);
        qs.a(im.v, (cm)tj5, im.x);
        qs.a(im.w, (cm)tj5, im.y);
        qs.a(im.x, (cm)tj7, im.y);
        qs.a(im.z, (cm)tj5, im.x);
        qs.a(im.A, (cm)tj5, im.x);
        qs.a(im.B, (cm)tj5, im.y);
        qs.a(im.e, (cm)tj12, im.z);
        qs.a(im.z, (cm)tj4, im.A);
        qs.a(im.z, (cm)tj7, im.B);
        qs.a(im.e, (cm)tj13, im.C);
        qs.a(im.C, (cm)tj4, im.D);
        qs.a(im.C, (cm)tj7, im.E);
        qs.a(im.e, (cm)tj14, im.F);
        qs.a(im.F, (cm)tj4, im.G);
        qs.a(im.F, (cm)tj7, im.H);
        qs.a(im.b, (cm)tj5, im.I);
        qs.a(im.I, (cm)tj4, im.J);
    }

    private static void a(abb abb2, tj tj2, abb abb3) {
        b.add(new boz(abb2, tj2, abb3));
    }

    private static void a(tj tj2) {
        c.add(tj2);
    }

    private static void a(hy hy2, cm cm2, hy hy3) {
        a.add(new boz(hy2, cm2, hy3));
    }

    static /* synthetic */ List b() {
        return c;
    }
}

