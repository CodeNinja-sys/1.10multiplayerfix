/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c;

import org.apache.commons.a.c.i;

public class j {
    private final StringBuilder b;
    private final StringBuilder c;
    private final int d;
    final /* synthetic */ i a;

    public j(i i2, int n2) {
        this.a = i2;
        this.b = new StringBuilder(this.a.a());
        this.c = new StringBuilder(this.a.a());
        this.d = n2;
    }

    public void a(char c2) {
        this.b(c2);
        this.c(c2);
    }

    public void a(char c2, char c3) {
        this.b(c2);
        this.c(c3);
    }

    public void b(char c2) {
        if (this.b.length() < this.d) {
            this.b.append(c2);
        }
    }

    public void c(char c2) {
        if (this.c.length() < this.d) {
            this.c.append(c2);
        }
    }

    public void a(String string) {
        this.b(string);
        this.c(string);
    }

    public void a(String string, String string2) {
        this.b(string);
        this.c(string2);
    }

    public void b(String string) {
        int n2 = this.d - this.b.length();
        if (string.length() <= n2) {
            this.b.append(string);
        } else {
            this.b.append(string.substring(0, n2));
        }
    }

    public void c(String string) {
        int n2 = this.d - this.c.length();
        if (string.length() <= n2) {
            this.c.append(string);
        } else {
            this.c.append(string.substring(0, n2));
        }
    }

    public String a() {
        return this.b.toString();
    }

    public String b() {
        return this.c.toString();
    }

    public boolean c() {
        return this.b.length() >= this.d && this.c.length() >= this.d;
    }
}

