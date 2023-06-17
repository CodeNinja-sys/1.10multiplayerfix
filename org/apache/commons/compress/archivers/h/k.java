/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ba;

public final class k
implements ap {
    private static final ba a = new ba(51966);
    private static final ba b = new ba(0);
    private static final byte[] c = new byte[0];
    private static final k d = new k();

    public static k b() {
        return d;
    }

    public ba cI_() {
        return a;
    }

    public ba f() {
        return b;
    }

    public ba d() {
        return b;
    }

    public byte[] e() {
        return c;
    }

    public byte[] c() {
        return c;
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (n3 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.a(arrby, n2, n3);
    }
}

