/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.Collection;
import net.minecraft.q.a.y;
import net.minecraft.u.b.u;
import net.minecraft.x.p;

public class a
implements p {
    private int a;
    private byte b;
    private boolean c;
    private u[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte[] i;

    public a() {
    }

    public a(int n2, byte by2, boolean bl2, Collection collection, byte[] arrby, int n3, int n4, int n5, int n6) {
        this.a = n2;
        this.b = by2;
        this.c = bl2;
        this.d = collection.toArray(new u[collection.size()]);
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.h = n6;
        this.i = new byte[n5 * n6];
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                this.i[i2 + i3 * n5] = arrby[n3 + i2 + (n4 + i3) * 128];
            }
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.E();
        this.c = a2.D();
        this.d = new u[a2.e()];
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            short s2 = a2.E();
            this.d[i2] = new u((byte)(s2 >> 4 & 0xF), a2.E(), a2.E(), (byte)(s2 & 0xF));
        }
        this.g = a2.F();
        if (this.g > 0) {
            this.h = a2.F();
            this.e = a2.F();
            this.f = a2.F();
            this.i = a2.a();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(this.b);
        a2.a(this.c);
        a2.d(this.d.length);
        u[] arru = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            u u2 = arru[i2];
            a2.B((u2.a() & 0xF) << 4 | u2.d() & 0xF);
            a2.B(u2.b());
            a2.B(u2.c());
        }
        a2.B(this.g);
        if (this.g > 0) {
            a2.B(this.h);
            a2.B(this.e);
            a2.B(this.f);
            a2.a(this.i);
        }
    }

    public void a(net.minecraft.x.d.a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public void a(y y2) {
        int n2;
        y2.e = this.b;
        y2.d = this.c;
        y2.h.clear();
        for (n2 = 0; n2 < this.d.length; ++n2) {
            u u2 = this.d[n2];
            y2.h.put("icon-" + n2, u2);
        }
        for (n2 = 0; n2 < this.g; ++n2) {
            for (int i2 = 0; i2 < this.h; ++i2) {
                y2.f[this.e + n2 + (this.f + i2) * 128] = this.i[n2 + i2 * this.g];
            }
        }
    }
}

