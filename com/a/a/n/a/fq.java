/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.fp;
import com.a.a.n.a.fr;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class fq
implements InvocationHandler {
    final /* synthetic */ Object a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;
    final /* synthetic */ Set d;
    final /* synthetic */ fp e;

    fq(fp fp2, Object object, long l2, TimeUnit timeUnit, Set set) {
        this.e = fp2;
        this.a = object;
        this.b = l2;
        this.c = timeUnit;
        this.d = set;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) {
        fr fr2 = new fr(this, method, arrobject);
        return this.e.a(fr2, this.b, this.c, this.d.contains(method));
    }
}

