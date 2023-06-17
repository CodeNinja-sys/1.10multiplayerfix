/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.m;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class wi
extends m {
    transient dx a;
    private static final long b = 0L;

    wi(Map map, dx dx2) {
        super(map);
        this.a = (dx)cl.a(dx2);
    }

    @Override
    protected List a() {
        return (List)this.a.a();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.f());
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (dx)objectInputStream.readObject();
        Map map = (Map)objectInputStream.readObject();
        this.a(map);
    }

    @Override
    protected /* synthetic */ Collection d() {
        return this.a();
    }
}

