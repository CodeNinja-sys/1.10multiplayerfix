/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

final class ao
extends AtomicReferenceFieldUpdater {
    private final long a;
    private final Unsafe b;

    ao(Unsafe unsafe, Class class_, String string) {
        Field field = class_.getDeclaredField(string);
        if (!Modifier.isVolatile(field.getModifiers())) {
            throw new IllegalArgumentException("Must be volatile");
        }
        this.b = unsafe;
        this.a = unsafe.objectFieldOffset(field);
    }

    public boolean compareAndSet(Object object, Object object2, Object object3) {
        return this.b.compareAndSwapObject(object, this.a, object2, object3);
    }

    public boolean weakCompareAndSet(Object object, Object object2, Object object3) {
        return this.b.compareAndSwapObject(object, this.a, object2, object3);
    }

    public void set(Object object, Object object2) {
        this.b.putObjectVolatile(object, this.a, object2);
    }

    public void lazySet(Object object, Object object2) {
        this.b.putOrderedObject(object, this.a, object2);
    }

    public Object get(Object object) {
        return this.b.getObjectVolatile(object, this.a);
    }
}

