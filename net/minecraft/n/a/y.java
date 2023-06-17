/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.client.r;
import net.minecraft.n.a.v;

class y
extends Thread {
    final /* synthetic */ v a;

    private y(v v2) {
        this.a = v2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        r.z().n();
    }

    /* synthetic */ y(v v2, y y2) {
        this(v2);
    }
}

