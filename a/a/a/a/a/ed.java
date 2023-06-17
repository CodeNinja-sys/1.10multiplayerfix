/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cu;
import a.a.a.a.a.eb;
import a.a.a.a.a.ec;
import java.io.Serializable;
import java.util.Set;

public class ed
extends cu
implements eb,
Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected ed() {
    }

    @Override
    public boolean g(int n2) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        return ec.a;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    private Object b() {
        return ec.a;
    }
}

