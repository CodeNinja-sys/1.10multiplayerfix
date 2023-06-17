/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.UUID;

public class bfv {
    public static final apg a = new apg();
    private final Map b = sz.c();
    private final boolean c;
    private final int d;
    private String e = "";
    private int f = -1;
    private double g;
    private boolean h;

    public static bfv a(int n2) {
        return (bfv)a.a(n2);
    }

    public static int a(bfv bfv2) {
        return a.a(bfv2);
    }

    public static bfv a(String string) {
        return (bfv)a.c(new bpx(string));
    }

    protected bfv(boolean bl2, int n2) {
        this.c = bl2;
        this.g = bl2 ? 0.5 : 1.0;
        this.d = n2;
    }

    protected bfv a(int n2, int n3) {
        this.f = n2 + n3 * 8;
        return this;
    }

    public void a(bga bga2, int n2) {
        if (this == ake.j) {
            if (bga2.bh() < bga2.bo()) {
                bga2.b_(1.0f);
            }
        } else if (this == ake.s) {
            if (bga2.bh() > 1.0f) {
                bga2.a(ahy.n, 1.0f);
            }
        } else if (this == ake.t) {
            bga2.a(ahy.o, 1.0f);
        } else if (this == ake.q && bga2 instanceof bdl) {
            ((bdl)bga2).g(0.025f * (float)(n2 + 1));
        } else if (this == ake.w && bga2 instanceof bdl) {
            if (!bga2.aQ.C) {
                ((bdl)bga2).aE().a(n2 + 1, 1.0f);
            }
        } else if (this == ake.f && !bga2.bg() || this == ake.g && bga2.bg()) {
            bga2.b_((float)Math.max(4 << n2, 0));
        } else if (this == ake.g && !bga2.bg() || this == ake.f && bga2.bg()) {
            bga2.a(ahy.n, (float)(6 << n2));
        }
    }

    public void a(cpk cpk2, cpk cpk3, bga bga2, int n2, double d2) {
        if (this == ake.f && !bga2.bg() || this == ake.g && bga2.bg()) {
            int n3 = (int)(d2 * (double)(4 << n2) + 0.5);
            bga2.b_((float)n3);
        } else if (this == ake.g && !bga2.bg() || this == ake.f && bga2.bg()) {
            int n4 = (int)(d2 * (double)(6 << n2) + 0.5);
            if (cpk2 == null) {
                bga2.a(ahy.n, (float)n4);
            } else {
                bga2.a(ahy.b(cpk2, cpk3), (float)n4);
            }
        }
    }

    public boolean b(int n2, int n3) {
        if (this == ake.j) {
            int n4 = 50 >> n3;
            if (n4 > 0) {
                return n2 % n4 == 0;
            }
            return true;
        }
        if (this == ake.s) {
            int n5 = 25 >> n3;
            if (n5 > 0) {
                return n2 % n5 == 0;
            }
            return true;
        }
        if (this == ake.t) {
            int n6 = 40 >> n3;
            if (n6 > 0) {
                return n2 % n6 == 0;
            }
            return true;
        }
        return this == ake.q;
    }

    public boolean a() {
        return false;
    }

