/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.a.b;
import net.minecraft.w.b.ap;
import net.minecraft.w.h.ak;

public class bj
extends ap {
    private final ak e;

    public bj(ak ak2) {
        super(ak2, b.class, 8.0f);
        this.e = ak2;
    }

    @Override
    public boolean e() {
        if (this.e.t()) {
            this.b = this.e.s();
            return true;
        }
        return false;
    }
}

