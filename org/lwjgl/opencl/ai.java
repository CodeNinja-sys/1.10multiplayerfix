/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.as;

public abstract class ai
extends aa {
    private as b;

    protected ai() {
        super(CallbackUtil.getEventCallback());
    }

    void a(as as2) {
        this.b = as2;
    }

    private void a(long l2, int n2) {
        this.a((ag)this.b.a(l2), n2);
    }

    protected abstract void a(ag var1, int var2);
}

