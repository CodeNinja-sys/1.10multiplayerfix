/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.p;
import a.a.a.a.f;
import java.io.Serializable;
import java.util.Arrays;

final class q
implements f,
Serializable {
    private static final long a = -7046029254386353129L;

    private q() {
    }

    public int a(Object[] arrobject) {
        return Arrays.hashCode(arrobject);
    }

    public boolean a(Object[] arrobject, Object[] arrobject2) {
        return Arrays.equals(arrobject, arrobject2);
    }

    /* synthetic */ q(p p2) {
        this();
    }
}

