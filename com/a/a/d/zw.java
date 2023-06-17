/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.xz;
import com.a.a.d.yd;
import java.io.Serializable;
import java.util.Iterator;

final class zw
extends yd
implements Serializable {
    static final zw a = new zw();
    private static final long b = 0L;

    public int a(Comparable comparable, Comparable comparable2) {
        cl.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override
    public yd a() {
        return yd.d();
    }

    public Comparable b(Comparable comparable, Comparable comparable2) {
        return (Comparable)xz.a.b(comparable, comparable2);
    }

    public Comparable a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable ... arrcomparable) {
        return (Comparable)xz.a.b(comparable, comparable2, comparable3, arrcomparable);
    }

    public Comparable c(Iterator iterator) {
        return (Comparable)xz.a.b(iterator);
    }

    public Comparable h(Iterable iterable) {
        return (Comparable)xz.a.e(iterable);
    }

    public Comparable c(Comparable comparable, Comparable comparable2) {
        return (Comparable)xz.a.a((Object)comparable, (Object)comparable2);
    }

    public Comparable b(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable ... arrcomparable) {
        return (Comparable)xz.a.a(comparable, comparable2, comparable3, arrcomparable);
    }

    public Comparable d(Iterator iterator) {
        return (Comparable)xz.a.a(iterator);
    }

    public Comparable i(Iterable iterable) {
        return (Comparable)xz.a.d(iterable);
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private zw() {
    }

    @Override
    public /* synthetic */ Object b(Object object, Object object2) {
        return this.c((Comparable)object, (Comparable)object2);
    }

    @Override
    public /* synthetic */ Object e(Iterable iterable) {
        return this.i(iterable);
    }

    @Override
    public /* synthetic */ Object b(Iterator iterator) {
        return this.d(iterator);
    }

    @Override
    public /* synthetic */ Object a(Object object, Object object2) {
        return this.b((Comparable)object, (Comparable)object2);
    }

    @Override
    public /* synthetic */ Object d(Iterable iterable) {
        return this.h(iterable);
    }

    @Override
    public /* synthetic */ Object a(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Comparable)object, (Comparable)object2);
    }
}

