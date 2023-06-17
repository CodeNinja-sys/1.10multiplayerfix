/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.a.l;

public class w
extends l {
    public w() {
        this.h = true;
    }

    public w(float f2, float f3, boolean bl2) {
        this.d = f2;
        this.e = f3;
        this.f = bl2;
        this.h = true;
    }

    @Override
    public void a(a a2) {
        this.d = a2.O();
        this.e = a2.O();
        super.a(a2);
    }

    @Override
    public void b(a a2) {
        a2.a(this.d);
        a2.a(this.e);
        super.b(a2);
    }
}

