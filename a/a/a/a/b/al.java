/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.ao;
import a.a.a.a.b.aq;
import a.a.a.a.b.at;
import a.a.a.a.c.ap;

class al
extends aq
implements ap {
    final ao a;
    final /* synthetic */ ai b;

    public al(ai ai2) {
        this.b = ai2;
        super(ai2, null);
        this.a = new ao(this.b);
    }

    public al(ai ai2, long l2) {
        this.b = ai2;
        super(ai2, l2, null);
        this.a = new ao(this.b);
    }

    public ao a() {
        this.a.a = this.e();
        return this.a;
    }

    public ao b() {
        this.a.a = this.f();
        return this.a;
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

