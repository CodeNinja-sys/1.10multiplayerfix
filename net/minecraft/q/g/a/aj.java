/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.g.c.b;
import net.minecraft.q.k;

public abstract class aj {
    private final boolean a;

    public aj() {
        this(false);
    }

    public aj(boolean bl2) {
        this.a = bl2;
    }

    public abstract boolean a(k var1, Random var2, net.minecraft.u.b.b var3);

    public void a() {
    }

    protected void a(k k2, net.minecraft.u.b.b b2, b b3) {
        if (this.a) {
            k2.a(b2, b3, 3);
        } else {
            k2.a(b2, b3, 2);
        }
    }
}

