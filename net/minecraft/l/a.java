/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.client.r;
import net.minecraft.l.i;
import net.minecraft.l.k;
import net.minecraft.l.o;

class a
extends Thread {
    final /* synthetic */ o a;

    private a(o o2) {
        this.a = o2;
    }

    @Override
    public void run() {
        o.a(this.a, true);
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        i.a(4);
        k.d = false;
        o.b((o)this.a).u = false;
        this.a.b = true;
        o.b(this.a, true);
        o.a((o)this.a).h = true;
        o.a(this.a).d(this.a.a.b + 1.0, this.a.a.c, this.a.a.d);
        try {
            Thread.sleep(4000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        r.z().n();
    }

    /* synthetic */ a(o o2, a a2) {
        this(o2);
    }
}

