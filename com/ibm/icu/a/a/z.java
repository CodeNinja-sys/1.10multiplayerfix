/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.a;

import com.ibm.icu.a.a.y;
import com.ibm.icu.a.eb;
import com.ibm.icu.a.jd;
import com.ibm.icu.d.kx;

public class z {
    private y a;
    private String b;
    private StringBuffer c;
    private boolean d;
    private int e;
    private int f;

    public z(y y2) {
        this.a = y2;
        this.b = null;
        this.d = false;
        this.c = new StringBuffer();
        this.f = -1;
        this.e = -1;
    }

    public String a() {
        if (this.d) {
            return null;
        }
        while (true) {
            if (this.b == null) {
                this.b = this.a.b();
                if (this.b == null) {
                    this.d = true;
                    return null;
                }
                this.e = 0;
            }
            this.c.setLength(0);
            this.f = this.e;
            this.e = this.a(this.e);
            if (this.e >= 0) break;
            this.b = null;
        }
        return this.c.toString();
    }

    public int b() {
        return this.a.c();
    }

    public String c() {
        return this.a.d() + ':' + (this.f + 1);
    }

    private int a(int n2) {
        if ((n2 = eb.a(this.b, n2)) == this.b.length()) {
            return -1;
        }
        int n3 = n2;
        char c2 = this.b.charAt(n2++);
        char c3 = '\u0000';
        switch (c2) {
            case '\"': 
            case '\'': {
                c3 = c2;
                break;
            }
            case '#': {
                return -1;
            }
            default: {
                this.c.append(c2);
            }
        }
        int[] arrn = null;
        while (n2 < this.b.length()) {
            c2 = this.b.charAt(n2);
            if (c2 == '\\') {
                int n4;
                if (arrn == null) {
                    arrn = new int[]{n2 + 1};
                }
                if ((n4 = jd.a(this.b, arrn)) < 0) {
                    throw new RuntimeException("Invalid escape at " + this.a.d() + ':' + n2);
                }
                kx.f(this.c, n4);
                n2 = arrn[0];
                continue;
            }
            if (c3 != '\u0000' && c2 == c3 || c3 == '\u0000' && eb.c(c2)) {
                return ++n2;
            }
            if (c3 == '\u0000' && c2 == '#') {
                return n2;
            }
            this.c.append(c2);
            ++n2;
        }
        if (c3 != '\u0000') {
            throw new RuntimeException("Unterminated quote at " + this.a.d() + ':' + n3);
        }
        return n2;
    }
}

