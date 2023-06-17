/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import net.minecraft.w.b.a.f;

public abstract class g
implements f {
    private final f a;
    private final String b;
    private final double c;
    private boolean d;

    protected g(f f2, String string, double d2) {
        this.a = f2;
        this.b = string;
        this.c = d2;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public double c() {
        return this.c;
    }

    @Override
    public boolean d() {
        return this.d;
    }

    public g a(boolean bl2) {
        this.d = bl2;
        return this;
    }

    @Override
    public f e() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof f && this.b.equals(((f)object).b());
    }
}

