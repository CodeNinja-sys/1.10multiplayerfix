/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.ej;
import com.a.a.n.a.gm;
import java.util.concurrent.TimeUnit;

final class ek
extends ej {
    ek() {
    }

    @Override
    public long a() {
        return ek.b().a();
    }

    @Override
    public void a(long l2) {
        if (l2 > 0L) {
            gm.a(l2, TimeUnit.MICROSECONDS);
        }
    }
}

