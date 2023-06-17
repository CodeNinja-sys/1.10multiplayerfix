/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.tomcat.jni.Library
 *  org.apache.tomcat.jni.SSL
 */
package io.netty.c.c;

import io.netty.c.c.j;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.p;
import org.apache.tomcat.jni.Library;
import org.apache.tomcat.jni.SSL;

public final class i {
    private static final g b = h.a(i.class);
    private static final Throwable c;
    static final String a = "error:00000000:";

    public static boolean a() {
        return c == null;
    }

    public static void b() {
        if (c != null) {
            throw (Error)new UnsatisfiedLinkError("failed to load the required native library").initCause(c);
        }
    }

    public static Throwable c() {
        return c;
    }

    private i() {
    }

    static {
        Throwable throwable = null;
        try {
            p.a("netty-tcnative", SSL.class.getClassLoader());
            Library.initialize((String)"provided");
            SSL.initialize(null);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            b.b("Failed to load netty-tcnative; " + j.class.getSimpleName() + " will be unavailable.", throwable2);
        }
        c = throwable;
    }
}

