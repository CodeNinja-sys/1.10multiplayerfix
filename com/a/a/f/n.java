/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class n {
    private final Object a;
    private final Method b;

    n(Object object, Method method) {
        cl.a(object, (Object)"EventSubscriber target cannot be null.");
        cl.a(method, (Object)"EventSubscriber method cannot be null.");
        this.a = object;
        this.b = method;
        method.setAccessible(true);
    }

    public void a(Object object) {
        cl.a(object);
        try {
            this.b.invoke(this.a, object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new Error("Method rejected target/argument: " + object, illegalArgumentException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new Error("Method became inaccessible: " + object, illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            if (invocationTargetException.getCause() instanceof Error) {
                throw (Error)invocationTargetException.getCause();
            }
            throw invocationTargetException;
        }
    }

    public String toString() {
        return "[wrapper " + this.b + "]";
    }

    public int hashCode() {
        int n2 = 31;
        return (31 + this.b.hashCode()) * 31 + System.identityHashCode(this.a);
    }

    public boolean equals(Object object) {
        if (object instanceof n) {
            n n2 = (n)object;
            return this.a == n2.a && this.b.equals(n2.b);
        }
        return false;
    }

    public Object a() {
        return this.a;
    }

    public Method b() {
        return this.b;
    }
}

