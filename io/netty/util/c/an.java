/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

final class an
extends AtomicLongFieldUpdater {
    private final long a;
    private final Unsafe b;

    an(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.b = unsafe;
        this.a = unsafe.objectFieldOffset(field);
    }

    public boolean compareAndSet(Object object, long l2, long l3) {
        return this.b.compareAndSwapLong(object, this.a, l2, l3);
    }

    public boolean weakCompareAndSet(Object object, long l2, long l3) {
        return this.b.compareAndSwapLong(object, this.a, l2, l3);
    }

    public void set(Object object, long l2) {
        this.b.putLongVolatile(object, this.a, l2);
    }

    public void lazySet(Object object, long l2) {
        this.b.putOrderedLong(object, this.a, l2);
    }

    public long get(Object object) {
        return this.b.getLongVolatile(object, this.a);
    }
}

