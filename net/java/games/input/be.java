/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.ArrayList;
import java.util.List;
import net.java.games.input.bd;

final class be
extends Thread {
    private final List a = new ArrayList();

    public be() {
        this.setDaemon(true);
        this.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void run() {
        while (true) {
            if (!this.a.isEmpty()) {
                bd bd2 = (bd)this.a.remove(0);
                bd2.a();
                bd bd3 = bd2;
                synchronized (bd3) {
                    bd2.notify();
                }
            }
            try {
                this.wait();
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object a(bd bd2) {
        Object object = this;
        synchronized (object) {
            this.a.add(bd2);
            this.notify();
        }
        object = bd2;
        synchronized (object) {
            while (bd2.d() == 1) {
                try {
                    bd2.wait();
                }
                catch (InterruptedException interruptedException) {}
            }
        }
        switch (bd2.d()) {
            case 2: {
                return bd2.c();
            }
            case 3: {
                throw bd2.b();
            }
        }
        throw new RuntimeException("Invalid task state: " + bd2.d());
    }
}

