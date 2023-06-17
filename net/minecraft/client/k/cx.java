/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.l.g;
import net.minecraft.x.d.a.aa;

public class cx
extends cc {
    private final g a;
    private int b;

    public cx(g g2) {
        this.a = g2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void ct_() {
        this.r.clear();
    }

    @Override
    public void bY_() {
        ++this.b;
        if (this.b % 20 == 0) {
            this.a.a(new aa());
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.c(0);
        this.a(this.u, net.minecraft.client.f.u.a("multiplayer.downloadingTerrain", new Object[0]), this.p / 2, this.q / 2 - 50, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean cq_() {
        return false;
    }
}

