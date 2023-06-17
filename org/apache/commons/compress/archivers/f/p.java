/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.LZMAInputStream
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.tukaani.xz.LZMAInputStream;

class p
extends g {
    p() {
        super(new Class[0]);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        byte by2 = f2.d[0];
        long l2 = f2.d[1];
        for (int i2 = 1; i2 < 4; ++i2) {
            l2 |= ((long)f2.d[i2 + 1] & 0xFFL) << 8 * i2;
        }
        if (l2 > 0x7FFFFFF0L) {
            throw new IOException("Dictionary larger than 4GiB maximum size");
        }
        return new LZMAInputStream(inputStream, -1L, by2, (int)l2);
    }
}

