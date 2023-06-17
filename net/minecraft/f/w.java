/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.f.ap;
import net.minecraft.f.l;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.x.d.b.j;

public class w
extends ap {
    private int a;
    private q b;
    private boolean c;
    private List d;
    private List e;
    private String f;

    public void a(cu cu2) {
        this.b = null;
        if (cu2.n() && cu2.o().b("BlockEntityTag", 10)) {
            e e2 = cu2.o().o("BlockEntityTag");
            if (e2.e("Patterns")) {
                this.b = e2.c("Patterns", 10).f();
            }
            this.a = e2.b("Base", 99) ? e2.h("Base") : cu2.h() & 0xF;
        } else {
            this.a = cu2.h() & 0xF;
        }
        this.d = null;
        this.e = null;
        this.f = "";
        this.c = true;
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        w.a(e2, this.a, this.b);
        return e2;
    }

    public static void a(e e2, int n2, q q2) {
        e2.a("Base", n2);
        if (q2 != null) {
            e2.a("Patterns", q2);
        }
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = e2.h("Base");
        this.b = e2.c("Patterns", 10);
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = true;
    }

    @Override
    public j bJ_() {
        return new j(this.l, 6, this.d());
    }

    @Override
    public e d() {
        return this.a(new e());
    }

    public int b() {
        return this.a;
    }

    public static int b(cu cu2) {
        e e2 = cu2.a("BlockEntityTag", false);
        return e2 != null && e2.e("Base") ? e2.h("Base") : cu2.h();
    }

    public static int c(cu cu2) {
        e e2 = cu2.a("BlockEntityTag", false);
        return e2 != null && e2.e("Patterns") ? e2.c("Patterns", 10).e() : 0;
    }

    public List g() {
        this.k();
        return this.d;
    }

    public q h() {
        return this.b;
    }

    public List i() {
        this.k();
        return this.e;
    }

    public String j() {
        this.k();
        return this.f;
    }

    private void k() {
        if (this.d == null || this.e == null || this.f == null) {
            if (!this.c) {
                this.f = "";
            } else {
                this.d = ov.a();
                this.e = ov.a();
                this.d.add(net.minecraft.f.l.a);
                this.e.add(cd.a(this.a));
                this.f = "b" + this.a;
                if (this.b != null) {
                    for (int i2 = 0; i2 < this.b.e(); ++i2) {
                        e e2 = this.b.b(i2);
                        l l2 = net.minecraft.f.l.a(e2.l("Pattern"));
                        if (l2 == null) continue;
                        this.d.add(l2);
                        int n2 = e2.h("Color");
                        this.e.add(cd.a(n2));
                        this.f = String.valueOf(this.f) + l2.b() + n2;
                    }
                }
            }
        }
    }

    public static void a(cu cu2, cd cd2) {
        e e2 = cu2.a("BlockEntityTag", true);
        e2.a("Base", cd2.c());
    }

    public static void d(cu cu2) {
        q q2;
        e e2 = cu2.a("BlockEntityTag", false);
        if (e2 != null && e2.b("Patterns", 9) && (q2 = e2.c("Patterns", 10)).e() > 0) {
            q2.a(q2.e() - 1);
            if (q2.c()) {
                cu2.o().q("BlockEntityTag");
                if (cu2.o().c()) {
                    cu2.d((e)null);
                }
            }
        }
    }
}

