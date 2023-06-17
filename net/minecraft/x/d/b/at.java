/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.g.c.b;
import net.minecraft.q.f.k;
import net.minecraft.x.d.b.bc;

public class at {
    private final short b;
    private final b c;
    final /* synthetic */ bc a;

    public at(bc bc2, short s2, b b2) {
        this.a = bc2;
        this.b = s2;
        this.c = b2;
    }

    public at(bc bc2, short s2, k k2) {
        this.a = bc2;
        this.b = s2;
        this.c = k2.a(this.a());
    }

    public net.minecraft.u.b.b a() {
        return new net.minecraft.u.b.b(bc.a(this.a).a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
    }

    public short b() {
        return this.b;
    }

    public b c() {
        return this.c;
    }
}

