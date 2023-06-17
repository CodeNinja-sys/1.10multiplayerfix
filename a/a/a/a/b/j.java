/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.m;
import a.a.a.a.c.v;
import java.util.Map;

public class j
extends m {
    protected final v a;

    public j(v v2) {
        this.a = v2;
    }

    @Override
    public long a() {
        return (Long)((Map.Entry)this.a.next()).getKey();
    }

    @Override
    public long b() {
        return (Long)((Map.Entry)this.a.previous()).getKey();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }
}

