/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.aac;
import com.a.a.d.ez;
import com.a.a.d.iz;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.kk;
import com.a.a.d.kq;
import com.a.a.d.lo;
import com.a.a.d.ls;
import com.a.a.d.lu;
import com.a.a.d.me;
import com.a.a.d.vi;
import com.a.a.d.zz;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class lr
extends kk
implements aac {
    private final transient lo a;
    private transient lr d;
    private transient lo e;
    private static final long f = 0L;

    public static lr a() {
        return ez.a;
    }

    public static lr d(Object object, Object object2) {
        ls ls2 = lr.b();
        ls2.a(object, object2);
        return ls2.a();
    }

    public static lr a(Object object, Object object2, Object object3, Object object4) {
        ls ls2 = lr.b();
        ls2.a(object, object2);
        ls2.a(object3, object4);
        return ls2.a();
    }

    public static lr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        ls ls2 = lr.b();
        ls2.a(object, object2);
        ls2.a(object3, object4);
        ls2.a(object5, object6);
        return ls2.a();
    }

    public static lr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        ls ls2 = lr.b();
        ls2.a(object, object2);
        ls2.a(object3, object4);
        ls2.a(object5, object6);
        ls2.a(object7, object8);
        return ls2.a();
    }

    public static lr a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        ls ls2 = lr.b();
        ls2.a(object, object2);
        ls2.a(object3, object4);
        ls2.a(object5, object6);
        ls2.a(object7, object8);
        ls2.a(object9, object10);
        return ls2.a();
    }

    public static ls b() {
        return new ls();
    }

    public static lr b(vi vi2) {
        return lr.b(vi2, null);
    }

    private static lr b(vi vi2, Comparator comparator) {
        Object object;
        cl.a(vi2);
        if (vi2.o() && comparator == null) {
            return lr.a();
        }
        if (vi2 instanceof lr && !((kk)(object = (lr)vi2)).w()) {
            return object;
        }
        object = jt.n();
        int n2 = 0;
        for (Map.Entry entry : vi2.c().entrySet()) {
            Object k2 = entry.getKey();
            Collection collection = (Collection)entry.getValue();
            lo lo2 = lr.a(comparator, collection);
            if (lo2.isEmpty()) continue;
            ((ju)object).b(k2, lo2);
            n2 += lo2.size();
        }
        return new lr(((ju)object).b(), n2, comparator);
    }

    lr(jt jt2, int n2, Comparator comparator) {
        super(jt2, n2);
        this.a = lr.a(comparator);
    }

    public lo e(Object object) {
        lo lo2 = (lo)this.b.get(object);
        return (lo)cc.b(lo2, this.a);
    }

    public lr d() {
        lr lr2 = this.d;
        return lr2 == null ? (this.d = this.J()) : lr2;
    }

    private lr J() {
        ls ls2 = lr.b();
        for (Map.Entry entry : this.H()) {
            ls2.a(entry.getValue(), entry.getKey());
        }
        lr lr2 = ls2.a();
        lr2.d = this;
        return lr2;
    }

    public lo h(Object object) {
        throw new UnsupportedOperationException();
    }

    public lo d(Object object, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    public lo H() {
        lo lo2 = this.e;
        return lo2 == null ? (this.e = new lu(this)) : lo2;
    }

    private static lo a(Comparator comparator, Collection collection) {
        return comparator == null ? lo.a(collection) : me.a(comparator, collection);
    }

    private static lo a(Comparator comparator) {
        return comparator == null ? lo.j() : me.a(comparator);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.I());
        zz.a((vi)this, objectOutputStream);
    }

    Comparator I() {
        return this.a instanceof me ? ((me)this.a).comparator() : null;
    }

    private void a(ObjectInputStream objectInputStream) {
        jt jt2;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator)objectInputStream.readObject();
        int n2 = objectInputStream.readInt();
        if (n2 < 0) {
            throw new InvalidObjectException("Invalid key count " + n2);
        }
        ju ju2 = jt.n();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n4 = objectInputStream.readInt();
            if (n4 <= 0) {
                throw new InvalidObjectException("Invalid value count " + n4);
            }
            Object[] arrobject = new Object[n4];
            for (int i3 = 0; i3 < n4; ++i3) {
                arrobject[i3] = objectInputStream.readObject();
            }
            lo lo2 = lr.a(comparator, Arrays.asList(arrobject));
            if (lo2.size() != arrobject.length) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            ju2.b(object, lo2);
            n3 += n4;
        }
        try {
            jt2 = ju2.b();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException.getMessage()).initCause(illegalArgumentException);
        }
        kq.a.a((Object)this, jt2);
        kq.b.a((Object)this, n3);
        kq.c.a((Object)this, lr.a(comparator));
    }

    @Override
    public /* synthetic */ iz z() {
        return this.H();
    }

    @Override
    public /* synthetic */ kk e() {
        return this.d();
    }

    @Override
    public /* synthetic */ iz i(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ iz e(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ iz j(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.H();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.e(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Set u() {
        return this.H();
    }

    @Override
    public /* synthetic */ Set a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Set b(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.e(object);
    }

    static /* synthetic */ lr a(vi vi2, Comparator comparator) {
        return lr.b(vi2, comparator);
    }
}

