/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.cv;
import a.a.a.a.a.cw;
import a.a.a.a.a.cx;
import a.a.a.a.a.dg;

public class ct {
    private ct() {
    }

    public static cs a(cs cs2) {
        return new cw(cs2);
    }

    public static cs a(cs cs2, Object object) {
        return new cw(cs2, object);
    }

    public static cs b(cs cs2) {
        return new cx(cs2);
    }

    public static cs a(dg dg2) {
        if (dg2 instanceof cs) {
            return (cs)dg2;
        }
        return new cv(dg2);
    }
}

