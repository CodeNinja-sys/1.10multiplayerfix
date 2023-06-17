/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.b;
import a.a.a.a.a.bv;
import a.a.a.a.a.eb;
import a.a.a.a.a.eh;
import a.a.a.a.a.i;
import a.a.a.a.a.k;
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
    public bv a(Integer n2) {
        return this.j(n2);
    }

    @Override
    public bv b(Integer n2) {
        return this.i(n2);
    }

    @Override
    public bv a(Integer n2, Integer n3) {
        return this.b(n2, n3);
    }

    public Integer e() {
        return this.l();
    }

    public Integer f() {
        return this.m();
    }

    @Override
    public eh g() {
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
    public /* synthetic */ eb b() {
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
        return this.b((Integer)object);
    }

    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a((Integer)object);
    }

    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

