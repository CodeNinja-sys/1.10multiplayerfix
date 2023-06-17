/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.aa;
import com.sun.jna.a.d.gr;

public class bq {
    public String a;
    public String b;
    public gr c;
    public String d;
    public aa e;
    public String f;
    private int g;

    public boolean a() {
        return (this.g & 1) != 0;
    }

    public boolean b() {
        return (this.g & 2) != 0;
    }

    public boolean c() {
        return (this.g & 4) != 0;
    }

    public boolean d() {
        return (this.g & 8) != 0;
    }

    public boolean e() {
        return (this.g & 0x10) != 0;
    }

    public boolean f() {
        return (this.g & 0x20) != 0;
    }

    static /* synthetic */ int a(bq bq2, int n2) {
        bq2.g = n2;
        return bq2.g;
    }
}

