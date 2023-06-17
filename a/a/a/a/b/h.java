/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.b;
import a.a.a.a.b.bv;
import a.a.a.a.b.ec;
import a.a.a.a.b.ei;
import a.a.a.a.b.i;
import a.a.a.a.b.k;
import a.a.a.a.c.aq;
import a.a.a.a.c.aw;
import a.a.a.a.c.w;
import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;

public abstract class h
extends b
implements bv {
    private static final long b = -1773560792952436569L;

    protected h() {
    }

    @Override
    public bv a(Long l2) {
        return this.g(l2);
    }

    @Override
    public bv b(Long l2) {
        return this.f(l2);
    }

    @Override
    public bv a(Long l2, Long l3) {
        return this.a((long)l2, (long)l3);
    }

    public Long e() {
        return this.l();
    }

    public Long f() {
        return this.m();
    }

    @Override
    public ei g() {
        return new i(this);
    }

    @Override
    public w c() {
        return new k(this);
    }

    @Override
    public aw h() {
        return this.s();
    }

    @Override
    public /* synthetic */ aq d() {
        return this.h();
    }

    @Override
    public /* synthetic */ ec b() {
        return this.g();
    }

    @Override
    public /* synthetic */ Set entrySet() {
        return this.h();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.g();
    }

    public /* synthetic */ Object lastKey() {
        return this.f();
    }

    public /* synthetic */ Object firstKey() {
        return this.e();
    }

    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b((Long)object);
    }

    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a((Long)object);
    }

    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

