/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.sz;
import com.a.a.d.yk;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bhm {
    private static final d e = org.apache.logging.log4j.c.c();
    public static final aei a = null;
    private final aei[] f = new aei[16];
    private final byte[] g = new byte[256];
    private final int[] h = new int[256];
    private final boolean[] i = new boolean[256];
    private boolean j;
    private final iu k;
    private final int[] l;
    public final int b;
    public final int c;
    private boolean m;
    private final Map n = sz.c();
    private final ka[] o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private long u;
    private int v;
    private long w;
    private int x = 4096;
    private ConcurrentLinkedQueue y = yk.b();
    public boolean d;

    public bhm(iu iu2, int n2, int n3) {
        this.o = new ka[16];
        this.k = iu2;
        this.b = n2;
        this.c = n3;
        this.l = new int[256];
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            this.o[i2] = new ka(cpk.class);
        }
        Arrays.fill(this.h, -999);
        Arrays.fill(this.g, (byte)-1);
    }

    public bhm(iu iu2, cnb cnb2, int n2, int n3) {
        this(iu2, n2, n3);
        int n4 = 256;
        boolean bl2 = !iu2.q.n();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 256; ++i4) {
                    dbk dbk2 = cnb2.a(i2, i4, i3);
                    if (dbk2.a() == ahk.a) continue;
                    int n5 = i4 >> 4;
                    if (this.f[n5] == a) {
                        this.f[n5] = new aei(n5 << 4, bl2);
                    }
                    this.f[n5].a(i2, i4 & 0xF, i3, dbk2);
                }
            }
        }
    }

    public boolean a(int n2, int n3) {
        return n2 == this.b && n3 == this.c;
    }

    public int a(cmz cmz2) {
        return this.b(cmz2.a() & 0xF, cmz2.c() & 0xF);
    }

    public int b(int n2, int n3) {
        return this.l[n3 << 4 | n2];
    }

    private aei y() {
        for (int i2 = this.f.length - 1; i2 >= 0; --i2) {
            if (this.f[i2] == a) continue;
            return this.f[i2];
        }
        return null;
    }

    public int a() {
        aei aei2 = this.y();
        return aei2 == null ? 0 : aei2.c();
    }

    public aei[] b() {
        return this.f;
    }

    protected void c() {
        int n2 = this.a();
        this.v = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            block1: for (int i3 = 0; i3 < 16; ++i3) {
                this.h[i2 + (i3 << 4)] = -999;
                for (int i4 = n2 + 16; i4 > 0; --i4) {
                    dbk dbk2 = this.a(i2, i4 - 1, i3);
                    if (dbk2.c() == 0) continue;
                    this.l[i3 << 4 | i2] = i4;
                    if (i4 >= this.v) continue block1;
                    this.v = i4;
                    continue block1;
                }
            }
        }
        this.s = true;
    }

    public void d() {
        int n2 = this.a();
        this.v = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n3;
                this.h[i2 + (i3 << 4)] = -999;
                for (n3 = n2 + 16; n3 > 0; --n3) {
                    if (this.d(i2, n3 - 1, i3) == 0) continue;
                    this.l[i3 << 4 | i2] = n3;
                    if (n3 >= this.v) break;
                    this.v = n3;
                    break;
                }
                if (this.k.q.n()) continue;
                n3 = 15;
                int n4 = n2 + 16 - 1;
                do {
                    aei aei2;
                    int n5;
                    if ((n5 = this.d(i2, n4, i3)) == 0 && n3 != 15) {
                        n5 = 1;
                    }
                    if ((n3 -= n5) <= 0 || (aei2 = this.f[n4 >> 4]) == a) continue;
                    aei2.a(i2, n4 & 0xF, i3, n3);
                    this.k.l(new cmz((this.b << 4) + i2, n4, (this.c << 4) + i3));
                } while (--n4 > 0 && n3 > 0);
            }
        }
        this.s = true;
    }

    private void d(int n2, int n3) {
        this.i[n2 + n3 * 16] = true;
        this.m = true;
    }

    private void h(boolean bl2) {
        this.k.A.a("recheckGaps");
        if (this.k.a(new cmz(this.b * 16 + 8, 0, this.c * 16 + 8), 16)) {
            for (int i2 = 0; i2 < 16; ++i2) {
                for (int i3 = 0; i3 < 16; ++i3) {
                    if (!this.i[i2 + i3 * 16]) continue;
                    this.i[i2 + i3 * 16] = false;
                    int n2 = this.b(i2, i3);
                    int n3 = this.b * 16 + i2;
                    int n4 = this.c * 16 + i3;
                    int n5 = Integer.MAX_VALUE;
                    for (bqk bqk2 : afj.a) {
                        n5 = Math.min(n5, this.k.c(n3 + bqk2.h(), n4 + bqk2.j()));
                    }
                    this.b(n3, n4, n5);
                    for (bqk bqk2 : afj.a) {
                        this.b(n3 + bqk2.h(), n4 + bqk2.j(), n2);
                    }
                    if (!bl2) continue;
                    this.k.A.b();
                    return;
                }
            }
            this.m = false;
        }
        this.k.A.b();
    }

    private void b(int n2, int n3, int n4) {
        int n5 = this.k.k(new cmz(n2, 0, n3)).b();
        if (n5 > n4) {
            this.a(n2, n3, n4, n5 + 1);
        } else if (n5 < n4) {
            this.a(n2, n3, n5, n4 + 1);
        }
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (n5 > n4 && this.k.a(new cmz(n2, 0, n3), 16)) {
            for (int i2 = n4; i2 < n5; ++i2) {
                this.k.c(bzq.a, new cmz(n2, i2, n3));
            }
            this.s = true;
        }
    }

    private void c(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n8 = this.l[n4 << 4 | n2] & 0xFF;
        if (n3 > n8) {
            n9 = n3;
        }
        while (n9 > 0 && this.d(n2, n9 - 1, n4) == 0) {
            --n9;
        }
        if (n9 == n8) {
            return;
        }
        this.k.a(n2 + this.b * 16, n4 + this.c * 16, n9, n8);
        this.l[n4 << 4 | n2] = n9;
        int n10 = this.b * 16 + n2;
        int n11 = this.c * 16 + n4;
        if (!this.k.q.n()) {
            aei aei2;
            if (n9 < n8) {
                for (n7 = n9; n7 < n8; ++n7) {
                    aei2 = this.f[n7 >> 4];
                    if (aei2 == a) continue;
                    aei2.a(n2, n7 & 0xF, n4, 15);
                    this.k.l(new cmz((this.b << 4) + n2, n7, (this.c << 4) + n4));
                }
            } else {
                for (n7 = n8; n7 < n9; ++n7) {
                    aei2 = this.f[n7 >> 4];
                    if (aei2 == a) continue;
                    aei2.a(n2, n7 & 0xF, n4, 0);
                    this.k.l(new cmz((this.b << 4) + n2, n7, (this.c << 4) + n4));
                }
            }
            n7 = 15;
            while (n9 > 0 && n7 > 0) {
                aei aei3;
                int n12;
                if ((n12 = this.d(n2, --n9, n4)) == 0) {
                    n12 = 1;
                }
                if ((n7 -= n12) < 0) {
                    n7 = 0;
                }
                if ((aei3 = this.f[n9 >> 4]) == a) continue;
                aei3.a(n2, n9 & 0xF, n4, n7);
            }
        }
        if ((n6 = (n7 = this.l[n4 << 4 | n2])) < (n5 = n8)) {
            int n13 = n5;
            n5 = n6;
            n6 = n13;
        }
        if (n7 < this.v) {
            this.v = n7;
        }
        if (!this.k.q.n()) {
            for (bqk bqk2 : afj.a) {
                this.a(n10 + bqk2.h(), n11 + bqk2.j(), n5, n6);
            }
            this.a(n10, n11, n5, n6);
        }
        this.s = true;
    }

    public int b(cmz cmz2) {
        return this.c(cmz2).c();
    }

    private int d(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).c();
    }

    public dbk c(cmz cmz2) {
        return this.a(cmz2.a(), cmz2.b(), cmz2.c());
    }

    public dbk a(int n2, int n3, int n4) {
        if (this.k.v() == aaf.g) {
            dbk dbk2 = null;
            if (n3 == 60) {
                dbk2 = blg.cv.s();
            }
            if (n3 == 70) {
                dbk2 = bhx.c(n2, n4);
            }
            return dbk2 == null ? blg.a.s() : dbk2;
        }
        try {
            aei aei2;
            if (n3 >= 0 && n3 >> 4 < this.f.length && (aei2 = this.f[n3 >> 4]) != a) {
                return aei2.a(n2 & 0xF, n3 & 0xF, n4 & 0xF);
            }
            return blg.a.s();
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Getting block state");
            sx sx2 = cet2.a("Block being got");
            sx2.a("Location", new nd(this, n2, n3, n4));
            throw new oz(cet2);
        }
    }

    public dbk a(cmz cmz2, dbk dbk2) {
        bql bql2;
        int n2;
        int n3;
        int n4 = cmz2.a() & 0xF;
        int n5 = cmz2.b();
        if (n5 >= this.h[n3 = (n2 = cmz2.c() & 0xF) << 4 | n4] - 1) {
            this.h[n3] = -999;
        }
        int n6 = this.l[n3];
        dbk dbk3 = this.c(cmz2);
        if (dbk3 == dbk2) {
            return null;
        }
        bfa bfa2 = dbk2.t();
        bfa bfa3 = dbk3.t();
        aei aei2 = this.f[n5 >> 4];
        boolean bl2 = false;
        if (aei2 == a) {
            if (bfa2 == blg.a) {
                return null;
            }
            this.f[n5 >> 4] = aei2 = new aei(n5 >> 4 << 4, !this.k.q.n());
            bl2 = n5 >= n6;
        }
        aei2.a(n4, n5 & 0xF, n2, dbk2);
        if (bfa3 != bfa2) {
            if (!this.k.C) {
                bfa3.b(this.k, cmz2, dbk3);
            } else if (bfa3 instanceof gk) {
                this.k.r(cmz2);
            }
        }
        if (aei2.a(n4, n5 & 0xF, n2).t() != bfa2) {
            return null;
        }
        if (bl2) {
            this.d();
        } else {
            int n7 = dbk2.c();
            int n8 = dbk3.c();
            if (n7 > 0) {
                if (n5 >= n6) {
                    this.c(n4, n5 + 1, n2);
                }
            } else if (n5 == n6 - 1) {
                this.c(n4, n5, n2);
            }
            if (n7 != n8 && (n7 < n8 || this.a(bzq.a, cmz2) > 0 || this.a(bzq.b, cmz2) > 0)) {
                this.d(n4, n2);
            }
        }
        if (bfa3 instanceof gk && (bql2 = this.a(cmz2, bfw.c)) != null) {
            bql2.g_();
        }
        if (!this.k.C && bfa3 != bfa2) {
            bfa2.a(this.k, cmz2, dbk2);
        }
        if (bfa2 instanceof gk) {
            bql bql3 = this.a(cmz2, bfw.c);
            if (bql3 == null) {
                bql3 = ((gk)((Object)bfa2)).a(this.k, bfa2.e(dbk2));
                this.k.a(cmz2, bql3);
            }
            if (bql3 != null) {
                bql3.g_();
            }
        }
        this.s = true;
        return dbk3;
    }

    public int a(bzq bzq2, cmz cmz2) {
        int n2 = cmz2.a() & 0xF;
        int n3 = cmz2.b();
        int n4 = cmz2.c() & 0xF;
        aei aei2 = this.f[n3 >> 4];
        if (aei2 == a) {
            if (this.d(cmz2)) {
                return bzq2.c;
            }
            return 0;
        }
        if (bzq2 == bzq.a) {
            if (this.k.q.n()) {
                return 0;
            }
            return aei2.b(n2, n3 & 0xF, n4);
        }
        if (bzq2 == bzq.b) {
            return aei2.c(n2, n3 & 0xF, n4);
        }
        return bzq2.c;
    }

    public void a(bzq bzq2, cmz cmz2, int n2) {
        int n3 = cmz2.a() & 0xF;
        int n4 = cmz2.b();
        int n5 = cmz2.c() & 0xF;
        aei aei2 = this.f[n4 >> 4];
        if (aei2 == a) {
            this.f[n4 >> 4] = aei2 = new aei(n4 >> 4 << 4, !this.k.q.n());
            this.d();
        }
        this.s = true;
        if (bzq2 == bzq.a) {
            if (!this.k.q.n()) {
                aei2.a(n3, n4 & 0xF, n5, n2);
            }
        } else if (bzq2 == bzq.b) {
            aei2.b(n3, n4 & 0xF, n5, n2);
        }
    }

    public int a(cmz cmz2, int n2) {
        int n3 = cmz2.a() & 0xF;
        int n4 = cmz2.b();
        int n5 = cmz2.c() & 0xF;
        aei aei2 = this.f[n4 >> 4];
        if (aei2 == a) {
            if (!this.k.q.n() && n2 < bzq.a.c) {
                return bzq.a.c - n2;
            }
            return 0;
        }
        int n6 = this.k.q.n() ? 0 : aei2.b(n3, n4 & 0xF, n5);
        int n7 = aei2.c(n3, n4 & 0xF, n5);
        if (n7 > (n6 -= n2)) {
            n6 = n7;
        }
        return n6;
    }

    public void a(cpk cpk2) {
        int n2;
        this.t = true;
        int n3 = cmk.c(cpk2.aU / 16.0);
        int n4 = cmk.c(cpk2.aW / 16.0);
        if (n3 != this.b || n4 != this.c) {
            e.f("Wrong location! ({}, {}) should be ({}, {}), {}", n3, n4, this.b, this.c, cpk2, cpk2);
            cpk2.ak_();
        }
        if ((n2 = cmk.c(cpk2.aV / 16.0)) < 0) {
            n2 = 0;
        }
        if (n2 >= this.o.length) {
            n2 = this.o.length - 1;
        }
        cpk2.bG = true;
        cpk2.bH = this.b;
        cpk2.bI = n2;
        cpk2.bJ = this.c;
        this.o[n2].add(cpk2);
    }

    public void b(cpk cpk2) {
        this.a(cpk2, cpk2.bI);
    }

    public void a(cpk cpk2, int n2) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= this.o.length) {
            n2 = this.o.length - 1;
        }
        this.o[n2].remove(cpk2);
    }

    public boolean d(cmz cmz2) {
        int n2;
        int n3 = cmz2.a() & 0xF;
        int n4 = cmz2.b();
        return n4 >= this.l[(n2 = cmz2.c() & 0xF) << 4 | n3];
    }

    private bql g(cmz cmz2) {
        dbk dbk2 = this.c(cmz2);
        bfa bfa2 = dbk2.t();
        if (!bfa2.l()) {
            return null;
        }
        return ((gk)((Object)bfa2)).a(this.k, dbk2.t().e(dbk2));
    }

    public bql a(cmz cmz2, bfw bfw2) {
        bql bql2 = (bql)this.n.get(cmz2);
        if (bql2 == null) {
            if (bfw2 == bfw.a) {
                bql2 = this.g(cmz2);
                this.k.a(cmz2, bql2);
            } else if (bfw2 == bfw.b) {
                this.y.add(cmz2);
            }
        } else if (bql2.A()) {
            this.n.remove(cmz2);
            return null;
        }
        return bql2;
    }

    public void a(bql bql2) {
        this.a(bql2.y(), bql2);
        if (this.j) {
            this.k.a(bql2);
        }
    }

    public void a(cmz cmz2, bql bql2) {
        bql2.a(this.k);
        bql2.c(cmz2);
        if (!(this.c(cmz2).t() instanceof gk)) {
            return;
        }
        if (this.n.containsKey(cmz2)) {
            ((bql)this.n.get(cmz2)).e_();
        }
        bql2.f_();
        this.n.put(cmz2, bql2);
    }

    public void e(cmz cmz2) {
        bql bql2;
        if (this.j && (bql2 = (bql)this.n.remove(cmz2)) != null) {
            bql2.e_();
        }
    }

    public void e() {
        this.j = true;
        this.k.a(this.n.values());
        for (ka ka2 : this.o) {
            this.k.b(ka2);
        }
    }

    public void f() {
        this.j = false;
        for (bql bql2 : this.n.values()) {
            this.k.b(bql2);
        }
        for (ka ka2 : this.o) {
            this.k.c(ka2);
        }
    }

    public void g() {
        this.s = true;
    }

    public void a(cpk cpk2, cxt cxt2, List list, cm cm2) {
        int n2 = cmk.c((cxt2.b - 2.0) / 16.0);
        int n3 = cmk.c((cxt2.e + 2.0) / 16.0);
        n2 = cmk.a(n2, 0, this.o.length - 1);
        n3 = cmk.a(n3, 0, this.o.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            if (this.o[i2].isEmpty()) continue;
            for (cpk cpk3 : this.o[i2]) {
                cpk[] arrcpk;
                if (!cpk3.cD().b(cxt2) || cpk3 == cpk2) continue;
                if (cm2 == null || cm2.a(cpk3)) {
                    list.add(cpk3);
                }
                if ((arrcpk = cpk3.at_()) == null) continue;
                for (cpk cpk4 : arrcpk) {
                    cpk3 = cpk4;
                    if (cpk3 == cpk2 || !cpk3.cD().b(cxt2) || cm2 != null && !cm2.a(cpk3)) continue;
                    list.add(cpk3);
                }
            }
        }
    }

    public void a(Class class_, cxt cxt2, List list, cm cm2) {
        int n2 = cmk.c((cxt2.b - 2.0) / 16.0);
        int n3 = cmk.c((cxt2.e + 2.0) / 16.0);
        n2 = cmk.a(n2, 0, this.o.length - 1);
        n3 = cmk.a(n3, 0, this.o.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (cpk cpk2 : this.o[i2].c(class_)) {
                if (!cpk2.cD().b(cxt2) || cm2 != null && !cm2.a(cpk2)) continue;
                list.add(cpk2);
            }
        }
    }

    public boolean a(boolean bl2) {
        if (bl2 ? this.t && this.k.z() != this.u || this.s : this.t && this.k.z() >= this.u + 600L) {
            return true;
        }
        return this.s;
    }

    public Random a(long l2) {
        return new Random(this.k.y() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.c * this.c) * 4392871L + (long)(this.c * 389711) ^ l2);
    }

    public boolean h() {
        return false;
    }

    public void a(apb apb2, tv tv2) {
        bhm bhm2;
        bhm bhm3 = apb2.a(this.b, this.c - 1);
        bhm bhm4 = apb2.a(this.b + 1, this.c);
        bhm bhm5 = apb2.a(this.b, this.c + 1);
        bhm bhm6 = apb2.a(this.b - 1, this.c);
        if (bhm4 != null && bhm5 != null && apb2.a(this.b + 1, this.c + 1) != null) {
            this.a(tv2);
        }
        if (bhm6 != null && bhm5 != null && apb2.a(this.b - 1, this.c + 1) != null) {
            bhm6.a(tv2);
        }
        if (bhm3 != null && bhm4 != null && apb2.a(this.b + 1, this.c - 1) != null) {
            bhm3.a(tv2);
        }
        if (bhm3 != null && bhm6 != null && (bhm2 = apb2.a(this.b - 1, this.c - 1)) != null) {
            bhm2.a(tv2);
        }
    }

    protected void a(tv tv2) {
        if (this.u()) {
            if (tv2.a(this, this.b, this.c)) {
                this.g();
            }
        } else {
            this.o();
            tv2.b(this.b, this.c);
            this.g();
        }
    }

    public cmz f(cmz cmz2) {
        int n2 = cmz2.a() & 0xF;
        int n3 = cmz2.c() & 0xF;
        int n4 = n2 | n3 << 4;
        cmz cmz3 = new cmz(cmz2.a(), this.h[n4], cmz2.c());
        if (cmz3.b() == -999) {
            int n5 = this.a() + 15;
            cmz3 = new cmz(cmz2.a(), n5, cmz2.c());
            int n6 = -1;
            while (cmz3.b() > 0 && n6 == -1) {
                dbk dbk2 = this.c(cmz3);
                ahk ahk2 = dbk2.a();
                if (!ahk2.c() && !ahk2.d()) {
                    cmz3 = cmz3.h();
                    continue;
                }
                n6 = cmz3.b() + 1;
            }
            this.h[n4] = n6;
        }
        return new cmz(cmz2.a(), this.h[n4], cmz2.c());
    }

    public void b(boolean bl2) {
        if (this.m && !this.k.q.n() && !bl2) {
            this.h(this.k.C);
        }
        this.r = true;
        if (!this.q && this.p) {
            this.o();
        }
        while (!this.y.isEmpty()) {
            cmz cmz2 = (cmz)this.y.poll();
            if (this.a(cmz2, bfw.c) != null || !this.c(cmz2).t().l()) continue;
            bql bql2 = this.g(cmz2);
            this.k.a(cmz2, bql2);
            this.k.b(cmz2, cmz2);
        }
    }

    public boolean i() {
        return this.r && this.p && this.q;
    }

    public boolean j() {
        return this.r;
    }

    public zz k() {
        return new zz(this.b, this.c);
    }

    public boolean c(int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        for (int i2 = n2; i2 <= n3; i2 += 16) {
            aei aei2 = this.f[i2 >> 4];
            if (aei2 == a || aei2.a()) continue;
            return false;
        }
        return true;
    }

    public void a(aei[] arraei) {
        if (this.f.length != arraei.length) {
            e.f("Could not set level chunk sections, array length is {} instead of {}", arraei.length, this.f.length);
            return;
        }
        System.arraycopy(arraei, 0, this.f, 0, this.f.length);
    }

    public void a(si si2, int n2, boolean bl2) {
        int n3;
        boolean bl3 = !this.k.q.n();
        for (n3 = 0; n3 < this.f.length; ++n3) {
            Object object = this.f[n3];
            if ((n2 & 1 << n3) == 0) {
                if (!bl2 || object == a) continue;
                this.f[n3] = a;
                continue;
            }
            if (object == a) {
                object = new aei(n3 << 4, bl3);
                this.f[n3] = object;
            }
            ((aei)object).e().a(si2);
            si2.b(((aei)object).f().a());
            if (!bl3) continue;
            si2.b(((aei)object).g().a());
        }
        if (bl2) {
            si2.b(this.g);
        }
        for (n3 = 0; n3 < this.f.length; ++n3) {
            if (this.f[n3] == a || (n2 & 1 << n3) == 0) continue;
            this.f[n3].d();
        }
        this.q = true;
        this.p = true;
        this.c();
        for (Object object : this.n.values()) {
            ((bql)object).g_();
        }
    }

    public anr a(cmz cmz2, ey ey2) {
        anr anr2;
        int n2 = cmz2.a() & 0xF;
        int n3 = cmz2.c() & 0xF;
        int n4 = this.g[n3 << 4 | n2] & 0xFF;
        if (n4 == 255) {
            anr2 = ey2.a(cmz2, cff.c);
            n4 = anr.a(anr2);
            this.g[n3 << 4 | n2] = (byte)(n4 & 0xFF);
        }
        if ((anr2 = anr.b(n4)) == null) {
            return cff.c;
        }
        return anr2;
    }

    public byte[] l() {
        return this.g;
    }

    public void a(byte[] arrby) {
        if (this.g.length != arrby.length) {
            e.f("Could not set level chunk biomes, array length is {} instead of {}", arrby.length, this.g.length);
            return;
        }
        System.arraycopy(arrby, 0, this.g, 0, this.g.length);
    }

    public void m() {
        this.x = 0;
    }

    public void n() {
        if (this.x >= 4096) {
            return;
        }
        cmz cmz2 = new cmz(this.b << 4, 0, this.c << 4);
        for (int i2 = 0; i2 < 8; ++i2) {
            if (this.x >= 4096) {
                return;
            }
            int n2 = this.x % 16;
            int n3 = this.x / 16 % 16;
            int n4 = this.x / 256;
            ++this.x;
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2;
                cmz cmz3 = cmz2.e(n3, (n2 << 4) + i3, n4);
                boolean bl3 = bl2 = i3 == 0 || i3 == 15 || n3 == 0 || n3 == 15 || n4 == 0 || n4 == 15;
                if ((this.f[n2] != a || !bl2) && (this.f[n2] == a || this.f[n2].a(n3, i3, n4).a() != ahk.a)) continue;
                for (bqk bqk2 : bqk.values()) {
                    cmz cmz4 = cmz3.c(bqk2);
                    if (this.k.n(cmz4).d() <= 0) continue;
                    this.k.v(cmz4);
                }
                this.k.v(cmz3);
            }
        }
    }

    public void o() {
        this.p = true;
        this.q = true;
        cmz cmz2 = new cmz(this.b << 4, 0, this.c << 4);
        if (!this.k.q.n()) {
            if (this.k.a(cmz2.e(-1, 0, -1), cmz2.e(16, this.k.u(), 16))) {
                block0: for (int i2 = 0; i2 < 16; ++i2) {
                    for (int i3 = 0; i3 < 16; ++i3) {
                        if (this.e(i2, i3)) continue;
                        this.q = false;
                        break block0;
                    }
                }
                if (this.q) {
                    for (bqk bqk2 : afj.a) {
                        int n2 = bqk2.d() == yy.a ? 16 : 1;
                        this.k.e(cmz2.c(bqk2, n2)).a(bqk2.e());
                    }
                    this.z();
                }
            } else {
                this.q = false;
            }
        }
    }

    private void z() {
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2] = true;
        }
        this.h(false);
    }

    private void a(bqk bqk2) {
        block6: {
            block8: {
                block7: {
                    block5: {
                        if (!this.p) {
                            return;
                        }
                        if (bqk2 != bqk.f) break block5;
                        for (int i2 = 0; i2 < 16; ++i2) {
                            this.e(15, i2);
                        }
                        break block6;
                    }
                    if (bqk2 != bqk.e) break block7;
                    for (int i3 = 0; i3 < 16; ++i3) {
                        this.e(0, i3);
                    }
                    break block6;
                }
                if (bqk2 != bqk.d) break block8;
                for (int i4 = 0; i4 < 16; ++i4) {
                    this.e(i4, 15);
                }
                break block6;
            }
            if (bqk2 != bqk.c) break block6;
            for (int i5 = 0; i5 < 16; ++i5) {
                this.e(i5, 0);
            }
        }
    }

    private boolean e(int n2, int n3) {
        int n4;
        int n5 = this.a();
        boolean bl2 = false;
        boolean bl3 = false;
        pj pj2 = new pj((this.b << 4) + n2, 0, (this.c << 4) + n3);
        for (n4 = n5 + 16 - 1; n4 > this.k.u() || n4 > 0 && !bl3; --n4) {
            pj2.a(pj2.a(), n4, pj2.c());
            int n6 = this.b(pj2);
            if (n6 == 255 && pj2.b() < this.k.u()) {
                bl3 = true;
            }
            if (!bl2 && n6 > 0) {
                bl2 = true;
                continue;
            }
            if (!bl2 || n6 != 0 || this.k.v(pj2)) continue;
            return false;
        }
        for (n4 = pj2.b(); n4 > 0; --n4) {
            pj2.a(pj2.a(), n4, pj2.c());
            if (this.c(pj2).d() <= 0) continue;
            this.k.v(pj2);
        }
        return true;
    }

    public boolean p() {
        return this.j;
    }

    public void c(boolean bl2) {
        this.j = bl2;
    }

    public iu q() {
        return this.k;
    }

    public int[] r() {
        return this.l;
    }

    public void a(int[] arrn) {
        if (this.l.length != arrn.length) {
            e.f("Could not set level chunk heightmap, array length is {} instead of {}", arrn.length, this.l.length);
            return;
        }
        System.arraycopy(arrn, 0, this.l, 0, this.l.length);
    }

    public Map s() {
        return this.n;
    }

    public ka[] t() {
        return this.o;
    }

    public boolean u() {
        return this.p;
    }

    public void d(boolean bl2) {
        this.p = bl2;
    }

    public boolean v() {
        return this.q;
    }

    public void e(boolean bl2) {
        this.q = bl2;
    }

    public void f(boolean bl2) {
        this.s = bl2;
    }

    public void g(boolean bl2) {
        this.t = bl2;
    }

    public void b(long l2) {
        this.u = l2;
    }

    public int w() {
        return this.v;
    }

    public long x() {
        return this.w;
    }

    public void c(long l2) {
        this.w = l2;
    }
}

