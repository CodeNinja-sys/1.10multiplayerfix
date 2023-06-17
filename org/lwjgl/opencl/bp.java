/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.d;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.x;

final class bp
extends bk {
    private bp() {
    }

    protected int a(ae ae2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(ae2, n2, byteBuffer, x2);
    }

    protected int a(ae ae2, int n2) {
        switch (n2) {
            case 4101: {
                return this.a((aq)ae2, 4099);
            }
        }
        throw new IllegalArgumentException("Unsupported parameter: " + d.a(n2));
    }

    protected /* synthetic */ int f(aq aq2, int n2) {
        return this.a((ae)aq2, n2);
    }

    /* synthetic */ bp(bm bm2) {
        this();
    }
}

