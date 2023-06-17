/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bv;
import com.ibm.icu.util.dn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class bw {
    private String b;
    private String c;
    private String d;
    private bv e;
    static Pattern a = Pattern.compile("([a-zA-Z]{1,8}|\\*)(?:-([a-zA-Z]{4}|\\*))?(?:-([a-zA-Z]{2}|[0-9]{3}|\\*))?");

    public bw(String string) {
        Matcher matcher = a.matcher(string);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Bad pattern: " + string);
        }
        this.b = matcher.group(1);
        this.c = matcher.group(2);
        this.d = matcher.group(3);
        bv bv2 = this.d != null ? bv.c : (this.e = this.c != null ? bv.b : bv.a);
        if (this.b.equals("*")) {
            this.b = null;
        }
        if (this.c != null && this.c.equals("*")) {
            this.c = null;
        }
        if (this.d != null && this.d.equals("*")) {
            this.d = null;
        }
    }

    boolean a(dn dn2) {
        if (this.b != null && !this.b.equals(dn2.f())) {
            return false;
        }
        if (this.c != null && !this.c.equals(dn2.g())) {
            return false;
        }
        return this.d == null || this.d.equals(dn2.h());
    }

    public bv a() {
        return this.e;
    }

    public String b() {
        return this.b == null ? "*" : this.b;
    }

    public String c() {
        return this.c == null ? "*" : this.c;
    }

    public String d() {
        return this.d == null ? "*" : this.d;
    }

    public String toString() {
        String string = this.b();
        if (this.e != bv.a) {
            string = string + "-" + this.c();
            if (this.e != bv.b) {
                string = string + "-" + this.d();
            }
        }
        return string;
    }
}

