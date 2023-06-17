/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.q.k;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.h.a;
import net.minecraft.w.n;

public abstract class c
extends f
implements a {
    public c(k k2) {
        super(k2);
    }

    @Override
    public boolean aZ() {
        return true;
    }

    @Override
    public boolean aq() {
        return true;
    }

    @Override
    public boolean ar() {
        return this.aQ.a(this.cT(), (n)this);
    }

    @Override
    public int ac() {
        return 120;
    }

    @Override
    protected boolean i() {
        return true;
    }

    @Override
    protected int b_(b b2) {
        return 1 + this.aQ.p.nextInt(3);
    }

    @Override
    public void cf_() {
        int n2 = this.cE();
        super.cf_();
        if (this.br() && !this.cm()) {
            this.n(--n2);
            if (this.cE() == -20) {
                this.n(0);
                this.a(net.minecraft.u.n.g, 2.0f);
            }
        } else {
            this.n(300);
        }
    }

    @Override
    public boolean ay() {
        return false;
    }
}

