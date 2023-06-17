/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.util.bf;
import java.io.InvalidObjectException;
import java.text.Format;
import java.util.HashMap;
import java.util.Map;

public class cv
extends Format.Field {
    private static final long a = -3627456821000730829L;
    private static final int z;
    private static final cv[] A;
    private static final Map B;
    public static final cv b;
    public static final cv c;
    public static final cv d;
    public static final cv e;
    public static final cv f;
    public static final cv g;
    public static final cv h;
    public static final cv i;
    public static final cv j;
    public static final cv k;
    public static final cv l;
    public static final cv m;
    public static final cv n;
    public static final cv o;
    public static final cv p;
    public static final cv q;
    public static final cv r;
    public static final cv s;
    public static final cv t;
    public static final cv u;
    public static final cv v;
    public static final cv w;
    public static final cv x;
    public static final cv y;
    private final int C;

    protected cv(String string, int n2) {
        super(string);
        this.C = n2;
        if (this.getClass() == cv.class) {
            B.put(string, this);
            if (n2 >= 0 && n2 < z) {
                cv.A[n2] = this;
            }
        }
    }

    public static cv b(int n2) {
        if (n2 < 0 || n2 >= z) {
            throw new IllegalArgumentException("Calendar field number is out of range");
        }
        return A[n2];
    }

    public int a() {
        return this.C;
    }

    protected Object readResolve() {
        if (this.getClass() != cv.class) {
            throw new InvalidObjectException("A subclass of DateFormat.Field must implement readResolve.");
        }
        Object v2 = B.get(this.getName());
        if (v2 == null) {
            throw new InvalidObjectException("Unknown attribute name.");
        }
        return v2;
    }

    static {
        bf bf2 = new bf();
        z = bf2.C();
        A = new cv[z];
        B = new HashMap(z);
        b = new cv("am pm", 9);
        c = new cv("day of month", 5);
        d = new cv("day of week", 7);
        e = new cv("day of week in month", 8);
        f = new cv("day of year", 6);
        g = new cv("era", 0);
        h = new cv("hour of day", 11);
        i = new cv("hour of day 1", -1);
        j = new cv("hour", 10);
        k = new cv("hour 1", -1);
        l = new cv("millisecond", 14);
        m = new cv("minute", 12);
        n = new cv("month", 2);
        o = new cv("second", 13);
        p = new cv("time zone", -1);
        q = new cv("week of month", 4);
        r = new cv("week of year", 3);
        s = new cv("year", 1);
        t = new cv("local day of week", 18);
        u = new cv("extended year", 19);
        v = new cv("Julian day", 20);
        w = new cv("milliseconds in day", 21);
        x = new cv("year for week of year", 17);
        y = new cv("quarter", -1);
    }
}

