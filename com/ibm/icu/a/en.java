/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.is;
import com.ibm.icu.d.ku;
import com.ibm.icu.d.kx;

public class en
extends ku {
    private iq b;
    private int c;

    public en(iq iq2) {
        if (iq2 == null) {
            throw new IllegalArgumentException();
        }
        this.b = iq2;
        this.c = 0;
    }

    public en(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        this.b = new is(string);
        this.c = 0;
    }

    public en(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            throw new IllegalArgumentException();
        }
        this.b = new is(stringBuffer);
        this.c = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public int a() {
        if (this.c < this.b.a()) {
            return this.b.a(this.c);
        }
        return -1;
    }

    public int h() {
        int n2 = this.a();
        if (kx.c((char)n2)) {
            this.d();
            int n3 = this.a();
            this.e();
            if (kx.b((char)n3)) {
                return hk.a((char)n2, (char)n3);
            }
        }
        return n2;
    }

    public int b() {
        return this.b.a();
    }

    public int c() {
        return this.c;
    }

    public int d() {
        if (this.c < this.b.a()) {
            return this.b.a(this.c++);
        }
        return -1;
    }

    public int e() {
        if (this.c > 0) {
            return this.b.a(--this.c);
        }
        return -1;
    }

    public void a(int n2) {
        if (n2 < 0 || n2 > this.b.a()) {
            throw new IndexOutOfBoundsException();
        }
        this.c = n2;
    }

    public int a(char[] arrc, int n2) {
        int n3 = this.b.a();
        if (n2 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException(Integer.toString(n3));
        }
        this.b.a(0, n3, arrc, n2);
        return n3;
    }
}

