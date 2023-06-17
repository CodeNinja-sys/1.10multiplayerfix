/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.au;
import io.netty.channel.av;
import io.netty.channel.bt;
import io.netty.channel.bv;
import io.netty.channel.bw;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.as;
import io.netty.util.b.at;
import io.netty.util.b.k;
import io.netty.util.b.w;

public class cm
extends k
implements au,
bv {
    private final an a;
    private long b;

    public cm(an an2) {
        this.a = an2;
    }

    public cm(an an2, w w2) {
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
    public bv q() {
        return this.a((Void)null);
    }

    @Override
    public bv a(Void void_) {
        super.a(void_);
        return this;
    }

    @Override
    public boolean c() {
        return this.a_((Object)null);
    }

    @Override
    public bv d(Throwable throwable) {
        super.e(throwable);
        return this;
    }

    @Override
    public bv a(long l2, long l3) {
        super.b(l2, l3);
        return this;
    }

    @Override
    public bv e(ad ad2) {
        super.j(ad2);
        return this;
    }

    @Override
    public bv e(ad ... arrad) {
        super.j(arrad);
        return this;
    }

    @Override
    public bv f(ad ad2) {
        super.i(ad2);
        return this;
    }

    @Override
    public bv f(ad ... arrad) {
        super.i(arrad);
        return this;
    }

    @Override
    public bv m() {
        super.A();
        return this;
    }

    @Override
    public bv n() {
        super.z();
        return this;
    }

    @Override
    public bv o() {
        super.y();
        return this;
    }

    @Override
    public bv p() {
        super.x();
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

    public bv v() {
        return this;
    }

    @Override
    protected void w() {
        if (this.e().j()) {
            super.w();
        }
    }

    @Override
    public /* synthetic */ at e(Throwable throwable) {
        return this.d(throwable);
    }

    @Override
    public /* synthetic */ at x() {
        return this.p();
    }

    @Override
    public /* synthetic */ at y() {
        return this.o();
    }

    @Override
    public /* synthetic */ at z() {
        return this.n();
    }

    @Override
    public /* synthetic */ at A() {
        return this.m();
    }

    @Override
    public /* synthetic */ at i(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ at i(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ at j(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ at j(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ at b(long l2, long l3) {
        return this.a(l2, l3);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au B() {
        return this.n();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au C() {
        return this.m();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au D() {
        return this.p();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au E() {
        return this.o();
    }

    @Override
    public /* synthetic */ io.netty.util.b.au k(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au k(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au l(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au l(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au c(Throwable throwable) {
        return this.d(throwable);
    }

    @Override
    public /* synthetic */ io.netty.util.b.au b(Object object) {
        return this.a((Void)object);
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.p();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.o();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.n();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.m();
    }

    @Override
    public /* synthetic */ ab b_(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ ab b_(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ ab a_(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ ab a_(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ as F() {
        return this.p();
    }

    @Override
    public /* synthetic */ as G() {
        return this.o();
    }

    @Override
    public /* synthetic */ as H() {
        return this.n();
    }

    @Override
    public /* synthetic */ as I() {
        return this.m();
    }

    @Override
    public /* synthetic */ as m(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ as m(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ as n(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ as n(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ bt l() {
        return this.p();
    }

    @Override
    public /* synthetic */ bt k() {
        return this.o();
    }

    @Override
    public /* synthetic */ bt j() {
        return this.n();
    }

    @Override
    public /* synthetic */ bt d() {
        return this.m();
    }

    @Override
    public /* synthetic */ bt d(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ bt d(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ bt c(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ bt c(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ av i() {
        return this.p();
    }

    @Override
    public /* synthetic */ av h() {
        return this.o();
    }

    @Override
    public /* synthetic */ av g() {
        return this.n();
    }

    @Override
    public /* synthetic */ av f() {
        return this.m();
    }

    @Override
    public /* synthetic */ av b(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ av b(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ av a(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ av a(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ bw u() {
        return this.p();
    }

    @Override
    public /* synthetic */ bw t() {
        return this.o();
    }

    @Override
    public /* synthetic */ bw s() {
        return this.n();
    }

    @Override
    public /* synthetic */ bw r() {
        return this.m();
    }

    @Override
    public /* synthetic */ bw h(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ bw h(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ bw g(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ bw g(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ bw a(Throwable throwable) {
        return this.d(throwable);
    }

    @Override
    public /* synthetic */ bw b() {
        return this.q();
    }

    @Override
    public /* synthetic */ bw b(Void void_) {
        return this.a(void_);
    }

    @Override
    public /* synthetic */ bw bh_() {
        return this.v();
    }
}

