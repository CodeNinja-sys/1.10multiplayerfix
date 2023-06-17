/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.k.p;
import net.minecraft.q.a.d;

class c
implements p {
    final /* synthetic */ d a;

    c(d d2) {
        this.a = d2;
    }

    public String a() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", d.o(this.a).b(), d.o(this.a).a(), d.p(this.a), d.q(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

