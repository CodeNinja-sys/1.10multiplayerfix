/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.List;
import net.minecraft.m.cu;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class cb
implements p {
    private int a;
    private cu[] b;

    public cb() {
    }

    public cb(int n2, List list) {
        this.a = n2;
        this.b = new cu[list.size()];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            cu cu2 = (cu)list.get(i2);
            this.b[i2] = cu2 == null ? null : cu2.j();
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.F();
        int n2 = a2.G();
        this.b = new cu[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b[i2] = a2.i();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.C(this.b.length);
        cu[] arrcu = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu cu2 = arrcu[i2];
            a2.a(cu2);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public cu[] b() {
        return this.b;
    }
}

