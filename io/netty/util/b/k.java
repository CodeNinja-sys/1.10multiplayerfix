/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.as;
import io.netty.util.b.at;
import io.netty.util.b.au;
import io.netty.util.b.l;
import io.netty.util.b.w;

public class k
extends l
implements at {
    public k(w w2) {
        super(w2);
    }

    protected k() {
    }

    @Override
    public at b(long l2, long l3) {
        if (l3 < 0L) {
            l3 = -1L;
            if (l2 < 0L) {
                throw new IllegalArgumentException("progress: " + l2 + " (expected: >= 0)");
            }
        } else if (l2 < 0L || l2 > l3) {
            throw new IllegalArgumentException("progress: " + l2 + " (expected: 0 <= progress <= total (" + l3 + "))");
        }
        if (this.isDone()) {
            throw new IllegalStateException("complete already");
        }
        this.d(l2, l3);
        return this;
    }

    @Override
    public boolean c(long l2, long l3) {
        if (l3 < 0L) {
            l3 = -1L;
            if (l2 < 0L || this.isDone()) {
                return false;
            }
        } else if (l2 < 0L || l2 > l3 || this.isDone()) {
            return false;
        }
        this.d(l2, l3);
        return true;
    }

    @Override
    public at j(ad ad2) {
        super.l(ad2);
        return this;
    }

    @Override
    public at j(ad ... arrad) {
        super.l(arrad);
        return this;
    }

    @Override
    public at i(ad ad2) {
        super.k(ad2);
        return this;
    }

    @Override
    public at i(ad ... arrad) {
        super.k(arrad);
        return this;
    }

    @Override
    public at A() {
        super.C();
        return this;
    }

    @Override
    public at z() {
        super.B();
        return this;
    }

    @Override
    public at y() {
        super.E();
        return this;
    }

    @Override
    public at x() {
        super.D();
        return this;
    }

    @Override
    public at a(Object object) {
        super.b(object);
        return this;
    }

    @Override
    public at e(Throwable throwable) {
        super.c(throwable);
        return this;
    }

    @Override
    public /* synthetic */ au c(Throwable throwable) {
        return this.e(throwable);
    }

    @Override
    public /* synthetic */ au b(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ au D() {
        return this.x();
    }

    @Override
    public /* synthetic */ au E() {
        return this.y();
    }

    @Override
    public /* synthetic */ au B() {
        return this.z();
    }

    @Override
    public /* synthetic */ au C() {
        return this.A();
    }

    @Override
    public /* synthetic */ au k(ad[] arrad) {
        return this.i(arrad);
    }

    @Override
    public /* synthetic */ au k(ad ad2) {
        return this.i(ad2);
    }

    @Override
    public /* synthetic */ au l(ad[] arrad) {
        return this.j(arrad);
    }

    @Override
    public /* synthetic */ au l(ad ad2) {
        return this.j(ad2);
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.x();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.y();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.z();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.A();
    }

    @Override
    public /* synthetic */ ab b_(ad[] arrad) {
        return this.i(arrad);
    }

    @Override
    public /* synthetic */ ab b_(ad ad2) {
        return this.i(ad2);
    }

    @Override
    public /* synthetic */ ab a_(ad[] arrad) {
        return this.j(arrad);
    }

    @Override
    public /* synthetic */ ab a_(ad ad2) {
        return this.j(ad2);
    }

    @Override
    public /* synthetic */ as F() {
        return this.x();
    }

    @Override
    public /* synthetic */ as G() {
        return this.y();
    }

    @Override
    public /* synthetic */ as H() {
        return this.z();
    }

    @Override
    public /* synthetic */ as I() {
        return this.A();
    }

    @Override
    public /* synthetic */ as m(ad[] arrad) {
        return this.i(arrad);
    }

    @Override
    public /* synthetic */ as m(ad ad2) {
        return this.i(ad2);
    }

    @Override
    public /* synthetic */ as n(ad[] arrad) {
        return this.j(arrad);
    }

    @Override
    public /* synthetic */ as n(ad ad2) {
        return this.j(ad2);
    }
}

