/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

final class t {
    static final Unsafe a = t.a();
    private static final long b = t.a(ByteBuffer.class, "address");
    private static final long c = t.a(ByteBuffer.class, "capacity");
    private static final ByteBuffer d = ByteBuffer.allocateDirect(4096);

    t() {
    }

    static ByteBuffer a(long l2, int n2) {
        if (l2 <= 0L || n2 < 0) {
            throw new IllegalStateException("you almost crashed the jvm");
        }
        ByteBuffer byteBuffer = d.duplicate().order(ByteOrder.nativeOrder());
        a.putLong(byteBuffer, b, l2);
        a.putInt(byteBuffer, c, n2);
        byteBuffer.position(0);
        byteBuffer.limit(n2);
        return byteBuffer;
    }

    private static long a(Class class_, String string) {
        while (class_ != null) {
            try {
                return a.objectFieldOffset(class_.getDeclaredField(string));
            }
            catch (Throwable throwable) {
                class_ = class_.getSuperclass();
            }
        }
        throw new UnsupportedOperationException();
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

