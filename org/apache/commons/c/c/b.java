/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.apache.commons.c.c.a;

public class b
implements InvocationHandler {
    final /* synthetic */ a a;

    protected b(a a2) {
        this.a = a2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) {
        for (Object e2 : org.apache.commons.c.c.a.a(this.a)) {
            method.invoke(e2, arrobject);
        }
        return null;
    }
}

