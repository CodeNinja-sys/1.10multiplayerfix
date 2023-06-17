/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bd;
import com.a.a.n.a.bi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class bh
extends ReentrantReadWriteLock.ReadLock {
    final bi a;
    final /* synthetic */ bd b;

    bh(bd bd2, bi bi2) {
        this.b = bd2;
        super(bi2);
        this.a = bi2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lock() {
        bd.a(this.b, this.a);
        try {
            super.lock();
        }
        finally {
            bd.b(this.b, this.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lockInterruptibly() {
        bd.a(this.b, this.a);
        try {
            super.lockInterruptibly();
        }
        finally {
            bd.b(this.b, this.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock() {
        bd.a(this.b, this.a);
        try {
            boolean bl2 = super.tryLock();
            return bl2;
        }
        finally {
            bd.b(this.b, this.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock(long l2, TimeUnit timeUnit) {
        bd.a(this.b, this.a);
        try {
            boolean bl2 = super.tryLock(l2, timeUnit);
            return bl2;
        }
        finally {
            bd.b(this.b, this.a);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void unlock() {
        try {
            super.unlock();
        }
        finally {
            bd.b(this.b, this.a);
        }
    }
}

