/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.ck;
import com.sun.jna.a.d.co;
import com.sun.jna.a.d.dn;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.es;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.gh;

public abstract class cl {
    public static String a(fg fg2, int n2, es es2) {
        char[] arrc = new char[260];
        gh gh2 = ck.g.a(fg2, n2, null, es2, arrc);
        if (!gh2.equals(dn.Wj)) {
            throw new dy(gh2);
        }
        return Native.a(arrc);
    }

    public static String a(int n2) {
        return cl.a(null, n2, co.a);
    }
}

