/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import org.apache.logging.log4j.core.b.d;
import org.apache.logging.log4j.core.b.g;
import org.apache.logging.log4j.core.h;

class i {
    private d a;
    private h b;

    private i() {
    }

    public void a() {
        this.a = null;
        this.b = null;
    }

    /* synthetic */ i(g g2) {
        this();
    }

    static /* synthetic */ h a(i i2, h h2) {
        i2.b = h2;
        return i2.b;
    }

    static /* synthetic */ d a(i i2, d d2) {
        i2.a = d2;
        return i2.a;
    }

    static /* synthetic */ h a(i i2) {
        return i2.b;
    }

    static /* synthetic */ d b(i i2) {
        return i2.a;
    }
}

