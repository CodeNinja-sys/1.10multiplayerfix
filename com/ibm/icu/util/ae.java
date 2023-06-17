/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.db;
import com.ibm.icu.util.z;
import java.nio.CharBuffer;

public final class ae
extends cs {
    private final char[] d = new char[3];
    private char[] e;
    private int f;

    public ae a(CharSequence charSequence, int n2) {
        this.b(charSequence, n2);
        return this;
    }

    public z a(db db2) {
        return new z(this.b(db2), 0);
    }

    public CharSequence b(db db2) {
        this.d(db2);
        return CharBuffer.wrap(this.e, this.e.length - this.f, this.f);
    }

    private void d(db db2) {
        if (this.e == null) {
            this.e = new char[1024];
        }
        this.c(db2);
    }

    public ae a() {
        this.f();
        this.e = null;
        this.f = 0;
        return this;
    }

    protected boolean b() {
        return true;
    }

    protected int c() {
        return 5;
    }

    protected int d() {
        return 48;
    }

    protected int e() {
        return 16;
    }

    private void c(int n2) {
        if (n2 > this.e.length) {
            int n3 = this.e.length;
            while ((n3 *= 2) <= n2) {
            }
            char[] arrc = new char[n3];
            System.arraycopy(this.e, this.e.length - this.f, arrc, arrc.length - this.f, this.f);
            this.e = arrc;
        }
    }

    protected int a(int n2) {
        int n3 = this.f + 1;
        this.c(n3);
        this.f = n3;
        this.e[this.e.length - this.f] = (char)n2;
        return this.f;
    }

    protected int a(int n2, int n3) {
        int n4 = this.f + n3;
        this.c(n4);
        this.f = n4;
        int n5 = this.e.length - this.f;
        while (n3 > 0) {
            this.e[n5++] = this.b.charAt(n2++);
            --n3;
        }
        return this.f;
    }

    private int a(char[] arrc, int n2) {
        int n3 = this.f + n2;
        this.c(n3);
        this.f = n3;
        System.arraycopy(arrc, 0, this.e, this.e.length - this.f, n2);
        return this.f;
    }

    protected int a(int n2, boolean bl2) {
        int n3;
        if (0 <= n2 && n2 <= 16383) {
            return this.a(n2 | (bl2 ? 32768 : 0));
        }
        if (n2 < 0 || n2 > 0x3FFEFFFF) {
            this.d[0] = 32767;
            this.d[1] = (char)(n2 >> 16);
            this.d[2] = (char)n2;
            n3 = 3;
        } else {
            this.d[0] = (char)(16384 + (n2 >> 16));
            this.d[1] = (char)n2;
            n3 = 2;
        }
        this.d[0] = (char)(this.d[0] | (bl2 ? 32768 : 0));
        return this.a(this.d, n3);
    }

    protected int a(boolean bl2, int n2, int n3) {
        int n4;
        if (!bl2) {
            return this.a(n3);
        }
        if (n2 < 0 || n2 > 0xFDFFFF) {
            this.d[0] = 32704;
            this.d[1] = (char)(n2 >> 16);
            this.d[2] = (char)n2;
            n4 = 3;
        } else if (n2 <= 255) {
            this.d[0] = (char)(n2 + 1 << 6);
            n4 = 1;
        } else {
            this.d[0] = (char)(16448 + (n2 >> 10 & 0x7FC0));
            this.d[1] = (char)n2;
            n4 = 2;
        }
        this.d[0] = (char)(this.d[0] | (char)n3);
        return this.a(this.d, n4);
    }

    protected int b(int n2) {
        int n3;
        int n4 = this.f - n2;
        assert (n4 >= 0);
        if (n4 <= 64511) {
            return this.a(n4);
        }
        if (n4 <= 0x3FEFFFF) {
            this.d[0] = (char)(64512 + (n4 >> 16));
            n3 = 1;
        } else {
            this.d[0] = 65535;
            this.d[1] = (char)(n4 >> 16);
            n3 = 2;
        }
        this.d[n3++] = (char)n4;
        return this.a(this.d, n3);
    }
}

