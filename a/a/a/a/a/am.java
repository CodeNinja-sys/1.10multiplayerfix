/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ai;
import a.a.a.a.a.aq;
import a.a.a.a.a.du;

final class am
extends aq
implements du {
    final /* synthetic */ ai a;

    public am(ai ai2, int n2) {
        this.a = ai2;
        super(ai2, n2, null);
    }

    @Override
    public int b() {
        return this.a.j[this.f()];
    }

    @Override
    public void d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(int n2) {
        throw new UnsupportedOperationException();
    }

    public Integer c() {
        return this.a.j[this.f()];
    }

    public void a(Integer n2) {
        throw new UnsupportedOperationException();
    }

    public void b(Integer n2) {
        throw new UnsupportedOperationException();
    }

    public am(ai ai2) {
        this.a = ai2;
        super(ai2, null);
    }

    @Override
    public int a() {
        return this.a.j[this.e()];
    }

    public Integer d() {
        return this.a.j[this.e()];
    }

    public /* synthetic */ void add(Object object) {
        this.b((Integer)object);
    }

    public /* synthetic */ void set(Object object) {
        this.a((Integer)object);
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

