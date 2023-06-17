/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.OutputStream;
import org.apache.commons.b.e.l;

public class e
extends l {
    private long a = 0L;

    public e(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    protected synchronized void b(int n2) {
        this.a += (long)n2;
    }

    public int a() {
        long l2 = this.c();
        if (l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("The byte count " + l2 + " is too large to be converted to an int");
        }
        return (int)l2;
    }

    public int b() {
        long l2 = this.d();
        if (l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("The byte count " + l2 + " is too large to be converted to an int");
        }
        return (int)l2;
    }

    public synchronized long c() {
        return this.a;
    }

    public synchronized long d() {
        long l2 = this.a;
        this.a = 0L;
        return l2;
    }
}

