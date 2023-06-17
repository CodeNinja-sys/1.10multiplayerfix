/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.aq;
import a.a.a.a.c.aw;
import a.a.a.a.c.az;
import a.a.a.a.c.ba;
import a.a.a.a.c.bb;
import a.a.a.a.c.bc;
import java.util.Comparator;

public class ax {
    public static final az a = new az();

    private ax() {
    }

    public static aq a() {
        return a;
    }

    public static aw a(Object object) {
        return new ba(object, null);
    }

    public static aw a(Object object, Comparator comparator) {
        return new ba(object, comparator, null);
    }

    public static aw a(aw aw2) {
        return new bb(aw2);
    }

    public static aw a(aw aw2, Object object) {
        return new bb(aw2, object);
    }

    public static aw b(aw aw2) {
        return new bc(aw2);
    }
}

