/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.aq;

abstract class at
extends aq {
    private int b;

    protected at(long l2) {
        super(l2);
        if (super.b()) {
            this.b = 1;
        }
    }

    public final int n() {
        return this.b;
    }

    @Override
    public final boolean b() {
        return this.b > 0;
    }

    int cP_() {
        this.c();
        return ++this.b;
    }

    int f() {
        this.c();
        return --this.b;
    }
}

