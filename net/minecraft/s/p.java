/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.client.i.o;

public class p {
    private final String a;
    private final int b;

    protected p(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public static p a(String string) {
        o o2 = o.a(string);
        return new p(o2.a(), o2.b());
    }
}

