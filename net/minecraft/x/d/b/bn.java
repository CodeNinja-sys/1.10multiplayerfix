/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bn
implements p {
    private long a;
    private long b;

    public bn() {
    }

    public bn(long l2, long l3, boolean bl2) {
        this.a = l2;
        this.b = l3;
        if (!bl2) {
            this.b = -this.b;
            if (this.b == 0L) {
                this.b = -1L;
            }
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.M();
        this.b = a2.M();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.b(this.a);
        a2.b(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}

