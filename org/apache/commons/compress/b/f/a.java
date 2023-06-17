/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.SingleXZInputStream
 *  org.tukaani.xz.XZ
 *  org.tukaani.xz.XZInputStream
 */
package org.apache.commons.compress.b.f;

import java.io.InputStream;
import org.apache.commons.compress.b.b;
import org.tukaani.xz.SingleXZInputStream;
import org.tukaani.xz.XZ;
import org.tukaani.xz.XZInputStream;

public class a
extends b {
    private final InputStream a;

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < XZ.HEADER_MAGIC.length) {
            return false;
        }
        for (int i2 = 0; i2 < XZ.HEADER_MAGIC.length; ++i2) {
            if (arrby[i2] == XZ.HEADER_MAGIC[i2]) continue;
            return false;
        }
        return true;
    }

    public a(InputStream inputStream) {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl2) {
        this.a = bl2 ? new XZInputStream(inputStream) : new SingleXZInputStream(inputStream);
    }

    public int read() {
        int n2 = this.a.read();
        this.a(n2 == -1 ? -1 : 1);
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.a.read(arrby, n2, n3);
        this.a(n4);
        return n4;
    }

    public long skip(long l2) {
        return this.a.skip(l2);
    }

    public int available() {
        return this.a.available();
    }

    public void close() {
        this.a.close();
    }
}

