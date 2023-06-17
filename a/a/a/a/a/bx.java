/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bv;
import a.a.a.a.a.by;
import a.a.a.a.a.bz;
import a.a.a.a.a.ca;
import a.a.a.a.a.cb;
import a.a.a.a.a.cc;
import a.a.a.a.a.cy;
import java.util.Comparator;

public class bx {
    public static final bz a = new bz();

    private bx() {
    }

    public static Comparator a(cy cy2) {
        return new by(cy2);
    }

    public static bv a() {
        return a;
    }

    public static bv a(Integer n2, Object object) {
        return new ca(n2, object);
    }

    public static bv a(Integer n2, Object object, cy cy2) {
        return new ca(n2, object, cy2);
    }

    public static bv a(int n2, Object object) {
        return new ca(n2, object);
    }

    public static bv a(int n2, Object object, cy cy2) {
        return new ca(n2, object, cy2);
    }

    public static bv a(bv bv2) {
        return new cb(bv2);
    }

    public static bv a(bv bv2, Object object) {
        return new cb(bv2, object);
    }

    public static bv b(bv bv2) {
        return new cc(bv2);
    }
}

