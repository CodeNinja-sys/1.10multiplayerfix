/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import org.apache.logging.log4j.core.g.h;
import org.apache.logging.log4j.core.g.i;
import org.apache.logging.log4j.core.g.m;

class j
implements m {
    final /* synthetic */ h a;

    private j(h h2) {
        this.a = h2;
    }

    @Override
    public boolean a(String string) {
        return !h.b(this.a).contains(string);
    }

    /* synthetic */ j(h h2, i i2) {
        this(h2);
    }
}

