/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.cv;
import java.io.InvalidObjectException;

public class bz
extends cv {
    private static final long z = -5102130532751400330L;
    public static final bz a = new bz("is leap month", 22);

    protected bz(String string, int n2) {
        super(string, n2);
    }

    public static cv a(int n2) {
        if (n2 == 22) {
            return a;
        }
        return cv.b(n2);
    }

    protected Object readResolve() {
        if (this.getClass() != bz.class) {
            throw new InvalidObjectException("A subclass of ChineseDateFormat.Field must implement readResolve.");
        }
        if (this.getName().equals(a.getName())) {
            return a;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}

