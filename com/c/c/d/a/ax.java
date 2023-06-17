/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a;
import com.c.c.d.a.aw;
import com.c.c.d.e;
import java.util.Date;
import net.minecraft.s.l;
import net.minecraft.s.n;
import net.minecraft.s.o;
import net.minecraft.s.v;

class ax
extends o {
    final /* synthetic */ aw a;

    public ax(aw aw2) {
        this.a = aw2;
        super(aw2.r(), aw2.s(), e.a(0), aw2.s() - 40, 36);
    }

    @Override
    public int a() {
        return aw.a(this.a).size();
    }

    @Override
    public void a(int n2, boolean bl2, int n3, int n4) {
        aw.a(this.a, n2);
        aw.c(this.a).b(aw.b(this.a) >= 0 && aw.b(this.a) < this.a() && !((l)aw.a(this.a).get(aw.b(this.a))).d());
        if (bl2) {
            aw.d(this.a);
        }
    }

    @Override
    public boolean a(int n2) {
        return n2 == aw.b(this.a);
    }

    @Override
    public int b() {
        return aw.a(this.a).size() * 36;
    }

    @Override
    public void d() {
        this.a.p();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, v v2, int n6, int n7) {
        l l2 = (l)aw.a(this.a).get(n2);
        String string = l2.f();
        if (string == null || string.isEmpty()) {
            string = aw.e(this.a) + " " + (n2 + 1);
        }
        String string2 = l2.b();
        string2 = string2 + " (" + aw.f(this.a).format(new Date(l2.g()));
        string2 = string2 + ")";
        String string3 = "";
        if (l2.e()) {
            string3 = aw.g(this.a) + " " + string3;
        } else {
            string3 = aw.h(this.a)[l2.a()];
            if (l2.d()) {
                string3 = (Object)((Object)com.c.c.d.a.e) + n.f("mco.upload.hardcore") + (Object)((Object)com.c.c.d.a.v);
            }
            if (l2.c()) {
                string3 = string3 + ", " + n.f("selectWorld.cheats");
            }
        }
        this.a.b(string, n3 + 2, n4 + 1, 0xFFFFFF);
        this.a.b(string2, n3 + 2, n4 + 12, 0x808080);
        this.a.b(string3, n3 + 2, n4 + 12 + 10, 0x808080);
    }
}

