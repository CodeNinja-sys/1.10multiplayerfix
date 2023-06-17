/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.apache.commons.compress.b.d.b;

class c
extends FilterInputStream {
    final /* synthetic */ b a;

    c(b b2, InputStream inputStream) {
        this.a = b2;
        super(inputStream);
    }

    public void close() {
    }
}

