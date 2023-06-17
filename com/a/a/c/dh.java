/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.dg;
import com.a.a.c.di;
import java.util.concurrent.Executor;

public final class dh {
    private dh() {
    }

    public static dg a(dg dg2, Executor executor) {
        cl.a(dg2);
        cl.a(executor);
        return new di(executor, dg2);
    }
}

