/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.au;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.l;
import io.netty.util.b.w;

public class cn
extends l
implements au,
bw {
    private final an a;
    private long b;

    public cn(an an2) {
        this.a = an2;
    }

    public cn(an an2, w w2) {
        super(w2);
        this.a = an2;
    }

    @Override
    protected w bu_() {
        w w2 = super.bu_();
        if (w2 == null) {
            return this.e().e();
        }
        return w2;
    }

    @Override
    public an e() {
        return this.a;
    }

    @Override
    public bw b() {
        return this.b((Void)null);
    }

    @Override
    public bw b(Void void_) {
        super.b(void_);
        return this;
    }

    @Override
    public boolean c() {
        return this.a_((Object)null);
    }

    @Override
    public bw a(Throwable throwable) {
        super.c(throwable);
        return this;
    }

    @Override
    public bw g(ad ad2) {
        super.l(ad2);
        return this;
    }

    @Override
    public bw g(ad ... arrad) {
        super.l(arrad);
        return this;
    }

    @Override
    public bw h(ad ad2) {
        super.k(ad2);
        return this;
    }

    @Override
    public bw h(ad ... arrad) {
        super.k(arrad);
        return this;
    }

    @Override
    public bw r() {
        super.C();
        return this;
    }

    @Override
    public bw s() {
        super.B();
        return this;
    }

    @Override
    public bw t() {
        super.E();
        return this;
    }

    @Override
    public bw u() {
        super.D();
        return this;
    }

    @Override
    public long bg_() {
        return this.b;
    }

    @Override
    public void a(long l2) {
        this.b = l2;
    }

    @Override
    public bw bh_() {
        return this;
    }

    @Override
    protected void w() {
        if (this.e().j()) {
            super.w();
        }
    }

    @Override
    public /* synthetic */ io.netty.util.b.au c(Throwable throwable) {
        return this.a(throwable);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au D() {
        return this.u();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au E() {
        return this.t();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au B() {
        return this.s();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au C() {
        return this.r();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au k(ad[] arrad) {
        return this.h(arrad);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au k(ad ad2) {
        return this.h(ad2);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au l(ad[] arrad) {
        return this.g(arrad);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au l(ad ad2) {
        return this.g(ad2);
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.u();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.t();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.s();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.r();
    }

    @Override
    public /* synthetic */ ab b_(ad[] arrad) {
        return this.h(arrad);
    }

    @Override
    public /* synthetic */ ab b_(ad ad2) {
        return this.h(ad2);
    }

    @Override
    public /* synthetic */ ab a_(ad[] arrad) {
        return this.g(arrad);
    }

    @Override
    public /* synthetic */ ab a_(ad ad2) {
        return this.g(ad2);
    }

    @Override
    public /* synthetic */ av i() {
        return this.u();
    }

    @Override
    public /* synthetic */ av h() {
        return this.t();
    }

    @Override
    public /* synthetic */ av g() {
        return this.s();
    }

    @Override
    public /* synthetic */ av f() {
        return this.r();
    }

    @Override
    public /* synthetic */ av b(ad[] arrad) {
        return this.h(arrad);
    }

    @Override
    public /* synthetic */ av b(ad ad2) {
        return this.h(ad2);
    }

    @Override
    public /* synthetic */ av a(ad[] arrad) {
        return this.g(arrad);
    }

    @Override
    public /* synthetic */ av a(ad ad2) {
        return this.g(ad2);
    }
}

