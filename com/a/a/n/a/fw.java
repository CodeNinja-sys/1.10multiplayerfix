/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import java.util.concurrent.Semaphore;

final class fw
implements dx {
    final /* synthetic */ int a;

    fw(int n2) {
        this.a = n2;
    }

    public Semaphore b() {
        return new Semaphore(this.a, false);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

