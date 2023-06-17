/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.w.n;

class bh
implements cm {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;

    bh(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public boolean a(n n2) {
        if (n2 == null) {
            return false;
        }
        int n3 = net.minecraft.u.b.n.b(net.minecraft.u.b.n.d(n2.bb));
        return this.a > this.b ? n3 >= this.a || n3 <= this.b : n3 >= this.a && n3 <= this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

