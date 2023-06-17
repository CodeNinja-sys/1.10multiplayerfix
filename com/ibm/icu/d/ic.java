/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.jd;
import com.ibm.icu.b.b;
import com.ibm.icu.d.hy;
import com.ibm.icu.d.hz;
import com.ibm.icu.d.ia;
import com.ibm.icu.d.ib;
import com.ibm.icu.d.id;
import com.ibm.icu.d.ie;
import com.ibm.icu.d.ii;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import java.text.ParsePosition;
import java.util.HashMap;

class ic {
    private static final int w = 100;
    hz a;
    int b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    id h = new id();
    String i;
    short[] j = new short[100];
    int k;
    hy[] l = new hy[100];
    int m;
    boolean n;
    boolean o;
    ii p;
    HashMap q = new HashMap();
    lf[] r = new lf[10];
    int s;
    int t;
    private static String x = "[^[\\p{Z}\\u0020-\\u007f]-[\\p{L}]-[\\p{N}]]";
    private static String y = "[_\\p{L}\\p{N}]";
    private static String z = "[0-9]";
    private static String A = "[_\\p{L}]";
    private static String B = "[\\p{Pattern_White_Space}]";
    private static String C = "any";
    static final int u = 133;
    static final int v = 8232;

    ic(hz hz2) {
        this.a = hz2;
        this.e = 1;
        this.r[3] = new lf(x);
        this.r[4] = new lf(B);
        this.r[1] = new lf(y);
        this.r[2] = new lf(A);
        this.r[0] = new lf(z);
        this.p = new ii(this, hz2.b);
    }

