/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.m.a.g;
import net.minecraft.m.a.w;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.c;
import net.minecraft.r.h;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.bp;
import net.minecraft.u.d.l;
import net.minecraft.w.q;

public class o {
    protected static final Map a = sz.c();
    public static final List b = ov.a();
    public static final List c = ov.a();
    public static final List d = ov.a();
    public static final List e = ov.a();
    public static final k f = new h("stat.leaveGame", new l("stat.leaveGame", new Object[0])).h().i();
    public static final k g = new h("stat.playOneMinute", new l("stat.playOneMinute", new Object[0]), net.minecraft.r.k.h).h().i();
    public static final k h = new h("stat.timeSinceDeath", new l("stat.timeSinceDeath", new Object[0]), net.minecraft.r.k.h).h().i();
    public static final k i = new h("stat.sneakTime", new l("stat.sneakTime", new Object[0]), net.minecraft.r.k.h).h().i();
    public static final k j = new h("stat.walkOneCm", new l("stat.walkOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k k = new h("stat.crouchOneCm", new l("stat.crouchOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k l = new h("stat.sprintOneCm", new l("stat.sprintOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k m = new h("stat.swimOneCm", new l("stat.swimOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k n = new h("stat.fallOneCm", new l("stat.fallOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k o = new h("stat.climbOneCm", new l("stat.climbOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k p = new h("stat.flyOneCm", new l("stat.flyOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k q = new h("stat.diveOneCm", new l("stat.diveOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k r = new h("stat.minecartOneCm", new l("stat.minecartOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k s = new h("stat.boatOneCm", new l("stat.boatOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k t = new h("stat.pigOneCm", new l("stat.pigOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k u = new h("stat.horseOneCm", new l("stat.horseOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k v = new h("stat.aviateOneCm", new l("stat.aviateOneCm", new Object[0]), net.minecraft.r.k.i).h().i();
    public static final k w = new h("stat.jump", new l("stat.jump", new Object[0])).h().i();
    public static final k x = new h("stat.drop", new l("stat.drop", new Object[0])).h().i();
    public static final k y = new h("stat.damageDealt", new l("stat.damageDealt", new Object[0]), net.minecraft.r.k.j).i();
    public static final k z = new h("stat.damageTaken", new l("stat.damageTaken", new Object[0]), net.minecraft.r.k.j).i();
    public static final k A = new h("stat.deaths", new l("stat.deaths", new Object[0])).i();
    public static final k B = new h("stat.mobKills", new l("stat.mobKills", new Object[0])).i();
    public static final k C = new h("stat.animalsBred", new l("stat.animalsBred", new Object[0])).i();
    public static final k D = new h("stat.playerKills", new l("stat.playerKills", new Object[0])).i();
    public static final k E = new h("stat.fishCaught", new l("stat.fishCaught", new Object[0])).i();
    public static final k F = new h("stat.junkFished", new l("stat.junkFished", new Object[0])).i();
    public static final k G = new h("stat.treasureFished", new l("stat.treasureFished", new Object[0])).i();
    public static final k H = new h("stat.talkedToVillager", new l("stat.talkedToVillager", new Object[0])).i();
    public static final k I = new h("stat.tradedWithVillager", new l("stat.tradedWithVillager", new Object[0])).i();
    public static final k J = new h("stat.cakeSlicesEaten", new l("stat.cakeSlicesEaten", new Object[0])).i();
    public static final k K = new h("stat.cauldronFilled", new l("stat.cauldronFilled", new Object[0])).i();
    public static final k L = new h("stat.cauldronUsed", new l("stat.cauldronUsed", new Object[0])).i();
    public static final k M = new h("stat.armorCleaned", new l("stat.armorCleaned", new Object[0])).i();
    public static final k N = new h("stat.bannerCleaned", new l("stat.bannerCleaned", new Object[0])).i();
    public static final k O = new h("stat.brewingstandInteraction", new l("stat.brewingstandInteraction", new Object[0])).i();
    public static final k P = new h("stat.beaconInteraction", new l("stat.beaconInteraction", new Object[0])).i();
    public static final k Q = new h("stat.dropperInspected", new l("stat.dropperInspected", new Object[0])).i();
    public static final k R = new h("stat.hopperInspected", new l("stat.hopperInspected", new Object[0])).i();
    public static final k S = new h("stat.dispenserInspected", new l("stat.dispenserInspected", new Object[0])).i();
    public static final k T = new h("stat.noteblockPlayed", new l("stat.noteblockPlayed", new Object[0])).i();
    public static final k U = new h("stat.noteblockTuned", new l("stat.noteblockTuned", new Object[0])).i();
    public static final k V = new h("stat.flowerPotted", new l("stat.flowerPotted", new Object[0])).i();
    public static final k W = new h("stat.trappedChestTriggered", new l("stat.trappedChestTriggered", new Object[0])).i();
    public static final k X = new h("stat.enderchestOpened", new l("stat.enderchestOpened", new Object[0])).i();
    public static final k Y = new h("stat.itemEnchanted", new l("stat.itemEnchanted", new Object[0])).i();
    public static final k Z = new h("stat.recordPlayed", new l("stat.recordPlayed", new Object[0])).i();
    public static final k aa = new h("stat.furnaceInteraction", new l("stat.furnaceInteraction", new Object[0])).i();
    public static final k ab = new h("stat.craftingTableInteraction", new l("stat.workbenchInteraction", new Object[0])).i();
    public static final k ac = new h("stat.chestOpened", new l("stat.chestOpened", new Object[0])).i();
    public static final k ad = new h("stat.sleepInBed", new l("stat.sleepInBed", new Object[0])).i();
    private static final k[] ae = new k[4096];
    private static final k[] af = new k[32000];
    private static final k[] ag = new k[32000];
    private static final k[] ah = new k[32000];
    private static final k[] ai = new k[32000];
    private static final k[] aj = new k[32000];

    public static k a(cn cn2) {
        return ae[cn.c(cn2)];
    }

    public static k a(cg cg2) {
        return af[cg.a(cg2)];
    }

    public static k b(cg cg2) {
        return ag[cg.a(cg2)];
    }

    public static k c(cg cg2) {
        return ah[cg.a(cg2)];
    }

    public static k d(cg cg2) {
        return ai[cg.a(cg2)];
    }

    public static k e(cg cg2) {
        return aj[cg.a(cg2)];
    }

    public static void a() {
        net.minecraft.r.o.c();
        net.minecraft.r.o.d();
        net.minecraft.r.o.e();
        net.minecraft.r.o.b();
        net.minecraft.r.o.f();
        net.minecraft.r.j.a();
        net.minecraft.w.h.a();
    }

    private static void b() {
        HashSet hashSet = aad.a();
        for (Object object : net.minecraft.m.a.g.a().b()) {
            if (object.b() == null) continue;
            hashSet.add(object.b().a());
        }
        for (Object object : net.minecraft.m.a.w.a().b().values()) {
            hashSet.add(((cu)object).a());
        }
        for (Object object : hashSet) {
            if (object == null) continue;
            int n2 = cg.a((cg)object);
            String string = net.minecraft.r.o.f((cg)object);
            if (string == null) continue;
            net.minecraft.r.o.af[n2] = new c("stat.craftItem.", string, new l("stat.craftItem", new cu((cg)object).B()), (cg)object).i();
        }
        net.minecraft.r.o.a(af);
    }

    private static void c() {
        for (cn cn2 : cn.v) {
            cg cg2 = cg.a(cn2);
            if (cg2 == null) continue;
            int n2 = cn.c(cn2);
            String string = net.minecraft.r.o.f(cg2);
            if (string == null || !cn2.q()) continue;
            net.minecraft.r.o.ae[n2] = new c("stat.mineBlock.", string, new l("stat.mineBlock", new cu(cn2).B()), cg2).i();
            e.add((c)ae[n2]);
        }
        net.minecraft.r.o.a(ae);
    }

    private static void d() {
        for (cg cg2 : cg.e) {
            if (cg2 == null) continue;
            int n2 = cg.a(cg2);
            String string = net.minecraft.r.o.f(cg2);
            if (string == null) continue;
            net.minecraft.r.o.ag[n2] = new c("stat.useItem.", string, new l("stat.useItem", new cu(cg2).B()), cg2).i();
            if (cg2 instanceof ar) continue;
            d.add((c)ag[n2]);
        }
        net.minecraft.r.o.a(ag);
    }

    private static void e() {
        for (cg cg2 : cg.e) {
            if (cg2 == null) continue;
            int n2 = cg.a(cg2);
            String string = net.minecraft.r.o.f(cg2);
            if (string == null || !cg2.l()) continue;
            net.minecraft.r.o.ah[n2] = new c("stat.breakItem.", string, new l("stat.breakItem", new cu(cg2).B()), cg2).i();
        }
        net.minecraft.r.o.a(ah);
    }

    private static void f() {
        for (cg cg2 : cg.e) {
            if (cg2 == null) continue;
            int n2 = cg.a(cg2);
            String string = net.minecraft.r.o.f(cg2);
            if (string == null) continue;
            net.minecraft.r.o.ai[n2] = new c("stat.pickup.", string, new l("stat.pickup", new cu(cg2).B()), cg2).i();
            net.minecraft.r.o.aj[n2] = new c("stat.drop.", string, new l("stat.drop", new cu(cg2).B()), cg2).i();
        }
        net.minecraft.r.o.a(ah);
    }

    private static String f(cg cg2) {
        bp bp2 = (bp)cg.e.b(cg2);
        return bp2 != null ? bp2.toString().replace(':', '.') : null;
    }

    private static void a(k[] arrk) {
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.j, net.minecraft.a.p.i);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.l, net.minecraft.a.p.k);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.aZ, net.minecraft.a.p.aU);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.am, net.minecraft.a.p.al);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.aD, net.minecraft.a.p.aC);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.bc, net.minecraft.a.p.bb);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.ck, net.minecraft.a.p.cj);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.aF, net.minecraft.a.p.aE);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.bK, net.minecraft.a.p.bJ);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.T, net.minecraft.a.p.U);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.bL, net.minecraft.a.p.bM);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.cO, net.minecraft.a.p.cP);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.c, net.minecraft.a.p.d);
        net.minecraft.r.o.a(arrk, net.minecraft.a.p.ak, net.minecraft.a.p.d);
    }

    private static void a(k[] arrk, cn cn2, cn cn3) {
        int n2 = cn.c(cn2);
        int n3 = cn.c(cn3);
        if (arrk[n2] != null && arrk[n3] == null) {
            arrk[n3] = arrk[n2];
        } else {
            b.remove(arrk[n2]);
            e.remove(arrk[n2]);
            c.remove(arrk[n2]);
            arrk[n2] = arrk[n3];
        }
    }

    public static k a(q q2) {
        return q2.a == null ? null : new k("stat.killEntity." + q2.a, new l("stat.entityKill", new l("entity." + q2.a + ".name", new Object[0]))).i();
    }

    public static k b(q q2) {
        return q2.a == null ? null : new k("stat.entityKilledBy." + q2.a, new l("stat.entityKilledBy", new l("entity." + q2.a + ".name", new Object[0]))).i();
    }

    public static k a(String string) {
        return (k)a.get(string);
    }
}

