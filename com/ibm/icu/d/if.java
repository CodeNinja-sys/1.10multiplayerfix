/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.cm;
import com.ibm.icu.d.hy;
import com.ibm.icu.d.hz;
import com.ibm.icu.d.ig;
import com.ibm.icu.d.ih;
import com.ibm.icu.d.lf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

class if {
    hz a;
    ih b;
    cm c;
    int d;
    int e;
    boolean f;
    ig g = new ig(this);

    if(hz hz2) {
        this.a = hz2;
    }

    void a() {
        ih ih2;
        Object object;
        Object object22;
        if (this.a.a != null && this.a.a.indexOf("usets") >= 0) {
            this.g();
        }
        this.b = new ih();
        this.b.a = 0;
        this.b.b = 0x10FFFF;
        for (Object object22 : this.a.n) {
            object = ((hy)object22).B;
            int n2 = ((lf)object).h();
            int n3 = 0;
            ih2 = this.b;
            while (n3 < n2) {
                int n4 = ((lf)object).i(n3);
                int n5 = ((lf)object).j(n3);
                while (ih2.b < n4) {
                    ih2 = ih2.e;
                }
                if (ih2.a < n4) {
                    ih2.a(n4);
                    continue;
                }
                if (ih2.b > n5) {
                    ih2.a(n5 + 1);
                }
                if (ih2.d.indexOf(object22) == -1) {
                    ih2.d.add(object22);
                }
                if (n5 == ih2.b) {
                    ++n3;
                }
                ih2 = ih2.e;
            }
        }
        if (this.a.a != null && this.a.a.indexOf("range") >= 0) {
            this.e();
        }
        ih2 = this.b;
        while (ih2 != null) {
            Object object3 = this.b;
            while (object3 != ih2) {
                if (((Object)ih2.d).equals(((ih)object3).d)) {
                    ih2.c = ((ih)object3).c;
                    break;
                }
                object3 = ((ih)object3).e;
            }
            if (ih2.c == 0) {
                ++this.e;
                ih2.c = this.e + 2;
                ih2.a();
                this.a(ih2.d, this.e + 2);
            }
            ih2 = ih2.e;
        }
        object22 = "eof";
        object = "bof";
        for (hy hy2 : this.a.n) {
            lf lf2 = hy2.B;
            if (lf2.j((String)object22)) {
                this.a(hy2, 1);
            }
            if (!lf2.j((String)object)) continue;
            this.a(hy2, 2);
            this.f = true;
        }
        if (this.a.a != null && this.a.a.indexOf("rgroup") >= 0) {
            this.f();
        }
        if (this.a.a != null && this.a.a.indexOf("esets") >= 0) {
            this.g();
        }
        this.c = new cm(null, 100000, 0, 0, true);
        ih2 = this.b;
        while (ih2 != null) {
            this.c.a(ih2.a, ih2.b + 1, ih2.c, true);
            ih2 = ih2.e;
        }
    }

    int b() {
        int n2 = 0;
        try {
            n2 = this.c.a(null, true, this.g);
        }
        catch (IOException iOException) {
            com.ibm.icu.a.a.a(false);
        }
        return n2;
    }

    void a(OutputStream outputStream) {
        this.c.a(outputStream, true, this.g);
    }

    void a(List list, int n2) {
        for (hy hy2 : list) {
            this.a(hy2, n2);
        }
    }

    void a(hy hy2, int n2) {
        hy hy3 = new hy(3);
        hy3.H = n2;
        if (hy2.z == null) {
            hy2.z = hy3;
            hy3.y = hy2;
        } else {
            hy hy4 = new hy(9);
            hy4.z = hy2.z;
            hy4.A = hy3;
            hy4.z.y = hy4;
            hy4.A.y = hy4;
            hy2.z = hy4;
            hy4.y = hy2;
        }
    }

    int c() {
        return this.e + 3;
    }

    boolean d() {
        return this.f;
    }

    int a(int n2) {
        int n3 = -1;
        ih ih2 = this.b;
        while (ih2 != null) {
            if (ih2.c == n2) {
                n3 = ih2.a;
                break;
            }
            ih2 = ih2.e;
        }
        return n3;
    }

    void e() {
        System.out.print("\n\n Nonoverlapping Ranges ...\n");
        ih ih2 = this.b;
        while (ih2 != null) {
            System.out.print(" " + ih2.c + "   " + ih2.a + "-" + ih2.b);
            for (int i2 = 0; i2 < ih2.d.size(); ++i2) {
                hy hy2;
                hy hy3 = (hy)ih2.d.get(i2);
                String string = "anon";
                hy hy4 = hy3.y;
                if (hy4 != null && (hy2 = hy4.y) != null && hy2.x == 2) {
                    string = hy2.D;
                }
                System.out.print(string);
                System.out.print("  ");
            }
            System.out.println("");
            ih2 = ih2.e;
        }
    }

    void f() {
        int n2 = 0;
        System.out.print("\nRanges grouped by Unicode Set Membership...\n");
        ih ih2 = this.b;
        while (ih2 != null) {
            int n3 = ih2.c & 0xBFFF;
            if (n3 > n2) {
                int n4;
                n2 = n3;
                if (n3 < 10) {
                    System.out.print(" ");
                }
                System.out.print(n3 + " ");
                if ((ih2.c & 0x4000) != 0) {
                    System.out.print(" <DICT> ");
                }
                for (n4 = 0; n4 < ih2.d.size(); ++n4) {
                    hy hy2;
                    hy hy3 = (hy)ih2.d.get(n4);
                    String string = "anon";
                    hy hy4 = hy3.y;
                    if (hy4 != null && (hy2 = hy4.y) != null && hy2.x == 2) {
                        string = hy2.D;
                    }
                    System.out.print(string);
                    System.out.print(" ");
                }
                n4 = 0;
                ih ih3 = ih2;
                while (ih3 != null) {
                    if (ih3.c == ih2.c) {
                        if (n4++ % 5 == 0) {
                            System.out.print("\n    ");
                        }
                        hy.b(ih3.a, -1);
                        System.out.print("-");
                        hy.b(ih3.b, 0);
                    }
                    ih3 = ih3.e;
                }
                System.out.print("\n");
            }
            ih2 = ih2.e;
        }
        System.out.print("\n");
    }

    void g() {
        System.out.print("\n\nUnicode Sets List\n------------------\n");
        for (int i2 = 0; i2 < this.a.n.size(); ++i2) {
            hy hy2;
            hy hy3 = (hy)this.a.n.get(i2);
            hy.a(2, i2);
            String string = "anonymous";
            hy hy4 = hy3.y;
            if (hy4 != null && (hy2 = hy4.y) != null && hy2.x == 2) {
                string = hy2.D;
            }
            System.out.print("  " + string);
            System.out.print("   ");
            System.out.print(hy3.D);
            System.out.print("\n");
            if (hy3.z == null) continue;
            hy3.z.a(true);
        }
        System.out.print("\n");
    }
}