    boolean a(int n2) {
        hy hy2 = null;
        boolean bl2 = true;
        switch (n2) {
            case 11: {
                this.d(7);
                ++this.s;
                break;
            }
            case 9: {
                this.c(4);
                hy hy3 = this.l[this.m--];
                hy hy4 = this.d(9);
                hy4.z = hy3;
                hy3.y = hy4;
                break;
            }
            case 7: {
                this.c(4);
                hy hy5 = this.l[this.m--];
                hy hy6 = this.d(8);
                hy6.z = hy5;
                hy5.y = hy6;
                break;
            }
            case 12: {
                this.d(15);
                break;
            }
            case 10: {
                this.c(2);
                break;
            }
            case 13: {
                break;
            }
            case 22: {
                hy2 = this.l[this.m - 1];
                hy2.E = this.c;
                this.d(7);
                break;
            }
            case 3: {
                this.c(1);
                hy hy7 = this.l[this.m - 2];
                hy hy8 = this.l[this.m - 1];
                hy hy9 = this.l[this.m];
                hy9.E = hy7.E;
                hy9.F = this.b;
                hy9.D = this.a.b.substring(hy9.E, hy9.F);
                hy8.z = hy9;
                hy9.y = hy8;
                this.p.a(hy8.D, hy8);
                this.m -= 3;
                break;
            }
            case 4: {
                int n3;
                hy hy10;
                hy hy11;
                this.c(1);
                if (this.a.a != null && this.a.a.indexOf("rtree") >= 0) {
                    this.b("end of rule");
                }
                com.ibm.icu.a.a.a(this.m == 1);
                if (this.o) {
                    hy hy12 = this.l[this.m];
                    hy11 = this.d(6);
                    hy10 = this.d(8);
                    this.m -= 2;
                    hy10.z = hy12;
                    hy10.A = hy11;
                    this.l[this.m] = hy10;
                    hy11.H = this.s;
                    hy11.I = true;
                }
                int n4 = n3 = this.n ? 1 : this.a.i;
                if (this.a.d[n3] != null) {
                    hy11 = this.l[this.m];
                    hy10 = this.a.d[n3];
                    hy hy13 = this.d(9);
                    hy13.z = hy10;
                    hy10.y = hy13;
                    hy13.A = hy11;
                    hy11.y = hy13;
                    this.a.d[n3] = hy13;
                } else {
                    this.a.d[n3] = this.l[this.m];
                }
                this.n = false;
                this.o = false;
                this.m = 0;
                break;
            }
            case 18: {
                this.b(66052);
                bl2 = false;
                break;
            }
            case 31: {
                this.b(66052);
                break;
            }
            case 28: {
                hy hy14 = this.l[this.m--];
                hy hy15 = this.d(11);
                hy15.z = hy14;
                hy14.y = hy15;
                break;
            }
            case 29: {
                hy hy16 = this.l[this.m--];
                hy hy17 = this.d(12);
                hy17.z = hy16;
                hy16.y = hy17;
                break;
            }
            case 30: {
                hy hy18 = this.l[this.m--];
                hy hy19 = this.d(10);
                hy19.z = hy18;
                hy18.y = hy19;
                break;
            }
            case 17: {
                hy2 = this.d(0);
                String string = String.valueOf((char)this.h.a);
                this.a(string, hy2, null);
                hy2.E = this.b;
                hy2.F = this.c;
                hy2.D = this.a.b.substring(hy2.E, hy2.F);
                break;
            }
            case 2: {
                hy2 = this.d(0);
                this.a(C, hy2, null);
                hy2.E = this.b;
                hy2.F = this.c;
                hy2.D = this.a.b.substring(hy2.E, hy2.F);
                break;
            }
            case 21: {
                hy2 = this.d(4);
                hy2.H = this.s;
                hy2.E = this.b;
                hy2.F = this.c;
                hy2.D = this.a.b.substring(hy2.E, hy2.F);
                this.o = true;
                break;
            }
            case 23: {
                hy2 = this.d(5);
                hy2.H = 0;
                hy2.E = this.b;
                hy2.F = this.c;
                break;
            }
            case 25: {
                hy2 = this.l[this.m];
                int n5 = com.ibm.icu.b.b.a((int)((char)this.h.a), 10);
                hy2.H = hy2.H * 10 + n5;
                break;
            }
            case 27: {
                hy2 = this.l[this.m];
                hy2.F = this.c;
                hy2.D = this.a.b.substring(hy2.E, hy2.F);
                break;
            }
            case 26: {
                this.b(66062);
                bl2 = false;
                break;
            }
            case 15: {
                this.t = this.b;
                break;
            }
            case 14: {
                String string = this.a.b.substring(this.t, this.b);
                if (string.equals("chain")) {
                    this.a.j = true;
                    break;
                }
                if (string.equals("LBCMNoChain")) {
                    this.a.k = true;
                    break;
                }
                if (string.equals("forward")) {
                    this.a.i = 0;
                    break;
                }
                if (string.equals("reverse")) {
                    this.a.i = 1;
                    break;
                }
                if (string.equals("safe_forward")) {
                    this.a.i = 2;
                    break;
                }
                if (string.equals("safe_reverse")) {
                    this.a.i = 3;
                    break;
                }
                if (string.equals("lookAheadHardBreak")) {
                    this.a.l = true;
                    break;
                }
                this.b(66061);
                break;
            }
            case 16: {
                this.n = true;
                break;
            }
            case 24: {
                hy2 = this.d(2);
                hy2.E = this.b;
                break;
            }
            case 5: {
                hy2 = this.l[this.m];
                if (hy2 == null || hy2.x != 2) {
                    this.b(66049);
                    break;
                }
                hy2.F = this.b;
                hy2.D = this.a.b.substring(hy2.E + 1, hy2.F);
                hy2.z = this.p.b(hy2.D);
                break;
            }
            case 1: {
                hy2 = this.l[this.m];
                if (hy2.z != null) break;
                this.b(66058);
                bl2 = false;
                break;
            }
            case 8: {
                break;
            }
            case 19: {
                this.b(66054);
                bl2 = false;
                break;
            }
            case 6: {
                bl2 = false;
                break;
            }
            case 20: {
                this.c();
                break;
            }
            default: {
                this.b(66049);
                bl2 = false;
            }
        }
        return bl2;
    }

