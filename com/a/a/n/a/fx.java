/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class fx
implements dx {
    fx() {
    }

    public ReadWriteLock b() {
        return new ReentrantReadWriteLock();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

