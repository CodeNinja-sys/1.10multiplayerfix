/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aac;
import com.a.a.d.aad;
import com.a.a.d.fi;
import com.a.a.d.gc;
import com.a.a.d.vi;
import java.util.Collection;
import java.util.Set;

final class fs
extends fi
implements gc {
    fs(aac aac2, cm cm2) {
        super(aac2, cm2);
    }

    @Override
    public aac e() {
        return (aac)this.a;
    }

    @Override
    public Set a(Object object) {
        return (Set)super.c(object);
    }

    @Override
    public Set b(Object object) {
        return (Set)super.d(object);
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        return (Set)super.b(object, iterable);
    }

    Set f() {
        return aad.a(this.e().u(), this.b());
    }

    @Override
    public Set u() {
        return (Set)super.l();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.f();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ vi a() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }
}

