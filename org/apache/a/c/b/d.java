/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

class d
extends InflaterInputStream {
    private boolean a = false;

    public d(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    public void close() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.inf.end();
        super.close();
    }
}

