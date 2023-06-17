/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.j;

class k
extends FilterOutputStream {
    final /* synthetic */ j a;

    k(j j2, OutputStream outputStream) {
        this.a = j2;
        super(outputStream);
    }

    public void flush() {
    }
}

