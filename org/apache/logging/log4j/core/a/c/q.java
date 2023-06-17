/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import org.apache.logging.log4j.core.a.c.a.b;
import org.apache.logging.log4j.core.a.c.p;

public final class q
implements p {
    private final String a;
    private final boolean b;
    private final b c;
    private final b d;

    public q(String string, boolean bl2, b b2, b b3) {
        if (string == null) {
            throw new NullPointerException("activeFileName");
        }
        this.b = bl2;
        this.a = string;
        this.c = b2;
        this.d = b3;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return this.b;
    }

    @Override
    public b c() {
        return this.c;
    }

    @Override
    public b d() {
        return this.d;
    }
}

