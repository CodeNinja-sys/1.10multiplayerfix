/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import net.minecraft.q.b.ao;
import net.minecraft.q.b.q;

public class b {
    public q[] a = new q[256];
    public int b;
    public int c;
    public long d;
    final /* synthetic */ ao e;

    public b(ao ao2, int n2, int n3) {
        this.e = ao2;
        this.b = n2;
        this.c = n3;
        ao.a(ao2).a(this.a, n2 << 4, n3 << 4, 16, 16, false);
    }

    public q a(int n2, int n3) {
        return this.a[n2 & 0xF | (n3 & 0xF) << 4];
    }
}

