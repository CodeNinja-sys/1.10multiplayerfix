/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

final class fq
implements Appendable {
    private final char[] a;
    private final int b;
    private final int c;
    private int d;

    public fq(char[] arrc, int n2, int n3) {
        this.a = arrc;
        this.b = this.d = n2;
        this.c = n3;
    }

    public int a() {
        int n2 = this.d - this.b;
        if (this.d <= this.c) {
            return n2;
        }
        throw new IndexOutOfBoundsException(Integer.toString(n2));
    }

    public Appendable append(char c2) {
        if (this.d < this.c) {
            this.a[this.d] = c2;
        }
        ++this.d;
        return this;
    }

    public Appendable append(CharSequence charSequence) {
        return this.append(charSequence, 0, charSequence.length());
    }

    public Appendable append(CharSequence charSequence, int n2, int n3) {
        int n4 = n3 - n2;
        if (n4 <= this.c - this.d) {
            while (n2 < n3) {
                this.a[this.d++] = charSequence.charAt(n2++);
            }
        } else {
            this.d += n4;
        }
        return this;
    }
}

