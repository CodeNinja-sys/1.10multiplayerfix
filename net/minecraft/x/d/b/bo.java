/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.List;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bo
implements p {
    private int a;
    private int[] b;

    public bo() {
    }

    public bo(n n2) {
        this.a = n2.ca();
        List list = n2.db();
        this.b = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b[i2] = ((n)list.get(i2)).ca();
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.b();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int[] a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}

