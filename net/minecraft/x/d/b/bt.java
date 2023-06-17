/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bt
implements p {
    private int[] a;

    public bt() {
    }

    public bt(int ... arrn) {
        this.a = arrn;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = new int[a2.e()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = a2.e();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a.length);
        int[] arrn = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn[i2];
            a2.d(n3);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int[] a() {
        return this.a;
    }
}

