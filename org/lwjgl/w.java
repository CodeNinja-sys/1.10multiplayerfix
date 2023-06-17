/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import org.lwjgl.o;
import org.lwjgl.q;
import sun.misc.Unsafe;

class w
implements q {
    private final Unsafe a;
    private final long b;

    w() {
        try {
            this.a = w.a();
            this.b = this.a.objectFieldOffset(o.a());
        }
        catch (Exception exception) {
            throw new UnsupportedOperationException(exception);
        }
    }

    public long a(Buffer buffer) {
        return this.a.getLong(buffer, this.b);
    }

    private static Unsafe a() {
        Field[] arrfield;
        for (Field field : arrfield = Unsafe.class.getDeclaredFields()) {
            int n2;
            if (!field.getType().equals(Unsafe.class) || !Modifier.isStatic(n2 = field.getModifiers()) || !Modifier.isFinal(n2)) continue;
            field.setAccessible(true);
            try {
                return (Unsafe)field.get(null);
            }
            catch (IllegalAccessException illegalAccessException) {
                break;
            }
        }
        throw new UnsupportedOperationException();
    }
}

