/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.aa;
import java.io.ByteArrayOutputStream;

final class ag
extends ByteArrayOutputStream {
    private ag() {
    }

    void a(byte[] arrby, int n2) {
        System.arraycopy(this.buf, 0, arrby, n2, this.count);
    }

    /* synthetic */ ag(aa aa2) {
        this();
    }
}

