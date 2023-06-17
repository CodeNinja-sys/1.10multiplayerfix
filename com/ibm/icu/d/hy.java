/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.d.lf;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class hy {
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static final int e = 4;
    static final int f = 5;
    static final int g = 6;
    static final int h = 7;
    static final int i = 8;
    static final int j = 9;
    static final int k = 10;
    static final int l = 11;
    static final int m = 12;
    static final int n = 13;
    static final int o = 14;
    static final int p = 15;
    static final int q = 16;
    static final String[] r = new String[]{"setRef", "uset", "varRef", "leafChar", "lookAhead", "tag", "endMark", "opStart", "opCat", "opOr", "opStar", "opPlus", "opQuestion", "opBreak", "opReverse", "opLParen"};
    static final int s = 0;
    static final int t = 1;
    static final int u = 2;
    static final int v = 3;
    static final int w = 4;
    int x;
    hy y;
    hy z;
    hy A;
    lf B;
    int C = 0;
    String D;
    int E;
    int F;
    boolean G;
    int H;
    boolean I;
    Set J;
    Set K;
    Set L;
    int M;
    static int N;

    hy(int n2) {
        com.ibm.icu.a.a.a(n2 < 16);
        this.M = ++N;
        this.x = n2;
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.C = n2 == 8 ? 4 : (n2 == 9 ? 3 : (n2 == 7 ? 1 : (n2 == 15 ? 2 : 0)));
    }

    hy(hy hy2) {
        this.M = ++N;
        this.x = hy2.x;
        this.B = hy2.B;
        this.C = hy2.C;
        this.D = hy2.D;
        this.E = hy2.E;
        this.F = hy2.F;
        this.G = hy2.G;
        this.H = hy2.H;
        this.J = new HashSet(hy2.J);
        this.K = new HashSet(hy2.K);
        this.L = new HashSet(hy2.L);
    }

    hy a() {
        hy hy2;
        if (this.x == 2) {
            hy2 = this.z.a();
        } else if (this.x == 1) {
            hy2 = this;
        } else {
            hy2 = new hy(this);
            if (this.z != null) {
                hy2.z = this.z.a();
                hy2.z.y = hy2;
            }
            if (this.A != null) {
                hy2.A = this.A.a();
                hy2.A.y = hy2;
            }
        }
        return hy2;
    }

    hy b() {
        if (this.x == 2) {
            hy hy2 = this.z.a();
            return hy2;
        }
        if (this.z != null) {
            this.z = this.z.b();
            this.z.y = this;
        }
        if (this.A != null) {
            this.A = this.A.b();
            this.A.y = this;
        }
        return this;
    }

    void c() {
        hy hy2;
        hy hy3;
        hy hy4;
        com.ibm.icu.a.a.a(this.x != 0);
        if (this.z != null) {
            if (this.z.x == 0) {
                hy4 = this.z;
                hy3 = hy4.z;
                hy2 = hy3.z;
                this.z = hy2.a();
                this.z.y = this;
            } else {
                this.z.c();
            }
        }
        if (this.A != null) {
            if (this.A.x == 0) {
                hy4 = this.A;
                hy3 = hy4.z;
                hy2 = hy3.z;
                this.A = hy2.a();
                this.A.y = this;
            } else {
                this.A.c();
            }
        }
    }

    void a(List list, int n2) {
        if (this.x == n2) {
            list.add(this);
        }
        if (this.z != null) {
            this.z.a(list, n2);
        }
        if (this.A != null) {
            this.A.a(list, n2);
        }
    }

    static void a(hy hy2) {
        if (hy2 == null) {
            System.out.print(" -- null --\n");
        } else {
            hy.a(hy2.M, 10);
            hy.a(r[hy2.x], 11);
            hy.a(hy2.y == null ? 0 : hy2.y.M, 11);
            hy.a(hy2.z == null ? 0 : hy2.z.M, 11);
            hy.a(hy2.A == null ? 0 : hy2.A.M, 12);
            hy.a(hy2.E, 12);
            hy.a(hy2.H, 7);
            if (hy2.x == 2) {
                System.out.print(" " + hy2.D);
            }
        }
        System.out.println("");
    }

    static void a(String string, int n2) {
        int n3;
        for (n3 = n2; n3 < 0; ++n3) {
            System.out.print(' ');
        }
        for (n3 = string.length(); n3 < n2; ++n3) {
            System.out.print(' ');
        }
        System.out.print(string);
    }

    static void a(int n2, int n3) {
        String string = Integer.toString(n2);
        hy.a(string, Math.max(n3, string.length() + 1));
    }

    static void b(int n2, int n3) {
        String string = Integer.toString(n2, 16);
        String string2 = "00000".substring(0, Math.max(0, 5 - string.length()));
        string = string2 + string;
        hy.a(string, n3);
    }

    void a(boolean bl2) {
        if (bl2) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("    Serial       type     Parent  LeftChild  RightChild    position  value");
        }
        hy.a(this);
        if (this.x != 2) {
            if (this.z != null) {
                this.z.a(false);
            }
            if (this.A != null) {
                this.A.a(false);
            }
        }
    }
}

