/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.a;
import com.ibm.icu.a.ar;
import com.ibm.icu.d.hy;
import com.ibm.icu.d.ic;
import com.ibm.icu.d.if;
import com.ibm.icu.d.ik;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class hz {
    String a;
    String b;
    ic c;
    hy[] d = new hy[4];
    static final int e = 0;
    static final int f = 1;
    static final int g = 2;
    static final int h = 3;
    int i = 0;
    boolean j;
    boolean k;
    boolean l;
    if m;
    List n;
    ik o;
    ik p;
    ik q;
    ik r;
    Map s = new HashMap();
    List t;
    static final int u = 66048;
    static final int v = 66049;
    static final int w = 66050;
    static final int x = 66051;
    static final int y = 66052;
    static final int z = 66053;
    static final int A = 66054;
    static final int B = 66055;
    static final int C = 66056;
    static final int D = 66057;
    static final int E = 66058;
    static final int F = 66059;
    static final int G = 66060;
    static final int H = 66061;
    static final int I = 66062;
    static final int J = 66063;
    static final int K = 66064;

    hz(String string) {
        this.a = ar.b("rbbi") ? ar.c("rbbi") : null;
        this.b = string;
        this.n = new ArrayList();
        this.t = new ArrayList();
        this.c = new ic(this);
        this.m = new if(this);
    }

    static final int a(int n2) {
        return n2 + 7 & 0xFFFFFFF8;
    }

    void a(OutputStream outputStream) {
        int n2;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        String string = ic.a(this.b);
        int n3 = 96;
        int n4 = hz.a(this.o.h());
        int n5 = hz.a(this.p.h());
        int n6 = hz.a(this.q.h());
        int n7 = hz.a(this.r.h());
        int n8 = hz.a(this.m.b());
        int n9 = hz.a(this.t.size() * 4);
        int n10 = hz.a(string.length() * 2);
        int n11 = n3 + n4 + n5 + n6 + n7 + n9 + n8 + n10;
        int n12 = 0;
        byte[] arrby = new byte[128];
        dataOutputStream.write(arrby);
        int[] arrn = new int[24];
        arrn[0] = 45472;
        arrn[1] = 0x3010000;
        arrn[2] = n11;
        arrn[3] = this.m.c();
        arrn[4] = n3;
        arrn[5] = n4;
        arrn[6] = arrn[4] + n4;
        arrn[7] = n5;
        arrn[8] = arrn[6] + n5;
        arrn[9] = n6;
        arrn[10] = arrn[8] + n6;
        arrn[11] = n7;
        arrn[12] = arrn[10] + n7;
        arrn[13] = this.m.b();
        arrn[16] = arrn[12] + arrn[13];
        arrn[17] = n9;
        arrn[14] = arrn[16] + n9;
        arrn[15] = string.length() * 2;
        for (n2 = 0; n2 < arrn.length; ++n2) {
            dataOutputStream.writeInt(arrn[n2]);
            n12 += 4;
        }
        short[] arrs = this.o.i();
        com.ibm.icu.a.a.a(n12 == arrn[4]);
        for (n2 = 0; n2 < arrs.length; ++n2) {
            dataOutputStream.writeShort(arrs[n2]);
            n12 += 2;
        }
        arrs = this.p.i();
        com.ibm.icu.a.a.a(n12 == arrn[6]);
        for (n2 = 0; n2 < arrs.length; ++n2) {
            dataOutputStream.writeShort(arrs[n2]);
            n12 += 2;
        }
        com.ibm.icu.a.a.a(n12 == arrn[8]);
        arrs = this.q.i();
        for (n2 = 0; n2 < arrs.length; ++n2) {
            dataOutputStream.writeShort(arrs[n2]);
            n12 += 2;
        }
        com.ibm.icu.a.a.a(n12 == arrn[10]);
        arrs = this.r.i();
        for (n2 = 0; n2 < arrs.length; ++n2) {
            dataOutputStream.writeShort(arrs[n2]);
            n12 += 2;
        }
        com.ibm.icu.a.a.a(n12 == arrn[12]);
        this.m.a(outputStream);
        n12 += arrn[13];
        while (n12 % 8 != 0) {
            dataOutputStream.write(0);
            ++n12;
        }
        com.ibm.icu.a.a.a(n12 == arrn[16]);
        for (Integer n13 : this.t) {
            dataOutputStream.writeInt(n13);
            n12 += 4;
        }
        while (n12 % 8 != 0) {
            dataOutputStream.write(0);
            ++n12;
        }
        com.ibm.icu.a.a.a(n12 == arrn[14]);
        dataOutputStream.writeChars(string);
        n12 += string.length() * 2;
        while (n12 % 8 != 0) {
            dataOutputStream.write(0);
            ++n12;
        }
    }

    static void a(String string, OutputStream outputStream) {
        hz hz2 = new hz(string);
        hz2.c.b();
        hz2.m.a();
        hz2.o = new ik(hz2, 0);
        hz2.p = new ik(hz2, 1);
        hz2.q = new ik(hz2, 2);
        hz2.r = new ik(hz2, 3);
        hz2.o.a();
        hz2.p.a();
        hz2.q.a();
        hz2.r.a();
        if (hz2.a != null && hz2.a.indexOf("states") >= 0) {
            hz2.o.k();
        }
        hz2.a(outputStream);
    }
}

