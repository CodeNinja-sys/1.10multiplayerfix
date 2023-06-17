/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.ab;
import org.lwjgl.opengl.iw;
import org.lwjgl.opengl.ix;

class iv {
    private static final long a = 1000000000L;
    private static long b = 0L;
    private static boolean c = false;
    private static ix d = new ix(10);
    private static ix e = new ix(10);

    iv() {
    }

    public static void a(int n2) {
        if (n2 <= 0) {
            return;
        }
        if (!c) {
            iv.a();
        }
        try {
            long l2;
            long l3 = iv.b();
            while (b - l3 > d.a()) {
                Thread.sleep(1L);
                l2 = iv.b();
                d.b(l2 - l3);
                l3 = l2;
            }
            d.b();
            l3 = iv.b();
            while (b - l3 > e.a()) {
                Thread.yield();
                l2 = iv.b();
                e.b(l2 - l3);
                l3 = l2;
            }
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        b = Math.max(b + 1000000000L / (long)n2, iv.b());
    }

    private static void a() {
        c = true;
        d.a(1000000L);
        e.a((int)((double)(-(iv.b() - iv.b())) * 1.333));
        b = iv.b();
        String string = System.getProperty("os.name");
        if (string.startsWith("Win")) {
            Thread thread = new Thread(new iw());
            thread.setName("LWJGL Timer");
            thread.setDaemon(true);
            thread.start();
        }
    }

    private static long b() {
        return ab.e() * 1000000000L / ab.d();
    }
}

