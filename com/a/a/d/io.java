/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.ba;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public final class io
extends ba {
    private static final int b = 2;
    transient int a = 2;
    private static final long c = 0L;

    public static io v() {
        return new io();
    }

    public static io a(int n2, int n3) {
        return new io(n2, n3);
    }

    public static io b(vi vi2) {
        return new io(vi2);
    }

    private io() {
        super(new HashMap());
    }

    private io(int n2, int n3) {
        super(sz.a(n2));
        cl.a(n3 >= 0);
        this.a = n3;
    }

    private io(vi vi2) {
        super(sz.a(vi2.q().size()));
        this.a(vi2);
    }

    @Override
    Set a() {
        return aad.a(this.a);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.a);
        zz.a((vi)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = objectInputStream.readInt();
        int n2 = zz.a(objectInputStream);
        HashMap hashMap = sz.a(n2);
        this.a(hashMap);
        zz.a(this, objectInputStream, n2);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }
}

