/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Serializable;
import java.util.Iterator;
import org.apache.commons.c.i;

final class g
implements Serializable,
Iterable {
    private static final long a = 8270183163158333422L;
    private final char b;
    private final char c;
    private final boolean d;
    private transient String e;

    private g(char c2, char c3, boolean bl2) {
        if (c2 > c3) {
            char c4 = c2;
            c2 = c3;
            c3 = c4;
        }
        this.b = c2;
        this.c = c3;
        this.d = bl2;
    }

    public static g a(char c2) {
        return new g(c2, c2, false);
    }

    public static g b(char c2) {
        return new g(c2, c2, true);
    }

    public static g a(char c2, char c3) {
        return new g(c2, c3, false);
    }

    public static g b(char c2, char c3) {
        return new g(c2, c3, true);
    }

    public char a() {
        return this.b;
    }

    public char b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean c(char c2) {
        return (c2 >= this.b && c2 <= this.c) != this.d;
    }

    public boolean a(g g2) {
        if (g2 == null) {
            throw new IllegalArgumentException("The Range must not be null");
        }
        if (this.d) {
            if (g2.d) {
                return this.b >= g2.b && this.c <= g2.c;
            }
            return g2.c < this.b || g2.b > this.c;
        }
        if (g2.d) {
            return this.b == '\u0000' && this.c == '\uffff';
        }
        return this.b <= g2.b && this.c >= g2.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        g g2 = (g)object;
        return this.b == g2.b && this.c == g2.c && this.d == g2.d;
    }

    public int hashCode() {
        return 83 + this.b + 7 * this.c + (this.d ? 1 : 0);
    }

    public String toString() {
        if (this.e == null) {
            StringBuilder stringBuilder = new StringBuilder(4);
            if (this.c()) {
                stringBuilder.append('^');
            }
            stringBuilder.append(this.b);
            if (this.b != this.c) {
                stringBuilder.append('-');
                stringBuilder.append(this.c);
            }
            this.e = stringBuilder.toString();
        }
        return this.e;
    }

    public Iterator iterator() {
        return new i(this, null);
    }

    static /* synthetic */ boolean b(g g2) {
        return g2.d;
    }

    static /* synthetic */ char c(g g2) {
        return g2.b;
    }

    static /* synthetic */ char d(g g2) {
        return g2.c;
    }
}

