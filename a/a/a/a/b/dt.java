/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.dv;
import a.a.a.a.b.u;

public class dt
extends u {
    protected final dv a;

    public dt(dv dv2) {
        this.a = dv2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override
    public long a() {
        return this.a.a();
    }

    @Override
    public long b() {
        return this.a.b();
    }

    @Override
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.a.previousIndex();
    }

    @Override
    public Long d() {
        return (Long)this.a.next();
    }

    @Override
    public Long c() {
        return (Long)this.a.previous();
    }

    @Override
    public /* synthetic */ Object previous() {
        return this.c();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.d();
    }
}

