/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aay;
import com.a.a.d.aaz;
import com.a.a.d.agi;
import com.a.a.d.em;
import com.a.a.d.fc;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.mf;
import com.a.a.d.mg;
import com.a.a.d.mh;
import com.a.a.d.mq;
import com.a.a.d.nj;
import com.a.a.d.yc;
import com.a.a.d.yd;
import com.a.a.d.zq;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class me
extends mh
implements aay,
NavigableSet {
    private static final Comparator a = yd.d();
    private static final me e = new fc(a);
    final transient Comparator c;
    transient me d;

    private static me f() {
        return e;
    }

    static me a(Comparator comparator) {
        if (a.equals(comparator)) {
            return me.f();
        }
        return new fc(comparator);
    }

    public static me l() {
        return me.f();
    }

    public static me c(Comparable comparable) {
        return new zq(jl.a(comparable), yd.d());
    }

    public static me b(Comparable comparable, Comparable comparable2) {
        return me.a((Comparator)yd.d(), 2, comparable, comparable2);
    }

    public static me a(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return me.a((Comparator)yd.d(), 3, comparable, comparable2, comparable3);
    }

    public static me a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return me.a((Comparator)yd.d(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static me a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return me.a((Comparator)yd.d(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    public static me a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable ... arrcomparable) {
        Object[] arrobject = new Comparable[6 + arrcomparable.length];
        arrobject[0] = comparable;
        arrobject[1] = comparable2;
        arrobject[2] = comparable3;
        arrobject[3] = comparable4;
        arrobject[4] = comparable5;
        arrobject[5] = comparable6;
        System.arraycopy(arrcomparable, 0, arrobject, 6, arrcomparable.length);
        return me.a((Comparator)yd.d(), arrobject.length, arrobject);
    }

    public static me a(Comparable[] arrcomparable) {
        return me.a((Comparator)yd.d(), arrcomparable.length, (Object[])arrcomparable.clone());
    }

    public static me b(Iterable iterable) {
        yd yd2 = yd.d();
        return me.a((Comparator)yd2, iterable);
    }

    public static me b(Collection collection) {
        yd yd2 = yd.d();
        return me.a((Comparator)yd2, collection);
    }

    public static me b(Iterator iterator) {
        yd yd2 = yd.d();
        return me.a((Comparator)yd2, iterator);
    }

    public static me a(Comparator comparator, Iterator iterator) {
        return new mf(comparator).c(iterator).c();
    }

    public static me a(Comparator comparator, Iterable iterable) {
        Object object;
        cl.a(comparator);
        boolean bl2 = aaz.a(comparator, iterable);
        if (bl2 && iterable instanceof me && !((iz)(object = (me)iterable)).a()) {
            return object;
        }
        object = mq.e(iterable);
        return me.a(comparator, ((Object[])object).length, (Object[])object);
    }

    public static me a(Comparator comparator, Collection collection) {
        return me.a(comparator, (Iterable)collection);
    }

    public static me a(SortedSet sortedSet) {
        Comparator comparator = aaz.a(sortedSet);
        jl jl2 = jl.a(sortedSet);
        if (jl2.isEmpty()) {
            return me.a(comparator);
        }
        return new zq(jl2, comparator);
    }

    static me a(Comparator comparator, int n2, Object ... arrobject) {
        if (n2 == 0) {
            return me.a(comparator);
        }
        yc.c(arrobject, n2);
        Arrays.sort(arrobject, 0, n2, comparator);
        int n3 = 1;
        for (int i2 = 1; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            Object object2 = arrobject[n3 - 1];
            if (comparator.compare(object, object2) == 0) continue;
            arrobject[n3++] = object;
        }
        Arrays.fill(arrobject, n3, n2, null);
        return new zq(jl.b(arrobject, n3), comparator);
    }

    public static mf b(Comparator comparator) {
        return new mf(comparator);
    }

    public static mf n() {
        return new mf(yd.d().a());
    }

    public static mf o() {
        return new mf(yd.d());
    }

    int c(Object object, Object object2) {
        return me.a(this.c, object, object2);
    }

    static int a(Comparator comparator, Object object, Object object2) {
        Comparator comparator2 = comparator;
        return comparator2.compare(object, object2);
    }

    me(Comparator comparator) {
        this.c = comparator;
    }

    @Override
    public Comparator comparator() {
        return this.c;
    }

    @Override
    public abstract agi aO_();

    public me b(Object object) {
        return this.d(object, false);
    }

    public me d(Object object, boolean bl2) {
        return this.b(cl.a(object), bl2);
    }

    public me a(Object object, Object object2) {
        return this.b(object, true, object2, false);
    }

    public me b(Object object, boolean bl2, Object object2, boolean bl3) {
        cl.a(object);
        cl.a(object2);
        cl.a(this.c.compare(object, object2) <= 0);
        return this.a(object, bl2, object2, bl3);
    }

    public me a(Object object) {
        return this.c(object, true);
    }

    public me c(Object object, boolean bl2) {
        return this.a(cl.a(object), bl2);
    }

    abstract me b(Object var1, boolean var2);

    abstract me a(Object var1, boolean var2, Object var3, boolean var4);

    abstract me a(Object var1, boolean var2);

    public Object lower(Object object) {
        return nj.d((Iterator)this.d(object, false).d(), null);
    }

    public Object floor(Object object) {
        return nj.d((Iterator)this.d(object, true).d(), null);
    }

    public Object ceiling(Object object) {
        return mq.d((Iterable)this.c(object, true), null);
    }

    public Object higher(Object object) {
        return mq.d((Iterable)this.c(object, false), null);
    }

    @Override
    public Object first() {
        return this.aO_().next();
    }

    @Override
    public Object last() {
        return this.d().next();
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public me aP_() {
        me me2 = this.d;
        if (me2 == null) {
            me2 = this.d = this.e();
            me2.d = this;
        }
        return me2;
    }

    me e() {
        return new em(this);
    }

    public abstract agi d();

    abstract int c(Object var1);

    private void a(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object aR_() {
        return new mg(this.c, this.toArray());
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }

    public /* synthetic */ NavigableSet tailSet(Object object, boolean bl2) {
        return this.c(object, bl2);
    }

    public /* synthetic */ NavigableSet headSet(Object object, boolean bl2) {
        return this.d(object, bl2);
    }

    public /* synthetic */ NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b(object, bl2, object2, bl3);
    }

    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    public /* synthetic */ NavigableSet descendingSet() {
        return this.aP_();
    }
}

