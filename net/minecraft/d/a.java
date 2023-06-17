/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.b.cm;
import com.a.a.d.ov;
import java.util.List;
import net.minecraft.a.o;
import net.minecraft.a.w;
import net.minecraft.d.b;
import net.minecraft.d.d;
import net.minecraft.d.f;
import net.minecraft.d.g;
import net.minecraft.d.m;
import net.minecraft.m.ae;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dg;

public class a {
    private static final List a = ov.a();
    private static final List b = ov.a();
    private static final List c = ov.a();
    private static final cm d = new d();

    public static boolean a(cu cu2) {
        return net.minecraft.d.a.b(cu2) || net.minecraft.d.a.c(cu2);
    }

    protected static boolean b(cu cu2) {
        int n2 = b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((f)net.minecraft.d.a.b.get((int)i2)).b.a(cu2)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(cu cu2) {
        int n2 = a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!((f)net.minecraft.d.a.a.get((int)i2)).b.a(cu2)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(cu cu2, cu cu3) {
        return !d.a(cu2) ? false : net.minecraft.d.a.b(cu2, cu3) || net.minecraft.d.a.c(cu2, cu3);
    }

    protected static boolean b(cu cu2, cu cu3) {
        cg cg2 = cu2.a();
        int n2 = b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            f f2 = (f)b.get(i2);
            if (f2.a != cg2 || !f2.b.a(cu3)) continue;
            return true;
        }
        return false;
    }

    protected static boolean c(cu cu2, cu cu3) {
        b b2 = m.c(cu2);
        int n2 = a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            f f2 = (f)a.get(i2);
            if (f2.a != b2 || !f2.b.a(cu3)) continue;
            return true;
        }
        return false;
    }

    public static cu d(cu cu2, cu cu3) {
        if (cu3 != null) {
            f f2;
            int n2;
            b b2 = m.c(cu3);
            cg cg2 = cu3.a();
            int n3 = b.size();
            for (n2 = 0; n2 < n3; ++n2) {
                f2 = (f)b.get(n2);
                if (f2.a != cg2 || !f2.b.a(cu2)) continue;
                return m.a(new cu((cg)f2.c), b2);
            }
            n3 = a.size();
            for (n2 = 0; n2 < n3; ++n2) {
                f2 = (f)a.get(n2);
                if (f2.a != b2 || !f2.b.a(cu2)) continue;
                return m.a(new cu(cg2), (b)f2.c);
            }
        }
        return cu3;
    }

    public static void a() {
        g g2 = new g(w.bF);
        g g3 = new g(w.cg);
        g g4 = new g(w.aE);
        g g5 = new g(w.bM);
        g g6 = new g(w.by);
        g g7 = new g(w.ba);
        g g8 = new g(w.bO);
        g g9 = new g(w.bf);
        g g10 = new g(w.bb, dg.d.a());
        g g11 = new g(w.bS);
        g g12 = new g(w.bL);
        g g13 = new g(w.bD);
        g g14 = new g(w.bN);
        net.minecraft.d.a.a(new g(w.bG));
        net.minecraft.d.a.a(new g(w.bH));
        net.minecraft.d.a.a(new g(w.bI));
        net.minecraft.d.a.a(w.bG, new g(w.J), w.bH);
        net.minecraft.d.a.a(w.bH, new g(w.bK), w.bI);
        net.minecraft.d.a.a(o.b, (cm)g11, o.c);
        net.minecraft.d.a.a(o.b, (cm)g13, o.c);
        net.minecraft.d.a.a(o.b, (cm)g6, o.c);
        net.minecraft.d.a.a(o.b, (cm)g14, o.c);
        net.minecraft.d.a.a(o.b, (cm)g12, o.c);
        net.minecraft.d.a.a(o.b, (cm)g9, o.c);
        net.minecraft.d.a.a(o.b, (cm)g8, o.c);
        net.minecraft.d.a.a(o.b, (cm)g7, o.d);
        net.minecraft.d.a.a(o.b, (cm)g4, o.c);
        net.minecraft.d.a.a(o.b, (cm)g2, o.e);
        net.minecraft.d.a.a(o.e, (cm)g3, o.f);
        net.minecraft.d.a.a(o.f, (cm)g4, o.g);
        net.minecraft.d.a.a(o.f, (cm)g5, o.h);
        net.minecraft.d.a.a(o.g, (cm)g5, o.i);
        net.minecraft.d.a.a(o.h, (cm)g4, o.i);
        net.minecraft.d.a.a(o.e, (cm)g8, o.m);
        net.minecraft.d.a.a(o.m, (cm)g4, o.n);
        net.minecraft.d.a.a(o.e, (cm)g6, o.j);
        net.minecraft.d.a.a(o.j, (cm)g4, o.k);
        net.minecraft.d.a.a(o.j, (cm)g7, o.l);
        net.minecraft.d.a.a(o.j, (cm)g5, o.r);
        net.minecraft.d.a.a(o.k, (cm)g5, o.s);
        net.minecraft.d.a.a(o.r, (cm)g4, o.s);
        net.minecraft.d.a.a(o.o, (cm)g5, o.r);
        net.minecraft.d.a.a(o.p, (cm)g5, o.s);
        net.minecraft.d.a.a(o.e, (cm)g9, o.o);
        net.minecraft.d.a.a(o.o, (cm)g4, o.p);
        net.minecraft.d.a.a(o.o, (cm)g7, o.q);
        net.minecraft.d.a.a(o.e, (cm)g10, o.t);
        net.minecraft.d.a.a(o.t, (cm)g4, o.u);
        net.minecraft.d.a.a(o.e, (cm)g11, o.v);
        net.minecraft.d.a.a(o.v, (cm)g7, o.w);
        net.minecraft.d.a.a(o.v, (cm)g5, o.x);
        net.minecraft.d.a.a(o.w, (cm)g5, o.y);
        net.minecraft.d.a.a(o.x, (cm)g7, o.y);
        net.minecraft.d.a.a(o.z, (cm)g5, o.x);
        net.minecraft.d.a.a(o.A, (cm)g5, o.x);
        net.minecraft.d.a.a(o.B, (cm)g5, o.y);
        net.minecraft.d.a.a(o.e, (cm)g12, o.z);
        net.minecraft.d.a.a(o.z, (cm)g4, o.A);
        net.minecraft.d.a.a(o.z, (cm)g7, o.B);
        net.minecraft.d.a.a(o.e, (cm)g13, o.C);
        net.minecraft.d.a.a(o.C, (cm)g4, o.D);
        net.minecraft.d.a.a(o.C, (cm)g7, o.E);
        net.minecraft.d.a.a(o.e, (cm)g14, o.F);
        net.minecraft.d.a.a(o.F, (cm)g4, o.G);
        net.minecraft.d.a.a(o.F, (cm)g7, o.H);
        net.minecraft.d.a.a(o.b, (cm)g5, o.I);
        net.minecraft.d.a.a(o.I, (cm)g4, o.J);
    }

    private static void a(ae ae2, g g2, ae ae3) {
        b.add(new f(ae2, g2, ae3));
    }

    private static void a(g g2) {
        c.add(g2);
    }

    private static void a(b b2, cm cm2, b b3) {
        a.add(new f(b2, cm2, b3));
    }

    static /* synthetic */ List b() {
        return c;
    }
}

