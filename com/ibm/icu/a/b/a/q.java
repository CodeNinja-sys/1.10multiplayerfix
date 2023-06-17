/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.a;
import com.ibm.icu.a.b.a.p;
import com.ibm.icu.a.b.a.v;
import com.ibm.icu.a.b.a.w;
import com.ibm.icu.a.b.x;
import java.util.Arrays;

public class q {
    final a a;
    String b;
    public static boolean c = false;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final int j = 6;

    public q(String string, a a2) {
        this.a = a2;
        this.b = string;
        if (string == null) {
            throw new NullPointerException("localename is null");
        }
        if (a2 == null) {
            throw new NullPointerException("data record is null");
        }
    }

    public int a() {
        return this.a.a;
    }

    public boolean b() {
        return this.a.G;
    }

    public boolean c() {
        return this.a.H;
    }

    public int d() {
        return this.a.I;
    }

    public boolean a(int n2, int n3, StringBuffer stringBuffer) {
        String string;
        int n4;
        p p2;
        if (this.a.J != null && (p2 = this.a.J[n4 = n2 * 3 + n3]) != null && (string = p2.a) != null) {
            stringBuffer.append(string);
            return p2.b;
        }
        return false;
    }

    public void b(int n2, int n3, StringBuffer stringBuffer) {
        String string;
        int n4;
        p p2;
        if (this.a.J != null && (p2 = this.a.J[n4 = n2 * 3 + n3]) != null && (string = p2.c) != null) {
            if (c) {
                System.out.println("appendSuffix '" + string + "'");
            }
            stringBuffer.append(string);
        }
    }

    public boolean a(x x2, int n2, int n3, int n4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, StringBuffer stringBuffer) {
        int n5 = x2.c();
        boolean bl7 = false;
        if (this.a.w != null && this.a.w[n5] && this.a.F != null) {
            if (!bl6 && bl5) {
                stringBuffer.append(this.a.F);
            }
            bl7 = true;
        }
        if (n4 != 0) {
            String[] arrstring;
            boolean bl8 = n4 == 1;
            String[] arrstring2 = arrstring = bl8 ? this.a.g : this.a.h;
            if (arrstring == null || arrstring[n5] == null) {
                String[] arrstring3 = arrstring = bl8 ? this.a.h : this.a.g;
            }
            if (arrstring != null && arrstring[n5] != null) {
                this.a(x2, false, false, n2, n3, bl2, arrstring[n5], bl5, stringBuffer);
                return false;
            }
        }
        if (n3 == 2 && this.a.n != null) {
            switch (this.a.n[n5]) {
                case 0: {
                    break;
                }
                case 2: {
                    if (n2 > 1000) break;
                }
                case 1: {
                    n2 = n2 / 500 * 500;
                    n3 = 3;
                }
            }
        }
        String string = null;
        int n6 = this.a(x2, n2, n3, bl4 && bl5);
        if (n6 == 4) {
            if (this.a.d == null) {
                n6 = 1;
                string = this.a.b[n5][n6];
            } else {
                string = this.a.d[n5];
            }
        } else if (n6 == 5) {
            string = this.a.b[n5][1];
        } else if (n6 == 6) {
            string = this.a.e[n5];
        } else {
            try {
                string = this.a.b[n5][n6];
            }
            catch (NullPointerException nullPointerException) {
                System.out.println("Null Pointer in PeriodFormatterData[" + this.b + "].au px: " + n5 + " form: " + n6 + " pn: " + Arrays.toString((Object[])this.a.b));
                throw nullPointerException;
            }
        }
        if (string == null) {
            n6 = 0;
            string = this.a.b[n5][n6];
        }
        boolean bl9 = n6 == 4 || n6 == 6 || this.a.A && n6 == 1 || this.a.B && n6 == 2;
        int n7 = this.a(x2, bl9, bl3, n2, n3, bl2, string, bl5, stringBuffer);
        if (bl5 && n7 >= 0) {
            String string2 = null;
            if (this.a.j != null && n7 < this.a.j.length) {
                string2 = this.a.j[n7];
            }
            if (string2 == null && this.a.k != null && n7 < this.a.k.length) {
                string2 = this.a.k[n7];
            }
            if (string2 != null) {
                stringBuffer.append(string2);
            }
        }
        return bl7;
    }

