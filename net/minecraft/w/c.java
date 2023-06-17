/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.l.b.b;
import net.minecraft.u.b.n;
import net.minecraft.w.l;

class c
extends Thread {
    private b b;
    final /* synthetic */ l a;

    public c(l l2, b b2) {
        this.a = l2;
        this.b = b2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(270L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        float f2 = this.b.ba * ((float)Math.PI / 180);
        this.b.aX -= (double)(n.a(f2) * 0.1f);
        this.b.aZ += (double)(n.b(f2) * 0.1f);
    }
}

