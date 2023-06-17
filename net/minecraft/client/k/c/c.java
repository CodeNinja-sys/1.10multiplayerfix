/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c;

import net.minecraft.client.k.ay;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

class c
implements f {
    private c() {
    }

    @Override
    public void a(j j2) {
        j2.d();
    }

    @Override
    public a cu_() {
        return new k("Close menu");
    }

    @Override
    public void a(float f2, int n2) {
        r.z().N().a(ay.a);
        de.a(0, 0, 128.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean cv_() {
        return true;
    }

    /* synthetic */ c(c c2) {
        this();
    }
}

