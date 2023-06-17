/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.r;

class i
extends Thread {
    final /* synthetic */ r a;

    i(r r2, String string) {
        this.a = r2;
        super(string);
    }

    @Override
    public void run() {
        while (this.a.E) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }
}

