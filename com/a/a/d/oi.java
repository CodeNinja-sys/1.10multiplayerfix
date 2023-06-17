/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ai;
import com.a.a.d.mq;
import com.a.a.d.sz;
import com.a.a.d.xc;
import com.a.a.d.xe;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public final class oi
extends ai {
    private static final long a = 0L;

    public static oi g() {
        return new oi();
    }

    public static oi a(int n2) {
        return new oi(n2);
    }

    public static oi a(Iterable iterable) {
        oi oi2 = oi.a(xe.a(iterable));
        mq.a(oi2, iterable);
        return oi2;
    }

    private oi() {
        super(new LinkedHashMap());
    }

    private oi(int n2) {
        super(new LinkedHashMap(sz.b(n2)));
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        zz.a((xc)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = zz.a(objectInputStream);
        this.a(new LinkedHashMap(sz.b(n2)));
        zz.a(this, objectInputStream, n2);
    }
}

