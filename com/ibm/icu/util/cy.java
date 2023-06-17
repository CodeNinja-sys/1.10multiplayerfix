/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.cw;
import com.ibm.icu.util.cx;
import com.ibm.icu.util.da;
import com.ibm.icu.util.de;

final class cy
extends de {
    private CharSequence e;
    private int f;
    private int g;
    private da h;
    private int i;

    public cy(CharSequence charSequence, int n2, int n3, da da2) {
        this.e = charSequence;
        this.f = n2;
        this.g = n3;
        this.h = da2;
    }

    public int hashCode() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        cy cy2 = (cy)object;
        if (this.g != cy2.g || this.h != cy2.h) {
            return false;
        }
        int n2 = this.f;
        int n3 = cy2.f;
        int n4 = this.f + this.g;
        while (n2 < n4) {
            if (this.e.charAt(n2) != this.e.charAt(n3)) {
                return false;
            }
            ++n2;
            ++n3;
        }
        return true;
    }

    public da a(cs cs2, CharSequence charSequence, int n2, int n3) {
        if (n2 == charSequence.length()) {
            if (this.a) {
                throw new IllegalArgumentException("Duplicate string.");
            }
            this.b(n3);
            return this;
        }
        int n4 = this.f + this.g;
        int n5 = this.f;
        while (n5 < n4) {
            char c2;
            char c3;
            if (n2 == charSequence.length()) {
                c3 = n5 - this.f;
                cy cy2 = new cy(this.e, n5, this.g - c3, this.h);
                cy2.b(n3);
                this.g = c3;
                this.h = cy2;
                return this;
            }
            c3 = this.e.charAt(n5);
            if (c3 != (c2 = charSequence.charAt(n2))) {
                de de2;
                da da2;
                cw cw2 = new cw();
                if (n5 == this.f) {
                    if (this.a) {
                        cw2.b(this.b);
                        this.b = 0;
                        this.a = false;
                    }
                    ++this.f;
                    --this.g;
                    da2 = this.g > 0 ? this : this.h;
                    de2 = cw2;
                } else if (n5 == n4 - 1) {
                    --this.g;
                    da2 = this.h;
                    this.h = cw2;
                    de2 = this;
                } else {
                    int n6 = n5 - this.f;
                    da2 = new cy(this.e, ++n5, this.g - (n6 + 1), this.h);
                    this.g = n6;
                    this.h = cw2;
                    de2 = this;
                }
                de de3 = cs.a(cs2, charSequence, n2 + 1, n3);
                cw2.a(c3, da2);
                cw2.a(c2, de3);
                return de2;
            }
            ++n5;
            ++n2;
        }
        this.h = this.h.a(cs2, charSequence, n2, n3);
        return this;
    }

    public da b(cs cs2) {
        de de2;
        this.h = this.h.b(cs2);
        int n2 = cs2.e();
        while (this.g > n2) {
            int n3 = this.f + this.g - n2;
            this.g -= n2;
            cy cy2 = new cy(this.e, n3, n2, this.h);
            cy2.b();
            this.h = cs.a(cs2, cy2);
        }
        if (this.a && !cs2.b()) {
            int n4 = this.b;
            this.b = 0;
            this.a = false;
            this.b();
            de2 = new cx(n4, cs.a(cs2, this));
        } else {
            this.b();
            de2 = this;
        }
        return cs.a(cs2, de2);
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.d = n2 = this.h.a(n2);
        }
        return n2;
    }

    public void a(cs cs2) {
        this.h.a(cs2);
        cs2.a(this.f, this.g);
        this.d = cs2.a(this.a, this.b, cs2.d() + this.g - 1);
    }

    private void b() {
        this.i = (124151391 + this.g) * 37 + this.h.hashCode();
        if (this.a) {
            this.i = this.i * 37 + this.b;
        }
        int n2 = this.f + this.g;
        for (int i2 = this.f; i2 < n2; ++i2) {
            this.i = this.i * 37 + this.e.charAt(i2);
        }
    }
}

