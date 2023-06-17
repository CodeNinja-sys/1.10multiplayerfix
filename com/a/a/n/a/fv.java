/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.n.a.gb;
import java.util.concurrent.Semaphore;

final class fv
implements dx {
    final /* synthetic */ int a;

    fv(int n2) {
        this.a = n2;
    }

    public Semaphore b() {
        return new gb(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

