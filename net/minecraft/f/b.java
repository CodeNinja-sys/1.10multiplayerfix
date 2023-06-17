/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.ap;
import net.minecraft.k.p;

class b
implements p {
    final /* synthetic */ ap a;

    b(ap ap2) {
        this.a = ap2;
    }

    public String a() {
        return String.valueOf((String)ap.G().get(this.a.getClass())) + " // " + this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

