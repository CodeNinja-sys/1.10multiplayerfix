/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import java.util.Arrays;

public final class a
implements Appendable,
CharSequence {
    private char[] a;
    private int b;

    public a(int n2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("length: " + n2 + " (length: >= 1)");
        }
        this.a = new char[n2];
    }

    private a(char[] arrc) {
        this.a = arrc;
        this.b = arrc.length;
    }

    @Override
    public int length() {
        return this.b;
    }

    @Override
    public char charAt(int n2) {
        if (n2 > this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[n2];
    }

    public a a(int n2, int n3) {
        return new a(Arrays.copyOfRange(this.a, n2, n3));
    }

    public a a(char c2) {
        if (this.b == this.a.length) {
            char[] arrc = this.a;
            int n2 = arrc.length << 1;
            if (n2 < 0) {
                throw new IllegalStateException();
            }
            this.a = new char[n2];
            System.arraycopy(arrc, 0, this.a, 0, arrc.length);
        }
        this.a[this.b++] = c2;
        return this;
    }

    public a a(CharSequence charSequence) {
        return this.a(charSequence, 0, charSequence.length());
    }

    public a a(CharSequence charSequence, int n2, int n3) {
        if (charSequence.length() < n3) {
            throw new IndexOutOfBoundsException();
        }
        int n4 = n3 - n2;
        if (n4 > this.a.length - this.b) {
            this.a = io.netty.util.c.a.a(this.a, this.b + n4, this.b);
        }
        if (charSequence instanceof a) {
            a a2 = (a)charSequence;
            char[] arrc = a2.a;
            System.arraycopy(arrc, n2, this.a, this.b, n4);
            this.b += n4;
            return this;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            this.a[this.b++] = charSequence.charAt(i2);
        }
        return this;
    }

    public void a() {
        this.b = 0;
    }

    @Override
    public String toString() {
        return new String(this.a, 0, this.b);
    }

    public String b(int n2, int n3) {
        int n4 = n3 - n2;
        if (n2 > this.b || n4 > this.b) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.a, n2, n4);
    }

    private static char[] a(char[] arrc, int n2, int n3) {
        int n4 = arrc.length;
        do {
            if ((n4 <<= 1) >= 0) continue;
            throw new IllegalStateException();
        } while (n2 > n4);
        char[] arrc2 = new char[n4];
        System.arraycopy(arrc, 0, arrc2, 0, n3);
        return arrc2;
    }

    @Override
    public /* synthetic */ CharSequence subSequence(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ Appendable append(char c2) {
        return this.a(c2);
    }

    @Override
    public /* synthetic */ Appendable append(CharSequence charSequence, int n2, int n3) {
        return this.a(charSequence, n2, n3);
    }

    @Override
    public /* synthetic */ Appendable append(CharSequence charSequence) {
        return this.a(charSequence);
    }
}

