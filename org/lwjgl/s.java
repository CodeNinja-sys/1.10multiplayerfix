/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Field;
import java.nio.Buffer;
import org.lwjgl.o;
import org.lwjgl.q;

class s
implements q {
    private final Field a;

    s() {
        try {
            this.a = o.a();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new UnsupportedOperationException(noSuchFieldException);
        }
        this.a.setAccessible(true);
    }

    @Override
    public long a(Buffer buffer) {
        try {
            return this.a.getLong(buffer);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0L;
        }
    }
}

