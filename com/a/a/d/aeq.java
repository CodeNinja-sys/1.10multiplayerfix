/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.af;
import com.a.a.d.bb;
import com.a.a.d.n;
import com.a.a.d.vi;
import com.a.a.d.w;
import com.a.a.d.x;
import com.a.a.d.yd;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class aeq
extends bb {
    private transient Comparator a;
    private transient Comparator b;
    private static final long c = 0L;

    public static aeq A() {
        return new aeq(yd.d(), yd.d());
    }

    public static aeq a(Comparator comparator, Comparator comparator2) {
        return new aeq((Comparator)cl.a(comparator), (Comparator)cl.a(comparator2));
    }

    public static aeq b(vi vi2) {
        return new aeq(yd.d(), yd.d(), vi2);
    }

    aeq(Comparator comparator, Comparator comparator2) {
        super(new TreeMap(comparator));
        this.a = comparator;
        this.b = comparator2;
    }

    private aeq(Comparator comparator, Comparator comparator2, vi vi2) {
        this(comparator, comparator2);
        this.a(vi2);
    }

    @Override
    SortedSet y() {
        return new TreeSet(this.b);
    }

    @Override
    Collection e(Object object) {
        if (object == null) {
            this.B().compare(object, object);
        }
        return super.e(object);
    }

    public Comparator B() {
        return this.a;
    }

    @Override
    public Comparator aM_() {
        return this.b;
    }

    NavigableMap C() {
        return (NavigableMap)super.w();
    }

    public NavigableSet j(Object object) {
        return (NavigableSet)super.h(object);
    }

    @Override
    Collection a(Collection collection) {
        return aad.a((NavigableSet)collection);
    }

    @Override
    Collection a(Object object, Collection collection) {
        return new af((n)this, object, (NavigableSet)collection, null);
    }

    public NavigableSet D() {
        return (NavigableSet)super.x();
    }

    NavigableSet E() {
        return new x((n)this, this.C());
    }

    public NavigableMap F() {
        return (NavigableMap)super.v();
    }

    NavigableMap G() {
        return new w((n)this, this.C());
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.B());
        objectOutputStream.writeObject(this.aM_());
        zz.a((vi)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (Comparator)cl.a((Comparator)objectInputStream.readObject());
        this.b = (Comparator)cl.a((Comparator)objectInputStream.readObject());
        this.a(new TreeMap(this.a));
        zz.a((vi)this, objectInputStream);
    }

    @Override
    public /* synthetic */ SortedSet x() {
        return this.D();
    }

    @Override
    /* synthetic */ SortedMap w() {
        return this.C();
    }

    @Override
    public /* synthetic */ SortedMap v() {
        return this.F();
    }

    @Override
    public /* synthetic */ Map c() {
        return this.F();
    }

    @Override
    public /* synthetic */ SortedSet h(Object object) {
        return this.j(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.j(object);
    }

    @Override
    public /* synthetic */ Set q() {
        return this.D();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.j(object);
    }

    @Override
    /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    /* synthetic */ Map n() {
        return this.G();
    }

    @Override
    /* synthetic */ Set i() {
        return this.E();
    }

    @Override
    /* synthetic */ Map f() {
        return this.C();
    }

    @Override
    /* synthetic */ Collection d() {
        return this.y();
    }
}

