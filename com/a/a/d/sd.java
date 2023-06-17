/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sc;
import java.lang.ref.ReferenceQueue;

final class sd
extends sc
implements rz {
    rz d = qy.i();
    rz e = qy.i();

    sd(ReferenceQueue referenceQueue, Object object, int n2, rz rz2) {
        super(referenceQueue, object, n2, rz2);
    }

    @Override
    public rz h() {
        return this.d;
    }

    @Override
    public void c(rz rz2) {
        this.d = rz2;
    }

    @Override
    public rz i() {
        return this.e;
    }

    @Override
    public void d(rz rz2) {
        this.e = rz2;
    }
}

