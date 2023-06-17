/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.aa;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ay;

abstract class ba
extends aa {
    private ab b;

    protected ba() {
        super(CallbackUtil.getProgramCallback());
    }

    final void a(ab ab2) {
        this.b = ab2;
    }

    private void a(long l2) {
        this.a(this.b.d(l2));
    }

    protected abstract void a(ay var1);
}

