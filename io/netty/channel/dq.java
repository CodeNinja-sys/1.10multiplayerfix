/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.au;
import io.netty.util.b.e;
import java.util.concurrent.TimeUnit;

final class dq
extends e
implements bw {
    private final an a;
    private final boolean b;

    dq(an an2, boolean bl2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        this.a = an2;
        this.b = bl2;
    }

    public dq e(ad ad2) {
        dq.z();
        return this;
    }

    public dq e(ad ... arrad) {
        dq.z();
        return this;
    }

    public dq f(ad ad2) {
        return this;
    }

    public dq f(ad ... arrad) {
        return this;
    }

    public dq a() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this;
    }

    @Override
    public boolean a(long l2, TimeUnit timeUnit) {
        dq.z();
        return false;
    }

    @Override
    public boolean a_(long l2) {
        dq.z();
        return false;
    }

    public dq o() {
        dq.z();
        return this;
    }

    @Override
    public boolean b(long l2, TimeUnit timeUnit) {
        dq.z();
        return false;
    }

    @Override
    public boolean b(long l2) {
        dq.z();
        return false;
    }

    @Override
    public an e() {
        return this.a;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public boolean bo_() {
        return false;
    }

    @Override
    public boolean bn_() {
        return true;
    }

    @Override
    public boolean bp_() {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public Throwable bq_() {
        return null;
    }

    public dq v() {
        dq.z();
        return this;
    }

    public dq w() {
        dq.z();
        return this;
    }

    public dq d(Throwable throwable) {
        this.e(throwable);
        return this;
    }

    public dq x() {
        return this;
    }

    @Override
    public boolean b(Throwable throwable) {
        this.e(throwable);
        return false;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    private static void z() {
        throw new IllegalStateException("void future");
    }

    public dq a(Void void_) {
        return this;
    }

    public boolean c(Void void_) {
        return false;
    }

    public Void y() {
        return null;
    }

    private void e(Throwable throwable) {
        if (this.b && this.a.j()) {
            this.a.c().a(throwable);
        }
    }

    @Override
    public /* synthetic */ Object bm_() {
        return this.y();
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.o();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.a();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.w();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.v();
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
    public /* synthetic */ bw u() {
        return this.o();
    }

    @Override
    public /* synthetic */ bw t() {
        return this.a();
    }

    @Override
    public /* synthetic */ bw s() {
        return this.w();
    }

    @Override
    public /* synthetic */ bw r() {
        return this.v();
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
        return this.x();
    }

    @Override
    public /* synthetic */ bw b(Void void_) {
        return this.a(void_);
    }

    @Override
    public /* synthetic */ av i() {
        return this.o();
    }

    @Override
    public /* synthetic */ av h() {
        return this.a();
    }

    @Override
    public /* synthetic */ av g() {
        return this.w();
    }

    @Override
    public /* synthetic */ av f() {
        return this.v();
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
    public /* synthetic */ au B() {
        return this.w();
    }

    @Override
    public /* synthetic */ au C() {
        return this.v();
    }

    @Override
    public /* synthetic */ au D() {
        return this.o();
    }

    @Override
    public /* synthetic */ au E() {
        return this.a();
    }

    @Override
    public /* synthetic */ au k(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ au k(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ au l(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ au l(ad ad2) {
        return this.e(ad2);
    }

    @Override
    public /* synthetic */ au c(Throwable throwable) {
        return this.d(throwable);
    }

    @Override
    public /* synthetic */ boolean a_(Object object) {
        return this.c((Void)object);
    }

    @Override
    public /* synthetic */ au b(Object object) {
        return this.a((Void)object);
    }
}

