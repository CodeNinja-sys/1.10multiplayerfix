/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.f.i;

class o
extends FilterInputStream {
    private boolean a = true;

    private o(InputStream inputStream) {
        super(inputStream);
    }

    public int read() {
        int n2 = super.read();
        if (n2 == -1 && this.a) {
            this.a = false;
            n2 = 0;
        }
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = super.read(arrby, n2, n3);
        if (n4 == -1 && this.a) {
            this.a = false;
            arrby[n2] = 0;
            return 1;
        }
        return n4;
    }

    /* synthetic */ o(InputStream inputStream, i i2) {
        this(inputStream);
    }
}

