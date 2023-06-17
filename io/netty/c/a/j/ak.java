/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.c.a.j.ag;
import io.netty.c.a.j.ai;
import io.netty.c.a.j.al;

public abstract class ak
extends ag {
    private final al a;

    protected ak(al al2) {
        super(ai.a);
        if (al2 == null) {
            throw new NullPointerException("requestType");
        }
        this.a = al2;
    }

    public al g() {
        return this.a;
    }
}