    public int a(x x2, boolean bl2, boolean bl3, int n2, int n3, boolean bl4, String string, boolean bl5, StringBuffer stringBuffer) {
        String string2;
        if (n3 == 2 && this.a.l == null) {
            n3 = 0;
        }
        if (!bl2 && bl3 && this.a.r != null) {
            stringBuffer.append(this.a.r);
        }
        int n4 = x2.c();
        block0 : switch (n3) {
            case 0: {
                if (bl2) break;
                this.b(n2 / 1000, 1, 10, stringBuffer);
                break;
            }
            case 1: {
                int n5 = n2 / 1000;
                if (x2 == x.h && (this.a.p != null || this.a.o != null) && n5 != 0 && n5 % 5 == 0) {
                    if (this.a.o != null && (n5 == 15 || n5 == 45)) {
                        int n6 = n5 = n5 == 15 ? 1 : 3;
                        if (!bl2) {
                            this.b(n5, 1, 10, stringBuffer);
                        }
                        string = this.a.o;
                        n4 = 8;
                        break;
                    }
                    if (this.a.p != null) {
                        n5 /= 5;
                        if (!bl2) {
                            this.b(n5, 1, 10, stringBuffer);
                        }
                        string = this.a.p;
                        n4 = 9;
                        break;
                    }
                }
                if (bl2) break;
                this.b(n5, 1, 10, stringBuffer);
                break;
            }
            case 2: {
                int n7;
                int n5 = n2 / 500;
                if (n5 != 1 && !bl2) {
                    this.a(n2, 1, 0, stringBuffer);
                }
                if ((n5 & 1) != 1) break;
                if (n5 == 1 && this.a.e != null && this.a.e[n4] != null) {
                    stringBuffer.append(string);
                    return bl5 ? n4 : -1;
                }
                int n8 = n7 = n5 == 1 ? 0 : 1;
                if (this.a.c != null && this.a.l.length > 2 && this.a.c[n4] == 1) {
                    n7 += 2;
                }
                byte by2 = this.a.m == null ? (byte)0 : this.a.m[n7 & 1];
                String string3 = this.a.l[n7];
                String string4 = this.a.i == null ? null : this.a.i[n4];
                switch (by2) {
                    case 0: {
                        stringBuffer.append(string3);
                        break block0;
                    }
                    case 1: {
                        if (string4 != null) {
                            stringBuffer.append(string4);
                            stringBuffer.append(string3);
                            if (bl4 && !bl2) {
                                stringBuffer.append(this.a.s);
                            }
                        } else {
                            stringBuffer.append(string);
                            stringBuffer.append(string3);
                            return bl5 ? n4 : -1;
                        }
                        stringBuffer.append(string);
                        return -1;
                    }
                    case 2: {
                        if (string4 != null) {
                            stringBuffer.append(string4);
                        }
                        if (bl4 && !bl2) {
                            stringBuffer.append(this.a.s);
                        }
                        stringBuffer.append(string);
                        stringBuffer.append(string3);
                        return bl5 ? n4 : -1;
                    }
                }
                break;
            }
            default: {
                int n5 = 1;
                switch (n3) {
                    case 4: {
                        n5 = 2;
                        break;
                    }
                    case 5: {
                        n5 = 3;
                        break;
                    }
                }
                if (bl2) break;
                this.a(n2, 1, n5, stringBuffer);
            }
        }
        if (!bl2 && bl4) {
            stringBuffer.append(this.a.s);
        }
        if (!bl2 && this.a.i != null && n4 < this.a.i.length && (string2 = this.a.i[n4]) != null) {
            stringBuffer.append(string2);
        }
        stringBuffer.append(string);
        return bl5 ? n4 : -1;
    }

    public void a(int n2, int n3, int n4, StringBuffer stringBuffer) {
        int n5 = n2 / 1000;
        if (n4 == 0) {
            this.b(n5, n3, 10, stringBuffer);
            return;
        }
        if (this.a.q && stringBuffer.length() > 0) {
            stringBuffer.append(' ');
        }
        this.a((long)n5, n3, 10, stringBuffer);
        int n6 = n2 % 1000;
        if (n4 == 1) {
            n6 /= 100;
        } else if (n4 == 2) {
            n6 /= 10;
        }
        stringBuffer.append(this.a.z);
        this.a((long)n6, n4, n4, stringBuffer);
        if (this.a.q) {
            stringBuffer.append(' ');
        }
    }

