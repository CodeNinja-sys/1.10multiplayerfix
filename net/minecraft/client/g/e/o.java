/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import net.minecraft.client.g.e.g;
import net.minecraft.client.g.e.r;

class o
implements Runnable {
    final /* synthetic */ r a;
    private final /* synthetic */ g b;

    o(r r2, g g2) {
        this.a = r2;
        this.b = g2;
    }

    @Override
    public void run() {
        r.a(this.a).remove(this.b);
    }
}

