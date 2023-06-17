/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.util.concurrent.locks.LockSupport;
import org.apache.logging.log4j.core.d.i;

class j
extends Thread {
    final /* synthetic */ i a;

    j(i i2, String string) {
        this.a = i2;
        super(string);
    }

    @Override
    public void run() {
        while (true) {
            long l2 = System.currentTimeMillis();
            i.a(this.a, l2);
            LockSupport.parkNanos(1000000L);
        }
    }
}

