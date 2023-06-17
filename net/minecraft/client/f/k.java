/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.client.f.g;
import net.minecraft.client.k.db;
import net.minecraft.client.r;

class k
implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ r b;
    private final /* synthetic */ db c;

    k(g g2, r r2, db db2) {
        this.a = g2;
        this.b = r2;
        this.c = db2;
    }

    @Override
    public void run() {
        this.b.a(this.c);
    }
}

