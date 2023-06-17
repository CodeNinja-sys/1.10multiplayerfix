/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.a;
import com.a.a.d.b;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

class f
extends a {
    private static final long b = 0L;

    private f(Map map, a a2) {
        super(map, a2, null);
    }

    @Override
    Object a(Object object) {
        return this.a.b(object);
    }

    @Override
    Object b(Object object) {
        return this.a.a(object);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.aT_());
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a((a)objectInputStream.readObject());
    }

    Object d() {
        return this.aT_().aT_();
    }

    @Override
    public /* synthetic */ Collection values() {
        return super.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return super.a();
    }

    /* synthetic */ f(Map map, a a2, b b2) {
        this(map, a2);
    }
}

