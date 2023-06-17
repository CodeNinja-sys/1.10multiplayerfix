/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.eg;
import com.a.a.i.ay;
import com.a.a.i.az;
import com.a.a.i.ba;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class ax
implements Closeable {
    private static final ba b = az.a() ? az.a : ay.a;
    final ba a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    public static ax a() {
        return new ax(b);
    }

    ax(ba ba2) {
        this.a = (ba)cl.a(ba2);
    }

    public Closeable a(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
        return closeable;
    }

    public RuntimeException a(Throwable throwable) {
        cl.a(throwable);
        this.d = throwable;
        eg.b(throwable, IOException.class);
        throw new RuntimeException(throwable);
    }

    public RuntimeException a(Throwable throwable, Class class_) {
        cl.a(throwable);
        this.d = throwable;
        eg.b(throwable, IOException.class);
        eg.b(throwable, class_);
        throw new RuntimeException(throwable);
    }

    public RuntimeException a(Throwable throwable, Class class_, Class class_2) {
        cl.a(throwable);
        this.d = throwable;
        eg.b(throwable, IOException.class);
        eg.a(throwable, class_, class_2);
        throw new RuntimeException(throwable);
    }

    @Override
    public void close() {
        Throwable throwable = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable)this.c.removeFirst();
            try {
                closeable.close();
            }
            catch (Throwable throwable2) {
                if (throwable == null) {
                    throwable = throwable2;
                    continue;
                }
                this.a.a(closeable, throwable, throwable2);
            }
        }
        if (this.d == null && throwable != null) {
            eg.b(throwable, IOException.class);
            throw new AssertionError((Object)throwable);
        }
    }
}

