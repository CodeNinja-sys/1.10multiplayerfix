/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.w.b.t;
import net.minecraft.w.h.am;

public class ae
extends t {
    private final am c;
    private boolean d;
    final /* synthetic */ am b;

    public ae(am am2, am am3) {
        this.b = am2;
        super(am3);
        this.c = am3;
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    @Override
    public void b() {
        if (this.a) {
            this.c.p();
            this.a = false;
        }
    }
}

