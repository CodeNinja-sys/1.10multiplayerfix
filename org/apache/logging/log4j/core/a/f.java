/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import org.apache.logging.log4j.core.a.e;
import org.apache.logging.log4j.core.config.a;
import org.apache.logging.log4j.core.e.d;

class f
extends Thread {
    private volatile boolean b = false;
    private final List c;
    private final BlockingQueue d;
    final /* synthetic */ e a;

    public f(e e2, List list, BlockingQueue blockingQueue) {
        this.a = e2;
        this.c = list;
        this.d = blockingQueue;
        this.setDaemon(true);
        this.setName("AsyncAppenderThread" + e.h().getAndIncrement());
    }

    @Override
    public void run() {
        d d2;
        Serializable serializable;
        while (!this.b) {
            block13: {
                try {
                    serializable = (Serializable)this.d.take();
                    if (serializable != null && serializable instanceof String && "Shutdown".equals(serializable.toString())) {
                        this.b = true;
                    }
                    break block13;
                }
                catch (InterruptedException interruptedException) {}
                continue;
            }
            d2 = org.apache.logging.log4j.core.e.d.a(serializable);
            d2.b(this.d.isEmpty());
            boolean bl2 = false;
            for (a a2 : this.c) {
                try {
                    a2.a(d2);
                    bl2 = true;
                }
                catch (Exception exception) {}
            }
            if (bl2 || e.a(this.a) == null) continue;
            try {
                e.a(this.a).a(d2);
            }
            catch (Exception exception) {}
        }
        while (!this.d.isEmpty()) {
            try {
                serializable = (Serializable)this.d.take();
                if (!(serializable instanceof d)) continue;
                d2 = org.apache.logging.log4j.core.e.d.a(serializable);
                d2.b(this.d.isEmpty());
                for (Object object : this.c) {
                    ((a)object).a(d2);
                }
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }

    public void a() {
        this.b = true;
        if (this.d.isEmpty()) {
            this.d.offer("Shutdown");
        }
    }
}

