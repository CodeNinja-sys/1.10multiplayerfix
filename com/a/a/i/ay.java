/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.aw;
import com.a.a.i.ba;
import java.io.Closeable;
import java.util.logging.Level;

final class ay
implements ba {
    static final ay a = new ay();

    ay() {
    }

    @Override
    public void a(Closeable closeable, Throwable throwable, Throwable throwable2) {
        aw.a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, throwable2);
    }
}

