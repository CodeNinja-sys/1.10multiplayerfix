/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import net.minecraft.u.b.n;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.g;

public class c
extends g {
    private final double a;
    private final double b;
    private String c;

    public c(f f2, String string, double d2, double d3, double d4) {
        super(f2, string, d2);
        this.a = d3;
        this.b = d4;
        if (d3 > d4) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d2 < d3) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d2 > d4) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public c a(String string) {
        this.c = string;
        return this;
    }

    public String a() {
        return this.c;
    }

    @Override
    public double a(double d2) {
        d2 = n.a(d2, this.a, this.b);
        return d2;
    }
}

