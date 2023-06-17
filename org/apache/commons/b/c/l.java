/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;

public class l
extends InputStream {
    private final InheritableThreadLocal a = new InheritableThreadLocal();

    public InputStream a(InputStream inputStream) {
        InputStream inputStream2 = (InputStream)this.a.get();
        this.a.set(inputStream);
        return inputStream2;
    }

    @Override
    public void close() {
        InputStream inputStream = (InputStream)this.a.get();
        if (null != inputStream) {
            inputStream.close();
        }
    }

    @Override
    public int read() {
        InputStream inputStream = (InputStream)this.a.get();
        if (null != inputStream) {
            return inputStream.read();
        }
        return -1;
    }
}

