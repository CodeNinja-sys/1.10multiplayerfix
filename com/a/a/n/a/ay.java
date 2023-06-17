/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.n.a.az;
import com.a.a.n.a.ba;
import com.a.a.n.a.bb;
import java.util.concurrent.Callable;

public final class ay {
    private ay() {
    }

    public static Callable a(Object object) {
        return new az(object);
    }

    static Callable a(Callable callable, dx dx2) {
        cl.a(dx2);
        cl.a(callable);
        return new ba(dx2, callable);
    }

    static Runnable a(Runnable runnable, dx dx2) {
        cl.a(dx2);
        cl.a(runnable);
        return new bb(dx2, runnable);
    }

    private static boolean b(String string, Thread thread) {
        try {
            thread.setName(string);
            return true;
        }
        catch (SecurityException securityException) {
            return false;
        }
    }

    static /* synthetic */ boolean a(String string, Thread thread) {
        return ay.b(string, thread);
    }
}

