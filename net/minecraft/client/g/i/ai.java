/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.a.x;
import net.minecraft.client.g.i.al;
import net.minecraft.client.g.i.ar;
import net.minecraft.client.j.c;

class ai
extends x {
    final /* synthetic */ ar a;

    ai(ar ar2, al al2) {
        this.a = ar2;
        super(al2);
    }

    @Override
    protected void a() {
        this.c = new c(0.5f, true);
        this.d = new c(1.0f, true);
    }
}

