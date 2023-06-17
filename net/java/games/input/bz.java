/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.bf;
import net.java.games.input.bx;
import net.java.games.input.m;

public class bz
extends bx {
    private bx a;
    private bx b;

    bz(m m2, bx bx2, bx bx3) {
        super(m2, false);
        this.a = bx2;
        this.b = bx3;
    }

    protected bx j() {
        return this.a;
    }

    protected bx k() {
        return this.b;
    }

    protected void l() {
        float f2 = this.a.f();
        float f3 = this.b.f();
        this.g();
        if (f2 == -1.0f && f3 == -1.0f) {
            this.a(0.125f);
        } else if (f2 == -1.0f && f3 == 0.0f) {
            this.a(1.0f);
        } else if (f2 == -1.0f && f3 == 1.0f) {
            this.a(0.875f);
        } else if (f2 == 0.0f && f3 == -1.0f) {
            this.a(0.25f);
        } else if (f2 == 0.0f && f3 == 0.0f) {
            this.a(0.0f);
        } else if (f2 == 0.0f && f3 == 1.0f) {
            this.a(0.75f);
        } else if (f2 == 1.0f && f3 == -1.0f) {
            this.a(0.375f);
        } else if (f2 == 1.0f && f3 == 0.0f) {
            this.a(0.5f);
        } else if (f2 == 1.0f && f3 == 1.0f) {
            this.a(0.625f);
        } else {
            bf.a("Unknown values x = " + f2 + " | y = " + f3);
            this.a(0.0f);
        }
    }
}

