/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.n.a.ci;
import net.minecraft.client.i.a;
import net.minecraft.client.i.f;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cc;
import net.minecraft.client.l.g;
import net.minecraft.client.l.k;
import net.minecraft.client.r;
import net.minecraft.x.d.a.e;
import net.minecraft.x.d.a.u;

class j
implements bu {
    final /* synthetic */ k a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    j(k k2, String string, String string2) {
        this.a = k2;
        this.b = string;
        this.c = string2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        g.a(k.a(this.a), r.z());
        a a2 = g.a(k.a(this.a)).C();
        if (bl2) {
            if (a2 != null) {
                a2.a(f.a);
            }
            g.b(k.a(this.a)).a(new e(u.d));
            ci.a(g.a(k.a(this.a)).P().a(this.b, this.c), g.c(k.a(this.a)));
        } else {
            if (a2 != null) {
                a2.a(f.b);
            }
            g.b(k.a(this.a)).a(new e(u.b));
        }
        net.minecraft.client.i.j.b(a2);
        g.a(k.a(this.a)).a((cc)null);
    }
}

