/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.apache.commons.compress.b.a.a;
import org.apache.commons.compress.b.a.c;

class l
extends g {
    l() {
        super(Number.class);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        return new a(inputStream);
    }

    OutputStream a(OutputStream outputStream, Object object) {
        int n2 = l.a(object, 9);
        return new c(outputStream, n2);
    }
}

