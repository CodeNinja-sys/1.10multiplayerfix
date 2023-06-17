/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.a;
import java.io.Serializable;

public class af
extends a
implements Serializable,
Cloneable {
    private static final long d = -7046029254386353129L;
    protected final int b;
    protected final Object c;

    protected af(int n2, Object object) {
        this.b = n2;
        this.c = object;
    }

    @Override
    public boolean b(int n2) {
        return this.b == n2;
    }

    @Override
    public Object c(int n2) {
        if (this.b == n2) {
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

