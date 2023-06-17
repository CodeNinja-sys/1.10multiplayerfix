/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;

public abstract class ad
extends aa {
    private final boolean b;

    protected ad() {
        super(CallbackUtil.getContextCallback());
        this.b = false;
    }

    protected ad(long l2) {
        super(l2);
        if (l2 == 0L) {
            throw new RuntimeException("Invalid callback function pointer specified.");
        }
        this.b = true;
    }

    final boolean d() {
        return this.b;
    }

    protected abstract void a(String var1, ByteBuffer var2);
}

