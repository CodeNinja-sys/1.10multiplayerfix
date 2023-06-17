/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.y;
import org.apache.commons.compress.archivers.f.z;

class aa
extends OutputStream {
    final /* synthetic */ y a;

    private aa(y y2) {
        this.a = y2;
    }

    public void write(int n2) {
        y.b(this.a).write(n2);
        y.c(this.a).update(n2);
        y.d(this.a);
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        y.b(this.a).write(arrby, n2, n3);
        y.c(this.a).update(arrby, n2, n3);
        y.a(this.a, n3);
    }

    public void flush() {
    }

    public void close() {
    }

    /* synthetic */ aa(y y2, z z2) {
        this(y2);
    }
}

