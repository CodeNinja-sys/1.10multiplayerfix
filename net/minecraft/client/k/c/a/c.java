/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.c.a;

import com.a.a.d.ov;
import java.util.List;
import java.util.Random;
import net.minecraft.client.f.z;
import net.minecraft.client.g.bd;
import net.minecraft.client.h.a;
import net.minecraft.client.k.c.a.b;
import net.minecraft.client.k.c.a.d;
import net.minecraft.client.k.c.f;
import net.minecraft.client.k.c.j;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.de;
import net.minecraft.client.r;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.k;

class c
implements f {
    private final net.minecraft.j.d b;
    private final bp c;
    private final List d;
    final /* synthetic */ d a;

    public c(d d2, net.minecraft.j.d d3) {
        this.a = d2;
        this.b = d3;
        this.d = ov.a();
        for (String string : d3.c()) {
            net.minecraft.client.l.r r2 = r.z().v().a(string);
            if (r2 == null) continue;
            this.d.add(r2);
        }
        if (this.d.isEmpty()) {
            this.c = z.a();
        } else {
            String string;
            string = ((net.minecraft.client.l.r)this.d.get(new Random().nextInt(this.d.size()))).a().b();
            this.c = net.minecraft.client.h.a.a(string);
            net.minecraft.client.h.a.a(this.c, string);
        }
    }

    @Override
    public void a(j j2) {
        j2.a(new b(this.d));
    }

    @Override
    public net.minecraft.u.d.a cu_() {
        return new k(this.b.b());
    }

    @Override
    public void a(float f2, int n2) {
        int n3 = -1;
        String string = ce.b(this.b.d());
        if (string.length() >= 2) {
            n3 = r.z().m.b(string.charAt(1));
        }
        if (n3 >= 0) {
            float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n3 & 0xFF) / 255.0f;
            de.a(1, 1, 15, 15, n.b(f3 * f2, f4 * f2, f5 * f2) | n2 << 24);
        }
        r.z().N().a(this.c);
        bd.c(f2, f2, f2, (float)n2 / 255.0f);
        de.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        de.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean cv_() {
        return !this.d.isEmpty();
    }
}

