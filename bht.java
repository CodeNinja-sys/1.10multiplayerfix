/*
 * Decompiled with CFR 0.150.
 */
import java.io.PrintStream;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bht {
    public static final PrintStream a = System.out;
    private static boolean b;
    private static final d c;

    public static boolean a() {
        return b;
    }

    static void b() {
        crh.c.a(hp.g, new or());
        crh.c.a(hp.i, new bli());
        crh.c.a(hp.h, new buq());
        crh.c.a(hp.aW, new aqs());
        crh.c.a(hp.aF, new akd());
        crh.c.a(hp.bU, new rb());
        crh.c.a(hp.bH, new den());
        crh.c.a(hp.bI, new csp());
        crh.c.a(hp.bT, new pp());
        crh.c.a(hp.cl, new bvw());
        crh.c.a(hp.bV, new bvx());
        crh.c.a(hp.aG, new el(cns.a));
        crh.c.a(hp.aH, new el(cns.b));
        crh.c.a(hp.aI, new el(cns.c));
        crh.c.a(hp.aJ, new el(cns.d));
        crh.c.a(hp.aL, new el(cns.f));
        crh.c.a(hp.aK, new el(cns.e));
        chz chz2 = new chz();
        crh.c.a(hp.aA, chz2);
        crh.c.a(hp.az, chz2);
        crh.c.a(hp.ay, new akk());
        crh.c.a(hp.d, new byg());
        crh.c.a(hp.bd, new aqm());
        crh.c.a(azg.a(blg.W), new ddu());
        crh.c.a(hp.ch, new afs());
        crh.c.a(azg.a(blg.aU), new coe());
    }

    public static void c() {
        if (b) {
            return;
        }
        b = true;
        if (c.e()) {
            bht.d();
        }
        bi.b();
        bfa.u();
        art.h();
        bfv.j();
        dad.f();
        azg.s();
        hy.b();
        qs.a();
        bpv.a();
        anr.q();
        bht.b();
    }

    private static void d() {
        System.setErr(new axt("STDERR", System.err));
        System.setOut(new axt("STDOUT", a));
    }

    public static void a(String string) {
        a.println(string);
    }

    static {
        c = org.apache.logging.log4j.c.c();
    }
}

