/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.ye;
import java.util.concurrent.atomic.AtomicInteger;

class yf
implements bl {
    final AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ ye b;

    yf(ye ye2) {
        this.b = ye2;
    }

    public Integer b(Object object) {
        return this.a.getAndIncrement();
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.b(object);
    }
}

