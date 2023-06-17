/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import java.io.File;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.a;

public abstract class d
extends OutputStream {
    private final byte[] b = new byte[1];
    static final int a = 255;
    private long c = 0L;

    public abstract void a(a var1);

    public abstract void a();

    public abstract void b();

    public abstract a a(File var1, String var2);

    public void write(int n2) {
        this.b[0] = (byte)(n2 & 0xFF);
        this.write(this.b, 0, 1);
    }

    protected void a(int n2) {
        this.a((long)n2);
    }

    protected void a(long l2) {
        if (l2 != -1L) {
            this.c += l2;
        }
    }

    public int c() {
        return (int)this.c;
    }

    public long d() {
        return this.c;
    }

    public boolean b(a a2) {
        return true;
    }
}

