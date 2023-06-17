/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.b;

import io.netty.util.c.b.g;
import io.netty.util.c.b.j;
import io.netty.util.c.b.l;
import io.netty.util.c.b.o;

public abstract class h {
    private static volatile h a = h.c(h.class.getName());

    private static h c(String string) {
        h h2;
        try {
            h2 = new o(true);
            h2.a(string).b("Using SLF4J as the default logging framework");
        }
        catch (Throwable throwable) {
            try {
                h2 = new l();
                h2.a(string).b("Using Log4J as the default logging framework");
            }
            catch (Throwable throwable2) {
                h2 = new j();
                h2.a(string).b("Using java.util.logging as the default logging framework");
            }
        }
        return h2;
    }

    public static h a() {
        return a;
    }

    public static void a(h h2) {
        if (h2 == null) {
            throw new NullPointerException("defaultFactory");
        }
        a = h2;
    }

    public static g a(Class class_) {
        return h.b(class_.getName());
    }

    public static g b(String string) {
        return h.a().a(string);
    }

    protected abstract g a(String var1);
}

