/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import org.apache.commons.b.c.o;

public class k
extends o {
    private long a;

    public k(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public synchronized long skip(long l2) {
        long l3 = super.skip(l2);
        this.a += l3;
        return l3;
    }

    @Override
    protected synchronized void a(int n2) {
        if (n2 != -1) {
            this.a += (long)n2;
        }
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

