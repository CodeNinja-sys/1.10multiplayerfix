/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hg;
import com.a.a.d.vi;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class gx
extends hg
implements vi {
    protected gx() {
    }

    protected abstract vi b();

    @Override
    public Map c() {
        return this.b().c();
    }

    @Override
    public void h() {
        this.b().h();
    }

    @Override
    public boolean b(Object object, Object object2) {
        return this.b().b(object, object2);
    }

    @Override
    public boolean f(Object object) {
        return this.b().f(object);
    }

    @Override
    public boolean g(Object object) {
        return this.b().g(object);
    }

    @Override
    public Collection l() {
        return this.b().l();
    }

    @Override
    public Collection c(Object object) {
        return this.b().c(object);
    }

    @Override
    public boolean o() {
        return this.b().o();
    }

    @Override
    public xc r() {
        return this.b().r();
    }

    @Override
    public Set q() {
        return this.b().q();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.b().a(object, object2);
    }

    @Override
    public boolean c(Object object, Iterable iterable) {
        return this.b().c(object, iterable);
    }

    @Override
    public boolean a(vi vi2) {
        return this.b().a(vi2);
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.b().c(object, object2);
    }

    @Override
    public Collection d(Object object) {
        return this.b().d(object);
    }

    @Override
    public Collection b(Object object, Iterable iterable) {
        return this.b().b(object, iterable);
    }

    @Override
    public int g() {
        return this.b().g();
    }

    @Override
    public Collection j() {
        return this.b().j();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.b().equals(object);
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

