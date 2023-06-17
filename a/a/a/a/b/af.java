/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.a;
import java.io.Serializable;

public class af
extends a
implements Serializable,
Cloneable {
    private static final long d = -7046029254386353129L;
    protected final long b;
    protected final Object c;

    protected af(long l2, Object object) {
        this.b = l2;
        this.c = object;
    }

    @Override
    public boolean b(long l2) {
        return this.b == l2;
    }

    @Override
    public Object c(long l2) {
        if (this.b == l2) {
            return this.c;
        }
        return this.a;
    }

    @Override
    public int size() {
        return 1;
    }

    public Object clone() {
        return this;
    }
}

