/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.BufferUtils;
import org.lwjgl.x;

final class j
extends ThreadLocal {
    j() {
    }

    protected x a() {
        return BufferUtils.h(256);
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

