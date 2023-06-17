/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  sun.reflect.FieldAccessor
 */
package org.lwjgl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import org.lwjgl.o;
import org.lwjgl.q;
import sun.reflect.FieldAccessor;

class v
implements q {
    private final FieldAccessor a;

    v() {
        Field field;
        try {
            field = o.a();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new UnsupportedOperationException(noSuchFieldException);
        }
        field.setAccessible(true);
        try {
            Method method = Field.class.getDeclaredMethod("acquireFieldAccessor", Boolean.TYPE);
            method.setAccessible(true);
            this.a = (FieldAccessor)method.invoke(field, true);
        }
        catch (Exception exception) {
            throw new UnsupportedOperationException(exception);
        }
    }

    public long a(Buffer buffer) {
        return this.a.getLong((Object)buffer);
    }
}

