/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.FinishableOutputStream
 *  org.tukaani.xz.FinishableWrapperOutputStream
 *  org.tukaani.xz.LZMA2InputStream
 *  org.tukaani.xz.LZMA2Options
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.tukaani.xz.FinishableOutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.LZMA2InputStream;
import org.tukaani.xz.LZMA2Options;

class s
extends g {
    s() {
        super(LZMA2Options.class, Number.class);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        try {
            int n2 = this.a(f2);
            return new LZMA2InputStream(inputStream, n2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(illegalArgumentException.getMessage());
        }
    }

    OutputStream a(OutputStream outputStream, Object object) {
        LZMA2Options lZMA2Options = this.d(object);
        FinishableWrapperOutputStream finishableWrapperOutputStream = new FinishableWrapperOutputStream(outputStream);
        return lZMA2Options.getOutputStream((FinishableOutputStream)finishableWrapperOutputStream);
    }

    byte[] b(Object object) {
        int n2 = this.c(object);
        int n3 = Integer.numberOfLeadingZeros(n2);
        int n4 = (n2 >>> 30 - n3) - 2;
        return new byte[]{(byte)((19 - n3) * 2 + n4)};
    }

    Object a(f f2, InputStream inputStream) {
        return this.a(f2);
    }

    private int c(Object object) {
        if (object instanceof LZMA2Options) {
            return ((LZMA2Options)object).getDictSize();
        }
        return this.e(object);
    }

    private int a(f f2) {
        int n2 = 0xFF & f2.d[0];
        if ((n2 & 0xFFFFFFC0) != 0) {
            throw new IllegalArgumentException("Unsupported LZMA2 property bits");
        }
        if (n2 > 40) {
            throw new IllegalArgumentException("Dictionary larger than 4GiB maximum size");
        }
        if (n2 == 40) {
            return -1;
        }
        return (2 | n2 & 1) << n2 / 2 + 11;
    }

    private LZMA2Options d(Object object) {
        if (object instanceof LZMA2Options) {
            return (LZMA2Options)object;
        }
        LZMA2Options lZMA2Options = new LZMA2Options();
        lZMA2Options.setDictSize(this.e(object));
        return lZMA2Options;
    }

    private int e(Object object) {
        return s.a(object, 0x800000);
    }
}

