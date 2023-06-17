/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.OutputStream;
import org.apache.commons.b.e.l;

public class p
extends l {
    protected OutputStream a;

    public p(OutputStream outputStream, OutputStream outputStream2) {
        super(outputStream);
        this.a = outputStream2;
    }

    @Override
    public synchronized void write(byte[] arrby) {
        super.write(arrby);
        this.a.write(arrby);
    }

    @Override
    public synchronized void write(byte[] arrby, int n2, int n3) {
        super.write(arrby, n2, n3);
        this.a.write(arrby, n2, n3);
    }

    @Override
    public synchronized void write(int n2) {
        super.write(n2);
        this.a.write(n2);
    }

    @Override
    public void flush() {
        super.flush();
        this.a.flush();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        try {
            super.close();
        }
        finally {
            this.a.close();
        }
    }
}

