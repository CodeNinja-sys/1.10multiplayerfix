/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.DeltaOptions
 *  org.tukaani.xz.FinishableOutputStream
 *  org.tukaani.xz.FinishableWrapperOutputStream
 *  org.tukaani.xz.UnsupportedOptionsException
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.tukaani.xz.DeltaOptions;
import org.tukaani.xz.FinishableOutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;
import org.tukaani.xz.UnsupportedOptionsException;

class q
extends g {
    q() {
        super(Number.class);
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        return new DeltaOptions(this.a(f2)).getInputStream(inputStream);
    }

    OutputStream a(OutputStream outputStream, Object object) {
        int n2 = q.a(object, 1);
        try {
            return new DeltaOptions(n2).getOutputStream((FinishableOutputStream)new FinishableWrapperOutputStream(outputStream));
        }
        catch (UnsupportedOptionsException unsupportedOptionsException) {
            throw new IOException(unsupportedOptionsException.getMessage());
        }
    }

    byte[] b(Object object) {
        return new byte[]{(byte)(q.a(object, 1) - 1)};
    }

    Object a(f f2, InputStream inputStream) {
        return this.a(f2);
    }

    private int a(f f2) {
        if (f2.d == null || f2.d.length == 0) {
            return 1;
        }
        return (0xFF & f2.d[0]) + 1;
    }
}

