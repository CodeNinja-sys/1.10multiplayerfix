/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class fu
implements dx {
    fu() {
    }

    public Lock b() {
        return new ReentrantLock(false);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

