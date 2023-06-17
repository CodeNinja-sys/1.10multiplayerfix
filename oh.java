/*
 * Decompiled with CFR 0.150.
 */
public abstract class oh {
    private long c;
    protected oh a;
    private long d;
    protected long b;

    public static oh[] a(long l2, aaf aaf2, String string) {
        int n2;
        oh oh2 = new ahb(1L);
        oh2 = new bqb(2000L, oh2);
        oh2 = new cqm(1L, oh2);
        oh2 = new dbp(2001L, oh2);
        oh2 = new cqm(2L, oh2);
        oh2 = new cqm(50L, oh2);
        oh2 = new cqm(70L, oh2);
        oh2 = new brn(2L, oh2);
        oh2 = new xw(2L, oh2);
        oh2 = new cqm(3L, oh2);
        oh2 = new cuk(2L, oh2, atn.a);
        oh2 = new cuk(2L, oh2, atn.b);
        oh2 = new cuk(3L, oh2, atn.c);
        oh2 = new dbp(2002L, oh2);
        oh2 = new dbp(2003L, oh2);
        oh2 = new cqm(4L, oh2);
        oh2 = new bft(5L, oh2);
        oh2 = new beb(4L, oh2);
        oh2 = dbp.a(1000L, oh2, 0);
        int n3 = n2 = 4;
        if (aaf2 == aaf.f && !string.isEmpty()) {
            dw dw2 = bqr.a(string).b();
            n2 = dw2.G;
            n3 = dw2.H;
        }
        if (aaf2 == aaf.d) {
            n2 = 6;
        }
        oh oh3 = oh2;
        oh3 = dbp.a(1000L, oh3, 0);
        oh3 = new amp(100L, oh3);
        oh oh4 = oh2;
        oh4 = new cqh(200L, oh4, aaf2, string);
        oh4 = dbp.a(1000L, oh4, 2);
        oh4 = new axd(1000L, oh4);
        oh oh5 = oh3;
        oh5 = dbp.a(1000L, oh5, 2);
        oh4 = new crn(1000L, oh4, oh5);
        oh3 = dbp.a(1000L, oh3, 2);
        oh3 = dbp.a(1000L, oh3, n3);
        oh3 = new abt(1L, oh3);
        oh3 = new bhy(1000L, oh3);
        oh4 = new dd(1001L, oh4);
        for (int i2 = 0; i2 < n2; ++i2) {
            oh4 = new dbp(1000 + i2, oh4);
            if (i2 == 0) {
                oh4 = new cqm(3L, oh4);
            }
            if (i2 != 1 && n2 != 1) continue;
            oh4 = new blp(1000L, oh4);
        }
        oh4 = new bhy(1000L, oh4);
        oh4 = new bee(100L, oh4, oh3);
        oh oh6 = oh4;
        ccl ccl2 = new ccl(10L, oh4);
        oh4.a(l2);
        ccl2.a(l2);
        return new oh[]{oh4, ccl2, oh6};
    }

    public oh(long l2) {
        this.b = l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
    }

    public void a(long l2) {
        this.c = l2;
        if (this.a != null) {
            this.a.a(l2);
        }
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
    }

    public void a(long l2, long l3) {
        this.d = this.c;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
    }

    protected int a(int n2) {
        int n3 = (int)((this.d >> 24) % (long)n2);
        if (n3 < 0) {
            n3 += n2;
        }
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += this.c;
        return n3;
    }

    public abstract int[] a(int var1, int var2, int var3, int var4);

    protected static boolean a(int n2, int n3) {
        if (n2 == n3) {
            return true;
        }
        anr anr2 = anr.b(n2);
        anr anr3 = anr.b(n3);
        if (anr2 == null || anr3 == null) {
            return false;
        }
        if (anr2 == cff.N || anr2 == cff.O) {
            return anr3 == cff.N || anr3 == cff.O;
        }
        return anr2 == anr3 || anr2.g() == anr3.g();
    }

    protected static boolean b(int n2) {
        anr anr2 = anr.b(n2);
        return anr2 == cff.a || anr2 == cff.z || anr2 == cff.l;
    }

    protected int a(int ... arrn) {
        return arrn[this.a(arrn.length)];
    }

    protected int b(int n2, int n3, int n4, int n5) {
        if (n3 == n4 && n4 == n5) {
            return n3;
        }
        if (n2 == n3 && n2 == n4) {
            return n2;
        }
        if (n2 == n3 && n2 == n5) {
            return n2;
        }
        if (n2 == n4 && n2 == n5) {
            return n2;
        }
        if (n2 == n3 && n4 != n5) {
            return n2;
        }
        if (n2 == n4 && n3 != n5) {
            return n2;
        }
        if (n2 == n5 && n3 != n4) {
            return n2;
        }
        if (n3 == n4 && n2 != n5) {
            return n3;
        }
        if (n3 == n5 && n2 != n4) {
            return n3;
        }
        if (n4 == n5 && n2 != n3) {
            return n4;
        }
        return this.a(new int[]{n2, n3, n4, n5});
    }
}

