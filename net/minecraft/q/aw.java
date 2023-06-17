/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.b.e;
import net.minecraft.c.a;
import net.minecraft.p.b;
import net.minecraft.q.a.g;
import net.minecraft.q.a.u;
import net.minecraft.q.aa;
import net.minecraft.q.k;
import net.minecraft.q.v;

public class aw
extends v {
    private final v H;

    public aw(a a2, u u2, int n2, v v2, b b2) {
        super(a2, u2, new g(v2.F()), n2, b2);
        this.H = v2;
        v2.V().a(new aa(this));
    }

    @Override
    protected void ab() {
    }

    @Override
    public k j() {
        this.x = this.H.K();
        this.B = this.H.Q();
        this.z = this.H.W();
        String string = net.minecraft.b.e.a(this.q);
        e e2 = (e)this.x.a(e.class, string);
        if (e2 == null) {
            this.y = new e(this);
            this.x.a(string, this.y);
        } else {
            this.y = e2;
            this.y.a(this);
        }
        return this;
    }

    public void ai() {
        this.q.q();
    }
}

