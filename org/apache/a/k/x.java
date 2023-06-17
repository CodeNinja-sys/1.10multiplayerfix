/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

public class x {
    private final int a;
    private final int b;
    private int c;

    public x(int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.a = n2;
        this.b = n3;
        this.c = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public void a(int n2) {
        if (n2 < this.a) {
            throw new IndexOutOfBoundsException("pos: " + n2 + " < lowerBound: " + this.a);
        }
        if (n2 > this.b) {
            throw new IndexOutOfBoundsException("pos: " + n2 + " > upperBound: " + this.b);
        }
        this.c = n2;
    }

    public boolean d() {
        return this.c >= this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(Integer.toString(this.a));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.c));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.b));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

