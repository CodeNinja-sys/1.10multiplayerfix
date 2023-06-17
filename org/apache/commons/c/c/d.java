/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.c.g.e;

class d
implements InvocationHandler {
    private final Object a;
    private final String b;
    private final Set c;

    d(Object object, String string, String[] arrstring) {
        this.a = object;
        this.b = string;
        this.c = new HashSet<String>(Arrays.asList(arrstring));
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) {
        if (this.c.isEmpty() || this.c.contains(method.getName())) {
            if (this.a(method)) {
                return e.a(this.a, this.b, arrobject);
            }
            return e.a(this.a, this.b, new Object[0]);
        }
        return null;
    }

    private boolean a(Method method) {
        return e.a(this.a.getClass(), this.b, method.getParameterTypes()) != null;
    }
}

