/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.d.a;
import net.minecraft.u.n;
import net.minecraft.w.l;

public class g {
    private final n a;
    private final int b;
    private final float c;
    private final float d;
    private final String e;
    private final float f;

    public g(n n2, int n3, float f2, float f3, String string, float f4) {
        this.a = n2;
        this.b = n3;
        this.c = f3;
        this.d = f2;
        this.e = string;
        this.f = f4;
    }

    public n a() {
        return this.a;
    }

    public float b() {
        return this.c;
    }

    public boolean c() {
        return this.a.j() instanceof l;
    }

    public String d() {
        return this.e;
    }

    public a e() {
        return this.a().j() == null ? null : this.a().j().aK();
    }

    public float f() {
        return this.a == n.l ? Float.MAX_VALUE : this.f;
    }
}

