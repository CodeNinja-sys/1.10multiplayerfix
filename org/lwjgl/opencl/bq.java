/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.ah;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

final class bq
extends bk
implements ah {
    private bq() {
    }

    protected int a(ag ag2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(ag2, n2, byteBuffer, x2);
    }

    public long a(ag ag2, int n2) {
        ag2.c();
        ByteBuffer byteBuffer = d.a(8);
        CL10.b(ag2, n2, byteBuffer, null);
        return byteBuffer.getLong(0);
    }

    /* synthetic */ bq(bm bm2) {
        this();
    }
}

