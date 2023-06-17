/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.o;
import org.lwjgl.util.d.b;
import org.lwjgl.x;

public final class d {
    private static final int a;

    private d() {
    }

    public static int a() {
        return a;
    }

    public static ByteBuffer a(int n2) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n2 + a);
        if (o.a(byteBuffer) % (long)a != 0L) {
            byteBuffer.position(a - (int)(o.a(byteBuffer) & (long)(a - 1)));
        }
        byteBuffer.limit(byteBuffer.position() + n2);
        return byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    public static ShortBuffer b(int n2) {
        return d.a(n2 << 1).asShortBuffer();
    }

    public static CharBuffer c(int n2) {
        return d.a(n2 << 1).asCharBuffer();
    }

    public static IntBuffer d(int n2) {
        return d.a(n2 << 2).asIntBuffer();
    }

    public static LongBuffer e(int n2) {
        return d.a(n2 << 3).asLongBuffer();
    }

    public static FloatBuffer f(int n2) {
        return d.a(n2 << 2).asFloatBuffer();
    }

    public static DoubleBuffer g(int n2) {
        return d.a(n2 << 3).asDoubleBuffer();
    }

    public static x h(int n2) {
        return new x(d.a(n2 * x.c()));
    }

    static {
        Integer n2 = org.lwjgl.d.c("org.lwjgl.util.mapped.CacheLineSize");
        if (n2 != null) {
            if (n2 < 1) {
                throw new IllegalStateException("Invalid CacheLineSize specified: " + n2);
            }
            a = n2;
        } else if (Runtime.getRuntime().availableProcessors() == 1) {
            if (org.lwjgl.d.i) {
                org.lwjgl.d.a((CharSequence)"Cannot detect cache line size on single-core CPUs, assuming 64 bytes.");
            }
            a = 64;
        } else {
            a = b.a();
        }
    }
}

