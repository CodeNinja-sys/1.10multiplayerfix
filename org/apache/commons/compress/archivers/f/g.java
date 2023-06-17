/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.f;

abstract class g {
    private final Class[] a;
    private static final byte[] b = new byte[0];

    protected g(Class ... arrclass) {
        this.a = arrclass;
    }

    boolean a(Object object) {
        for (Class class_ : this.a) {
            if (!class_.isInstance(object)) continue;
            return true;
        }
        return false;
    }

    byte[] b(Object object) {
        return b;
    }

    Object a(f f2, InputStream inputStream) {
        return null;
    }

    abstract InputStream a(InputStream var1, f var2, byte[] var3);

    OutputStream a(OutputStream outputStream, Object object) {
        throw new UnsupportedOperationException("method doesn't support writing");
    }

    protected static int a(Object object, int n2) {
        return object instanceof Number ? ((Number)object).intValue() : n2;
    }
}

