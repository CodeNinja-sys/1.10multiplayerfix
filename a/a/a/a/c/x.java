/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.aa;
import a.a.a.a.c.ab;
import a.a.a.a.c.ac;
import a.a.a.a.c.w;
import a.a.a.a.c.z;

public class x {
    private x() {
    }

    public static w a(w w2) {
        return new aa(w2);
    }

    public static w a(w w2, Object object) {
        return new aa(w2, object);
    }

    public static w b(w w2) {
        return new ab(w2);
    }

    public static w a(ac ac2) {
        if (ac2 instanceof w) {
            return (w)ac2;
        }
        return new z(ac2);
    }
}

