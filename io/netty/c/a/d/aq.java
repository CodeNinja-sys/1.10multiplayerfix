/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ar;
import io.netty.util.e;

final class aq
implements CharSequence {
    private final String a;
    private final int b;
    private final byte[] c;
    private final int d;

    public aq(String string) {
        this(string, null);
    }

    public aq(String string, byte[] arrby) {
        this.a = string;
        this.b = ar.h(string);
        byte[] arrby2 = string.getBytes(e.f);
        if (arrby == null) {
            this.c = arrby2;
            this.d = 0;
        } else {
            this.d = arrby.length;
            this.c = new byte[arrby2.length + arrby.length];
            System.arraycopy(arrby2, 0, this.c, 0, arrby2.length);
            System.arraycopy(arrby, 0, this.c, arrby2.length, arrby.length);
        }
    }

    int a() {
        return this.b;
    }

    @Override
    public int length() {
        return this.c.length - this.d;
    }

    @Override
    public char charAt(int n2) {
        if (this.c.length - this.d <= n2) {
            throw new IndexOutOfBoundsException();
        }
        return (char)this.c[n2];
    }

    @Override
    public CharSequence subSequence(int n2, int n3) {
        return new aq(this.a.substring(n2, n3));
    }

    @Override
    public String toString() {
        return this.a;
    }

    boolean a(g g2) {
        g2.c(this.c);
        return this.d > 0;
    }
}

