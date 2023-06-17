/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.client.r;
import net.minecraft.l.k;

class j
extends Thread {
    final /* synthetic */ k a;

    private j(k k2) {
        this.a = k2;
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
}

