/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import org.apache.commons.b.c.j;
import org.apache.commons.b.c.o;

public class i
extends o {
    public i(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() {
        this.in = new j();
    }
}

