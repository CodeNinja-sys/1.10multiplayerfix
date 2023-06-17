/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.g;

import net.minecraft.client.g.g.a;
import net.minecraft.client.g.g.b;
import net.minecraft.client.g.g.d;

public class e
implements d {
    private final a a;
    private double b;
    private double c;
    private double d;

    public e() {
        this(net.minecraft.client.g.g.b.a());
    }

    public e(a a2) {
        this.a = a2;
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.a.a(d2 - this.b, d3 - this.c, d4 - this.d, d5 - this.b, d6 - this.c, d7 - this.d);
    }

    @Override
    public boolean a(net.minecraft.u.b.a a2) {
        return this.a(a2.a, a2.b, a2.c, a2.d, a2.e, a2.f);
    }
}

