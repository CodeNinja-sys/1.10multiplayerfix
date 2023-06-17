/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import net.minecraft.client.i.d;
import net.minecraft.k.p;

class h
implements p {
    final /* synthetic */ d a;

    h(d d2) {
        this.a = d2;
    }

    public String a() {
        return d.c(this.a).F() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

