/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import org.apache.logging.log4j.core.a.c.a.a;
import org.apache.logging.log4j.core.a.c.a.b;
import org.apache.logging.log4j.core.a.c.f;

class h
extends a {
    private final b b;
    private final f c;

    public h(b b2, f f2) {
        this.b = b2;
        this.c = f2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a() {
        try {
            boolean bl2 = this.b.a();
            return bl2;
        }
        finally {
            f.a(this.c).release();
        }
    }

    @Override
    public void b() {
        this.b.b();
    }

    @Override
    public boolean c() {
        return this.b.c();
    }
}

