/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.tukaani.xz.FilterOptions
 *  org.tukaani.xz.LZMA2Options
 *  org.tukaani.xz.XZOutputStream
 */
package org.apache.commons.compress.b.f;

import java.io.OutputStream;
import org.apache.commons.compress.b.c;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.XZOutputStream;

public class b
extends c {
    private final XZOutputStream a;

    public b(OutputStream outputStream) {
        this.a = new XZOutputStream(outputStream, (FilterOptions)new LZMA2Options());
    }

    public b(OutputStream outputStream, int n2) {
        this.a = new XZOutputStream(outputStream, (FilterOptions)new LZMA2Options(n2));
    }

    public void write(int n2) {
        this.a.write(n2);
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.a.write(arrby, n2, n3);
    }

    public void flush() {
        this.a.flush();
    }

    public void a() {
        this.a.finish();
    }

    public void close() {
        this.a.close();
    }
}

