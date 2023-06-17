/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.m;

public class dq
extends m {
    protected final cr a;

    public dq(cr cr2) {
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
    public int a() {
        return this.a.a();
    }

    @Override
    public int b() {
        return this.a.b();
    }

    @Override
    public Integer d() {
        return (Integer)this.a.next();
    }

    @Override
    public Integer c() {
        return (Integer)this.a.previous();
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

