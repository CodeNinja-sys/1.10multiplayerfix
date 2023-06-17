/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.FilterOptions
 *  org.tukaani.xz.FinishableOutputStream
 *  org.tukaani.xz.FinishableWrapperOutputStream
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.f.f;
import org.apache.commons.compress.archivers.f.g;
import org.apache.commons.compress.archivers.f.k;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.FinishableOutputStream;
import org.tukaani.xz.FinishableWrapperOutputStream;

class j
extends g {
    private final FilterOptions a;

    j(FilterOptions filterOptions) {
        super(new Class[0]);
        this.a = filterOptions;
    }

    InputStream a(InputStream inputStream, f f2, byte[] arrby) {
        try {
            return this.a.getInputStream(inputStream);
        }
        catch (AssertionError assertionError) {
            IOException iOException = new IOException("BCJ filter needs XZ for Java > 1.4 - see http://commons.apache.org/proper/commons-compress/limitations.html#7Z");
            iOException.initCause((Throwable)((Object)assertionError));
            throw iOException;
        }
    }

    OutputStream a(OutputStream outputStream, Object object) {
        FinishableOutputStream finishableOutputStream = this.a.getOutputStream((FinishableOutputStream)new FinishableWrapperOutputStream(outputStream));
        return new k(this, (OutputStream)finishableOutputStream);
    }
}

