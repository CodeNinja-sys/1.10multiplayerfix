/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bd;
import com.a.a.n.a.be;
import com.a.a.n.a.bf;
import com.a.a.n.a.bl;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

final class bg
extends ReentrantLock
implements bf {
    private final bl b;
    final /* synthetic */ bd a;

    private bg(bd bd2, bl bl2, boolean bl3) {
        this.a = bd2;
        super(bl3);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public bl a() {
        return this.b;
    }

    @Override
    public boolean b() {
        return this.isHeldByCurrentThread();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lock() {
        bd.a(this.a, this);
        try {
            super.lock();
        }
        finally {
            bd.b(this.a, this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lockInterruptibly() {
        bd.a(this.a, this);
        try {
            super.lockInterruptibly();
        }
        finally {
            bd.b(this.a, this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock() {
        bd.a(this.a, this);
        try {
            boolean bl2 = super.tryLock();
            return bl2;
        }
        finally {
            bd.b(this.a, this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean tryLock(long l2, TimeUnit timeUnit) {
        bd.a(this.a, this);
        try {
            boolean bl2 = super.tryLock(l2, timeUnit);
            return bl2;
        }
        finally {
            bd.b(this.a, this);
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
            bd.b(this.a, this);
        }
    }

    /* synthetic */ bg(bd bd2, bl bl2, boolean bl3, be be2) {
        this(bd2, bl2, bl3);
    }
}

