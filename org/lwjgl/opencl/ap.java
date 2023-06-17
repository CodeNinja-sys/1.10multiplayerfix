/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;

public abstract class ap
extends aa {
    protected ap() {
        super(CallbackUtil.getNativeKernelCallback());
    }

    protected abstract void a(ByteBuffer[] var1);
}

