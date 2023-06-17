/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.client.c.d;
import net.minecraft.client.c.r;
import net.minecraft.u.bp;

public class l
implements r {
    private final bp a;
    private final float b;
    private final float c;
    private final int d;
    private final d e;
    private final boolean f;

    public l(String string, float f2, float f3, int n2, d d2, boolean bl2) {
        this.a = new bp(string);
        this.b = f2;
        this.c = f3;
        this.d = n2;
        this.e = d2;
        this.f = bl2;
    }

    public bp a() {
        return this.a;
    }

    public bp b() {
        return new bp(this.a.c(), "sounds/" + this.a.b() + ".ogg");
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    @Override
    public int e() {
        return this.d;
    }

    public l f() {
        return this;
    }

    public d g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    @Override
    public /* synthetic */ Object i() {
        return this.f();
    }
}

