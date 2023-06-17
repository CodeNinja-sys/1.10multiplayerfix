/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import java.util.Random;
import net.minecraft.u.b.n;

public class f {
    private final float a;
    private final float b;

    public f(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public f(float f2) {
        this.a = f2;
        this.b = f2;
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public int a(Random random) {
        return n.a(random, n.d(this.a), n.d(this.b));
    }

    public float b(Random random) {
        return n.a(random, this.a, this.b);
    }

    public boolean a(int n2) {
        return (float)n2 <= this.b && (float)n2 >= this.a;
    }

    static /* synthetic */ float a(f f2) {
        return f2.a;
    }

    static /* synthetic */ float b(f f2) {
        return f2.b;
    }
}

