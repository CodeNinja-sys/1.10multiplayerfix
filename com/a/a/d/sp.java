/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.ReferenceQueue;

final class sp
implements sr {
    final Object a;

    sp(Object object) {
        this.a = object;
    }

    @Override
    public Object get() {
        return this.a;
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
        return this.get();
    }

    @Override
    public void a(sr sr2) {
    }
}

