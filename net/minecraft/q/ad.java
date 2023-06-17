/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.q.f;

public class ad
implements Runnable {
    private final f a;

    public ad(f f2) {
        this.a = f2;
    }

    @Override
    public void run() {
        this.a.d();
    }
}

