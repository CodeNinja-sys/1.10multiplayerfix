/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.e.e;

public abstract class f {
    public final String i;
    private boolean a;

    public f(String string) {
        this.i = string;
    }

    public abstract void a(e var1);

    public abstract e b(e var1);

    public void d() {
        this.a(true);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean e() {
        return this.a;
    }
}

