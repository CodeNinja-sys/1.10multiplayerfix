/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.ce;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.ev;
import com.a.a.d.fc;
import com.a.a.d.jl;
import com.a.a.d.me;
import com.a.a.d.nj;
import com.a.a.d.yd;
import com.a.a.d.yl;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class et
extends du {
    et(ep ep2) {
        super(ep2);
    }

    public Comparable f() {
        throw new NoSuchElementException();
    }

    public Comparable g() {
        throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public du a(du du2) {
        return this;
    }

    @Override
    public yl b() {
        throw new NoSuchElementException();
    }

    @Override
    public yl a(ce ce2, ce ce3) {
        throw new NoSuchElementException();
    }

    @Override
    du c(Comparable comparable, boolean bl2) {
        return this;
    }

    @Override
    du b(Comparable comparable, boolean bl2, Comparable comparable2, boolean bl3) {
        return this;
    }

    @Override
    du d(Comparable comparable, boolean bl2) {
        return this;
    }

    @Override
    int c(Object object) {
        return -1;
    }

    @Override
    public agi aO_() {
        return nj.a();
    }

    @Override
    public agi d() {
        return nj.a();
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public jl h() {
        return jl.d();
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Set) {
            Set set = (Set)object;
            return set.isEmpty();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    Object aR_() {
        return new ev(this.a, null);
    }

    @Override
    me e() {
        return new fc(yd.d().a());
    }

    @Override
    public /* synthetic */ Object last() {
        return this.g();
    }

    @Override
    public /* synthetic */ Object first() {
        return this.f();
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2) {
        return this.d((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    /* synthetic */ me b(Object object, boolean bl2) {
        return this.c((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

