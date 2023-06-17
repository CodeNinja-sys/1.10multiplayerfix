/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b;

import java.io.InputStream;

public abstract class b
extends InputStream {
    private long a = 0L;

    protected void a(int n2) {
        this.a((long)n2);
    }

    protected void a(long l2) {
        if (l2 != -1L) {
            this.a += l2;
        }
    }

    protected void b(long l2) {
        this.a -= l2;
    }

    public int b() {
        return (int)this.a;
    }

    public long c() {
        return this.a;
    }
}

