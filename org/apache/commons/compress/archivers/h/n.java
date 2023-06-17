/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

final class n
implements Comparable {
    public final char a;
    public final byte b;

    n(byte by2, char c2) {
        this.b = by2;
        this.a = c2;
    }

    public int a(n n2) {
        return this.a - n2.a;
    }

    public String toString() {
        return "0x" + Integer.toHexString(0xFFFF & this.a) + "->0x" + Integer.toHexString(0xFF & this.b);
    }

    public boolean equals(Object object) {
        if (object instanceof n) {
            n n2 = (n)object;
            return this.a == n2.a && this.b == n2.b;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((n)object);
    }
}

