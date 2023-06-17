/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  sun.misc.Cleaner
 */
package io.netty.util.c;

import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.v;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import sun.misc.Cleaner;

final class b {
    private static final long a;
    private static final g b;

    static void a(ByteBuffer byteBuffer) {
        if (a == -1L || !byteBuffer.isDirect()) {
            return;
        }
        try {
            Cleaner cleaner = (Cleaner)v.a(byteBuffer, a);
            if (cleaner != null) {
                cleaner.clean();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private b() {
    }

    static {
        b = h.a(b.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1);
        long l2 = -1L;
        if (v.a()) {
            try {
                Field field = byteBuffer.getClass().getDeclaredField("cleaner");
                field.setAccessible(true);
                Cleaner cleaner = (Cleaner)field.get(byteBuffer);
                cleaner.clean();
                l2 = v.a(field);
            }
            catch (Throwable throwable) {
                l2 = -1L;
            }
        }
        b.b("java.nio.ByteBuffer.cleaner(): {}", (Object)(l2 != -1L ? "available" : "unavailable"));
        a = l2;
        io.netty.util.c.b.a(byteBuffer);
    }
}

