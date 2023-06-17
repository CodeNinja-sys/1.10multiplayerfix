/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.util.concurrent.locks.LockSupport;
import org.apache.logging.log4j.core.d.c;

class d
extends Thread {
    final /* synthetic */ c a;

    d(c c2, String string) {
        this.a = c2;
        super(string);
    }

    @Override
    public void run() {
        while (true) {
            long l2 = System.currentTimeMillis();
            c.a(this.a, l2);
            LockSupport.parkNanos(1000000L);
        }
    }
}

