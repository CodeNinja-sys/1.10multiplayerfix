/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.aq;
import com.sun.jna.x;
import com.sun.jna.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class aj
implements InvocationHandler {
    private final z a;
    private final x b;

    aj(z z2, x x2) {
        this.a = z2;
        this.b = x2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object invoke(Object object, Method method, Object[] arrobject) {
        aq aq2 = this.a.a();
        synchronized (aq2) {
            return this.a.invoke(this.b, method, arrobject);
        }
    }
}

