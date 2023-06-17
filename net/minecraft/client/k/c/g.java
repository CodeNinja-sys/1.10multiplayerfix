/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c;

import com.c.a.e;
import net.minecraft.client.g.bd;
import net.minecraft.client.h.a;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.bp;
import net.minecraft.u.d.k;
import net.minecraft.x.d.a.i;

public class g
implements f {
    private final e a;
    private final bp b;

    public g(e e2) {
        this.a = e2;
        this.b = net.minecraft.client.h.a.a(e2.b());
        net.minecraft.client.h.a.a(this.b, e2.b());
    }

    @Override
    public void a(j j2) {
        r.z().v().a(new i(this.a.a()));
    }

    @Override
    public net.minecraft.u.d.a cu_() {
        return new k(this.a.b());
    }

    @Override
    public void a(float f2, int n2) {
        r.z().N().a(this.b);
        bd.c(1.0f, 1.0f, 1.0f, (float)n2 / 255.0f);
        de.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        de.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean cv_() {
        return true;
    }
}

