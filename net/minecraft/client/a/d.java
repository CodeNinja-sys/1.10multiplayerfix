/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.f;
import net.minecraft.k.p;

class d
implements p {
    final /* synthetic */ f a;
    private final /* synthetic */ int b;

    d(f f2, int n2) {
        this.a = f2;
        this.b = n2;
    }

    public String a() {
        return this.b == 0 ? "MISC_TEXTURE" : (this.b == 1 ? "TERRAIN_TEXTURE" : (this.b == 3 ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + this.b));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

