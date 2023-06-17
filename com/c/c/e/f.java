/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f {
    private static final d a = c.c();
    private static final int b = 25;

    private static void b(int n2) {
        try {
            Thread.sleep(n2 * 1000);
        }
        catch (InterruptedException interruptedException) {
            a.b("", (Throwable)interruptedException);
        }
    }

    static /* synthetic */ void a(int n2) {
        f.b(n2);
    }

    static /* synthetic */ d a() {
        return a;
    }
}

