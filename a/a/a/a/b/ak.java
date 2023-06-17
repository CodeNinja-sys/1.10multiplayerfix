/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.ao;
import a.a.a.a.b.aq;
import a.a.a.a.b.at;
import a.a.a.a.c.ap;

class ak
extends aq
implements ap {
    private ao b;
    final /* synthetic */ ai a;

    public ak(ai ai2) {
        this.a = ai2;
        super(ai2, null);
    }

    public ak(ai ai2, long l2) {
        this.a = ai2;
        super(ai2, l2, null);
    }

    public ao a() {
        this.b = new ao(this.a, this.e());
        return this.b;
    }

    public ao b() {
        this.b = new ao(this.a, this.f());
        return this.b;
    }

    @Override
    public void remove() {
        super.remove();
        this.b.a = -1;
    }

    public void a(at at2) {
        throw new UnsupportedOperationException();
    }

    public void b(at at2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void add(Object object) {
        this.b((at)object);
    }

    public /* synthetic */ void set(Object object) {
        this.a((at)object);
    }

    @Override
    public /* synthetic */ Object previous() {
        return this.b();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

