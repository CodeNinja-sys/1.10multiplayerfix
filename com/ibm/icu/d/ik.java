/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.b.b;
import com.ibm.icu.d.hy;
import com.ibm.icu.d.hz;
import com.ibm.icu.d.il;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class ik {
    private hz a;
    private int b;
    private List c;

    ik(hz hz2, int n2) {
        this.b = n2;
        this.a = hz2;
        this.c = new ArrayList();
    }

    void a() {
        hy hy2;
        if (this.a.d[this.b] == null) {
            return;
        }
        this.a.d[this.b] = this.a.d[this.b].b();
        if (this.a.a != null && this.a.a.indexOf("ftree") >= 0) {
            System.out.println("Parse tree after flattening variable references.");
            this.a.d[this.b].a(true);
        }
        if (this.a.m.d()) {
            hy hy3;
            hy2 = new hy(8);
            hy2.z = hy3 = new hy(3);
            hy2.A = this.a.d[this.b];
            hy3.y = hy2;
            hy3.H = 2;
            this.a.d[this.b] = hy2;
        }
        hy2 = new hy(8);
        hy2.z = this.a.d[this.b];
        this.a.d[this.b].y = hy2;
        hy2.A = new hy(6);
        hy2.A.y = hy2;
        this.a.d[this.b] = hy2;
        this.a.d[this.b].c();
        if (this.a.a != null && this.a.a.indexOf("stree") >= 0) {
            System.out.println("Parse tree after flattening Unicode Set references.");
            this.a.d[this.b].a(true);
        }
        this.a(this.a.d[this.b]);
        this.b(this.a.d[this.b]);
        this.c(this.a.d[this.b]);
        this.d(this.a.d[this.b]);
        if (this.a.a != null && this.a.a.indexOf("pos") >= 0) {
            System.out.print("\n");
            this.f(this.a.d[this.b]);
        }
        if (this.a.j) {
            this.e(this.a.d[this.b]);
        }
        if (this.a.m.d()) {
            this.b();
        }
        this.c();
        this.d();
        this.e();
        this.f();
        this.g();
        if (this.a.a != null && this.a.a.indexOf("states") >= 0) {
            this.j();
        }
    }

    void a(hy hy2) {
        if (hy2 == null) {
            return;
        }
        if (hy2.x == 0 || hy2.x == 6) {
            hy2.G = false;
            return;
        }
        if (hy2.x == 4 || hy2.x == 5) {
            hy2.G = true;
            return;
        }
        this.a(hy2.z);
        this.a(hy2.A);
        hy2.G = hy2.x == 9 ? hy2.z.G || hy2.A.G : (hy2.x == 8 ? hy2.z.G && hy2.A.G : hy2.x == 10 || hy2.x == 12);
    }

    void b(hy hy2) {
        if (hy2 == null) {
            return;
        }
        if (hy2.x == 3 || hy2.x == 6 || hy2.x == 4 || hy2.x == 5) {
            hy2.J.add(hy2);
            return;
        }
        this.b(hy2.z);
        this.b(hy2.A);
        if (hy2.x == 9) {
            hy2.J.addAll(hy2.z.J);
            hy2.J.addAll(hy2.A.J);
        } else if (hy2.x == 8) {
            hy2.J.addAll(hy2.z.J);
            if (hy2.z.G) {
                hy2.J.addAll(hy2.A.J);
            }
        } else if (hy2.x == 10 || hy2.x == 12 || hy2.x == 11) {
            hy2.J.addAll(hy2.z.J);
        }
    }

    void c(hy hy2) {
        if (hy2 == null) {
            return;
        }
        if (hy2.x == 3 || hy2.x == 6 || hy2.x == 4 || hy2.x == 5) {
            hy2.K.add(hy2);
            return;
        }
        this.c(hy2.z);
        this.c(hy2.A);
        if (hy2.x == 9) {
            hy2.K.addAll(hy2.z.K);
            hy2.K.addAll(hy2.A.K);
        } else if (hy2.x == 8) {
            hy2.K.addAll(hy2.A.K);
            if (hy2.A.G) {
                hy2.K.addAll(hy2.z.K);
            }
        } else if (hy2.x == 10 || hy2.x == 12 || hy2.x == 11) {
            hy2.K.addAll(hy2.z.K);
        }
    }

    void d(hy hy2) {
        if (hy2 == null || hy2.x == 3 || hy2.x == 6) {
            return;
        }
        this.d(hy2.z);
        this.d(hy2.A);
        if (hy2.x == 8) {
            for (hy hy3 : hy2.z.K) {
                hy3.L.addAll(hy2.A.J);
            }
        }
        if (hy2.x == 10 || hy2.x == 11) {
            for (hy hy3 : hy2.K) {
                hy3.L.addAll(hy2.J);
            }
        }
    }

    void e(hy hy2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hy2.a(arrayList, 6);
        hy2.a(arrayList2, 3);
        hy hy3 = hy2;
        if (this.a.m.d()) {
            hy3 = hy2.z.A;
        }
        com.ibm.icu.a.a.a(hy3 != null);
        Set set = hy3.J;
        for (hy hy4 : arrayList2) {
            int n2;
            int n3;
            hy hy5 = null;
            for (hy hy6 : arrayList) {
                if (!hy4.L.contains(hy6)) continue;
                hy5 = hy4;
                break;
            }
            if (hy5 == null || this.a.k && (n3 = this.a.m.a(hy5.H)) != -1 && (n2 = com.ibm.icu.b.b.e(n3, 4104)) == 9) continue;
            for (hy hy6 : set) {
                if (hy6.x != 3 || hy5.H != hy6.H) continue;
                hy5.L.addAll(hy6.L);
            }
        }
    }

    void b() {
        hy hy2 = this.a.d[this.b].z.z;
        com.ibm.icu.a.a.a(hy2.x == 3);
        com.ibm.icu.a.a.a(hy2.H == 2);
        Set set = this.a.d[this.b].z.A.J;
        for (hy hy3 : set) {
            if (hy3.x != 3 || hy3.H != hy2.H) continue;
            hy2.L.addAll(hy3.L);
        }
    }

    void c() {
        int n2 = this.a.m.c() - 1;
        il il2 = new il(n2);
        this.c.add(il2);
        il il3 = new il(n2);
        il3.f.addAll(this.a.d[this.b].J);
        this.c.add(il3);
        block0: while (true) {
            il il4 = null;
            for (int i2 = 1; i2 < this.c.size(); ++i2) {
                il il5 = (il)this.c.get(i2);
                if (il5.a) continue;
                il4 = il5;
                break;
            }
            if (il4 == null) break;
            il4.a = true;
            int n3 = 1;
            while (true) {
                if (n3 > n2) continue block0;
                Set set = null;
                for (hy hy2 : il4.f) {
                    if (hy2.x != 3 || hy2.H != n3) continue;
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.addAll(hy2.L);
                }
                int n4 = 0;
                boolean bl2 = false;
                if (set != null) {
                    il il6;
                    com.ibm.icu.a.a.a(set.size() > 0);
                    for (int i3 = 0; i3 < this.c.size(); ++i3) {
                        il6 = (il)this.c.get(i3);
                        if (!((Object)set).equals(il6.f)) continue;
                        set = il6.f;
                        n4 = i3;
                        bl2 = true;
                        break;
                    }
                    if (!bl2) {
                        il6 = new il(n2);
                        il6.f = set;
                        this.c.add(il6);
                        n4 = this.c.size() - 1;
                    }
                    il4.g[n3] = n4;
                }
                ++n3;
            }
            break;
        }
    }

    void d() {
        ArrayList arrayList = new ArrayList();
        this.a.d[this.b].a(arrayList, 6);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            hy hy2 = (hy)arrayList.get(i2);
            for (int i3 = 0; i3 < this.c.size(); ++i3) {
                il il2 = (il)this.c.get(i3);
                if (!il2.f.contains(hy2)) continue;
                if (il2.b == 0) {
                    il2.b = hy2.H;
                    if (il2.b == 0) {
                        il2.b = -1;
                    }
                }
                if (il2.b == -1 && hy2.H != 0) {
                    il2.b = hy2.H;
                }
                if (!hy2.I) continue;
                il2.c = il2.b;
            }
        }
    }

    void e() {
        ArrayList arrayList = new ArrayList();
        this.a.d[this.b].a(arrayList, 4);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            hy hy2 = (hy)arrayList.get(i2);
            for (int i3 = 0; i3 < this.c.size(); ++i3) {
                il il2 = (il)this.c.get(i3);
                if (!il2.f.contains(hy2)) continue;
                il2.c = hy2.H;
            }
        }
    }

    void f() {
        ArrayList arrayList = new ArrayList();
        this.a.d[this.b].a(arrayList, 5);
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            hy hy2 = (hy)arrayList.get(i2);
            for (int i3 = 0; i3 < this.c.size(); ++i3) {
                il il2 = (il)this.c.get(i3);
                if (!il2.f.contains(hy2)) continue;
                il2.d.add(hy2.H);
            }
        }
    }

    void g() {
        Serializable serializable;
        Object object;
        Object object2;
        if (this.a.t.size() == 0) {
            this.a.t.add(1);
            this.a.t.add(0);
            object2 = new TreeSet();
            object = 0;
            this.a.s.put(object2, object);
            serializable = new TreeSet();
            serializable.add(object);
            this.a.s.put(object2, object);
        }
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            object2 = (il)this.c.get(i2);
            object = ((il)object2).d;
            serializable = (Integer)this.a.s.get(object);
            if (serializable == null) {
                serializable = Integer.valueOf(this.a.t.size());
                this.a.s.put(object, serializable);
                this.a.t.add(object.size());
                this.a.t.addAll(object);
            }
            ((il)object2).e = (Integer)serializable;
        }
    }

    void f(hy hy2) {
        if (hy2 == null) {
            return;
        }
        hy.a(hy2);
        System.out.print("         Nullable:  " + hy2.G);
        System.out.print("         firstpos:  ");
        this.a(hy2.J);
        System.out.print("         lastpos:   ");
        this.a(hy2.K);
        System.out.print("         followpos: ");
        this.a(hy2.L);
        this.f(hy2.z);
        this.f(hy2.A);
    }

    int h() {
        int n2 = 0;
        if (this.a.d[this.b] == null) {
            return 0;
        }
        n2 = 16;
        int n3 = this.c.size();
        int n4 = this.a.m.c();
        int n5 = 8 + 2 * n4;
        n2 += n3 * n5;
        while (n2 % 8 > 0) {
            ++n2;
        }
        return n2;
    }

    short[] i() {
        if (this.a.d[this.b] == null) {
            return new short[0];
        }
        com.ibm.icu.a.a.a(this.a.m.c() < 32767 && this.c.size() < 32767);
        int n2 = this.c.size();
        int n3 = 4 + this.a.m.c();
        int n4 = this.h() / 2;
        short[] arrs = new short[n4];
        arrs[0] = (short)(n2 >>> 16);
        arrs[1] = (short)(n2 & 0xFFFF);
        arrs[2] = (short)(n3 >>> 16);
        arrs[3] = (short)(n3 & 0xFFFF);
        int n5 = 0;
        if (this.a.l) {
            n5 |= 1;
        }
        if (this.a.m.d()) {
            n5 |= 2;
        }
        arrs[4] = (short)(n5 >>> 16);
        arrs[5] = (short)(n5 & 0xFFFF);
        int n6 = this.a.m.c();
        for (int i2 = 0; i2 < n2; ++i2) {
            il il2 = (il)this.c.get(i2);
            int n7 = 8 + i2 * n3;
            com.ibm.icu.a.a.a(-32768 < il2.b && il2.b <= 32767);
            com.ibm.icu.a.a.a(-32768 < il2.c && il2.c <= 32767);
            arrs[n7 + 0] = (short)il2.b;
            arrs[n7 + 1] = (short)il2.c;
            arrs[n7 + 2] = (short)il2.e;
            for (int i3 = 0; i3 < n6; ++i3) {
                arrs[n7 + 4 + i3] = (short)il2.g[i3];
            }
        }
        return arrs;
    }

    void a(Collection collection) {
        for (hy hy2 : collection) {
            hy.a(hy2.M, 8);
        }
        System.out.println();
    }

    void j() {
        int n2;
        System.out.print("state |           i n p u t     s y m b o l s \n");
        System.out.print("      | Acc  LA    Tag");
        for (n2 = 0; n2 < this.a.m.c(); ++n2) {
            hy.a(n2, 3);
        }
        System.out.print("\n");
        System.out.print("      |---------------");
        for (n2 = 0; n2 < this.a.m.c(); ++n2) {
            System.out.print("---");
        }
        System.out.print("\n");
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            il il2 = (il)this.c.get(i2);
            hy.a(i2, 5);
            System.out.print(" | ");
            hy.a(il2.b, 3);
            hy.a(il2.c, 4);
            hy.a(il2.e, 6);
            System.out.print(" ");
            for (n2 = 0; n2 < this.a.m.c(); ++n2) {
                hy.a(il2.g[n2], 3);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }

    void k() {
        int n2 = 0;
        int n3 = 0;
        List list = this.a.t;
        System.out.print("index |  tags \n");
        System.out.print("-------------------\n");
        while (n3 < list.size()) {
            n2 = n3;
            n3 = n2 + (Integer)list.get(n2) + 1;
            hy.a(n2, 7);
            for (int i2 = n2 + 1; i2 < n3; ++i2) {
                int n4 = (Integer)list.get(i2);
                hy.a(n4, 7);
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
    }
}

