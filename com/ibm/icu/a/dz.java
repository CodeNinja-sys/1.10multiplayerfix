/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.af;
import com.ibm.icu.a.ar;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.jd;
import com.ibm.icu.a.je;
import com.ibm.icu.util.a;
import com.ibm.icu.util.av;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.cq;
import com.ibm.icu.util.dg;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dl;
import com.ibm.icu.util.dm;
import com.ibm.icu.util.dv;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.MissingResourceException;

public class dz
extends b {
    static final long a = -6281977362477515376L;
    private int i;
    private int j;
    private long[] z;
    private int[] A;
    private byte[] B;
    private int C = Integer.MAX_VALUE;
    private double D = Double.MAX_VALUE;
    private cq E = null;
    private volatile String F = null;
    private static final String G = "zoneinfo64";
    private static final boolean H = ar.b("olson");
    private static final int I = 86400;
    private transient bl J;
    private transient dm K;
    private transient int L;
    private transient dm M;
    private transient dg[] N;
    private transient cq O;
    private transient boolean P;
    private static final int Q = 1;
    private int R = 1;
    private transient boolean S = false;

    public int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n4 < 0 || n4 > 11) {
            throw new IllegalArgumentException("Month is not in the legal range: " + n4);
        }
        return this.a(n2, n3, n4, n5, n6, n7, af.a(n3, n4));
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n2 != 1 && n2 != 0 || n4 < 0 || n4 > 11 || n5 < 1 || n5 > n8 || n6 < 1 || n6 > 7 || n7 < 0 || n7 >= 86400000 || n8 < 28 || n8 > 31) {
            throw new IllegalArgumentException();
        }
        if (n2 == 0) {
            n3 = -n3;
        }
        if (this.E != null && n3 >= this.C) {
            return this.E.a(n2, n3, n4, n5, n6, n7);
        }
        long l2 = af.a(n3, n4, n5) * 86400000L + (long)n7;
        int[] arrn = new int[2];
        this.a(l2, true, 3, 1, arrn);
        return arrn[0] + arrn[1];
    }

    public void a(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen OlsonTimeZone instance.");
        }
        if (this.a() == n2) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if ((double)l2 < this.D) {
            Object[] arrobject;
            cq cq2 = new cq(n2, this.l());
            boolean bl2 = this.b();
            if (bl2) {
                Object object;
                arrobject = this.b(l2);
                if (arrobject.length != 3 && (object = this.b(l2, false)) != null) {
                    arrobject = this.b(((dm)object).a() - 1L);
                }
                if (arrobject.length == 3 && arrobject[1] instanceof a && arrobject[2] instanceof a) {
                    int n3;
                    av av2;
                    av av3;
                    int n4;
                    object = (a)arrobject[1];
                    a a2 = (a)arrobject[2];
                    int n5 = ((dl)object).f() + ((dl)object).g();
                    if (n5 > (n4 = a2.f() + a2.g())) {
                        av3 = ((a)object).a();
                        av2 = a2.a();
                        n3 = n5 - n4;
                    } else {
                        av3 = a2.a();
                        av2 = ((a)object).a();
                        n3 = n4 - n5;
                    }
                    cq2.a(av3.b(), av3.e(), av3.d(), av3.g());
                    cq2.b(av2.b(), av2.e(), av2.d(), av2.g());
                    cq2.c(n3);
                } else {
                    cq2.a(0, 1, 0);
                    cq2.b(11, 31, 86399999);
                }
            }
            arrobject = af.b(l2, null);
            this.C = (int)arrobject[0];
            this.D = af.a((int)arrobject[0], 0, 1);
            if (bl2) {
                cq2.b(this.C);
            }
            this.E = cq2;
        } else {
            this.E.a(n2);
        }
        this.P = false;
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    public void a(long l2, boolean bl2, int[] arrn) {
        if (this.E != null && (double)l2 >= this.D) {
            this.E.a(l2, bl2, arrn);
        } else {
            this.a(l2, bl2, 4, 12, arrn);
        }
    }

    public void a(long l2, int n2, int n3, int[] arrn) {
        if (this.E != null && (double)l2 >= this.D) {
            this.E.a(l2, n2, n3, arrn);
        } else {
            this.a(l2, true, n2, n3, arrn);
        }
    }

    public int a() {
        int[] arrn = new int[2];
        this.a(System.currentTimeMillis(), false, arrn);
        return arrn[0];
    }

    public boolean b() {
        long l2 = System.currentTimeMillis();
        if (this.E != null && (double)l2 >= this.D) {
            return this.E != null && this.E.b();
        }
        int[] arrn = af.b(l2, null);
        long l3 = af.a(arrn[0], 0, 1) * 86400L;
        long l4 = af.a(arrn[0] + 1, 0, 1) * 86400L;
        for (int i2 = 0; i2 < this.i && this.z[i2] < l4; ++i2) {
            if ((this.z[i2] < l3 || this.f(i2) == 0) && (this.z[i2] <= l3 || i2 <= 0 || this.f(i2 - 1) == 0)) continue;
            return true;
        }
        return false;
    }

    public boolean c() {
        long l2 = System.currentTimeMillis();
        if (this.E != null) {
            if (this.E.b()) {
                return true;
            }
            if ((double)l2 >= this.D) {
                return false;
            }
        }
        long l3 = af.a(l2, 1000L);
        int n2 = this.i - 1;
        if (this.f(n2) != 0) {
            return true;
        }
        while (n2 >= 0 && this.z[n2] > l3) {
            if (this.f(n2 - 1) == 0) continue;
            return true;
        }
        return false;
    }

    public int d() {
        if (this.E != null) {
            return this.E.d();
        }
        return super.d();
    }

    public boolean a(Date date) {
        int[] arrn = new int[2];
        this.a(date.getTime(), false, arrn);
        return arrn[1] != 0;
    }

    public boolean a(dj dj2) {
        if (this == dj2) {
            return true;
        }
        if (!super.a(dj2)) {
            return false;
        }
        if (!(dj2 instanceof dz)) {
            return false;
        }
        dz dz2 = (dz)dj2;
        if (this.E == null ? dz2.E != null : dz2.E == null || this.C != dz2.C || !this.E.a(dz2.E)) {
            return false;
        }
        return this.i == dz2.i && Arrays.equals(this.z, dz2.z) && this.j == dz2.j && Arrays.equals(this.B, dz2.B) && Arrays.equals(this.A, dz2.A);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String e() {
        if (this.F == null) {
            dz dz2 = this;
            synchronized (dz2) {
                if (this.F == null) {
                    this.F = dz.f(this.l());
                    assert (this.F != null);
                    if (this.F == null) {
                        this.F = this.l();
                    }
                }
            }
        }
        return this.F;
    }

    private void r() {
        this.i = 0;
        this.z = null;
        this.B = null;
        this.j = 1;
        this.A = new int[]{0, 0};
        this.E = null;
        this.C = Integer.MAX_VALUE;
        this.D = Double.MAX_VALUE;
        this.P = false;
    }

    public dz(dv dv2, dv dv3, String string) {
        super(string);
        this.a(dv2, dv3);
    }

    private void a(dv dv2, dv dv3) {
        block25: {
            int n2;
            dv dv4;
            if (dv2 == null || dv3 == null) {
                throw new IllegalArgumentException();
            }
            if (H) {
                System.out.println("OlsonTimeZone(" + dv3.k() + ")");
            }
            int[] arrn = null;
            int[] arrn2 = null;
            int[] arrn3 = null;
            this.i = 0;
            try {
                dv4 = dv3.l("transPre32");
                arrn3 = dv4.z();
                if (arrn3.length % 2 != 0) {
                    throw new IllegalArgumentException("Invalid Format");
                }
                this.i += arrn3.length / 2;
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            try {
                dv4 = dv3.l("trans");
                arrn2 = dv4.z();
                this.i += arrn2.length;
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            try {
                dv4 = dv3.l("transPost32");
                arrn = dv4.z();
                if (arrn.length % 2 != 0) {
                    throw new IllegalArgumentException("Invalid Format");
                }
                this.i += arrn.length / 2;
            }
            catch (MissingResourceException missingResourceException) {
                // empty catch block
            }
            if (this.i > 0) {
                this.z = new long[this.i];
                int n3 = 0;
                if (arrn3 != null) {
                    n2 = 0;
                    while (n2 < arrn3.length / 2) {
                        this.z[n3] = ((long)arrn3[n2 * 2] & 0xFFFFFFFFL) << 32 | (long)arrn3[n2 * 2 + 1] & 0xFFFFFFFFL;
                        ++n2;
                        ++n3;
                    }
                }
                if (arrn2 != null) {
                    n2 = 0;
                    while (n2 < arrn2.length) {
                        this.z[n3] = arrn2[n2];
                        ++n2;
                        ++n3;
                    }
                }
                if (arrn != null) {
                    n2 = 0;
                    while (n2 < arrn.length / 2) {
                        this.z[n3] = ((long)arrn[n2 * 2] & 0xFFFFFFFFL) << 32 | (long)arrn[n2 * 2 + 1] & 0xFFFFFFFFL;
                        ++n2;
                        ++n3;
                    }
                }
            } else {
                this.z = null;
            }
            dv4 = dv3.l("typeOffsets");
            this.A = dv4.z();
            if (this.A.length < 2 || this.A.length > 32766 || this.A.length % 2 != 0) {
                throw new IllegalArgumentException("Invalid Format");
            }
            this.j = this.A.length / 2;
            if (this.i > 0) {
                dv4 = dv3.l("typeMap");
                this.B = dv4.a(null);
                if (this.B.length != this.i) {
                    throw new IllegalArgumentException("Invalid Format");
                }
            } else {
                this.B = null;
            }
            this.E = null;
            this.C = Integer.MAX_VALUE;
            this.D = Double.MAX_VALUE;
            String string = null;
            try {
                string = dv3.getString("finalRule");
                dv4 = dv3.l("finalRaw");
                n2 = dv4.x() * 1000;
                dv4 = dz.a(dv2, string);
                int[] arrn4 = dv4.z();
                if (arrn4 == null || arrn4.length != 11) {
                    throw new IllegalArgumentException("Invalid Format");
                }
                this.E = new cq(n2, "", arrn4[0], arrn4[1], arrn4[2], arrn4[3] * 1000, arrn4[4], arrn4[5], arrn4[6], arrn4[7], arrn4[8] * 1000, arrn4[9], arrn4[10] * 1000);
                dv4 = dv3.l("finalYear");
                this.C = dv4.x();
                this.D = af.a(this.C, 0, 1) * 86400000L;
            }
            catch (MissingResourceException missingResourceException) {
                if (string == null) break block25;
                throw new IllegalArgumentException("Invalid Format");
            }
        }
    }

    public dz(String string) {
        super(string);
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", G, bc.n);
        dv dv3 = je.a(dv2, string);
        this.a(dv2, dv3);
        if (this.E != null) {
            this.E.a_(string);
        }
    }

    public void a_(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen OlsonTimeZone instance.");
        }
        if (this.F == null) {
            this.F = dz.f(this.l());
            assert (this.F != null);
            if (this.F == null) {
                this.F = this.l();
            }
        }
        if (this.E != null) {
            this.E.a_(string);
        }
        super.a_(string);
        this.P = false;
    }

    private void a(long l2, boolean bl2, int n2, int n3, int[] arrn) {
        if (this.i != 0) {
            long l3 = af.a(l2, 1000L);
            if (!bl2 && l3 < this.z[0]) {
                arrn[0] = this.s() * 1000;
                arrn[1] = this.t() * 1000;
            } else {
                int n4;
                for (n4 = this.i - 1; n4 >= 0; --n4) {
                    long l4 = this.z[n4];
                    if (bl2) {
                        boolean bl3;
                        int n5 = this.b(n4 - 1);
                        boolean bl4 = this.f(n4 - 1) != 0;
                        int n6 = this.b(n4);
                        boolean bl5 = this.f(n4) != 0;
                        boolean bl6 = bl4 && !bl5;
                        boolean bl7 = bl3 = !bl4 && bl5;
                        l4 = n6 - n5 >= 0 ? ((n2 & 3) == 1 && bl6 || (n2 & 3) == 3 && bl3 ? (l4 += (long)n5) : ((n2 & 3) == 1 && bl3 || (n2 & 3) == 3 && bl6 ? (l4 += (long)n6) : ((n2 & 0xC) == 12 ? (l4 += (long)n5) : (l4 += (long)n6)))) : ((n3 & 3) == 1 && bl6 || (n3 & 3) == 3 && bl3 ? (l4 += (long)n6) : ((n3 & 3) == 1 && bl3 || (n3 & 3) == 3 && bl6 ? (l4 += (long)n5) : ((n3 & 0xC) == 4 ? (l4 += (long)n5) : (l4 += (long)n6))));
                    }
                    if (l3 >= l4) break;
                }
                arrn[0] = this.c(n4) * 1000;
                arrn[1] = this.f(n4) * 1000;
            }
        } else {
            arrn[0] = this.s() * 1000;
            arrn[1] = this.t() * 1000;
        }
    }

    private int a(byte by2) {
        return by2 & 0xFF;
    }

    private int b(int n2) {
        int n3 = n2 >= 0 ? this.a(this.B[n2]) * 2 : 0;
        return this.A[n3] + this.A[n3 + 1];
    }

    private int c(int n2) {
        int n3 = n2 >= 0 ? this.a(this.B[n2]) * 2 : 0;
        return this.A[n3];
    }

    private int f(int n2) {
        int n3 = n2 >= 0 ? this.a(this.B[n2]) * 2 : 0;
        return this.A[n3 + 1];
    }

    private int s() {
        return this.A[0];
    }

    private int t() {
        return this.A[1];
    }

    public String toString() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append('[');
        stringBuilder.append("transitionCount=" + this.i);
        stringBuilder.append(",typeCount=" + this.j);
        stringBuilder.append(",transitionTimes=");
        if (this.z != null) {
            stringBuilder.append('[');
            for (n2 = 0; n2 < this.z.length; ++n2) {
                if (n2 > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(Long.toString(this.z[n2]));
            }
            stringBuilder.append(']');
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(",typeOffsets=");
        if (this.A != null) {
            stringBuilder.append('[');
            for (n2 = 0; n2 < this.A.length; ++n2) {
                if (n2 > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(Integer.toString(this.A[n2]));
            }
            stringBuilder.append(']');
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(",typeMapData=");
        if (this.B != null) {
            stringBuilder.append('[');
            for (n2 = 0; n2 < this.B.length; ++n2) {
                if (n2 > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(Byte.toString(this.B[n2]));
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(",finalStartYear=" + this.C);
        stringBuilder.append(",finalStartMillis=" + this.D);
        stringBuilder.append(",finalZone=" + this.E);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private static dv a(dv dv2, String string) {
        dv dv3 = dv2.l("Rules");
        dv3 = dv3.l(string);
        return dv3;
    }

    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }
        dz dz2 = (dz)object;
        return jd.a(this.B, (Object)dz2.B) || this.C == dz2.C && (this.E == null && dz2.E == null || this.E != null && dz2.E != null && this.E.equals(dz2.E) && this.i == dz2.i && this.j == dz2.j && jd.a((Object)this.z, (Object)dz2.z) && jd.a(this.A, (Object)dz2.A) && jd.a(this.B, (Object)dz2.B));
    }

    public int hashCode() {
        int n2;
        int n3 = (int)((long)(this.C ^ (this.C >>> 4) + this.i ^ (this.i >>> 6) + this.j) ^ (long)(this.j >>> 8) + Double.doubleToLongBits(this.D) + (long)(this.E == null ? 0 : this.E.hashCode()) + (long)super.hashCode());
        if (this.z != null) {
            for (n2 = 0; n2 < this.z.length; ++n2) {
                n3 = (int)((long)n3 + (this.z[n2] ^ this.z[n2] >>> 8));
            }
        }
        for (n2 = 0; n2 < this.A.length; ++n2) {
            n3 += this.A[n2] ^ this.A[n2] >>> 8;
        }
        if (this.B != null) {
            for (n2 = 0; n2 < this.B.length; ++n2) {
                n3 += this.B[n2] & 0xFF;
            }
        }
        return n3;
    }

    public dm a(long l2, boolean bl2) {
        this.u();
        if (this.E != null) {
            if (bl2 && l2 == this.M.a()) {
                return this.M;
            }
            if (l2 >= this.M.a()) {
                if (this.E.b()) {
                    return this.O.a(l2, bl2);
                }
                return null;
            }
        }
        if (this.N != null) {
            long l3;
            int n2;
            for (n2 = this.i - 1; n2 >= this.L && l2 <= (l3 = this.z[n2] * 1000L) && (bl2 || l2 != l3); --n2) {
            }
            if (n2 == this.i - 1) {
                return this.M;
            }
            if (n2 < this.L) {
                return this.K;
            }
            dg dg2 = this.N[this.a(this.B[n2 + 1])];
            dg dg3 = this.N[this.a(this.B[n2])];
            long l4 = this.z[n2 + 1] * 1000L;
            if (dg3.e().equals(dg2.e()) && dg3.f() == dg2.f() && dg3.g() == dg2.g()) {
                return this.a(l4, false);
            }
            return new dm(l4, dg3, dg2);
        }
        return null;
    }

    public dm b(long l2, boolean bl2) {
        this.u();
        if (this.E != null) {
            if (bl2 && l2 == this.M.a()) {
                return this.M;
            }
            if (l2 > this.M.a()) {
                if (this.E.b()) {
                    return this.O.b(l2, bl2);
                }
                return this.M;
            }
        }
        if (this.N != null) {
            long l3;
            int n2;
            for (n2 = this.i - 1; !(n2 < this.L || l2 > (l3 = this.z[n2] * 1000L) || bl2 && l2 == l3); --n2) {
            }
            if (n2 < this.L) {
                return null;
            }
            if (n2 == this.L) {
                return this.K;
            }
            dg dg2 = this.N[this.a(this.B[n2])];
            dg dg3 = this.N[this.a(this.B[n2 - 1])];
            long l4 = this.z[n2] * 1000L;
            if (dg3.e().equals(dg2.e()) && dg3.f() == dg2.f() && dg3.g() == dg2.g()) {
                return this.b(l4, false);
            }
            return new dm(l4, dg3, dg2);
        }
        return null;
    }

    public dl[] k() {
        this.u();
        int n2 = 1;
        if (this.N != null) {
            for (int i2 = 0; i2 < this.N.length; ++i2) {
                if (this.N[i2] == null) continue;
                ++n2;
            }
        }
        if (this.E != null) {
            n2 = this.E.b() ? (n2 += 2) : ++n2;
        }
        dl[] arrdl = new dl[n2];
        int n3 = 0;
        arrdl[n3++] = this.J;
        if (this.N != null) {
            for (int i3 = 0; i3 < this.N.length; ++i3) {
                if (this.N[i3] == null) continue;
                arrdl[n3++] = this.N[i3];
            }
        }
        if (this.E != null) {
            if (this.E.b()) {
                dl[] arrdl2 = this.O.k();
                arrdl[n3++] = arrdl2[1];
                arrdl[n3++] = arrdl2[2];
            } else {
                arrdl[n3++] = new dg(this.l() + "(STD)", this.E.a(), 0, new long[]{(long)this.D}, 2);
            }
        }
        return arrdl;
    }

    private synchronized void u() {
        Object object;
        if (this.P) {
            return;
        }
        this.J = null;
        this.K = null;
        this.M = null;
        this.N = null;
        this.L = 0;
        this.O = null;
        String string = this.l() + "(STD)";
        String string2 = this.l() + "(DST)";
        int n2 = this.s() * 1000;
        int n3 = this.t() * 1000;
        this.J = new bl(n3 == 0 ? string : string2, n2, n3);
        if (this.i > 0) {
            int n4;
            for (n4 = 0; n4 < this.i && this.a(this.B[n4]) == 0; ++n4) {
                ++this.L;
            }
            if (n4 != this.i) {
                int n5;
                object = new long[this.i];
                for (n5 = 0; n5 < this.j; ++n5) {
                    int n6 = 0;
                    for (n4 = this.L; n4 < this.i; ++n4) {
                        long l2;
                        if (n5 != this.a(this.B[n4]) || !((double)(l2 = this.z[n4] * 1000L) < this.D)) continue;
                        object[n6++] = l2;
                    }
                    if (n6 <= 0) continue;
                    long[] arrl = new long[n6];
                    System.arraycopy(object, 0, arrl, 0, n6);
                    n2 = this.A[n5 * 2] * 1000;
                    n3 = this.A[n5 * 2 + 1] * 1000;
                    if (this.N == null) {
                        this.N = new dg[this.j];
                    }
                    this.N[n5] = new dg(n3 == 0 ? string : string2, n2, n3, arrl, 2);
                }
                n5 = this.a(this.B[this.L]);
                this.K = new dm(this.z[this.L] * 1000L, this.J, this.N[n5]);
            }
        }
        if (this.E != null) {
            long l3 = (long)this.D;
            if (this.E.b()) {
                this.O = (cq)this.E.clone();
                this.O.b(this.C);
                dm dm2 = this.O.a(l3, false);
                object = dm2.b();
                l3 = dm2.a();
            } else {
                this.O = this.E;
                object = new dg(this.E.l(), this.E.a(), 0, new long[]{l3}, 2);
            }
            dl dl2 = null;
            if (this.i > 0) {
                dl2 = this.N[this.a(this.B[this.i - 1])];
            }
            if (dl2 == null) {
                dl2 = this.J;
            }
            this.M = new dm(l3, dl2, (dl)object);
        }
        this.P = true;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.R < 1) {
            boolean bl2 = false;
            String string = this.l();
            if (string != null) {
                try {
                    dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", G, bc.n);
                    dv dv3 = je.a(dv2, string);
                    this.a(dv2, dv3);
                    if (this.E != null) {
                        this.E.a_(string);
                    }
                    bl2 = true;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (!bl2) {
                this.r();
            }
        }
        this.P = false;
    }

    public boolean f() {
        return this.S;
    }

    public dj g() {
        this.S = true;
        return this;
    }

    public dj h() {
        dz dz2 = (dz)super.h();
        if (this.E != null) {
            this.E.a_(this.l());
            dz2.E = (cq)this.E.clone();
        }
        dz2.S = false;
        return dz2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }
}

