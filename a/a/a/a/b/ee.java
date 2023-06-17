/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cu;
import a.a.a.a.b.ec;
import a.a.a.a.b.ed;
import java.io.Serializable;
import java.util.Set;

public class ee
extends cu
implements ec,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected ee() {
    }

    @Override
    public boolean g(long l2) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        return ed.a;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    private Object b() {
        return ed.a;
    }
}

