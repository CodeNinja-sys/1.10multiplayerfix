/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class cd
implements PrivilegedExceptionAction {
    cd() {
    }

    public Unsafe a() {
        Class<Unsafe> class_ = Unsafe.class;
        for (Field field : class_.getDeclaredFields()) {
            field.setAccessible(true);
            Object object = field.get(null);
            if (!class_.isInstance(object)) continue;
            return (Unsafe)class_.cast(object);
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}

