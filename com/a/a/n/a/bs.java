/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bd;
import com.a.a.n.a.bg;
import com.a.a.n.a.bi;
import com.a.a.n.a.bl;
import com.a.a.n.a.bm;
import com.a.a.n.a.bq;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class bs
extends bd {
    private final Map b;

    bs(bq bq2, Map map) {
        super(bq2, null);
        this.b = map;
    }

    public ReentrantLock a(Enum enum_) {
        return this.a(enum_, false);
    }

    public ReentrantLock a(Enum enum_, boolean bl2) {
        return this.a == bm.c ? new ReentrantLock(bl2) : new bg(this, (bl)this.b.get(enum_), bl2, null);
    }

    public ReentrantReadWriteLock b(Enum enum_) {
        return this.b(enum_, false);
    }

    public ReentrantReadWriteLock b(Enum enum_, boolean bl2) {
        return this.a == bm.c ? new ReentrantReadWriteLock(bl2) : new bi(this, (bl)this.b.get(enum_), bl2, null);
    }
}

