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

class e
implements f {
    private final int a;
    private final boolean b;

    public e(int n2, boolean bl2) {
        this.a = n2;
        this.b = bl2;
    }

    @Override
    public void a(j j2) {
        j.a(j2, this.a);
    }

    @Override
    public a cu_() {
        return this.a < 0 ? new k("Previous Page") : new k("Next Page");
    }

    @Override
    public void a(float f2, int n2) {
        r.z().N().a(ay.a);
        if (this.a < 0) {
            de.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        } else {
            de.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean cv_() {
        return this.b;
    }
}

