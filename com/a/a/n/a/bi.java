/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bd;
import com.a.a.n.a.be;
import com.a.a.n.a.bf;
import com.a.a.n.a.bh;
import com.a.a.n.a.bj;
import com.a.a.n.a.bl;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class bi
extends ReentrantReadWriteLock
implements bf {
    private final bh b;
    private final bj c;
    private final bl d;
    final /* synthetic */ bd a;

    private bi(bd bd2, bl bl2, boolean bl3) {
        this.a = bd2;
        super(bl3);
        this.b = new bh(bd2, this);
        this.c = new bj(bd2, this);
        this.d = (bl)cl.a(bl2);
    }

    @Override
    public ReentrantReadWriteLock.ReadLock readLock() {
        return this.b;
    }

    @Override
    public ReentrantReadWriteLock.WriteLock writeLock() {
        return this.c;
    }

    @Override
    public bl a() {
        return this.d;
    }

    @Override
    public boolean b() {
        return this.isWriteLockedByCurrentThread() || this.getReadHoldCount() > 0;
    }

    /* synthetic */ bi(bd bd2, bl bl2, boolean bl3, be be2) {
        this(bd2, bl2, bl3);
    }
}

