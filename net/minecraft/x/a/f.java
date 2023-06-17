/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import net.minecraft.x.a.g;

public class f {
    private final g a;
    private Object b;
    private boolean c;

    public f(g g2, Object object) {
        this.a = g2;
        this.b = object;
        this.c = true;
    }

    public g a() {
        return this.a;
    }

    public void a(Object object) {
        this.b = object;
    }

    public Object b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    static /* synthetic */ void a(f f2, boolean bl2) {
        f2.c = bl2;
    }
}

