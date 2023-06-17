/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.k.p;
import net.minecraft.q.a.d;

class v
implements p {
    final /* synthetic */ d a;

    v(d d2) {
        this.a = d2;
    }

    public String a() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", d.k(this.a), d.l(this.a), d.m(this.a), d.n(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

