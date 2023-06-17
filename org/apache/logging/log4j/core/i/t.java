/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

public final class t {
    private static final char[] a = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private static final t b = new t(false, 0, Integer.MAX_VALUE);
    private final int c;
    private final int d;
    private final boolean e;

    public t(boolean bl2, int n2, int n3) {
        this.e = bl2;
        this.c = n2;
        this.d = n3;
    }

    public static t a() {
        return b;
    }

    public boolean b() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void a(int n2, StringBuilder stringBuilder) {
        int n3 = stringBuilder.length() - n2;
        if (n3 > this.d) {
            stringBuilder.delete(n2, stringBuilder.length() - this.d);
        } else if (n3 < this.c) {
            if (this.e) {
                int n4 = stringBuilder.length();
                stringBuilder.setLength(n2 + this.c);
                for (int i2 = n4; i2 < stringBuilder.length(); ++i2) {
                    stringBuilder.setCharAt(i2, ' ');
                }
            } else {
                int n5;
                for (n5 = this.c - n3; n5 > a.length; n5 -= a.length) {
                    stringBuilder.insert(n2, a);
                }
                stringBuilder.insert(n2, a, 0, n5);
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[leftAlign=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(this.d);
        stringBuilder.append(", minLength=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