    public bfv b(String string) {
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

    public static String a(cko cko2, float f2) {
        if (cko2.g()) {
            return "**:**";
        }
        int n2 = cmk.d((float)cko2.b() * f2);
        return aco.a(n2);
    }

    protected bfv a(double d2) {
        this.g = d2;
        return this;
    }

    public int f() {
        return this.d;
    }

    public bfv a(cmb cmb2, String string, double d2, int n2) {
        cs cs2 = new cs(UUID.fromString(string), this.b(), d2, n2);
        this.b.put(cmb2, cs2);
        return this;
    }

    public Map g() {
        return this.b;
    }

    public void a(bga bga2, anu anu2, int n2) {
        for (Map.Entry entry : this.b.entrySet()) {
            cp cp2 = anu2.d((cmb)entry.getKey());
            if (cp2 == null) continue;
            cp2.c((cs)entry.getValue());
        }
    }

    public void b(bga bga2, anu anu2, int n2) {
        for (Map.Entry entry : this.b.entrySet()) {
            cp cp2 = anu2.d((cmb)entry.getKey());
            if (cp2 == null) continue;
            cs cs2 = (cs)entry.getValue();
            cp2.c(cs2);
            cp2.b(new cs(cs2.a(), this.b() + " " + n2, this.a(n2, cs2), cs2.c()));
        }
    }

    public double a(int n2, cs cs2) {
        return cs2.d() * (double)(n2 + 1);
    }

    public boolean h() {
        return this.h;
    }

    public bfv i() {
        this.h = true;
        return this;
    }

    public static void j() {
        a.a(1, new bpx("speed"), new bfv(false, 8171462).b("effect.moveSpeed").a(0, 0).a(cgz.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2).i());
        a.a(2, new bpx("slowness"), new bfv(true, 5926017).b("effect.moveSlowdown").a(1, 0).a(cgz.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2));
        a.a(3, new bpx("haste"), new bfv(false, 14270531).b("effect.digSpeed").a(2, 0).a(1.5).i().a(cgz.f, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1f, 2));
        a.a(4, new bpx("mining_fatigue"), new bfv(true, 4866583).b("effect.digSlowDown").a(3, 0).a(cgz.f, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1f, 2));
        a.a(5, new bpx("strength"), new bjk(false, 9643043, 3.0).b("effect.damageBoost").a(4, 0).a(cgz.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, 0).i());
        a.a(6, new bpx("instant_health"), new bgz(false, 16262179).b("effect.heal").i());
        a.a(7, new bpx("instant_damage"), new bgz(true, 4393481).b("effect.harm").i());
        a.a(8, new bpx("jump_boost"), new bfv(false, 2293580).b("effect.jump").a(2, 1).i());
        a.a(9, new bpx("nausea"), new bfv(true, 5578058).b("effect.confusion").a(3, 1).a(0.25));
        a.a(10, new bpx("regeneration"), new bfv(false, 13458603).b("effect.regeneration").a(7, 0).a(0.25).i());
        a.a(11, new bpx("resistance"), new bfv(false, 10044730).b("effect.resistance").a(6, 1).i());
        a.a(12, new bpx("fire_resistance"), new bfv(false, 14981690).b("effect.fireResistance").a(7, 1).i());
        a.a(13, new bpx("water_breathing"), new bfv(false, 3035801).b("effect.waterBreathing").a(0, 2).i());
        a.a(14, new bpx("invisibility"), new bfv(false, 8356754).b("effect.invisibility").a(0, 1).i());
        a.a(15, new bpx("blindness"), new bfv(true, 2039587).b("effect.blindness").a(5, 1).a(0.25));
        a.a(16, new bpx("night_vision"), new bfv(false, 0x1F1FA1).b("effect.nightVision").a(4, 1).i());
        a.a(17, new bpx("hunger"), new bfv(true, 5797459).b("effect.hunger").a(1, 1));
        a.a(18, new bpx("weakness"), new bjk(true, 0x484D48, -4.0).b("effect.weakness").a(5, 0).a(cgz.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, 0));
        a.a(19, new bpx("poison"), new bfv(true, 5149489).b("effect.poison").a(6, 0).a(0.25));
        a.a(20, new bpx("wither"), new bfv(true, 3484199).b("effect.wither").a(1, 2).a(0.25));
        a.a(21, new bpx("health_boost"), new cpi(false, 16284963).b("effect.healthBoost").a(7, 2).a(cgz.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0).i());
        a.a(22, new bpx("absorption"), new bgw(false, 0x2552A5).b("effect.absorption").a(2, 2).i());
        a.a(23, new bpx("saturation"), new bgz(false, 16262179).b("effect.saturation").i());
        a.a(24, new bpx("glowing"), new bfv(false, 9740385).b("effect.glowing").a(4, 2));
        a.a(25, new bpx("levitation"), new bfv(true, 0xCEFFFF).b("effect.levitation").a(3, 2));
        a.a(26, new bpx("luck"), new bfv(false, 0x339900).b("effect.luck").a(5, 2).i().a(cgz.i, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, 0));
        a.a(27, new bpx("unluck"), new bfv(true, 12624973).b("effect.unluck").a(6, 2).a(cgz.i, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, 0));
    }
}

