/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.be;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

class wl
extends be {
    transient dx a;
    transient Comparator b;
    private static final long c = 0L;

    wl(Map map, dx dx2) {
        super(map);
        this.a = (dx)cl.a(dx2);
        this.b = ((SortedSet)dx2.a()).comparator();
    }

    @Override
    protected SortedSet y() {
        return (SortedSet)this.a.a();
    }

    @Override
    public Comparator aM_() {
        return this.b;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.f());
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (dx)objectInputStream.readObject();
        this.b = ((SortedSet)this.a.a()).comparator();
        Map map = (Map)objectInputStream.readObject();
        this.a(map);
    }

    @Override
    protected /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    protected /* synthetic */ Collection d() {
        return this.y();
    }
}

