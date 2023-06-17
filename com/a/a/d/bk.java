/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.m;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class bk
extends m {
    private static final int b = 3;
    transient int a;
    private static final long c = 0L;

    public static bk u() {
        return new bk();
    }

    public static bk a(int n2, int n3) {
        return new bk(n2, n3);
    }

    public static bk b(vi vi2) {
        return new bk(vi2);
    }

    private bk() {
        super(new HashMap());
        this.a = 3;
    }

    private bk(int n2, int n3) {
        super(sz.a(n2));
        cl.a(n3, "expectedValuesPerKey");
        this.a = n3;
    }

    private bk(vi vi2) {
        this(vi2.q().size(), vi2 instanceof bk ? ((bk)vi2).a : 3);
        this.a(vi2);
    }

    @Override
    List a() {
        return new ArrayList(this.a);
    }

    public void v() {
        for (Collection collection : this.f().values()) {
            ArrayList arrayList = (ArrayList)collection;
            arrayList.trimToSize();
        }
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

