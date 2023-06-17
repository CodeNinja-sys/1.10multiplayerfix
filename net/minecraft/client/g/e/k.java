/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.n.a.dl;
import net.minecraft.client.g.e.l;

class k
implements Runnable {
    final /* synthetic */ l a;
    private final /* synthetic */ dl b;

    k(l l2, dl dl2) {
        this.a = l2;
        this.b = dl2;
    }

    @Override
    public void run() {
        this.b.cancel(false);
    }
}

