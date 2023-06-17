/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cy;
import a.a.a.a.a.eh;
import a.a.a.a.a.ek;
import a.a.a.a.a.el;
import a.a.a.a.a.em;
import a.a.a.a.a.en;

public class ei {
    public static final ek a = new ek();

    private ei() {
    }

    public static eh a(int n2) {
        return new el(n2, null);
    }

    public static eh a(int n2, cy cy2) {
        return new el(n2, cy2, null);
    }

    public static eh a(Object object) {
        return new el((int)((Integer)object), null);
    }

    public static eh a(Object object, cy cy2) {
        return new el((Integer)object, cy2, null);
    }

    public static eh a(eh eh2) {
        return new em(eh2);
    }

    public static eh a(eh eh2, Object object) {
        return new em(eh2, object);
    }

    public static eh b(eh eh2) {
        return new en(eh2);
    }
}

