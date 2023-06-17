/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.j;

public class n
implements bo {
    private final String b;
    private final int c;
    final /* synthetic */ j a;

    public n(j j2, String string) {
        this.a = j2;
        this.b = u.a(string, new Object[0]);
        this.c = j.a((j)j2).m.a(this.b);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        j.a((j)this.a).m.a(this.b, j.a((j)this.a).o.p / 2 - this.c / 2, n4 + n6 - j.a((j)this.a).m.a - 1, 0xFFFFFF);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }
}

