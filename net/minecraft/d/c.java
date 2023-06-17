/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.d.sz;
import java.util.Map;
import java.util.UUID;
import net.minecraft.d.h;
import net.minecraft.d.i;
import net.minecraft.d.j;
import net.minecraft.d.k;
import net.minecraft.d.l;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.bw;
import net.minecraft.w.b.a.b;
import net.minecraft.w.b.a.f;
import net.minecraft.w.d;

public class c {
    public static final net.minecraft.u.c.c a = new net.minecraft.u.c.c();
    private final Map b = sz.c();
    private final boolean c;
    private final int d;
    private String e = "";
    private int f = -1;
    private double g;
    private boolean h;

    public static c a(int n2) {
        return (c)a.a(n2);
    }

    public static int a(c c2) {
        return a.d(c2);
    }

    public static c a(String string) {
        return (c)a.a(new bp(string));
    }

    protected c(boolean bl2, int n2) {
        this.c = bl2;
        this.g = bl2 ? 0.5 : 1.0;
        this.d = n2;
    }

    protected c a(int n2, int n3) {
        this.f = n2 + n3 * 8;
        return this;
    }

    public void a(net.minecraft.w.l l2, int n2) {
        if (this == net.minecraft.a.c.j) {
            if (l2.bo() < l2.bw()) {
                l2.a(1.0f);
            }
        } else if (this == net.minecraft.a.c.s) {
            if (l2.bo() > 1.0f) {
                l2.a(net.minecraft.u.n.n, 1.0f);
            }
        } else if (this == net.minecraft.a.c.t) {
            l2.a(net.minecraft.u.n.o, 1.0f);
        } else if (this == net.minecraft.a.c.q && l2 instanceof net.minecraft.w.a.b) {
            ((net.minecraft.w.a.b)l2).e(0.025f * (float)(n2 + 1));
        } else if (this == net.minecraft.a.c.w && l2 instanceof net.minecraft.w.a.b) {
            if (!l2.aQ.C) {
                ((net.minecraft.w.a.b)l2).ap().a(n2 + 1, 1.0f);
            }
        } else if (!(this == net.minecraft.a.c.f && !l2.bn() || this == net.minecraft.a.c.g && l2.bn())) {
            if (this == net.minecraft.a.c.g && !l2.bn() || this == net.minecraft.a.c.f && l2.bn()) {
                l2.a(net.minecraft.u.n.n, (float)(6 << n2));
            }
        } else {
            l2.a((float)Math.max(4 << n2, 0));
        }
    }

    public void a(net.minecraft.w.n n2, net.minecraft.w.n n3, net.minecraft.w.l l2, int n4, double d2) {
        if (!(this == net.minecraft.a.c.f && !l2.bn() || this == net.minecraft.a.c.g && l2.bn())) {
            if (this == net.minecraft.a.c.g && !l2.bn() || this == net.minecraft.a.c.f && l2.bn()) {
                int n5 = (int)(d2 * (double)(6 << n4) + 0.5);
                if (n2 == null) {
                    l2.a(net.minecraft.u.n.n, (float)n5);
                } else {
                    l2.a(net.minecraft.u.n.b(n2, n3), (float)n5);
                }
            }
        } else {
            int n6 = (int)(d2 * (double)(4 << n4) + 0.5);
            l2.a((float)n6);
        }
    }

    public boolean b(int n2, int n3) {
        if (this == net.minecraft.a.c.j) {
            int n4 = 50 >> n3;
            return n4 > 0 ? n2 % n4 == 0 : true;
        }
        if (this == net.minecraft.a.c.s) {
            int n5 = 25 >> n3;
            return n5 > 0 ? n2 % n5 == 0 : true;
        }
        if (this == net.minecraft.a.c.t) {
            int n6 = 40 >> n3;
            return n6 > 0 ? n2 % n6 == 0 : true;
        }
        return this == net.minecraft.a.c.q;
    }

    public boolean a() {
        return false;
    }

    public c b(String string) {
        this.e = string;
        return this;
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.f >= 0;
    }

    public int d() {
        return this.f;
    }

    public boolean e() {
        return this.c;
    }

    public static String a(j j2, float f2) {
        if (j2.g()) {
            return "**:**";
        }
        int n2 = n.d((float)j2.b() * f2);
        return bw.a(n2);
    }

    protected c a(double d2) {
        this.g = d2;
        return this;
    }

    public int f() {
        return this.d;
    }

    public c a(f f2, String string, double d2, int n2) {
        net.minecraft.w.b.a.h h2 = new net.minecraft.w.b.a.h(UUID.fromString(string), this.b(), d2, n2);
        this.b.put(f2, h2);
        return this;
    }

    public Map g() {
        return this.b;
    }

