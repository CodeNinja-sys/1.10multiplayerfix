/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

public class q {
    private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private boolean f;

    public q(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.a(0);
    }

    public String a() {
        this.a(0);
        return this.c;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public String f() {
        if (this.g()) {
            this.d = this.e + 1;
            this.e = this.b(this.d);
            this.c = this.a.substring(this.d, this.e);
        } else {
            this.d = this.e;
            this.c = null;
            this.f = true;
        }
        return this.c;
    }

    public boolean g() {
        return this.e < this.a.length();
    }

    public q a(int n2) {
        if (n2 > this.a.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.d = n2;
        this.e = this.b(this.d);
        this.c = this.a.substring(this.d, this.e);
        this.f = false;
        return this;
    }

    public q a(String string) {
        this.a = string;
        this.a(0);
        return this;
    }

    private int b(int n2) {
        int n3;
        block0: for (n3 = n2; n3 < this.a.length(); ++n3) {
            char c2 = this.a.charAt(n3);
            for (int i2 = 0; i2 < this.b.length(); ++i2) {
                if (c2 == this.b.charAt(i2)) break block0;
            }
        }
        return n3;
    }
}

