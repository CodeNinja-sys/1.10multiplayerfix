/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.cl;
import com.a.a.b.m;

final class j {
    final String a;
    int b = 0;

    j(String string) {
        this.a = string;
    }

    String a(m m2) {
        cl.b(this.b());
        int n2 = this.b;
        this.b = m2.a().a((CharSequence)this.a, n2);
        return this.b() ? this.a.substring(n2, this.b) : this.a.substring(n2);
    }

    String b(m m2) {
        int n2 = this.b;
        String string = this.a(m2);
        cl.b(this.b != n2);
        return string;
    }

    char c(m m2) {
        cl.b(this.b());
        char c2 = this.a();
        cl.b(m2.c(c2));
        ++this.b;
        return c2;
    }

    char a(char c2) {
        cl.b(this.b());
        cl.b(this.a() == c2);
        ++this.b;
        return c2;
    }

    char a() {
        cl.b(this.b());
        return this.a.charAt(this.b);
    }

    boolean b() {
        return this.b >= 0 && this.b < this.a.length();
    }
}

