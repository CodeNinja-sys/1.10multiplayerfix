/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.OutputStream;

public class g
extends OutputStream {
    private final InheritableThreadLocal a = new InheritableThreadLocal();

    public OutputStream a(OutputStream outputStream) {
        OutputStream outputStream2 = (OutputStream)this.a.get();
        this.a.set(outputStream);
        return outputStream2;
    }

    @Override
    public void close() {
        OutputStream outputStream = (OutputStream)this.a.get();
        if (null != outputStream) {
            outputStream.close();
        }
    }

    @Override
    public void flush() {
        OutputStream outputStream = (OutputStream)this.a.get();
        if (null != outputStream) {
            outputStream.flush();
        }
    }

    @Override
    public void write(int n2) {
        OutputStream outputStream = (OutputStream)this.a.get();
        if (null != outputStream) {
            outputStream.write(n2);
        }
    }
}

