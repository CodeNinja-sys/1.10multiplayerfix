/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import net.minecraft.x.b;
import net.minecraft.x.p;

class ad
implements Runnable {
    private final /* synthetic */ p a;
    private final /* synthetic */ b b;

    ad(p p2, b b2) {
        this.a = p2;
        this.b = b2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

