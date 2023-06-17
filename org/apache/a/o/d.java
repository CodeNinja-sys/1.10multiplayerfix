/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.Serializable;
import org.apache.a.n.f;
import org.apache.a.o.a;
import org.apache.a.o.c;

public final class d
implements Serializable {
    private static final long a = -6208952725094867135L;
    private char[] b;
    private int c;

    public d(int n2) {
        org.apache.a.o.a.b(n2, "Buffer capacity");
        this.b = new char[n2];
    }

    private void e(int n2) {
        char[] arrc = new char[Math.max(this.b.length << 1, n2)];
        System.arraycopy(this.b, 0, arrc, 0, this.c);
        this.b = arrc;
    }

    public void a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return;
        }
        if (n2 < 0 || n2 > arrc.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + arrc.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.c + n3;
        if (n4 > this.b.length) {
            this.e(n4);
        }
        System.arraycopy(arrc, n2, this.b, this.c, n3);
        this.c = n4;
    }

    public void a(String string) {
        String string2 = string != null ? string : "null";
        int n2 = string2.length();
        int n3 = this.c + n2;
        if (n3 > this.b.length) {
            this.e(n3);
        }
        string2.getChars(0, n2, this.b, this.c);
        this.c = n3;
    }

    public void a(d d2, int n2, int n3) {
        if (d2 == null) {
            return;
        }
        this.a(d2.b, n2, n3);
    }

    public void a(d d2) {
        if (d2 == null) {
            return;
        }
        this.a(d2.b, 0, d2.c);
    }

    public void a(char c2) {
        int n2 = this.c + 1;
        if (n2 > this.b.length) {
            this.e(n2);
        }
        this.b[this.c] = c2;
        this.c = n2;
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            return;
        }
        if (n2 < 0 || n2 > arrby.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + arrby.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.c;
        int n5 = n4 + n3;
        if (n5 > this.b.length) {
            this.e(n5);
        }
        int n6 = n2;
        for (int i2 = n4; i2 < n5; ++i2) {
            this.b[i2] = (char)(arrby[n6] & 0xFF);
            ++n6;
        }
        this.c = n5;
    }

    public void a(c c2, int n2, int n3) {
        if (c2 == null) {
            return;
        }
        this.a(c2.e(), n2, n3);
    }

    public void a(Object object) {
        this.a(String.valueOf(object));
    }

    public void a() {
        this.c = 0;
    }

    public char[] b() {
        char[] arrc = new char[this.c];
        if (this.c > 0) {
            System.arraycopy(this.b, 0, arrc, 0, this.c);
        }
        return arrc;
    }

    public char a(int n2) {
        return this.b[n2];
    }

    public char[] c() {
        return this.b;
    }

    public int d() {
        return this.b.length;
    }

    public int e() {
        return this.c;
    }

    public void b(int n2) {
        if (n2 <= 0) {
            return;
        }
        int n3 = this.b.length - this.c;
        if (n2 > n3) {
            this.e(this.c + n2);
        }
    }

    public void c(int n2) {
        if (n2 < 0 || n2 > this.b.length) {
            throw new IndexOutOfBoundsException("len: " + n2 + " < 0 or > buffer len: " + this.b.length);
        }
        this.c = n2;
    }

    public boolean f() {
        return this.c == 0;
    }

    public boolean g() {
        return this.c == this.b.length;
    }

    public int a(int n2, int n3, int n4) {
        int n5;
        int n6 = n3;
        if (n6 < 0) {
            n6 = 0;
        }
        if ((n5 = n4) > this.c) {
            n5 = this.c;
        }
        if (n6 > n5) {
            return -1;
        }
        for (int i2 = n6; i2 < n5; ++i2) {
            if (this.b[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    public int d(int n2) {
        return this.a(n2, 0, this.c);
    }

    public String a(int n2, int n3) {
        return new String(this.b, n2, n3 - n2);
    }

    public String b(int n2, int n3) {
        int n4;
        int n5 = n3;
        if (n4 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: " + n4);
        }
        if (n5 > this.c) {
            throw new IndexOutOfBoundsException("endIndex: " + n5 + " > length: " + this.c);
        }
        if (n4 > n5) {
            throw new IndexOutOfBoundsException("beginIndex: " + n4 + " > endIndex: " + n5);
        }
        for (n4 = n2; n4 < n5 && f.a(this.b[n4]); ++n4) {
        }
        while (n5 > n4 && f.a(this.b[n5 - 1])) {
            --n5;
        }
        return new String(this.b, n4, n5 - n4);
    }

    public String toString() {
        return new String(this.b, 0, this.c);
    }
}

