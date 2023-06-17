/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.aq;
import a.a.a.a.b.dv;

final class am
extends aq
implements dv {
    final /* synthetic */ ai a;

    public am(ai ai2, long l2) {
        this.a = ai2;
        super(ai2, l2, null);
    }

    @Override
    public long b() {
        return this.a.j[this.f()];
    }

    @Override
    public void b(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(long l2) {
        throw new UnsupportedOperationException();
    }

    public Long c() {
        return this.a.j[this.f()];
    }

    public void a(Long l2) {
        throw new UnsupportedOperationException();
    }

    public void b(Long l2) {
        throw new UnsupportedOperationException();
    }

    public am(ai ai2) {
        this.a = ai2;
        super(ai2, null);
    }

    @Override
    public long a() {
        return this.a.j[this.e()];
    }

    public Long d() {
        return this.a.j[this.e()];
    }

    public /* synthetic */ void add(Object object) {
        this.b((Long)object);
    }

    public /* synthetic */ void set(Object object) {
        this.a((Long)object);
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

