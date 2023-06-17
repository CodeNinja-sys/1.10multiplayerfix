/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ay;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;

public abstract class ax {
    private final Object a = new Object();
    private ay b;
    private List c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(EventListener eventListener) {
        if (eventListener == null) {
            throw new NullPointerException();
        }
        if (this.c(eventListener)) {
            Object object = this.a;
            synchronized (object) {
                if (this.c == null) {
                    this.c = new ArrayList();
                } else {
                    for (EventListener eventListener2 : this.c) {
                        if (eventListener2 != eventListener) continue;
                        return;
                    }
                }
                this.c.add(eventListener);
            }
        } else {
            throw new IllegalStateException("Listener invalid for this notifier.");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(EventListener eventListener) {
        if (eventListener == null) {
            throw new NullPointerException();
        }
        Object object = this.a;
        synchronized (object) {
            if (this.c != null) {
                Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() != eventListener) continue;
                    iterator.remove();
                    if (this.c.size() == 0) {
                        this.c = null;
                    }
                    return;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        if (this.c != null) {
            Object object = this.a;
            synchronized (object) {
                if (this.c != null) {
                    if (this.b == null) {
                        this.b = new ay(this);
                        this.b.setDaemon(true);
                        this.b.start();
                    }
                    this.b.a(this.c.toArray(new EventListener[this.c.size()]));
                }
            }
        }
    }

    protected abstract boolean c(EventListener var1);

    protected abstract void d(EventListener var1);
}

