/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.b.s;

public class v
extends s {
    private static final long a = -6994123481142850163L;
    private final Serializable b;

    public static boolean a(Throwable throwable, Object object) {
        return object != null && throwable instanceof v && object.equals(((v)throwable).b);
    }

    public static void b(Throwable throwable, Object object) {
        if (v.a(throwable, object)) {
            throw ((v)throwable).b();
        }
    }

    public v(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.b = serializable;
    }

    public Serializable a() {
        return this.b;
    }

    public IOException b() {
        return (IOException)super.getCause();
    }

    @Override
    public /* synthetic */ Throwable getCause() {
        return this.b();
    }
}

