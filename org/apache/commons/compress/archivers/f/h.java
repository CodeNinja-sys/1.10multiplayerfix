/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.apache.commons.compress.archivers.f.i;
import org.apache.commons.compress.archivers.f.w;

class h {
    private static final Map a = new i();

    h() {
    }

    static g a(w w2) {
        return (g)a.get((Object)w2);
    }

    static InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        g g2 = h.a(w.a(f2.a));
        if (g2 == null) {
            throw new IOException("Unsupported compression method " + Arrays.toString(f2.a));
        }
        return g2.a(inputStream, f2, arrby);
    }

    static OutputStream a(OutputStream outputStream, w w2, Object object) {
        g g2 = h.a(w2);
        if (g2 == null) {
            throw new IOException("Unsupported compression method " + (Object)((Object)w2));
        }
        return g2.a(outputStream, object);
    }
}

