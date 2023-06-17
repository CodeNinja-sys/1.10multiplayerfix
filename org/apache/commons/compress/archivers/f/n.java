/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.apache.commons.compress.archivers.f.o;

class n
extends g {
    n() {
        super(Number.class);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        return new InflaterInputStream(new o(inputStream, null), new Inflater(true));
    }

    OutputStream a(OutputStream outputStream, Object object) {
        int n2 = n.a(object, 9);
        return new DeflaterOutputStream(outputStream, new Deflater(n2, true));
    }
}

