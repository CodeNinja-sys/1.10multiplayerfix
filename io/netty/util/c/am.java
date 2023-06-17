/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

final class am
extends AtomicIntegerFieldUpdater {
    private final long a;
    private final Unsafe b;

    am(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.b = unsafe;
        this.a = unsafe.objectFieldOffset(field);
    }

    public boolean compareAndSet(Object object, int n2, int n3) {
        return this.b.compareAndSwapInt(object, this.a, n2, n3);
    }

    public boolean weakCompareAndSet(Object object, int n2, int n3) {
        return this.b.compareAndSwapInt(object, this.a, n2, n3);
    }

    public void set(Object object, int n2) {
        this.b.putIntVolatile(object, this.a, n2);
    }

    public void lazySet(Object object, int n2) {
        this.b.putOrderedInt(object, this.a, n2);
    }

    public int get(Object object) {
        return this.b.getIntVolatile(object, this.a);
    }
}

