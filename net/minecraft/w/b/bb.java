/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.h.aq;
import net.minecraft.w.a.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.ak;

public class bb
extends bm {
    private final ak a;

    public bb(ak ak2) {
        this.a = ak2;
        this.b(5);
    }

    @Override
    public boolean e() {
        if (!this.a.br()) {
            return false;
        }
        if (this.a.cm()) {
            return false;
        }
        if (!this.a.be) {
            return false;
        }
        if (this.a.bi) {
            return false;
        }
        b b2 = this.a.s();
        return b2 == null ? false : (this.a.n(b2) > 16.0 ? false : b2.s instanceof aq);
    }

    @Override
    public void b() {
        this.a.N().m();
    }

    @Override
    public void c() {
        this.a.a((b)null);
    }
}

