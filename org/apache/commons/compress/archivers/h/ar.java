/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.archivers.h.aq;

class ar
extends InflaterInputStream {
    final /* synthetic */ Inflater a;
    final /* synthetic */ aq b;

    ar(aq aq2, InputStream inputStream, Inflater inflater, Inflater inflater2) {
        this.b = aq2;
        this.a = inflater2;
        super(inputStream, inflater);
    }

    public void close() {
        super.close();
        this.a.end();
    }
}

