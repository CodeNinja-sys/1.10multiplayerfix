/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.Random;
import net.minecraft.q.f.e;
import net.minecraft.q.k;

public class u {
    protected int e = 8;
    protected Random f = new Random();
    protected k g;

    public void a(k k2, int n2, int n3, e e2) {
        int n4 = this.e;
        this.g = k2;
        this.f.setSeed(k2.A());
        long l2 = this.f.nextLong();
        long l3 = this.f.nextLong();
        for (int i2 = n2 - n4; i2 <= n2 + n4; ++i2) {
            for (int i3 = n3 - n4; i3 <= n3 + n4; ++i3) {
                long l4 = (long)i2 * l2;
                long l5 = (long)i3 * l3;
                this.f.setSeed(l4 ^ l5 ^ k2.A());
                this.a(k2, i2, i3, n2, n3, e2);
            }
        }
    }

    protected void a(k k2, int n2, int n3, int n4, int n5, e e2) {
    }
}

