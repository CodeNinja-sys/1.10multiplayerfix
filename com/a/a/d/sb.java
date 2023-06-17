/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.d.ql;
import com.a.a.d.qw;
import com.a.a.d.rc;
import com.a.a.d.sh;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

final class sb
extends rc {
    private static final long a = 3L;

    sb(sh sh2, sh sh3, aw aw2, aw aw3, long l2, long l3, int n2, int n3, qw qw2, ConcurrentMap concurrentMap) {
        super(sh2, sh3, aw2, aw3, l2, l3, n2, n3, qw2, concurrentMap);
    }

    private void b(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        this.a(objectOutputStream);
    }

    private void c(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ql ql2 = this.a(objectInputStream);
        this.k = ql2.e();
        this.b(objectInputStream);
    }

    private Object b() {
        return this.k;
    }
}

