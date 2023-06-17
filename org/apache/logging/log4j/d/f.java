/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.d;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.d.d;

class f
extends ConcurrentLinkedQueue {
    private static final long b = -3945953719763255337L;
    private final int c;
    final /* synthetic */ d a;

    public f(d d2, int n2) {
        this.a = d2;
        this.c = n2;
    }

    @Override
    public boolean add(Object object) {
        while (d.a(this.a).size() > this.c) {
            d.a(this.a).poll();
        }
        return super.add(object);
    }
}

