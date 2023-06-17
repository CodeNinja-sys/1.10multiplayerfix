/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.bv;
import com.sun.jna.a.d.dw;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.hj;
import com.sun.jna.b.e;

public abstract class bw {
    public static String a(hj hj2) {
        e e2 = new e();
        int n2 = bv.g.a(hj2, 0, null, 0, e2);
        if (n2 != -1073741789 || e2.d() <= 0) {
            throw new dy(n2);
        }
        dw dw2 = new dw(e2.d());
        n2 = bv.g.a(hj2, 0, dw2, e2.d(), e2);
        if (n2 != 0) {
            throw new dy(n2);
        }
        return dw2.s();
    }
}