    void b(int n2) {
        String string = "Error " + n2 + " at line " + this.e + " column " + this.f;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string);
        throw illegalArgumentException;
    }

    void c(int n2) {
        hy hy2;
        while (true) {
            hy2 = this.l[this.m - 1];
            if (hy2.C == 0) {
                System.out.print("RBBIRuleScanner.fixOpStack, bad operator node");
                this.b(66049);
                return;
            }
            if (hy2.C < n2 || hy2.C <= 2) break;
            hy2.A = this.l[this.m];
            this.l[this.m].y = hy2;
            --this.m;
        }
        if (n2 <= 2) {
            if (hy2.C != n2) {
                this.b(66056);
            }
            this.l[this.m - 1] = this.l[this.m];
            --this.m;
        }
    }

    void a(String string, hy hy2, lf lf2) {
        ie ie2 = (ie)this.q.get(string);
        if (ie2 != null) {
            hy2.z = ie2.b;
            com.ibm.icu.a.a.a(hy2.z.x == 1);
            return;
        }
        if (lf2 == null) {
            if (string.equals(C)) {
                lf2 = new lf(0, 0x10FFFF);
            } else {
                int n2 = kx.a(string, 0);
                lf2 = new lf(n2, n2);
            }
        }
        hy hy3 = new hy(1);
        hy3.B = lf2;
        hy3.y = hy2;
        hy2.z = hy3;
        hy3.D = string;
        this.a.n.add(hy3);
        ie2 = new ie();
        ie2.a = string;
        ie2.b = hy3;
        this.q.put(ie2.a, ie2);
    }

    static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        int n3 = 0;
        while (n3 < n2) {
            char c2;
            if ((c2 = string.charAt(n3++)) == '#') {
                while (n3 < n2 && c2 != '\r' && c2 != '\n' && c2 != '\u0085') {
                    c2 = string.charAt(n3++);
                }
            }
            if (com.ibm.icu.b.b.h(c2)) continue;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    int a() {
        if (this.c >= this.a.b.length()) {
            return -1;
        }
        int n2 = kx.a(this.a.b, this.c);
        this.c = kx.a(this.a.b, this.c, 1);
        if (n2 == 13 || n2 == 133 || n2 == 8232 || n2 == 10 && this.g != 13) {
            ++this.e;
            this.f = 0;
            if (this.d) {
                this.b(66057);
                this.d = false;
            }
        } else if (n2 != 10) {
            ++this.f;
        }
        this.g = n2;
        return n2;
    }

    void a(id id2) {
        this.b = this.c;
        id2.a = this.a();
        id2.b = false;
        if (id2.a == 39) {
            if (kx.a(this.a.b, this.c) == 39) {
                id2.a = this.a();
                id2.b = true;
            } else {
                this.d = !this.d;
                id2.a = this.d ? 40 : 41;
                id2.b = false;
                return;
            }
        }
        if (this.d) {
            id2.b = true;
        } else {
            if (id2.a == 35) {
                do {
                    id2.a = this.a();
                } while (id2.a != -1 && id2.a != 13 && id2.a != 10 && id2.a != 133 && id2.a != 8232);
            }
            if (id2.a == -1) {
                return;
            }
            if (id2.a == 92) {
                id2.b = true;
                int[] arrn = new int[]{this.c};
                id2.a = jd.a(this.a.b, arrn);
                if (arrn[0] == this.c) {
                    this.b(66050);
                }
                this.f += arrn[0] - this.c;
                this.c = arrn[0];
            }
        }
    }

    void b() {
        int n2 = 1;
        this.a(this.h);
        while (n2 != 0) {
            ib ib2 = ia.N[n2];
            if (this.a.a != null && this.a.a.indexOf("scan") >= 0) {
                System.out.println("char, line, col = ('" + (char)this.h.a + "', " + this.e + ", " + this.f + "    state = " + ib2.f);
            }
            int n3 = n2;
            while (true) {
                lf lf2;
                ib2 = ia.N[n3];
                if (this.a.a != null && this.a.a.indexOf("scan") >= 0) {
                    System.out.print(".");
                }
                if (ib2.b < 127 && !this.h.b && ib2.b == this.h.a || ib2.b == 255 || ib2.b == 254 && this.h.b || ib2.b == 253 && this.h.b && (this.h.a == 80 || this.h.a == 112) || ib2.b == 252 && this.h.a == -1 || ib2.b >= 128 && ib2.b < 240 && !this.h.b && this.h.a != -1 && (lf2 = this.r[ib2.b - 128]).b(this.h.a)) break;
                ++n3;
            }
            if (this.a.a != null && this.a.a.indexOf("scan") >= 0) {
                System.out.println("");
            }
            if (!this.a(ib2.a)) break;
            if (ib2.d != 0) {
                ++this.k;
                if (this.k >= 100) {
                    System.out.println("RBBIRuleScanner.parse() - state stack overflow.");
                    this.b(66049);
                }
                this.j[this.k] = ib2.d;
            }
            if (ib2.e) {
                this.a(this.h);
            }
            if (ib2.c != 255) {
                n2 = ib2.c;
                continue;
            }
            n2 = this.j[this.k];
            --this.k;
            if (this.k >= 0) continue;
            System.out.println("RBBIRuleScanner.parse() - state stack underflow.");
            this.b(66049);
        }
        if (this.a.d[1] == null) {
            this.a.d[1] = this.d(10);
            hy hy2 = this.d(0);
            this.a(C, hy2, null);
            this.a.d[1].z = hy2;
            hy2.y = this.a.d[1];
            this.m -= 2;
        }
        if (this.a.a != null && this.a.a.indexOf("symbols") >= 0) {
            this.p.a();
        }
        if (this.a.a != null && this.a.a.indexOf("ptree") >= 0) {
            System.out.println("Completed Forward Rules Parse Tree...");
            this.a.d[0].a(true);
            System.out.println("\nCompleted Reverse Rules Parse Tree...");
            this.a.d[1].a(true);
            System.out.println("\nCompleted Safe Point Forward Rules Parse Tree...");
            if (this.a.d[2] == null) {
                System.out.println("  -- null -- ");
            } else {
                this.a.d[2].a(true);
            }
            System.out.println("\nCompleted Safe Point Reverse Rules Parse Tree...");
            if (this.a.d[3] == null) {
                System.out.println("  -- null -- ");
            } else {
                this.a.d[3].a(true);
            }
        }
    }

    void b(String string) {
        System.out.println(string + ".  Dumping node stack...\n");
        for (int i2 = this.m; i2 > 0; --i2) {
            this.l[i2].a(true);
        }
    }

    hy d(int n2) {
        ++this.m;
        if (this.m >= 100) {
            System.out.println("RBBIRuleScanner.pushNewNode - stack overflow.");
            this.b(66049);
        }
        this.l[this.m] = new hy(n2);
        return this.l[this.m];
    }

    void c() {
        lf lf2 = null;
        ParsePosition parsePosition = new ParsePosition(this.b);
        int n2 = this.b;
        try {
            lf2 = new lf(this.a.b, parsePosition, this.p, 1);
        }
        catch (Exception exception) {
            this.b(66063);
        }
        if (lf2.b()) {
            this.b(66060);
        }
        int n3 = parsePosition.getIndex();
        while (this.c < n3) {
            this.a();
        }
        hy hy2 = this.d(0);
        hy2.E = n2;
        hy2.F = this.c;
        hy2.D = this.a.b.substring(hy2.E, hy2.F);
        this.a(hy2.D, hy2, lf2);
    }
}

