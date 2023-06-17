/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bv;
import a.a.a.a.b.by;
import a.a.a.a.b.bz;
import a.a.a.a.b.ca;
import a.a.a.a.b.cb;
import a.a.a.a.b.cc;
import a.a.a.a.b.cy;
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

    public static bv a(Long l2, Object object) {
        return new ca(l2, object);
    }

    public static bv a(Long l2, Object object, cy cy2) {
        return new ca(l2, object, cy2);
    }

    public static bv a(long l2, Object object) {
        return new ca(l2, object);
    }

    public static bv a(long l2, Object object, cy cy2) {
        return new ca(l2, object, cy2);
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

