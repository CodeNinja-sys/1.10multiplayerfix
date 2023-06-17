/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.d.cm;
import com.a.a.d.ge;
import com.a.a.d.jl;
import com.a.a.d.jr;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.me;
import com.a.a.d.mq;
import com.a.a.d.sz;
import com.a.a.d.we;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public abstract class gd
implements Iterable {
    private final Iterable a;

    protected gd() {
        this.a = this;
    }

    gd(Iterable iterable) {
        this.a = (Iterable)cl.a(iterable);
    }

    public static gd a(Iterable iterable) {
        return iterable instanceof gd ? (gd)iterable : new ge(iterable, iterable);
    }

    public static gd a(gd gd2) {
        return (gd)cl.a(gd2);
    }

    public String toString() {
        return mq.c(this.a);
    }

    public final int b() {
        return mq.b(this.a);
    }

    public final boolean a(Object object) {
        return mq.a(this.a, object);
    }

    public final gd c() {
        return gd.a(mq.f(this.a));
    }

    public final gd a(com.a.a.b.cm cm2) {
        return gd.a(mq.c(this.a, cm2));
    }

    public final gd a(Class class_) {
        return gd.a(mq.b(this.a, class_));
    }

    public final boolean b(com.a.a.b.cm cm2) {
        return mq.d(this.a, cm2);
    }

    public final boolean c(com.a.a.b.cm cm2) {
        return mq.e(this.a, cm2);
    }

    public final cg d(com.a.a.b.cm cm2) {
        return mq.g(this.a, cm2);
    }

    public final gd a(bl bl2) {
        return gd.a(mq.a(this.a, bl2));
    }

    public gd b(bl bl2) {
        return gd.a(mq.g(this.a(bl2)));
    }

    public final cg d() {
        Iterator iterator = this.a.iterator();
        return iterator.hasNext() ? cg.b(iterator.next()) : cg.f();
    }

    public final cg e() {
        Object t2;
        if (this.a instanceof List) {
            List list = (List)this.a;
            if (list.isEmpty()) {
                return cg.f();
            }
            return cg.b(list.get(list.size() - 1));
        }
        Iterator iterator = this.a.iterator();
        if (!iterator.hasNext()) {
            return cg.f();
        }
        if (this.a instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet)this.a;
            return cg.b(sortedSet.last());
        }
        do {
            t2 = iterator.next();
        } while (iterator.hasNext());
        return cg.b(t2);
    }

    public final gd a(int n2) {
        return gd.a(mq.d(this.a, n2));
    }

    public final gd b(int n2) {
        return gd.a(mq.e(this.a, n2));
    }

    public final boolean f() {
        return !this.a.iterator().hasNext();
    }

    public final jl g() {
        return jl.a(this.a);
    }

    public final jl a(Comparator comparator) {
        return yd.a(comparator).b(this.a);
    }

    public final lo h() {
        return lo.a(this.a);
    }

    public final me b(Comparator comparator) {
        return me.a(comparator, this.a);
    }

    public final jt c(bl bl2) {
        return sz.a(this.a, bl2);
    }

    public final jr d(bl bl2) {
        return we.a(this.a, bl2);
    }

    public final jt e(bl bl2) {
        return sz.b(this.a, bl2);
    }

    public final Object[] b(Class class_) {
        return mq.a(this.a, class_);
    }

    public final Collection a(Collection collection) {
        cl.a(collection);
        if (this.a instanceof Collection) {
            collection.addAll(cm.a(this.a));
        } else {
            for (Object t2 : this.a) {
                collection.add(t2);
            }
        }
        return collection;
    }

    public final Object c(int n2) {
        return mq.c(this.a, n2);
    }
}

