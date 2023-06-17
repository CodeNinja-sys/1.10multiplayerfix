/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import net.minecraft.k.p;
import net.minecraft.q.a.d;

class f
implements p {
    final /* synthetic */ d a;

    f(d d2) {
        this.a = d2;
    }

    public String a() {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", d.a(this.a).g(), d.a(this.a).a(), d.a(this.a).d(), d.b(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

