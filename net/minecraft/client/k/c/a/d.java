/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c.a;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.k.ay;
import net.minecraft.client.k.c.a.c;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.h;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

public class d
implements f,
h {
    private final List a = ov.a();

    public d() {
        r r2 = r.z();
        for (net.minecraft.j.d d2 : r2.h.Q().f()) {
            this.a.add(new c(this, d2));
        }
    }

    @Override
    public List a() {
        return this.a;
    }

    @Override
    public a b() {
        return new k("Select a team to teleport to");
    }

    @Override
    public void a(j j2) {
        j2.a(this);
    }

    @Override
    public a cu_() {
        return new k("Teleport to team member");
    }

    @Override
    public void a(float f2, int n2) {
        r.z().N().a(ay.a);
        de.a(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean cv_() {
        for (f f2 : this.a) {
            if (!f2.cv_()) continue;
            return true;
        }
        return false;
    }
}

