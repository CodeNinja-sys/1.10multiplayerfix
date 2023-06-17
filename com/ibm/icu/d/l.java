/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

public class l {
    int a;
    int b;
    int c;
    byte d;

    l() {
        this(0, 0, 0);
    }

    l(int n2, int n3, byte by2) {
        this.a = n2;
        this.b = n3;
        this.d = by2;
    }

    void a(l l2) {
        this.a = l2.a;
        this.b = l2.b;
        this.d = l2.d;
        this.c = l2.c;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.b - this.a;
    }

    public byte d() {
        return this.d;
    }

    public boolean e() {
        return (this.d & 1) == 1;
    }

    public boolean f() {
        return (this.d & 1) == 0;
    }

    public byte g() {
        return (byte)(this.d & 1);
    }

    public String toString() {
        return "BidiRun " + this.a + " - " + this.b + " @ " + this.d;
    }
}

