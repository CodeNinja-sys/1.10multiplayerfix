/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.du;
import a.a.a.a.a.u;

public class ds
extends u {
    protected final du a;

    public ds(du du2) {
        this.a = du2;
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
    public int nextIndex() {
        return this.a.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.a.previousIndex();
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
    public /* synthetic */ Object previous() {
        return this.c();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.d();
    }
}

