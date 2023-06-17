/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.i;
import net.minecraft.s.r;
import net.minecraft.s.v;

class j
extends r {
    final /* synthetic */ i a;

    public j(i i2) {
        this.a = i2;
        super(i2.r(), i2.s(), 32, i2.s() - 64, 36);
    }

    @Override
    public int a() {
        return i.a((i)this.a).e.size();
    }

    @Override
    public void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    public boolean a(int n2) {
        return false;
    }

    @Override
    public int b() {
        return this.a() * 36;
    }

    @Override
    public void c() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, v v2, int n6, int n7) {
        String string = (String)i.b(this.a).get(n2);
        this.a.b(string, this.d() / 2 - 40, n4, 0xA0A0A0);
        String string2 = (String)i.a((i)this.a).e.get(string);
        this.a.b(i.a(this.a, string, string2), this.d() / 2 - 40, n4 + 12, 0xFFFFFF);
    }
}

