/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import org.lwjgl.util.d.i;

public class w {
    private final i b;
    private final i c;
    private final i d;
    public int a;

    w(i i2, i i3, i i4) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    void a(int n2) {
        this.b.a(this.b.a(n2));
        this.c.a(this.c.a(n2));
        this.d.a(this.d.a(n2));
    }

    public void a() {
        this.b.g();
        this.c.g();
        this.d.g();
    }
}

