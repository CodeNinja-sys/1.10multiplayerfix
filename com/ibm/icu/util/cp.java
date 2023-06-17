/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.au;
import com.ibm.icu.util.bf;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.ch;
import com.ibm.icu.util.co;
import java.util.Date;

public class cp
extends bi {
    public static final cp a = new cp(0, 1, "New Year's Day");
    public static final cp b = new cp(0, 6, "Epiphany");
    public static final cp c = new cp(4, 1, "May Day");
    public static final cp d = new cp(7, 15, "Assumption");
    public static final cp e = new cp(10, 1, "All Saints' Day");
    public static final cp f = new cp(10, 2, "All Souls' Day");
    public static final cp g = new cp(11, 8, "Immaculate Conception");
    public static final cp h = new cp(11, 24, "Christmas Eve");
    public static final cp i = new cp(11, 25, "Christmas");
    public static final cp j = new cp(11, 26, "Boxing Day");
    public static final cp k = new cp(11, 26, "St. Stephen's Day");
    public static final cp l = new cp(11, 31, "New Year's Eve");

    public cp(int n2, int n3, String string) {
        super(string, new co(n2, n3));
    }

    public cp(int n2, int n3, String string, int n4) {
        super(string, cp.a(n4, 0, new co(n2, n3)));
    }

    public cp(int n2, int n3, String string, int n4, int n5) {
        super(string, cp.a(n4, n5, new co(n2, n3)));
    }

    public cp(int n2, int n3, int n4, String string) {
        super(string, new co(n2, n3, n4 > 0 ? n4 : -n4, n4 > 0));
    }

    public cp(int n2, int n3, int n4, String string, int n5) {
        super(string, cp.a(n5, 0, new co(n2, n3, n4 > 0 ? n4 : -n4, n4 > 0)));
    }

    public cp(int n2, int n3, int n4, String string, int n5, int n6) {
        super(string, cp.a(n5, n6, new co(n2, n3, n4 > 0 ? n4 : -n4, n4 > 0)));
    }

    private static au a(int n2, int n3, au au2) {
        Cloneable cloneable;
        if (n2 == 0 && n3 == 0) {
            return au2;
        }
        ch ch2 = new ch();
        if (n2 != 0) {
            cloneable = new bf(n2, 0, 1);
            ch2.a(cloneable.g(), au2);
        } else {
            ch2.a(au2);
        }
        if (n3 != 0) {
            cloneable = new bf(n3, 11, 31).g();
            ch2.a((Date)cloneable, (au)null);
        }
        return ch2;
    }
}

