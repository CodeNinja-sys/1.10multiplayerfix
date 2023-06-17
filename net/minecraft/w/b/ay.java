/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.bm;
import net.minecraft.w.h.ai;
import net.minecraft.w.l;

public class ay
extends bm {
    private final ai a;
    private boolean b;

    public ay(ai ai2) {
        this.a = ai2;
        this.b(5);
    }

    @Override
    public boolean e() {
        if (!this.a.z()) {
            return false;
        }
        if (this.a.cm()) {
            return false;
        }
        if (!this.a.be) {
            return false;
        }
        l l2 = this.a.do();
        return l2 == null ? true : (this.a.n(l2) < 144.0 && l2.be() != null ? false : this.b);
    }

    @Override
    public void b() {
        this.a.N().m();
        this.a.t(true);
    }

    @Override
    public void c() {
        this.a.t(false);
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }
}

