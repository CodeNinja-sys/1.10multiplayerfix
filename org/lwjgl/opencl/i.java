/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

final class i
extends ThreadLocal {
    i() {
    }

    protected ByteBuffer a() {
        return BufferUtils.a(256);
    }

    protected /* synthetic */ Object initialValue() {
        return this.a();
    }
}

