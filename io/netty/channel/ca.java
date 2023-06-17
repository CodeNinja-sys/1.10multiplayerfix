/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.g;
import io.netty.util.b.w;

abstract class ca
extends g
implements av {
    private final an a;

    protected ca(an an2, w w2) {
        super(w2);
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        this.a = an2;
    }

    @Override
    protected w a() {
        w w2 = super.a();
        if (w2 == null) {
            return this.e().e();
        }
        return w2;
    }

    @Override
    public av a(ad ad2) {
        super.a_(ad2);
        return this;
    }

    @Override
    public av a(ad ... arrad) {
        super.a_(arrad);
        return this;
    }

    @Override
    public av b(ad ad2) {
        super.b_(ad2);
        return this;
    }

    @Override
    public av b(ad ... arrad) {
        super.b_(arrad);
        return this;
    }

    @Override
    public av g() {
        return this;
    }

    @Override
    public av f() {
        return this;
    }

    @Override
    public av h() {
        return this;
    }

    @Override
    public av i() {
        return this;
    }

    @Override
    public an e() {
        return this.a;
    }

    public Void b() {
        return null;
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.i();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.g();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.f();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.h();
    }

    @Override
    public /* synthetic */ ab b_(ad[] arrad) {
        return this.b(arrad);
    }

    @Override
    public /* synthetic */ ab b_(ad ad2) {
        return this.b(ad2);
    }

    @Override
    public /* synthetic */ ab a_(ad[] arrad) {
        return this.a(arrad);
    }

    @Override
    public /* synthetic */ ab a_(ad ad2) {
        return this.a(ad2);
    }

    @Override
    public /* synthetic */ Object bm_() {
        return this.b();
    }
}

