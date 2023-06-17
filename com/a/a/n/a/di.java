/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.dj;
import com.a.a.n.a.dl;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class di {
    public static dl a(Future future) {
        if (future instanceof dl) {
            return (dl)future;
        }
        return new dj(future);
    }

    public static dl a(Future future, Executor executor) {
        cl.a(executor);
        if (future instanceof dl) {
            return (dl)future;
        }
        return new dj(future, executor);
    }

    private di() {
    }
}