    public void b(int n2, int n3, int n4, StringBuffer stringBuffer) {
        String string;
        if (this.a.f != null && n2 < this.a.f.length && (string = this.a.f[n2]) != null) {
            stringBuffer.append(string);
            return;
        }
        if (this.a.q && stringBuffer.length() > 0) {
            stringBuffer.append(' ');
        }
        switch (this.a.x) {
            case 0: {
                this.a((long)n2, n3, n4, stringBuffer);
                break;
            }
            case 1: {
                stringBuffer.append(v.a(n2, w.g));
                break;
            }
            case 2: {
                stringBuffer.append(v.a(n2, w.h));
                break;
            }
            case 3: {
                stringBuffer.append(v.a(n2, w.i));
            }
        }
        if (this.a.q) {
            stringBuffer.append(' ');
        }
    }

    public void a(long l2, int n2, int n3, StringBuffer stringBuffer) {
        char[] arrc = new char[n3];
        int n4 = n3;
        while (n4 > 0 && l2 > 0L) {
            arrc[--n4] = (char)((long)this.a.y + l2 % 10L);
            l2 /= 10L;
        }
        int n5 = n3 - n2;
        while (n4 > n5) {
            arrc[--n4] = this.a.y;
        }
        stringBuffer.append(arrc, n4, n3 - n4);
    }

    public void a(StringBuffer stringBuffer) {
        if (this.a.F != null) {
            stringBuffer.append(this.a.F);
        }
    }

    public boolean a(x x2, boolean bl2, boolean bl3, boolean bl4, StringBuffer stringBuffer) {
        if (bl2 && this.a.u != null || this.a.t != null) {
            if (bl2 && this.a.u != null) {
                int n2 = (bl3 ? 2 : 0) + (bl4 ? 1 : 0);
                stringBuffer.append(this.a.u[n2]);
                return this.a.v != null && this.a.v[n2];
            }
            stringBuffer.append(this.a.t);
        }
        return false;
    }

    private int a(x x2, int n2, int n3, boolean bl2) {
        int n4;
        if (c) {
            System.err.println("pfd.cf unit: " + x2 + " count: " + n2 + " cv: " + n3 + " dr.pl: " + this.a.a);
            Thread.dumpStack();
        }
        if (this.a.a == 0) {
            return 0;
        }
        int n5 = n2 / 1000;
        block0 : switch (n3) {
            case 0: 
            case 1: {
                break;
            }
            case 2: {
                switch (this.a.E) {
                    case 0: {
                        return 0;
                    }
                    case 1: 
                    case 2: {
                        n4 = n2 / 500;
                        if (n4 == 1) {
                            if (this.a.e != null && this.a.e[x2.c()] != null) {
                                return 6;
                            }
                            return 5;
                        }
                        if ((n4 & 1) != 1) break block0;
                        if (this.a.a == 5 && n4 > 21) {
                            return 5;
                        }
                        if (n4 != 3 || this.a.a != 1 || this.a.E == 2) break block0;
                        return 0;
                    }
                    case 3: {
                        n4 = n2 / 500;
                        if (n4 != 1 && n4 != 3) break block0;
                        return 3;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            default: {
                switch (this.a.D) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        return 5;
                    }
                    case 2: {
                        if (n2 >= 1000) break;
                        return 5;
                    }
                    case 3: {
                        if (this.a.a != 3) break;
                        return 3;
                    }
                }
                return 0;
            }
        }
        if (c && n2 == 0) {
            System.err.println("EZeroHandling = " + this.a.C);
        }
        if (n2 == 0 && this.a.C == 1) {
            return 4;
        }
        n4 = 0;
        switch (this.a.a) {
            case 0: {
                break;
            }
            case 1: {
                if (n5 != 1) break;
                n4 = 4;
                break;
            }
            case 2: {
                if (n5 == 2) {
                    n4 = 2;
                    break;
                }
                if (n5 != 1) break;
                n4 = 1;
                break;
            }
            case 3: {
                int n6 = n5;
                if ((n6 %= 100) > 20) {
                    n6 %= 10;
                }
                if (n6 == 1) {
                    n4 = 1;
                    break;
                }
                if (n6 <= 1 || n6 >= 5) break;
                n4 = 3;
                break;
            }
            case 4: {
                if (n5 == 2) {
                    n4 = 2;
                    break;
                }
                if (n5 == 1) {
                    if (bl2) {
                        n4 = 4;
                        break;
                    }
                    n4 = 1;
                    break;
                }
                if (x2 != x.c || n5 <= 11) break;
                n4 = 5;
                break;
            }
            case 5: {
                if (n5 == 2) {
                    n4 = 2;
                    break;
                }
                if (n5 == 1) {
                    n4 = 1;
                    break;
                }
                if (n5 <= 10) break;
                n4 = 5;
                break;
            }
            default: {
                System.err.println("dr.pl is " + this.a.a);
                throw new IllegalStateException();
            }
        }
        return n4;
    }
}

