/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net.a;

import org.apache.logging.log4j.d.d;

public class f {
    protected static final d a = d.k();
    private String b;
    private String c;

    public f(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public String c() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public String d() {
        return this.c;
    }

    public char[] e() {
        if (this.c == null) {
            return null;
        }
        return this.c.toCharArray();
    }

    public void b(String string) {
        this.c = string;
    }

    public boolean a(f f2) {
        if (f2 == null) {
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        if (this.b != null) {
            bl2 = this.b.equals(f2.b);
        } else {
            boolean bl4 = bl2 = this.b == f2.b;
        }
        bl3 = this.c != null ? this.c.equals(f2.c) : this.c == f2.c;
        return bl2 && bl3;
    }

    protected void a() {
    }
}

