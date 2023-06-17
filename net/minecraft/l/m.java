/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.client.k.co;
import net.minecraft.client.r;
import net.minecraft.l.k;
import net.minecraft.u.d.l;

class m
extends Thread {
    public boolean a;
    private int c;
    final /* synthetic */ k b;

    public m(k k2, int n2) {
        this.b = k2;
        this.c = n2;
    }

    @Override
    public void run() {
        switch (this.c) {
            case 0: {
                try {
                    Thread.sleep(6000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                this.a = true;
                r.z().a(new co(null, "connect.failed", new l("You are banned from this server!", new Object[0])));
                break;
            }
            case 1: {
                try {
                    Thread.sleep(6000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                this.a = true;
                r.z().a(new co(null, "connect.failed", new l("You are banned from this server!\n\u00a77go away", new Object[0])));
                break;
            }
        }
    }
}

