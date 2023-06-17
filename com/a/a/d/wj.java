/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

class wj
extends n {
    transient dx a;
    private static final long b = 0L;

    wj(Map map, dx dx2) {
        super(map);
        this.a = (dx)cl.a(dx2);
    }

    @Override
    protected Collection d() {
        return (Collection)this.a.a();
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
}

