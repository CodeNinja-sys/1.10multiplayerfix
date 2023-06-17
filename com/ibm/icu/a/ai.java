/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

class ai
extends DataInputStream {
    public ai(InputStream inputStream, int n2) {
        super(inputStream);
        this.mark(n2);
    }

    public ai(byte[] arrby) {
        this(new ByteArrayInputStream(arrby), arrby.length);
    }

    public void a(int n2) {
        this.reset();
        int n3 = this.skipBytes(n2);
        if (n3 != n2) {
            throw new IllegalStateException("Skip(" + n2 + ") only skipped " + n3 + " bytes");
        }
    }
}

