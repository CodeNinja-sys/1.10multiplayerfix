/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.vi;
import java.util.List;
import java.util.UUID;
import net.minecraft.e.e;
import net.minecraft.g.en;
import net.minecraft.h.k;
import net.minecraft.m.br;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.z;
import net.minecraft.t.g;
import net.minecraft.t.i;
import net.minecraft.u.a;
import net.minecraft.u.aa;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.r;
import net.minecraft.w.a.b;
import net.minecraft.w.b.a.h;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.l;

public class dn
extends cg {
    private static final int[] n = new int[]{13, 15, 16, 11};
    private static final UUID[] o = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public static final String[] a = new String[]{"minecraft:items/empty_armor_slot_boots", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_helmet"};
    public static final i b = new z();
    public final k c;
    public final int d;
    public final float l;
    public final int m;
    private final br p;

    public static cu a(g g2, cu cu2) {
        net.minecraft.u.b.b b2 = g2.e().a((ad)((Object)g2.f().a(en.a)));
        List list = g2.a().a(l.class, new net.minecraft.u.b.a(b2), cn.a(r.e, (cm)new aa(cu2)));
        if (list.isEmpty()) {
            return null;
        }
        l l2 = (l)list.get(0);
        k k2 = net.minecraft.w.f.c(cu2);
        cu cu3 = cu2.j();
        cu3.b = 1;
        l2.a(k2, cu3);
        if (l2 instanceof f) {
            ((f)l2).a(k2, 2.0f);
        }
        --cu2.b;
        return cu2;
    }

    public dn(br br2, int n2, k k2) {
        this.p = br2;
        this.c = k2;
        this.m = n2;
        this.d = br2.b(k2);
        this.e(br2.a(k2));
        this.l = br2.e();
        this.i = 1;
        this.a(net.minecraft.v.d.j);
        en.c.a(this, b);
    }

    public k e() {
        return this.c;
    }

    @Override
    public int cx_() {
        return this.p.a();
    }

    public br g() {
        return this.p;
    }

    public boolean h(cu cu2) {
        if (this.p != br.a) {
            return false;
        }
        e e2 = cu2.o();
        return e2 != null && e2.b("display", 10) ? e2.o("display").b("color", 3) : false;
    }

    public int i(cu cu2) {
        e e2;
        if (this.p != br.a) {
            return 0xFFFFFF;
        }
        e e3 = cu2.o();
        if (e3 != null && (e2 = e3.o("display")) != null && e2.b("color", 3)) {
            return e2.h("color");
        }
        return 10511680;
    }

    public void k(cu cu2) {
        e e2;
        e e3;
        if (this.p == br.a && (e3 = cu2.o()) != null && (e2 = e3.o("display")).e("color")) {
            e2.q("color");
        }
    }

    public void a(cu cu2, int n2) {
        if (this.p != br.a) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        e e2 = cu2.o();
        if (e2 == null) {
            e2 = new e();
            cu2.d(e2);
        }
        e e3 = e2.o("display");
        if (!e2.b("display", 10)) {
            e2.a("display", e3);
        }
        e3.a("color", n2);
    }

    @Override
    public boolean a(cu cu2, cu cu3) {
        return this.p.c() == cu3.a() ? true : super.a(cu2, cu3);
    }

    @Override
    public a a(cu cu2, net.minecraft.q.k k2, b b2, ah ah2) {
        k k3 = net.minecraft.w.f.c(cu2);
        cu cu3 = b2.a(k3);
        if (cu3 == null) {
            b2.a(k3, cu2.j());
            cu2.b = 0;
            return new a(ab.a, cu2);
        }
        return new a(ab.c, cu2);
    }

    @Override
    public vi a(k k2) {
        vi vi2 = super.a(k2);
        if (k2 == this.c) {
            vi2.a(net.minecraft.w.d.g.b(), new h(o[k2.b()], "Armor modifier", this.d, 0));
            vi2.a(net.minecraft.w.d.h.b(), new h(o[k2.b()], "Armor toughness", this.l, 0));
        }
        return vi2;
    }

    static /* synthetic */ int[] t() {
        return n;
    }
}

