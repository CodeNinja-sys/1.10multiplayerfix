/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.a.n;

class j
implements InvocationHandler {
    private static final Method a;
    private final n b;
    private boolean c = false;

    j(n n2) {
        this.b = n2;
    }

    public n a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public Object invoke(Object object, Method method, Object[] arrobject) {
        try {
            if (method.equals(a)) {
                this.c = true;
            }
            return method.invoke(this.b, arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw invocationTargetException;
        }
    }

    static {
        try {
            a = n.class.getMethod("a", OutputStream.class);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new Error(noSuchMethodException);
        }
    }
}

