/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.ep;
import com.sun.jna.a.d.eq;
import com.sun.jna.a.d.n;
import com.sun.jna.b.h;

public abstract class o {
    public static byte[] a(byte[] arrby) {
        return o.a(arrby, 0);
    }

    public static byte[] a(byte[] arrby, int n2) {
        return o.a(arrby, null, n2, "", null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(byte[] arrby, byte[] arrby2, int n2, String string, ep ep2) {
        eq eq2 = new eq(arrby);
        eq eq3 = new eq();
        eq eq4 = arrby2 == null ? null : new eq(arrby2);
        try {
            if (!n.g.a(eq2, string, eq4, null, ep2, n2, eq3)) {
                throw new dy(ac.g.f());
            }
            byte[] arrby3 = eq3.s();
            return arrby3;
        }
        finally {
            if (eq3.b != null) {
                ac.g.a(eq3.b);
            }
        }
    }

    public static byte[] b(byte[] arrby) {
        return o.b(arrby, 0);
    }

    public static byte[] b(byte[] arrby, int n2) {
        return o.a(arrby, null, n2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(byte[] arrby, byte[] arrby2, int n2, ep ep2) {
        eq eq2 = new eq(arrby);
        eq eq3 = new eq();
        eq eq4 = arrby2 == null ? null : new eq(arrby2);
        h h2 = new h();
        try {
            if (!n.g.a(eq2, h2, eq4, null, ep2, n2, eq3)) {
                throw new dy(ac.g.f());
            }
            byte[] arrby3 = eq3.s();
            return arrby3;
        }
        finally {
            if (eq3.b != null) {
                ac.g.a(eq3.b);
            }
            if (h2.d() != null) {
                ac.g.a(h2.d());
            }
        }
    }
}

