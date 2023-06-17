/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.rz;
import com.a.a.d.sr;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class sx
extends WeakReference
implements sr {
    final rz a;

    sx(ReferenceQueue referenceQueue, Object object, rz rz2) {
        super(object, referenceQueue);
        this.a = rz2;
    }

    @Override
    public rz a() {
        return this.a;
    }

    @Override
    public void a(sr sr2) {
        this.clear();
    }

    @Override
    public sr a(ReferenceQueue referenceQueue, Object object, rz rz2) {
        return new sx(referenceQueue, object, rz2);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public Object c() {
        return this.get();
    }
}

