/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.Reader;
import java.io.Serializable;

public class g
extends Reader
implements Serializable {
    private final CharSequence a;
    private int b;
    private int c;

    public g(CharSequence charSequence) {
        this.a = charSequence != null ? charSequence : "";
    }

    @Override
    public void close() {
        this.b = 0;
        this.c = 0;
    }

    @Override
    public void mark(int n2) {
        this.c = this.b;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public int read() {
        if (this.b >= this.a.length()) {
            return -1;
        }
        return this.a.charAt(this.b++);
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        if (this.b >= this.a.length()) {
            return -1;
        }
        if (arrc == null) {
            throw new NullPointerException("Character array is missing");
        }
        if (n3 < 0 || n2 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException("Array Size=" + arrc.length + ", offset=" + n2 + ", length=" + n3);
        }
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = this.read();
            if (n5 == -1) {
                return n4;
            }
            arrc[n2 + i2] = (char)n5;
            ++n4;
        }
        return n4;
    }

    @Override
    public void reset() {
        this.b = this.c;
    }

    @Override
    public long skip(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + l2);
        }
        if (this.b >= this.a.length()) {
            return -1L;
        }
        int n2 = (int)Math.min((long)this.a.length(), (long)this.b + l2);
        int n3 = n2 - this.b;
        this.b = n2;
        return n3;
    }

    public String toString() {
        return ((Object)this.a).toString();
    }
}

