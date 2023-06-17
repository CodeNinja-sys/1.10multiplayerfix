/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.lang.reflect.Method;
import net.java.games.input.dl;

final class dm {
    private static final dm[] z = new dm[255];
    public static final dm a = new dm(0);
    public static final dm b = new dm(1, w == null ? (w = dm.a("net.java.games.input.at")) : w);
    public static final dm c = new dm(2);
    public static final dm d = new dm(3);
    public static final dm e = new dm(4);
    public static final dm f = new dm(5);
    public static final dm g = new dm(7, x == null ? (x = dm.a("net.java.games.input.av")) : x);
    public static final dm h = new dm(8);
    public static final dm i = new dm(9, y == null ? (y = dm.a("net.java.games.input.j")) : y);
    public static final dm j = new dm(10);
    public static final dm k = new dm(11);
    public static final dm l = new dm(12);
    public static final dm m = new dm(13);
    public static final dm n = new dm(15);
    public static final dm o = new dm(16);
    public static final dm p = new dm(20);
    public static final dm q = new dm(132);
    public static final dm r = new dm(133);
    public static final dm s = new dm(140);
    public static final dm t = new dm(141);
    public static final dm u = new dm(144);
    public static final dm v = new dm(145);
    private final Class A;
    private final int B;
    static Class w;
    static Class x;
    static Class y;

    public static final dm a(int n2) {
        if (n2 < 0 || n2 >= z.length) {
            return null;
        }
        return z[n2];
    }

    private dm(int n2, Class class_) {
        dm.z[n2] = this;
        this.A = class_;
        this.B = n2;
    }

    private dm(int n2) {
        this(n2, null);
    }

    public final String toString() {
        return "UsagePage (0x" + Integer.toHexString(this.B) + ")";
    }

    public final dl b(int n2) {
        if (this.A == null) {
            return null;
        }
        try {
            Method method = this.A.getMethod("map", Integer.TYPE);
            Object object = method.invoke(null, new Integer(n2));
            return (dl)object;
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

