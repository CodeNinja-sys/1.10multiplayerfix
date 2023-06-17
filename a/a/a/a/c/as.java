/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.aq;
import a.a.a.a.c.ar;
import a.a.a.a.c.y;
import java.io.Serializable;
import java.util.Set;

public class as
extends y
implements aq,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected as() {
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        return ar.a;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    private Object b() {
        return ar.a;
    }
}

