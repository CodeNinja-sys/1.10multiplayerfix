/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.aa;
import com.sun.jna.a.d.ab;
import com.sun.jna.a.d.by;
import com.sun.jna.a.d.dn;
import com.sun.jna.a.d.gh;

public abstract class bz {
    public static aa a(String string) {
        ab ab2 = new ab();
        gh gh2 = by.g.a(string, ab2);
        if (!gh2.equals(dn.Wj)) {
            throw new RuntimeException(gh2.toString());
        }
        return ab2;
    }

    public static String a(aa aa2) {
        int n2;
        char[] arrc;
        ab ab2 = new ab(aa2.g());
        int n3 = by.g.a(ab2, arrc = new char[n2 = 39], n2);
        if (n3 == 0) {
            throw new RuntimeException("StringFromGUID2");
        }
        arrc[n3 - 1] = '\u0000';
        return Native.a(arrc);
    }

    public static aa a() {
        ab ab2 = new ab();
        gh gh2 = by.g.a(ab2);
        if (!gh2.equals(dn.Wj)) {
            throw new RuntimeException(gh2.toString());
        }
        return ab2;
    }
}

