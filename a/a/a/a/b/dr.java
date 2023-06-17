/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.m;

public class dr
extends m {
    protected final cr a;

    public dr(cr cr2) {
        this.a = cr2;
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
    public Long d() {
        return (Long)this.a.next();
    }

    @Override
    public Long c() {
        return (Long)this.a.previous();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.d();
    }

    @Override
    public /* synthetic */ Object previous() {
        return this.c();
    }
}

