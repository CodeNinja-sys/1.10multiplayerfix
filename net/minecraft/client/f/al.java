/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import net.minecraft.client.f.ad;
import net.minecraft.client.f.i;

public class al
extends ad {
    private final i c;

    public al(net.minecraft.client.k.i i2, i i3) {
        super(i2);
        this.c = i3;
    }

    @Override
    protected void d() {
        this.c.a(this.a.N());
    }

    @Override
    protected int a() {
        return this.c.f();
    }

    @Override
    protected String b() {
        return this.c.e();
    }

    @Override
    protected String c() {
        return this.c.d();
    }

    public i k() {
        return this.c;
    }
}

