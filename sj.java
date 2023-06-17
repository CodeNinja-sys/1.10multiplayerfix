/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class sj {
    private static final d a = c.c();
    private static sj b;

    public static void a() {
        b = new sj();
    }

    public static sj b() {
        return b;
    }

    private sj() {
    }

    public void a(afl afl2) {
        afl2.f().b(afl2);
        afl2.e().b(afl2);
        cjg.e(afl2.g());
    }

    public int c() {
        int n2 = cjg.d();
        if (n2 <= 0) {
            throw new csy("Could not create shader program (returned program ID " + n2 + ")");
        }
        return n2;
    }

    public void b(afl afl2) {
        afl2.f().a(afl2);
        afl2.e().a(afl2);
        cjg.f(afl2.g());
        int n2 = cjg.a(afl2.g(), cjg.m);
        if (n2 == 0) {
            a.f("Error encountered when linking program containing VS {} and FS {}. Log output:", afl2.e().a(), afl2.f().a());
            a.f(cjg.e(afl2.g(), 32768));
        }
    }
}

