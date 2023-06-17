/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.InputStream;
import org.apache.commons.compress.archivers.f.b;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;

class a
extends g {
    a() {
        super(new Class[0]);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        return new b(this, f2, arrby, inputStream);
    }
}

