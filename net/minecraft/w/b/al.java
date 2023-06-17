/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.bm;
import net.minecraft.w.e.bi;
import net.minecraft.w.l;

public class al
extends bm {
    bi a;
    l b;

    public al(bi bi2) {
        this.a = bi2;
        this.b(1);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        return this.a.p() > 0 || l2 != null && this.a.n(l2) < 9.0;
    }

    @Override
    public void b() {
        this.a.N().m();
        this.b = this.a.W();
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public void d() {
        if (this.b == null) {
            this.a.b(-1);
        } else if (this.a.n(this.b) > 49.0) {
            this.a.b(-1);
        } else if (!this.a.V().a(this.b)) {
            this.a.b(-1);
        } else {
            this.a.b(1);
        }
    }
}

