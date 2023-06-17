/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.du;
import com.a.a.n.a.p;
import java.util.concurrent.ThreadFactory;

class v
implements ThreadFactory {
    final /* synthetic */ p a;

    v(p p2) {
        this.a = p2;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return du.a(this.a.m(), runnable);
    }
}

