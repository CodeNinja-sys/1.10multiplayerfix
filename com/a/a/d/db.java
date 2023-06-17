/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

final class db
implements sr {
    final Throwable a;

    db(Throwable throwable) {
        this.a = throwable;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public rz a() {
        return null;
    }

    @Override
    public sr a(ReferenceQueue referenceQueue, Object object, rz rz2) {
        return this;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Object c() {
        throw new ExecutionException(this.a);
    }

    @Override
    public void a(sr sr2) {
    }
}

