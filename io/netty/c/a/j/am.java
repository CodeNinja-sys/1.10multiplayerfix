/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.c.a.j.ag;
import io.netty.c.a.j.ai;
import io.netty.c.a.j.an;

public abstract class am
extends ag {
    private final an a;

    protected am(an an2) {
        super(ai.b);
        if (an2 == null) {
            throw new NullPointerException("responseType");
        }
        this.a = an2;
    }

    public an g() {
        return this.a;
    }
}

