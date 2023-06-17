/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Arrays;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.m;
import net.minecraft.client.g.b.a.t;

public class ah
extends t {
    private final d e;

    public ah(t t2, d d2) {
        super(Arrays.copyOf(t2.b(), t2.b().length), t2.b, m.a(t2.b()), t2.a());
        this.e = d2;
        this.f();
    }

    private void f() {
        for (int i2 = 0; i2 < 4; ++i2) {
            int n2 = 7 * i2;
            this.a[n2 + 4] = Float.floatToRawIntBits(this.e.a((double)this.d.a(Float.intBitsToFloat(this.a[n2 + 4]))));
            this.a[n2 + 4 + 1] = Float.floatToRawIntBits(this.e.b((double)this.d.b(Float.intBitsToFloat(this.a[n2 + 4 + 1]))));
        }
    }
}

