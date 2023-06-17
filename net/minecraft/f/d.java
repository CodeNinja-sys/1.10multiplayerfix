/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.e.e;
import net.minecraft.f.ap;

public class d
extends ap {
    private int a;

    @Override
    public e a(e e2) {
        super.a(e2);
        e2.a("OutputSignal", this.a);
        return e2;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = e2.h("OutputSignal");
    }

    public int a() {
        return this.a;
    }

    public void a(int n2) {
        this.a = n2;
    }
}

