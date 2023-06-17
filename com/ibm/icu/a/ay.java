/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ax;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

class ay
extends Thread {
    private final ax a;
    private final List b = new ArrayList();

    ay(ax ax2) {
        this.a = ax2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(EventListener[] arreventListener) {
        ay ay2 = this;
        synchronized (ay2) {
            this.b.add(arreventListener);
            this.notify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (true) {
            try {
                block6: while (true) {
                    EventListener[] arreventListener;
                    ay ay2 = this;
                    synchronized (ay2) {
                        while (this.b.isEmpty()) {
                            this.wait();
                        }
                        arreventListener = (EventListener[])this.b.remove(0);
                    }
                    int n2 = 0;
                    while (true) {
                        if (n2 >= arreventListener.length) continue block6;
                        this.a.d(arreventListener[n2]);
                        ++n2;
                    }
                    break;
                }
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }
}

