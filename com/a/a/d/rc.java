/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.d.gi;
import com.a.a.d.ql;
import com.a.a.d.qw;
import com.a.a.d.sh;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

abstract class rc
extends gi
implements Serializable {
    private static final long a = 3L;
    final sh b;
    final sh c;
    final aw d;
    final aw e;
    final long f;
    final long g;
    final int h;
    final int i;
    final qw j;
    transient ConcurrentMap k;

    rc(sh sh2, sh sh3, aw aw2, aw aw3, long l2, long l3, int n2, int n3, qw qw2, ConcurrentMap concurrentMap) {
        this.b = sh2;
        this.c = sh3;
        this.d = aw2;
        this.e = aw3;
        this.f = l2;
        this.g = l3;
        this.h = n2;
        this.i = n3;
        this.j = qw2;
        this.k = concurrentMap;
    }

    @Override
    protected ConcurrentMap c() {
        return this.k;
    }

    void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.k.size());
        for (Map.Entry entry : this.k.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    ql a(ObjectInputStream objectInputStream) {
        int n2 = objectInputStream.readInt();
        ql ql2 = new ql().d(n2).a(this.b).b(this.c).b(this.d).f(this.i);
        ql2.a(this.j);
        if (this.f > 0L) {
            ql2.c(this.f, TimeUnit.NANOSECONDS);
        }
        if (this.g > 0L) {
            ql2.d(this.g, TimeUnit.NANOSECONDS);
        }
        if (this.h != -1) {
            ql2.e(this.h);
        }
        return ql2;
    }

    void b(ObjectInputStream objectInputStream) {
        Object object;
        while ((object = objectInputStream.readObject()) != null) {
            Object object2 = objectInputStream.readObject();
            this.k.put(object, object2);
        }
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

