/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.fp;
import com.a.a.n.a.fq;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

class fr
implements Callable {
    final /* synthetic */ Method a;
    final /* synthetic */ Object[] b;
    final /* synthetic */ fq c;

    fr(fq fq2, Method method, Object[] arrobject) {
        this.c = fq2;
        this.a = method;
        this.b = arrobject;
    }

    public Object call() {
        try {
            return this.a.invoke(this.c.a, this.b);
        }
        catch (InvocationTargetException invocationTargetException) {
            fp.a(invocationTargetException, false);
            throw new AssertionError((Object)"can't get here");
        }
    }
}

