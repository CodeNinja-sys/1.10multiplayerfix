/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.h;

class u {
    private String a;
    private boolean b;
    private int c;
    private double d;
    private final h e;

    public u(String string, h h2) {
        this.e = h2;
        this.a(string);
    }

    public void a(String string) {
        this.a = string;
        this.b = Boolean.parseBoolean(string);
        this.c = this.b ? 1 : 0;
        try {
            this.c = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.d = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public h d() {
        return this.e;
    }
}