    public void a(net.minecraft.w.l l2, b b2, int n2) {
        for (Map.Entry entry : this.b.entrySet()) {
            net.minecraft.w.b.a.i i2 = b2.a((f)entry.getKey());
            if (i2 == null) continue;
            i2.c((net.minecraft.w.b.a.h)entry.getValue());
        }
    }

    public void b(net.minecraft.w.l l2, b b2, int n2) {
        for (Map.Entry entry : this.b.entrySet()) {
            net.minecraft.w.b.a.i i2 = b2.a((f)entry.getKey());
            if (i2 == null) continue;
            net.minecraft.w.b.a.h h2 = (net.minecraft.w.b.a.h)entry.getValue();
            i2.c(h2);
            i2.b(new net.minecraft.w.b.a.h(h2.a(), String.valueOf(this.b()) + " " + n2, this.a(n2, h2), h2.c()));
        }
    }

    public double a(int n2, net.minecraft.w.b.a.h h2) {
        return h2.d() * (double)(n2 + 1);
    }

    public boolean h() {
        return this.h;
    }

    public c i() {
        this.h = true;
        return this;
    }

    public static void j() {
        a.a(1, new bp("speed"), new c(false, 8171462).b("effect.moveSpeed").a(0, 0).a(net.minecraft.w.d.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2).i());
        a.a(2, new bp("slowness"), new c(true, 5926017).b("effect.moveSlowdown").a(1, 0).a(net.minecraft.w.d.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2));
        a.a(3, new bp("haste"), new c(false, 14270531).b("effect.digSpeed").a(2, 0).a(1.5).i().a(net.minecraft.w.d.f, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1f, 2));
        a.a(4, new bp("mining_fatigue"), new c(true, 4866583).b("effect.digSlowDown").a(3, 0).a(net.minecraft.w.d.f, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1f, 2));
        a.a(5, new bp("strength"), new k(false, 9643043, 3.0).b("effect.damageBoost").a(4, 0).a(net.minecraft.w.d.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, 0).i());
        a.a(6, new bp("instant_health"), new i(false, 16262179).b("effect.heal").i());
        a.a(7, new bp("instant_damage"), new i(true, 4393481).b("effect.harm").i());
        a.a(8, new bp("jump_boost"), new c(false, 2293580).b("effect.jump").a(2, 1).i());
        a.a(9, new bp("nausea"), new c(true, 5578058).b("effect.confusion").a(3, 1).a(0.25));
        a.a(10, new bp("regeneration"), new c(false, 13458603).b("effect.regeneration").a(7, 0).a(0.25).i());
        a.a(11, new bp("resistance"), new c(false, 10044730).b("effect.resistance").a(6, 1).i());
        a.a(12, new bp("fire_resistance"), new c(false, 14981690).b("effect.fireResistance").a(7, 1).i());
        a.a(13, new bp("water_breathing"), new c(false, 3035801).b("effect.waterBreathing").a(0, 2).i());
        a.a(14, new bp("invisibility"), new c(false, 8356754).b("effect.invisibility").a(0, 1).i());
        a.a(15, new bp("blindness"), new c(true, 2039587).b("effect.blindness").a(5, 1).a(0.25));
        a.a(16, new bp("night_vision"), new c(false, 0x1F1FA1).b("effect.nightVision").a(4, 1).i());
        a.a(17, new bp("hunger"), new c(true, 5797459).b("effect.hunger").a(1, 1));
        a.a(18, new bp("weakness"), new k(true, 0x484D48, -4.0).b("effect.weakness").a(5, 0).a(net.minecraft.w.d.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, 0));
        a.a(19, new bp("poison"), new c(true, 5149489).b("effect.poison").a(6, 0).a(0.25));
        a.a(20, new bp("wither"), new c(true, 3484199).b("effect.wither").a(1, 2).a(0.25));
        a.a(21, new bp("health_boost"), new l(false, 16284963).b("effect.healthBoost").a(7, 2).a(net.minecraft.w.d.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0).i());
        a.a(22, new bp("absorption"), new h(false, 0x2552A5).b("effect.absorption").a(2, 2).i());
        a.a(23, new bp("saturation"), new i(false, 16262179).b("effect.saturation").i());
        a.a(24, new bp("glowing"), new c(false, 9740385).b("effect.glowing").a(4, 2));
        a.a(25, new bp("levitation"), new c(true, 0xCEFFFF).b("effect.levitation").a(3, 2));
        a.a(26, new bp("luck"), new c(false, 0x339900).b("effect.luck").a(5, 2).i().a(net.minecraft.w.d.i, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, 0));
        a.a(27, new bp("unluck"), new c(true, 12624973).b("effect.unluck").a(6, 2).a(net.minecraft.w.d.i, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, 0));
    }
}

