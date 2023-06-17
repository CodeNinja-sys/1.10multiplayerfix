/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c.a;

import com.a.a.d.ov;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.List;
import net.minecraft.client.k.ay;
import net.minecraft.client.k.c.a.e;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.g;
import net.minecraft.client.k.c.h;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.q.am;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

public class b
implements f,
h {
    private static final yd a = yd.a(new e());
    private final List b = ov.a();

    public b() {
        this(a.a(r.z().v().c()));
    }

    public b(Collection collection) {
        for (net.minecraft.client.l.r r2 : a.a(collection)) {
            if (r2.b() == am.e) continue;
            this.b.add(new g(r2.a()));
        }
    }

    @Override
    public List a() {
        return this.b;
    }

    @Override
    public a b() {
        return new k("Select a player to teleport to");
    }

    @Override
    public void a(j j2) {
        j2.a(this);
    }

    @Override
    public a cu_() {
        return new k("Teleport to player");
    }

    @Override
    public void a(float f2, int n2) {
        r.z().N().a(ay.a);
        de.a(0, 0, 0.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean cv_() {
        return !this.b.isEmpty();
    }
}

