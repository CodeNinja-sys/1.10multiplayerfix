/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.OutputStream;
import org.apache.commons.b.e.d;
import org.apache.commons.b.e.l;

public class c
extends l {
    public c(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void close() {
        this.out = new d();
    }
}

