/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cy;
import a.a.a.a.b.ei;
import a.a.a.a.b.el;
import a.a.a.a.b.em;
import a.a.a.a.b.en;
import a.a.a.a.b.eo;

public class ej {
    public static final el a = new el();

    private ej() {
    }

    public static ei a(long l2) {
        return new em(l2, null);
    }

    public static ei a(long l2, cy cy2) {
        return new em(l2, cy2, null);
    }

    public static ei a(Object object) {
        return new em((long)((Long)object), null);
    }

    public static ei a(Object object, cy cy2) {
        return new em((Long)object, cy2, null);
    }

    public static ei a(ei ei2) {
        return new en(ei2);
    }

    public static ei a(ei ei2, Object object) {
        return new en(ei2, object);
    }

    public static ei b(ei ei2) {
        return new eo(ei2);
    }
}

