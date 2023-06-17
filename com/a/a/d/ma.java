/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.abn;
import com.a.a.d.aer;
import com.a.a.d.ce;
import com.a.a.d.el;
import com.a.a.d.fb;
import com.a.a.d.iz;
import com.a.a.d.jn;
import com.a.a.d.ku;
import com.a.a.d.mb;
import com.a.a.d.mc;
import com.a.a.d.md;
import com.a.a.d.me;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.xd;
import com.a.a.d.yd;
import com.a.a.d.zp;
import com.a.a.d.zq;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class ma
extends md
implements abn {
    private static final Comparator b = yd.d();
    private static final ma c = new fb(b);
    transient ma a;

    public static ma r() {
        return c;
    }

    public static ma a(Comparable comparable) {
        zq zq2 = (zq)me.c(comparable);
        int[] arrn = new int[]{1};
        long[] arrl = new long[]{0L, 1L};
        return new zp(zq2, arrn, arrl, 0, 1);
    }

    public static ma a(Comparable comparable, Comparable comparable2) {
        return ma.a((Comparator)yd.d(), Arrays.asList(comparable, comparable2));
    }

    public static ma a(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return ma.a((Comparator)yd.d(), Arrays.asList(comparable, comparable2, comparable3));
    }

    public static ma a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return ma.a((Comparator)yd.d(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static ma a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return ma.a((Comparator)yd.d(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    public static ma a(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable ... arrcomparable) {
        int n2 = arrcomparable.length + 6;
        ArrayList arrayList = ov.b(n2);
        Collections.addAll(arrayList, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayList, arrcomparable);
        return ma.a((Comparator)yd.d(), (Iterable)arrayList);
    }

    public static ma a(Comparable[] arrcomparable) {
        return ma.a((Comparator)yd.d(), Arrays.asList(arrcomparable));
    }

    public static ma b(Iterable iterable) {
        yd yd2 = yd.d();
        return ma.a((Comparator)yd2, iterable);
    }

    public static ma b(Iterator iterator) {
        yd yd2 = yd.d();
        return ma.a((Comparator)yd2, iterator);
    }

    public static ma a(Comparator comparator, Iterator iterator) {
        cl.a(comparator);
        return new mb(comparator).c(iterator).c();
    }

    public static ma a(Comparator comparator, Iterable iterable) {
        AbstractCollection abstractCollection;
        if (iterable instanceof ma && comparator.equals(((ma)(abstractCollection = (ma)iterable)).comparator())) {
            if (((iz)abstractCollection).a()) {
                return ma.a(comparator, ((ku)abstractCollection).n().h());
            }
            return abstractCollection;
        }
        iterable = ov.a(iterable);
        abstractCollection = aer.a((Comparator)cl.a(comparator));
        mq.a(abstractCollection, iterable);
        return ma.a(comparator, ((aer)abstractCollection).aS_());
    }

    public static ma a(abn abn2) {
        return ma.a(abn2.comparator(), ov.a(abn2.aS_()));
    }

    private static ma a(Comparator comparator, Collection collection) {
        if (collection.isEmpty()) {
            return ma.a(comparator);
        }
        jn jn2 = new jn(collection.size());
        int[] arrn = new int[collection.size()];
        long[] arrl = new long[collection.size() + 1];
        int n2 = 0;
        for (xd xd2 : collection) {
            jn2.c(xd2.a());
            arrn[n2] = xd2.b();
            arrl[n2 + 1] = arrl[n2] + (long)arrn[n2];
            ++n2;
        }
        return new zp(new zq(jn2.b(), comparator), arrn, arrl, 0, collection.size());
    }

    static ma a(Comparator comparator) {
        if (b.equals(comparator)) {
            return c;
        }
        return new fb(comparator);
    }

    ma() {
    }

    @Override
    public final Comparator comparator() {
        return this.b().comparator();
    }

    public abstract me b();

    public ma e() {
        ma ma2 = this.a;
        if (ma2 == null) {
            this.a = new el(this);
            return this.a;
        }
        return ma2;
    }

    @Override
    public final xd k() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final xd l() {
        throw new UnsupportedOperationException();
    }

    public abstract ma a(Object var1, ce var2);

    public ma b(Object object, ce ce2, Object object2, ce ce3) {
        cl.a(this.comparator().compare(object, object2) <= 0, "Expected lowerBound <= upperBound but %s > %s", object, object2);
        return this.b(object, ce2).a(object2, ce3);
    }

    public abstract ma b(Object var1, ce var2);

    public static mb b(Comparator comparator) {
        return new mb(comparator);
    }

    public static mb s() {
        return new mb(yd.d().a());
    }

    public static mb t() {
        return new mb(yd.d());
    }

    @Override
    Object aR_() {
        return new mc(this);
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }

    @Override
    public /* synthetic */ abn c(Object object, ce ce2) {
        return this.b(object, ce2);
    }

    @Override
    public /* synthetic */ abn a(Object object, ce ce2, Object object2, ce ce3) {
        return this.b(object, ce2, object2, ce3);
    }

    @Override
    public /* synthetic */ abn d(Object object, ce ce2) {
        return this.a(object, ce2);
    }

    @Override
    public /* synthetic */ abn o() {
        return this.e();
    }

    @Override
    public /* synthetic */ NavigableSet g() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }
}

