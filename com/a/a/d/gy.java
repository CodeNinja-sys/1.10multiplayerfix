/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.gh;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class gy
extends gh
implements xc {
    protected gy() {
    }

    protected abstract xc f();

    @Override
    public int a(Object object) {
        return this.f().a(object);
    }

    @Override
    public int a(Object object, int n2) {
        return this.f().a(object, n2);
    }

    @Override
    public int b(Object object, int n2) {
        return this.f().b(object, n2);
    }

    @Override
    public Set d() {
        return this.f().d();
    }

    @Override
    public Set aS_() {
        return this.f().aS_();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.f().equals(object);
    }

    @Override
    public int hashCode() {
        return this.f().hashCode();
    }

    @Override
    public int c(Object object, int n2) {
        return this.f().c(object, n2);
    }

    @Override
    public boolean a(Object object, int n2, int n3) {
        return this.f().a(object, n2, n3);
    }

    @Override
    protected boolean b(Object object) {
        return this.a(object) > 0;
    }

    @Override
    protected void m() {
        nj.i(this.aS_().iterator());
    }

    protected int d(Object object) {
        for (xd xd2 : this.aS_()) {
            if (!cc.a(xd2.a(), object)) continue;
            return xd2.b();
        }
        return 0;
    }

    protected boolean e(Object object) {
        this.a(object, 1);
        return true;
    }

    @Override
    protected boolean b(Collection collection) {
        return xe.a((xc)this, collection);
    }

    @Override
    protected boolean c(Object object) {
        return this.b(object, 1) > 0;
    }

    @Override
    protected boolean c(Collection collection) {
        return xe.b((xc)this, collection);
    }

    @Override
    protected boolean d(Collection collection) {
        return xe.c((xc)this, collection);
    }

    protected int d(Object object, int n2) {
        return xe.a(this, object, n2);
    }

    protected boolean b(Object object, int n2, int n3) {
        return xe.a(this, object, n2, n3);
    }

    protected Iterator s() {
        return xe.b(this);
    }

    protected int t() {
        return xe.c(this);
    }

    protected boolean f(Object object) {
        return xe.a((xc)this, object);
    }

    protected int u() {
        return this.aS_().hashCode();
    }

    @Override
    protected String p() {
        return this.aS_().toString();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.f();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

