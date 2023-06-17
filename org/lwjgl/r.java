/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.nio.Buffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.p;
import org.lwjgl.q;

class r
implements q {
    private r() {
    }

    @Override
    public long a(Buffer buffer) {
        return BufferUtils.getBufferAddress(buffer);
    }

    /* synthetic */ r(p p2) {
        this();
    }
}

