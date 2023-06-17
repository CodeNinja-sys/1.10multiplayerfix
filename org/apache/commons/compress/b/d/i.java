/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

abstract class i
extends FilterOutputStream {
    private InputStream a;
    private final Object b = new Object();

    protected i(OutputStream outputStream) {
        super(outputStream);
    }

    protected i() {
        this(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    InputStream b() {
        Object object = this.b;
        synchronized (object) {
            if (this.a == null) {
                this.a = this.a();
            }
        }
        return this.a;
    }

    abstract InputStream a();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void c() {
        this.close();
        Object object = this.b;
        synchronized (object) {
            if (this.a != null) {
                this.a.close();
                this.a = null;
            }
        }
    }
}

