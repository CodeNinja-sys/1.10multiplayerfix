/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.u.b.b;

public class bw {
    private final int a;
    private final b b;
    private int c;
    private int d;

    public bw(int n2, b b2) {
        this.a = n2;
        this.b = b2;
    }

    public b a() {
        return this.b;
    }

    public void a(int n2) {
        if (n2 > 10) {
            n2 = 10;
        }
        this.c = n2;
    }

    public int b() {
        return this.c;
    }

    public void b(int n2) {
        this.d = n2;
    }

    public int c() {
        return this.d;
    }
}

