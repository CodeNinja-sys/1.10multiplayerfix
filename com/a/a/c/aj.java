/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ai;
import com.a.a.c.e;
import com.a.a.d.hg;
import com.a.a.d.jt;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

public abstract class aj
extends hg
implements e {
    protected aj() {
    }

    protected abstract e f();

    @Override
    public Object e(Object object) {
        return this.f().e(object);
    }

    @Override
    public Object a(Object object, Callable callable) {
        return this.f().a(object, callable);
    }

    @Override
    public jt a(Iterable iterable) {
        return this.f().a(iterable);
    }

    @Override
    public void a(Object object, Object object2) {
        this.f().a(object, object2);
    }

    @Override
    public void a(Map map) {
        this.f().a(map);
    }

    @Override
    public void b(Object object) {
        this.f().b(object);
    }

    @Override
    public void b(Iterable iterable) {
        this.f().b(iterable);
    }

    @Override
    public void c() {
        this.f().c();
    }

    @Override
    public long b() {
        return this.f().b();
    }

    @Override
    public ai d() {
        return this.f().d();
    }

    @Override
    public ConcurrentMap e() {
        return this.f().e();
    }

    @Override
    public void a() {
        this.f().a();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

