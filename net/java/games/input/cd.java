/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.ax;
import net.java.games.input.az;
import net.java.games.input.bb;
import net.java.games.input.bf;
import net.java.games.input.bq;

final class cd
extends az {
    private final bq a;
    private final bq b;
    private float c;
    private float d;

    public cd(bq bq2, bq bq3) {
        super(bq2);
        this.a = bq2;
        this.b = bq3;
    }

    protected final float a() {
        this.c = bb.a(this.a);
        this.d = bb.a(this.b);
        return this.a(0.0f, null);
    }

    public float a(float f2, ax ax2) {
        if (ax2 == this.a.d()) {
            this.c = f2;
        }
        if (ax2 == this.b.d()) {
            this.d = f2;
        }
        if (this.c == -1.0f && this.d == -1.0f) {
            return 0.125f;
        }
        if (this.c == -1.0f && this.d == 0.0f) {
            return 1.0f;
        }
        if (this.c == -1.0f && this.d == 1.0f) {
            return 0.875f;
        }
        if (this.c == 0.0f && this.d == -1.0f) {
            return 0.25f;
        }
        if (this.c == 0.0f && this.d == 0.0f) {
            return 0.0f;
        }
        if (this.c == 0.0f && this.d == 1.0f) {
            return 0.75f;
        }
        if (this.c == 1.0f && this.d == -1.0f) {
            return 0.375f;
        }
        if (this.c == 1.0f && this.d == 0.0f) {
            return 0.5f;
        }
        if (this.c == 1.0f && this.d == 1.0f) {
            return 0.625f;
        }
        bf.a("Unknown values x = " + this.c + " | y = " + this.d);
        return 0.0f;
    }
}

