/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ba;
import com.a.a.d.cl;
import com.a.a.d.od;
import com.a.a.d.oe;
import com.a.a.d.of;
import com.a.a.d.oh;
import com.a.a.d.sz;
import com.a.a.d.vi;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class oc
extends ba {
    private static final int c = 16;
    private static final int d = 2;
    static final double a = 1.0;
    transient int b = 2;
    private transient oe e;
    private static final long f = 1L;

    public static oc v() {
        return new oc(16, 2);
    }

    public static oc a(int n2, int n3) {
        return new oc(sz.b(n2), sz.b(n3));
    }

    public static oc b(vi vi2) {
        oc oc2 = oc.a(vi2.q().size(), 2);
        oc2.a(vi2);
        return oc2;
    }

    private static void b(oh oh2, oh oh3) {
        oh2.b(oh3);
        oh3.a(oh2);
    }

    private static void b(oe oe2, oe oe3) {
        oe2.a(oe3);
        oe3.b(oe2);
    }

    private static void b(oh oh2) {
        oc.b(oh2.a(), oh2.b());
    }

    private static void b(oe oe2) {
        oc.b(oe2.c(), oe2.d());
    }

    private oc(int n2, int n3) {
        super(new LinkedHashMap(n2));
        cl.a(n3, "expectedValuesPerKey");
        this.b = n3;
        this.e = new oe(null, null, 0, null);
        oc.b(this.e, this.e);
    }

    @Override
    Set a() {
        return new LinkedHashSet(this.b);
    }

    @Override
    Collection e(Object object) {
        return new of(this, object, this.b);
    }

    @Override
    public Set a(Object object, Iterable iterable) {
        return super.a(object, iterable);
    }

    @Override
    public Set u() {
        return super.u();
    }

    @Override
    public Collection j() {
        return super.j();
    }

    @Override
    Iterator m() {
        return new od(this);
    }

    @Override
    Iterator k() {
        return sz.b(this.m());
    }

    @Override
    public void h() {
        super.h();
        oc.b(this.e, this.e);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b);
        objectOutputStream.writeInt(this.q().size());
        for (Object object : this.q()) {
            objectOutputStream.writeObject(object);
        }
        objectOutputStream.writeInt(this.g());
        for (Object object : this.u()) {
            objectOutputStream.writeObject(object.getKey());
            objectOutputStream.writeObject(object.getValue());
        }
    }

    private void a(ObjectInputStream objectInputStream) {
        int n2;
        objectInputStream.defaultReadObject();
        this.e = new oe(null, null, 0, null);
        oc.b(this.e, this.e);
        this.b = objectInputStream.readInt();
        int n3 = objectInputStream.readInt();
        LinkedHashMap<Object, Collection> linkedHashMap = new LinkedHashMap<Object, Collection>(sz.b(n3));
        for (n2 = 0; n2 < n3; ++n2) {
            Object object = objectInputStream.readObject();
            linkedHashMap.put(object, this.e(object));
        }
        n2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            ((Collection)linkedHashMap.get(object)).add(object2);
        }
        this.a(linkedHashMap);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }

    static /* synthetic */ void a(oh oh2, oh oh3) {
        oc.b(oh2, oh3);
    }

    static /* synthetic */ oe a(oc oc2) {
        return oc2.e;
    }

    static /* synthetic */ void a(oe oe2, oe oe3) {
        oc.b(oe2, oe3);
    }

    static /* synthetic */ void a(oh oh2) {
        oc.b(oh2);
    }

    static /* synthetic */ void a(oe oe2) {
        oc.b(oe2);
    }
}

