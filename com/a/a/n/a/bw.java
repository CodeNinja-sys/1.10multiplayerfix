/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.gh;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class bw
implements gh {
    @Override
    public Object a(Object object, Class class_, long l2, TimeUnit timeUnit) {
        cl.a(object);
        cl.a(class_);
        cl.a((Object)timeUnit);
        return object;
    }

    @Override
    public Object a(Callable callable, long l2, TimeUnit timeUnit, boolean bl2) {
        cl.a((Object)timeUnit);
        return callable.call();
    }
}

