/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.lwjgl.o;
import org.lwjgl.util.d.c;
import org.lwjgl.util.d.d;
import org.lwjgl.util.d.h;
import org.lwjgl.util.d.t;

final class b {
    private b() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static int a() {
        int n2 = 2;
        int n3 = 200000;
        int n4 = 100000;
        int n5 = org.lwjgl.d.a("org.lwjgl.util.mapped.CacheLineMaxSize", 1024) / 4;
        double d2 = 1.0 + (double)org.lwjgl.d.a("org.lwjgl.util.mapped.CacheLineTimeThreshold", 50).intValue() / 100.0;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        try {
            int n6;
            IntBuffer intBuffer = b.a(n5);
            int n7 = 10;
            for (int i2 = 0; i2 < 10; ++i2) {
                b.a(2, 100000, 0, intBuffer, executorCompletionService);
            }
            long l2 = 0L;
            int n8 = 0;
            int n9 = 64;
            boolean bl2 = false;
            for (n6 = n5; n6 >= 1; n6 >>= 1) {
                long l3;
                long l4 = b.a(2, 100000, n6, intBuffer, executorCompletionService);
                if (l2 > 0L && (double)l4 / (double)(l3 = l2 / (long)n8) > d2) {
                    n9 = (n6 << 1) * 4;
                    bl2 = true;
                    break;
                }
                l2 += l4;
                ++n8;
            }
            if (org.lwjgl.d.i) {
                if (bl2) {
                    org.lwjgl.d.a((CharSequence)("Cache line size detected: " + n9 + " bytes"));
                } else {
                    org.lwjgl.d.a((CharSequence)("Failed to detect cache line size, assuming " + n9 + " bytes"));
                }
            }
            n6 = n9;
            return n6;
        }
        finally {
            executorService.shutdown();
        }
    }

    public static void a(String[] arrstring) {
        d.a();
    }

    static long a(int n2, int n3, IntBuffer intBuffer, int n4) {
        long l2 = o.a(intBuffer) + (long)(n2 * n4 * 4);
        long l3 = System.nanoTime();
        for (int i2 = 0; i2 < n3; ++i2) {
            h.b(h.h(l2) + 1, l2);
        }
        return System.nanoTime() - l3;
    }

    private static IntBuffer a(int n2) {
        int n3 = t.a.pageSize();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(n2 * 4 + n3).order(ByteOrder.nativeOrder());
        if (o.a(byteBuffer) % (long)n3 != 0L) {
            byteBuffer.position(n3 - (int)(o.a(byteBuffer) & (long)(n3 - 1)));
        }
        return byteBuffer.asIntBuffer();
    }

    private static long a(int n2, int n3, int n4, IntBuffer intBuffer, ExecutorCompletionService executorCompletionService) {
        for (int i2 = 0; i2 < n2; ++i2) {
            b.a(executorCompletionService, i2, n3, intBuffer, n4);
        }
        return b.a(n2, executorCompletionService);
    }

    private static void a(ExecutorCompletionService executorCompletionService, int n2, int n3, IntBuffer intBuffer, int n4) {
        executorCompletionService.submit(new c(n2, n3, intBuffer, n4));
    }

    private static long a(int n2, ExecutorCompletionService executorCompletionService) {
        try {
            long l2 = 0L;
            for (int i2 = 0; i2 < n2; ++i2) {
                l2 += ((Long)executorCompletionService.take().get()).longValue();
            }
            return l2;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

