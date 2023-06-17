/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aaa;
import java.lang.reflect.Field;

final class aab {
    private final Field a;

    private aab(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    void a(Object object, Object object2) {
        try {
            this.a.set(object, object2);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
    }

    void a(Object object, int n2) {
        try {
            this.a.set(object, n2);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
    }

    /* synthetic */ aab(Field field, aaa aaa2) {
        this(field);
    }
}

