/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.dv;
import a.a.a.a.b.m;

public abstract class u
extends m
implements dv {
    protected u() {
    }

    public void a(Long l2) {
        this.b((long)l2);
    }

    public void b(Long l2) {
        this.a((long)l2);
    }

    @Override
    public void b(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(long l2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void add(Object object) {
        this.b((Long)object);
    }

    public /* synthetic */ void set(Object object) {
        this.a((Long)object);
    }
}

