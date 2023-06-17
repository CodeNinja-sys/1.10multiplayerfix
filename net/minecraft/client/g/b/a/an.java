/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import net.minecraft.client.g.b.a.as;

class an {
    private final as a;
    private int b;
    private int c;
    private final int d;

    public an(as as2, int n2, int n3) {
        this.a = as2;
        this.b = n2;
        this.c = n2;
        this.d = n3;
    }

    public void a(int n2) {
        if (n2 < this.b) {
            this.b = n2;
        } else if (n2 > this.c) {
            this.c = n2;
        }
    }

    public as a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}

