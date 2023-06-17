/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.x;

final class k
extends ThreadLocal {
    k() {
    }

    protected x a() {
        return BufferUtils.h(4);
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

