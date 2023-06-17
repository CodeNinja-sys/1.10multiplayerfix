/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.g;
import net.minecraft.u.c;

public class bl {
    private final g[] a = new g[c.values().length];

    public bl() {
        this.a[c.a.ordinal()] = new g(0x200000);
        this.a[c.c.ordinal()] = new g(131072);
        this.a[c.b.ordinal()] = new g(131072);
        this.a[c.d.ordinal()] = new g(262144);
    }

    public g a(c c2) {
        return this.a[c2.ordinal()];
    }

    public g a(int n2) {
        return this.a[n2];
    }
}

