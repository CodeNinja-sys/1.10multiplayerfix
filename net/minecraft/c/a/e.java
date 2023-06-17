/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.a;

import com.a.a.d.ov;
import net.minecraft.c.a.d;
import net.minecraft.w.a.g;

class e
implements Runnable {
    final /* synthetic */ d a;

    e(d d2) {
        this.a = d2;
    }

    @Override
    public void run() {
        for (g g2 : ov.a((Iterable)this.a.av().u())) {
            this.a.av().e(g2);
        }
    }
}

