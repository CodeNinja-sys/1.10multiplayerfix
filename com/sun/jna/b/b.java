/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.b;

import com.sun.jna.b.a;

public class b
extends a {
    public b() {
        this(0);
    }

    public b(byte by2) {
        super(1);
        this.a(by2);
    }

    public void a(byte by2) {
        this.c().a(0L, by2);
    }

    public byte d() {
        return this.c().b(0L);
    }
}

