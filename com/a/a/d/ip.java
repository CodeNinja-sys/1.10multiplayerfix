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
import java.util.HashMap;

public final class ip
extends ai {
    private static final long a = 0L;

    public static ip g() {
        return new ip();
    }

    public static ip a(int n2) {
        return new ip(n2);
    }

    public static ip a(Iterable iterable) {
        ip ip2 = ip.a(xe.a(iterable));
        mq.a(ip2, iterable);
        return ip2;
    }

    private ip() {
        super(new HashMap());
    }

    private ip(int n2) {
        super(sz.a(n2));
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        zz.a((xc)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = zz.a(objectInputStream);
        this.a(sz.a(n2));
        zz.a(this, objectInputStream, n2);
    }
}

