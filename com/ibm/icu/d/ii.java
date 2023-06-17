/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.b.b;
import com.ibm.icu.d.hy;
import com.ibm.icu.d.ic;
import com.ibm.icu.d.ij;
import com.ibm.icu.d.jy;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.ld;
import com.ibm.icu.d.lf;
import java.text.ParsePosition;
import java.util.HashMap;

class ii
implements jy {
    String a;
    HashMap b;
    ic c;
    String d;
    lf e;

    ii(ic ic2, String string) {
        this.a = string;
        this.c = ic2;
        this.b = new HashMap();
        this.d = "\uffff";
    }

    public char[] a(String string) {
        String string2;
        ij ij2 = (ij)this.b.get(string);
        if (ij2 == null) {
            return null;
        }
        hy hy2 = ij2.b;
        while (hy2.z.x == 2) {
            hy2 = hy2.z;
        }
        hy hy3 = hy2.z;
        if (hy3.x == 0) {
            hy hy4 = hy3.z;
            this.e = hy4.B;
            string2 = this.d;
        } else {
            this.c.b(66063);
            string2 = hy3.D;
            this.e = null;
        }
        return string2.toCharArray();
    }

    public ld a(int n2) {
        lf lf2 = null;
        if (n2 == 65535) {
            lf2 = this.e;
            this.e = null;
        }
        return lf2;
    }

    public String a(String string, ParsePosition parsePosition, int n2) {
        int n3;
        int n4;
        int n5;
        String string2 = "";
        for (n4 = n3 = parsePosition.getIndex(); n4 < n2; n4 += kx.a(n5)) {
            n5 = kx.a(string, n4);
            if (n4 == n3 && !com.ibm.icu.b.b.t(n5) || !com.ibm.icu.b.b.s(n5)) break;
        }
        if (n4 == n3) {
            return string2;
        }
        parsePosition.setIndex(n4);
        string2 = string.substring(n3, n4);
        return string2;
    }

    hy b(String string) {
        hy hy2 = null;
        ij ij2 = (ij)this.b.get(string);
        if (ij2 != null) {
            hy2 = ij2.b;
        }
        return hy2;
    }

    void a(String string, hy hy2) {
        ij ij2 = (ij)this.b.get(string);
        if (ij2 != null) {
            this.c.b(66055);
            return;
        }
        ij2 = new ij();
        ij2.a = string;
        ij2.b = hy2;
        this.b.put(ij2.a, ij2);
    }

    void a() {
        ij ij2;
        int n2;
        System.out.print("Variable Definitions\nName               Node Val     String Val\n----------------------------------------------------------------------\n");
        ij[] arrij = this.b.values().toArray(new ij[0]);
        for (n2 = 0; n2 < arrij.length; ++n2) {
            ij2 = arrij[n2];
            System.out.print("  " + ij2.a + "  ");
            System.out.print("  " + ij2.b + "  ");
            System.out.print(ij2.b.z.D);
            System.out.print("\n");
        }
        System.out.println("\nParsed Variable Definitions\n");
        for (n2 = 0; n2 < arrij.length; ++n2) {
            ij2 = arrij[n2];
            System.out.print(ij2.a);
            ij2.b.z.a(true);
            System.out.print("\n");
        }
    }
}

