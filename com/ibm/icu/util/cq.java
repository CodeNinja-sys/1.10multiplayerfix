/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.af;
import com.ibm.icu.util.a;
import com.ibm.icu.util.av;
import com.ibm.icu.util.b;
import com.ibm.icu.util.bf;
import com.ibm.icu.util.bl;
import com.ibm.icu.util.cn;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dl;
import com.ibm.icu.util.dm;
import java.io.ObjectInputStream;
import java.util.Date;

public class cq
extends b {
    private static final long z = -7034676239311322769L;
    public static final int a = 0;
    public static final int b = 1;
    public static final int i = 2;
    private static final byte[] A = new byte[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;
    private static final int E = 4;
    private int F;
    private int G = 3600000;
    private cn H = null;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private int U;
    private int V;
    private transient boolean W;
    private transient bl X;
    private transient dm Y;
    private transient a Z;
    private transient a aa;
    private transient boolean ab = false;

    public cq(int n2, String string) {
        super(string);
        this.b(n2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3600000);
    }

    public cq(int n2, String string, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        super(string);
        this.b(n2, n3, n4, n5, n6, 0, n7, n8, n9, n10, 0, 3600000);
    }

    public cq(int n2, String string, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        super(string);
        this.b(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13);
    }

    public cq(int n2, String string, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        super(string);
        this.b(n2, n3, n4, n5, n6, 0, n7, n8, n9, n10, 0, n11);
    }

    public void a_(String string) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        super.a_(string);
        this.W = false;
    }

    public void a(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.F = n2;
        this.W = false;
    }

    public int a() {
        return this.F;
    }

    public void b(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().a = n2;
        this.S = n2;
        this.W = false;
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().a(n2, n3, n4, n5, -1, false);
        this.a(n2, n3, n4, n5, 0);
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        assert (!this.f());
        this.I = n2;
        this.J = n3;
        this.K = n4;
        this.L = n5;
        this.M = n6;
        this.s();
        this.W = false;
    }

    public void a(int n2, int n3, int n4) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().a(n2, -1, -1, n4, n3, false);
        this.a(n2, n3, 0, n4, 0);
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().a(n2, -1, n4, n5, n3, bl2);
        this.a(n2, bl2 ? n3 : -n3, -n4, n5, 0);
    }

    public void b(int n2, int n3, int n4, int n5) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().b(n2, n3, n4, n5, -1, false);
        this.b(n2, n3, n4, n5, 0);
    }

    public void b(int n2, int n3, int n4) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().b(n2, -1, -1, n4, n3, false);
        this.b(n2, n3, 0, n4);
    }

    public void b(int n2, int n3, int n4, int n5, boolean bl2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.e().b(n2, -1, n4, n5, n3, bl2);
        this.a(n2, n3, n4, n5, 0, bl2);
    }

    private void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        assert (!this.f());
        this.b(n2, bl2 ? n3 : -n3, -n4, n5, n6);
    }

    private void b(int n2, int n3, int n4, int n5, int n6) {
        assert (!this.f());
        this.O = n2;
        this.P = n3;
        this.Q = n4;
        this.R = n5;
        this.N = n6;
        this.t();
        this.W = false;
    }

    public void c(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.G = n2;
        this.W = false;
    }

    public int d() {
        return this.G;
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.H != null) {
            this.H.a(this);
        }
    }

    public String toString() {
        return "SimpleTimeZone: " + this.l();
    }

    private cn e() {
        if (this.H == null) {
            this.H = new cn();
        }
        return this.H;
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n4 < 0 || n4 > 11) {
            throw new IllegalArgumentException();
        }
        return this.a(n2, n3, n4, n5, n6, n7, af.a(n3, n4));
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n4 < 0 || n4 > 11) {
            throw new IllegalArgumentException();
        }
        return this.a(n2, n3, n4, n5, n6, n7, af.a(n3, n4), af.b(n3, n4));
    }

    private int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n2 != 1 && n2 != 0 || n4 < 0 || n4 > 11 || n5 < 1 || n5 > n8 || n6 < 1 || n6 > 7 || n7 < 0 || n7 >= 86400000 || n8 < 28 || n8 > 31 || n9 < 28 || n9 > 31) {
            throw new IllegalArgumentException();
        }
        int n10 = this.F;
        if (!this.T || n3 < this.S || n2 != 1) {
            return n10;
        }
        boolean bl2 = this.I > this.O;
        int n11 = this.a(n4, n8, n9, n5, n6, n7, this.M == 2 ? -this.F : 0, this.U, this.I, this.K, this.J, this.L);
        int n12 = 0;
        if (bl2 != n11 >= 0) {
            n12 = this.a(n4, n8, n9, n5, n6, n7, this.N == 0 ? this.G : (this.N == 2 ? -this.F : 0), this.V, this.O, this.Q, this.P, this.R);
        }
        if (!bl2 && n11 >= 0 && n12 < 0 || bl2 && (n11 >= 0 || n12 < 0)) {
            n10 += this.G;
        }
        return n10;
    }

    public void a(long l2, int n2, int n3, int[] arrn) {
        arrn[0] = this.a();
        int[] arrn2 = new int[6];
        af.b(l2, arrn2);
        arrn[1] = this.a(1, arrn2[0], arrn2[1], arrn2[2], arrn2[3], arrn2[5]) - arrn[0];
        boolean bl2 = false;
        if (arrn[1] > 0) {
            if ((n2 & 3) == 1 || (n2 & 3) != 3 && (n2 & 0xC) != 12) {
                l2 -= (long)this.d();
                bl2 = true;
            }
        } else if ((n3 & 3) == 3 || (n3 & 3) != 1 && (n3 & 0xC) == 4) {
            l2 -= (long)this.d();
            bl2 = true;
        }
        if (bl2) {
            af.b(l2, arrn2);
            arrn[1] = this.a(1, arrn2[0], arrn2[1], arrn2[2], arrn2[3], arrn2[5]) - arrn[0];
        }
    }

    private int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        n7 += n8;
        while (n7 >= 86400000) {
            n7 -= 86400000;
            n6 = 1 + n6 % 7;
            if (++n5 <= n3) continue;
            n5 = 1;
            ++n2;
        }
        while (n7 < 0) {
            n6 = 1 + (n6 + 5) % 7;
            if (--n5 < 1) {
                n5 = n4;
                --n2;
            }
            n7 += 86400000;
        }
        if (n2 < n10) {
            return -1;
        }
        if (n2 > n10) {
            return 1;
        }
        int n14 = 0;
        if (n12 > n3) {
            n12 = n3;
        }
        switch (n9) {
            case 1: {
                n14 = n12;
                break;
            }
            case 2: {
                if (n12 > 0) {
                    n14 = 1 + (n12 - 1) * 7 + (7 + n11 - (n6 - n5 + 1)) % 7;
                    break;
                }
                n14 = n3 + (n12 + 1) * 7 - (7 + (n6 + n3 - n5) - n11) % 7;
                break;
            }
            case 3: {
                n14 = n12 + (49 + n11 - n12 - n6 + n5) % 7;
                break;
            }
            case 4: {
                n14 = n12 - (49 - n11 + n12 + n6 - n5) % 7;
            }
        }
        if (n5 < n14) {
            return -1;
        }
        if (n5 > n14) {
            return 1;
        }
        if (n7 < n13) {
            return -1;
        }
        if (n7 > n13) {
            return 1;
        }
        return 0;
    }

    public boolean b() {
        return this.T;
    }

    public boolean c() {
        return this.T;
    }

    public boolean a(Date date) {
        bf bf2 = new bf(this);
        bf2.a(date);
        return bf2.G();
    }

    private void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        this.F = n2;
        this.I = n3;
        this.J = n4;
        this.K = n5;
        this.L = n6;
        this.M = n7;
        this.O = n8;
        this.P = n9;
        this.Q = n10;
        this.R = n11;
        this.N = n12;
        this.G = n13;
        this.S = 0;
        this.U = 1;
        this.V = 1;
        this.r();
        if (n13 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    private void r() {
        this.s();
        this.t();
    }

    private void s() {
        boolean bl2 = this.T = this.J != 0 && this.P != 0;
        if (this.T && this.G == 0) {
            this.G = 86400000;
        }
        if (this.J != 0) {
            if (this.I < 0 || this.I > 11) {
                throw new IllegalArgumentException();
            }
            if (this.L < 0 || this.L > 86400000 || this.M < 0 || this.M > 2) {
                throw new IllegalArgumentException();
            }
            if (this.K == 0) {
                this.U = 1;
            } else {
                if (this.K > 0) {
                    this.U = 2;
                } else {
                    this.K = -this.K;
                    if (this.J > 0) {
                        this.U = 3;
                    } else {
                        this.J = -this.J;
                        this.U = 4;
                    }
                }
                if (this.K > 7) {
                    throw new IllegalArgumentException();
                }
            }
            if (this.U == 2 ? this.J < -5 || this.J > 5 : this.J < 1 || this.J > A[this.I]) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void t() {
        boolean bl2 = this.T = this.J != 0 && this.P != 0;
        if (this.T && this.G == 0) {
            this.G = 86400000;
        }
        if (this.P != 0) {
            if (this.O < 0 || this.O > 11) {
                throw new IllegalArgumentException();
            }
            if (this.R < 0 || this.R > 86400000 || this.N < 0 || this.N > 2) {
                throw new IllegalArgumentException();
            }
            if (this.Q == 0) {
                this.V = 1;
            } else {
                if (this.Q > 0) {
                    this.V = 2;
                } else {
                    this.Q = -this.Q;
                    if (this.P > 0) {
                        this.V = 3;
                    } else {
                        this.P = -this.P;
                        this.V = 4;
                    }
                }
                if (this.Q > 7) {
                    throw new IllegalArgumentException();
                }
            }
            if (this.V == 2 ? this.P < -5 || this.P > 5 : this.P < 1 || this.P > A[this.O]) {
                throw new IllegalArgumentException();
            }
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cq cq2 = (cq)object;
        return this.F == cq2.F && this.T == cq2.T && this.a(this.l(), cq2.l()) && (!this.T || this.G == cq2.G && this.U == cq2.U && this.I == cq2.I && this.J == cq2.J && this.K == cq2.K && this.L == cq2.L && this.M == cq2.M && this.V == cq2.V && this.O == cq2.O && this.P == cq2.P && this.Q == cq2.Q && this.R == cq2.R && this.N == cq2.N && this.S == cq2.S);
    }

    private boolean a(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string != null && string2 != null) {
            return string.equals(string2);
        }
        return false;
    }

    public int hashCode() {
        int n2 = super.hashCode() + this.F ^ (this.F >>> 8) + (this.T ? 0 : 1);
        if (!this.T) {
            n2 += this.G ^ (this.G >>> 10) + this.U ^ (this.U >>> 11) + this.I ^ (this.I >>> 12) + this.J ^ (this.J >>> 13) + this.K ^ (this.K >>> 14) + this.L ^ (this.L >>> 15) + this.M ^ (this.M >>> 16) + this.V ^ (this.V >>> 17) + this.O ^ (this.O >>> 18) + this.P ^ (this.P >>> 19) + this.Q ^ (this.Q >>> 20) + this.R ^ (this.R >>> 21) + this.N ^ (this.N >>> 22) + this.S ^ this.S >>> 23;
        }
        return n2;
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    public boolean a(dj dj2) {
        if (this == dj2) {
            return true;
        }
        if (!(dj2 instanceof cq)) {
            return false;
        }
        cq cq2 = (cq)dj2;
        return cq2 != null && this.F == cq2.F && this.T == cq2.T && (!this.T || this.G == cq2.G && this.U == cq2.U && this.I == cq2.I && this.J == cq2.J && this.K == cq2.K && this.L == cq2.L && this.M == cq2.M && this.V == cq2.V && this.O == cq2.O && this.P == cq2.P && this.Q == cq2.Q && this.R == cq2.R && this.N == cq2.N && this.S == cq2.S);
    }

    public dm a(long l2, boolean bl2) {
        if (!this.T) {
            return null;
        }
        this.u();
        long l3 = this.Y.a();
        if (l2 < l3 || bl2 && l2 == l3) {
            return this.Y;
        }
        Date date = this.Z.a(l2, this.aa.f(), this.aa.g(), bl2);
        Date date2 = this.aa.a(l2, this.Z.f(), this.Z.g(), bl2);
        if (date != null && (date2 == null || date.before(date2))) {
            return new dm(date.getTime(), this.aa, this.Z);
        }
        if (date2 != null && (date == null || date2.before(date))) {
            return new dm(date2.getTime(), this.Z, this.aa);
        }
        return null;
    }

    public dm b(long l2, boolean bl2) {
        if (!this.T) {
            return null;
        }
        this.u();
        long l3 = this.Y.a();
        if (l2 < l3 || !bl2 && l2 == l3) {
            return null;
        }
        Date date = this.Z.b(l2, this.aa.f(), this.aa.g(), bl2);
        Date date2 = this.aa.b(l2, this.Z.f(), this.Z.g(), bl2);
        if (date != null && (date2 == null || date.after(date2))) {
            return new dm(date.getTime(), this.aa, this.Z);
        }
        if (date2 != null && (date == null || date2.after(date))) {
            return new dm(date2.getTime(), this.Z, this.aa);
        }
        return null;
    }

    public dl[] k() {
        this.u();
        int n2 = this.T ? 3 : 1;
        dl[] arrdl = new dl[n2];
        arrdl[0] = this.X;
        if (this.T) {
            arrdl[1] = this.Z;
            arrdl[2] = this.aa;
        }
        return arrdl;
    }

    private synchronized void u() {
        if (this.W) {
            return;
        }
        if (this.T) {
            av av2 = null;
            int n2 = this.M == 1 ? 1 : (this.M == 2 ? 2 : 0);
            switch (this.U) {
                case 1: {
                    av2 = new av(this.I, this.J, this.L, n2);
                    break;
                }
                case 2: {
                    av2 = new av(this.I, this.J, this.K, this.L, n2);
                    break;
                }
                case 3: {
                    av2 = new av(this.I, this.J, this.K, true, this.L, n2);
                    break;
                }
                case 4: {
                    av2 = new av(this.I, this.J, this.K, false, this.L, n2);
                }
            }
            this.aa = new a(this.l() + "(DST)", this.a(), this.d(), av2, this.S, Integer.MAX_VALUE);
            long l2 = this.aa.a(this.a(), 0).getTime();
            n2 = this.N == 1 ? 1 : (this.N == 2 ? 2 : 0);
            switch (this.V) {
                case 1: {
                    av2 = new av(this.O, this.P, this.R, n2);
                    break;
                }
                case 2: {
                    av2 = new av(this.O, this.P, this.Q, this.R, n2);
                    break;
                }
                case 3: {
                    av2 = new av(this.O, this.P, this.Q, true, this.R, n2);
                    break;
                }
                case 4: {
                    av2 = new av(this.O, this.P, this.Q, false, this.R, n2);
                }
            }
            this.Z = new a(this.l() + "(STD)", this.a(), 0, av2, this.S, Integer.MAX_VALUE);
            long l3 = this.Z.a(this.a(), this.aa.g()).getTime();
            if (l3 < l2) {
                this.X = new bl(this.l() + "(DST)", this.a(), this.aa.g());
                this.Y = new dm(l3, this.X, this.Z);
            } else {
                this.X = new bl(this.l() + "(STD)", this.a(), 0);
                this.Y = new dm(l2, this.X, this.aa);
            }
        } else {
            this.X = new bl(this.l(), this.a(), 0);
        }
        this.W = true;
    }

    public boolean f() {
        return this.ab;
    }

    public dj g() {
        this.ab = true;
        return this;
    }

    public dj h() {
        cq cq2 = (cq)super.h();
        cq2.ab = false;
        return cq2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }
}

