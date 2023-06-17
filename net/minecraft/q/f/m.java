/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.f.c;
import net.minecraft.q.f.h;
import net.minecraft.x.a;

public class m
implements h {
    private final b[] a;
    private final c b;
    private final int c;
    private int d;

    public m(int n2, c c2) {
        this.a = new b[1 << n2];
        this.c = n2;
        this.b = c2;
    }

    @Override
    public int a(b b2) {
        int n2;
        for (n2 = 0; n2 < this.d; ++n2) {
            if (this.a[n2] != b2) continue;
            return n2;
        }
        if ((n2 = this.d++) < this.a.length) {
            this.a[n2] = b2;
            return n2;
        }
        return this.b.a(this.c + 1, b2);
    }

    @Override
    public b a(int n2) {
        return n2 >= 0 && n2 < this.d ? this.a[n2] : null;
    }

    @Override
    public void a(a a2) {
        this.d = a2.e();
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.a[i2] = (b)cn.w.a(a2.e());
        }
    }

    @Override
    public void b(a a2) {
        a2.d(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            a2.d(cn.w.a(this.a[i2]));
        }
    }

    @Override
    public int a() {
        int n2 = net.minecraft.x.a.a(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            n2 += net.minecraft.x.a.a(cn.w.a(this.a[i2]));
        }
        return n2;
    }
}

