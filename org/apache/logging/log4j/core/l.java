/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core;

import org.apache.logging.log4j.core.k;

class l
extends Thread {
    private final k b;
    final /* synthetic */ k a;

    public l(k k2, k k3) {
        this.a = k2;
        this.b = k3;
    }

    @Override
    public void run() {
        k.a(this.b, null);
        this.b.f();
    }
}

