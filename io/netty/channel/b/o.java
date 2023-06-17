/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.b.a;
import io.netty.channel.b.b;
import io.netty.channel.b.c;
import io.netty.channel.b.p;
import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.aj;
import io.netty.util.b.au;
import io.netty.util.b.f;
import io.netty.util.b.l;
import io.netty.util.b.w;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

final class o
extends l
implements c {
    private final a a;
    private final Map b;
    private int c;
    private int d;
    private final aw e = new p(this);

    o(a a2, Collection collection, w w2) {
        super(w2);
        if (a2 == null) {
            throw new NullPointerException("group");
        }
        if (collection == null) {
            throw new NullPointerException("futures");
        }
        this.a = a2;
        LinkedHashMap<an, av> linkedHashMap = new LinkedHashMap<an, av>();
        for (av av2 : collection) {
            linkedHashMap.put(av2.e(), av2);
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
        for (av av2 : this.b.values()) {
            av2.a((ad)this.e);
        }
        if (this.b.isEmpty()) {
            this.v();
        }
    }

    o(a a2, Map map, w w2) {
        super(w2);
        this.a = a2;
        this.b = Collections.unmodifiableMap(map);
        for (av av2 : this.b.values()) {
            av2.a((ad)this.e);
        }
        if (this.b.isEmpty()) {
            this.v();
        }
    }

    @Override
    public a a() {
        return this.a;
    }

    @Override
    public av a(an an2) {
        return (av)this.b.get(an2);
    }

    @Override
    public Iterator iterator() {
        return this.b.values().iterator();
    }

    @Override
    public synchronized boolean e() {
        return this.c != 0 && this.c != this.b.size();
    }

    @Override
    public synchronized boolean f() {
        return this.d != 0 && this.d != this.b.size();
    }

    public o e(ad ad2) {
        super.l(ad2);
        return this;
    }

    public o e(ad ... arrad) {
        super.l(arrad);
        return this;
    }

    public o f(ad ad2) {
        super.k(ad2);
        return this;
    }

    public o f(ad ... arrad) {
        super.k(arrad);
        return this;
    }

    public o r() {
        super.E();
        return this;
    }

    public o s() {
        super.D();
        return this;
    }

    public o t() {
        super.B();
        return this;
    }

    public o u() {
        super.C();
        return this;
    }

    @Override
    public b b() {
        return (b)super.bq_();
    }

    private void v() {
        super.b((Object)null);
    }

    private void a(b b2) {
        super.c(b2);
    }

    public o a(Void void_) {
        throw new IllegalStateException();
    }

    public boolean b(Void void_) {
        throw new IllegalStateException();
    }

    public o a(Throwable throwable) {
        throw new IllegalStateException();
    }

    @Override
    public boolean b(Throwable throwable) {
        throw new IllegalStateException();
    }

    @Override
    protected void w() {
        w w2 = this.bu_();
        if (w2 != null && w2 != aj.a && w2.bt_()) {
            throw new f();
        }
    }

    @Override
    public /* synthetic */ au c(Throwable throwable) {
        return this.a(throwable);
    }

    @Override
    public /* synthetic */ boolean a_(Object object) {
        return this.b((Void)object);
    }

    @Override
    public /* synthetic */ au b(Object object) {
        return this.a((Void)object);
    }

    @Override
    public /* synthetic */ au D() {
        return this.s();
    }

    @Override
    public /* synthetic */ au E() {
        return this.r();
    }

    @Override
    public /* synthetic */ au B() {
        return this.t();
    }

    @Override
    public /* synthetic */ au C() {
        return this.u();
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
    public /* synthetic */ Throwable bq_() {
        return this.b();
    }

    @Override
    public /* synthetic */ ab bi_() {
        return this.s();
    }

    @Override
    public /* synthetic */ ab k() {
        return this.r();
    }

    @Override
    public /* synthetic */ ab bj_() {
        return this.t();
    }

    @Override
    public /* synthetic */ ab bl_() {
        return this.u();
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
    public /* synthetic */ c o() {
        return this.u();
    }

    @Override
    public /* synthetic */ c i() {
        return this.t();
    }

    @Override
    public /* synthetic */ c h() {
        return this.s();
    }

    @Override
    public /* synthetic */ c g() {
        return this.r();
    }

    @Override
    public /* synthetic */ c b(ad[] arrad) {
        return this.f(arrad);
    }

    @Override
    public /* synthetic */ c b(ad ad2) {
        return this.f(ad2);
    }

    @Override
    public /* synthetic */ c a(ad[] arrad) {
        return this.e(arrad);
    }

    @Override
    public /* synthetic */ c a(ad ad2) {
        return this.e(ad2);
    }

    static /* synthetic */ int a(o o2) {
        return o2.c++;
    }

    static /* synthetic */ int b(o o2) {
        return o2.d++;
    }

    static /* synthetic */ int c(o o2) {
        return o2.c;
    }

    static /* synthetic */ int d(o o2) {
        return o2.d;
    }

    static /* synthetic */ Map e(o o2) {
        return o2.b;
    }

    static /* synthetic */ void a(o o2, b b2) {
        o2.a(b2);
    }

    static /* synthetic */ void f(o o2) {
        o2.v();
    }
}

