/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class bpv {
    protected static final Map a = sz.c();
    public static final List b = ov.a();
    public static final List c = ov.a();
    public static final List d = ov.a();
    public static final List e = ov.a();
    public static final cyd f = new ayv("stat.leaveGame", new du("stat.leaveGame", new Object[0])).i().aE_();
    public static final cyd g = new ayv("stat.playOneMinute", new du("stat.playOneMinute", new Object[0]), cyd.h).i().aE_();
    public static final cyd h = new ayv("stat.timeSinceDeath", new du("stat.timeSinceDeath", new Object[0]), cyd.h).i().aE_();
    public static final cyd i = new ayv("stat.sneakTime", new du("stat.sneakTime", new Object[0]), cyd.h).i().aE_();
    public static final cyd j = new ayv("stat.walkOneCm", new du("stat.walkOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd k = new ayv("stat.crouchOneCm", new du("stat.crouchOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd l = new ayv("stat.sprintOneCm", new du("stat.sprintOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd m = new ayv("stat.swimOneCm", new du("stat.swimOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd n = new ayv("stat.fallOneCm", new du("stat.fallOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd o = new ayv("stat.climbOneCm", new du("stat.climbOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd p = new ayv("stat.flyOneCm", new du("stat.flyOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd q = new ayv("stat.diveOneCm", new du("stat.diveOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd r = new ayv("stat.minecartOneCm", new du("stat.minecartOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd s = new ayv("stat.boatOneCm", new du("stat.boatOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd t = new ayv("stat.pigOneCm", new du("stat.pigOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd u = new ayv("stat.horseOneCm", new du("stat.horseOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd v = new ayv("stat.aviateOneCm", new du("stat.aviateOneCm", new Object[0]), cyd.i).i().aE_();
    public static final cyd w = new ayv("stat.jump", new du("stat.jump", new Object[0])).i().aE_();
    public static final cyd x = new ayv("stat.drop", new du("stat.drop", new Object[0])).i().aE_();
    public static final cyd y = new ayv("stat.damageDealt", new du("stat.damageDealt", new Object[0]), cyd.j).aE_();
    public static final cyd z = new ayv("stat.damageTaken", new du("stat.damageTaken", new Object[0]), cyd.j).aE_();
    public static final cyd A = new ayv("stat.deaths", new du("stat.deaths", new Object[0])).aE_();
    public static final cyd B = new ayv("stat.mobKills", new du("stat.mobKills", new Object[0])).aE_();
    public static final cyd C = new ayv("stat.animalsBred", new du("stat.animalsBred", new Object[0])).aE_();
    public static final cyd D = new ayv("stat.playerKills", new du("stat.playerKills", new Object[0])).aE_();
    public static final cyd E = new ayv("stat.fishCaught", new du("stat.fishCaught", new Object[0])).aE_();
    public static final cyd F = new ayv("stat.junkFished", new du("stat.junkFished", new Object[0])).aE_();
    public static final cyd G = new ayv("stat.treasureFished", new du("stat.treasureFished", new Object[0])).aE_();
    public static final cyd H = new ayv("stat.talkedToVillager", new du("stat.talkedToVillager", new Object[0])).aE_();
    public static final cyd I = new ayv("stat.tradedWithVillager", new du("stat.tradedWithVillager", new Object[0])).aE_();
    public static final cyd J = new ayv("stat.cakeSlicesEaten", new du("stat.cakeSlicesEaten", new Object[0])).aE_();
    public static final cyd K = new ayv("stat.cauldronFilled", new du("stat.cauldronFilled", new Object[0])).aE_();
    public static final cyd L = new ayv("stat.cauldronUsed", new du("stat.cauldronUsed", new Object[0])).aE_();
    public static final cyd M = new ayv("stat.armorCleaned", new du("stat.armorCleaned", new Object[0])).aE_();
    public static final cyd N = new ayv("stat.bannerCleaned", new du("stat.bannerCleaned", new Object[0])).aE_();
    public static final cyd O = new ayv("stat.brewingstandInteraction", new du("stat.brewingstandInteraction", new Object[0])).aE_();
    public static final cyd P = new ayv("stat.beaconInteraction", new du("stat.beaconInteraction", new Object[0])).aE_();
    public static final cyd Q = new ayv("stat.dropperInspected", new du("stat.dropperInspected", new Object[0])).aE_();
    public static final cyd R = new ayv("stat.hopperInspected", new du("stat.hopperInspected", new Object[0])).aE_();
    public static final cyd S = new ayv("stat.dispenserInspected", new du("stat.dispenserInspected", new Object[0])).aE_();
    public static final cyd T = new ayv("stat.noteblockPlayed", new du("stat.noteblockPlayed", new Object[0])).aE_();
    public static final cyd U = new ayv("stat.noteblockTuned", new du("stat.noteblockTuned", new Object[0])).aE_();
    public static final cyd V = new ayv("stat.flowerPotted", new du("stat.flowerPotted", new Object[0])).aE_();
    public static final cyd W = new ayv("stat.trappedChestTriggered", new du("stat.trappedChestTriggered", new Object[0])).aE_();
    public static final cyd X = new ayv("stat.enderchestOpened", new du("stat.enderchestOpened", new Object[0])).aE_();
    public static final cyd Y = new ayv("stat.itemEnchanted", new du("stat.itemEnchanted", new Object[0])).aE_();
    public static final cyd Z = new ayv("stat.recordPlayed", new du("stat.recordPlayed", new Object[0])).aE_();
    public static final cyd aa = new ayv("stat.furnaceInteraction", new du("stat.furnaceInteraction", new Object[0])).aE_();
    public static final cyd ab = new ayv("stat.craftingTableInteraction", new du("stat.workbenchInteraction", new Object[0])).aE_();
    public static final cyd ac = new ayv("stat.chestOpened", new du("stat.chestOpened", new Object[0])).aE_();
    public static final cyd ad = new ayv("stat.sleepInBed", new du("stat.sleepInBed", new Object[0])).aE_();
    private static final cyd[] ae = new cyd[4096];
    private static final cyd[] af = new cyd[32000];
    private static final cyd[] ag = new cyd[32000];
    private static final cyd[] ah = new cyd[32000];
    private static final cyd[] ai = new cyd[32000];
    private static final cyd[] aj = new cyd[32000];

    public static cyd a(bfa bfa2) {
        return ae[bfa.c(bfa2)];
    }

    public static cyd a(azg azg2) {
        return af[azg.a(azg2)];
    }

    public static cyd b(azg azg2) {
        return ag[azg.a(azg2)];
    }

    public static cyd c(azg azg2) {
        return ah[azg.a(azg2)];
    }

    public static cyd d(azg azg2) {
        return ai[azg.a(azg2)];
    }

    public static cyd e(azg azg2) {
        return aj[azg.a(azg2)];
    }

    public static void a() {
        bpv.c();
        bpv.d();
        bpv.e();
        bpv.b();
        bpv.f();
        bpa.a();
        vb.a();
    }

    private static void b() {
        HashSet hashSet = aad.a();
        for (Object object : gx.a().b()) {
            if (object.b() == null) continue;
            hashSet.add(object.b().a());
        }
        for (Object object : gu.a().b().values()) {
            hashSet.add(((bhl)object).a());
        }
        for (Object object : hashSet) {
            if (object == null) continue;
            int n2 = azg.a((azg)object);
            String string = bpv.f((azg)object);
            if (string == null) continue;
            bpv.af[n2] = new va("stat.craftItem.", string, new du("stat.craftItem", new bhl((azg)object).B()), (azg)object).aE_();
        }
        bpv.a(af);
    }

    private static void c() {
        for (bfa bfa2 : bfa.v) {
            azg azg2 = azg.a(bfa2);
            if (azg2 == null) continue;
            int n2 = bfa.c(bfa2);
            String string = bpv.f(azg2);
            if (string == null || !bfa2.o()) continue;
            bpv.ae[n2] = new va("stat.mineBlock.", string, new du("stat.mineBlock", new bhl(bfa2).B()), azg2).aE_();
            e.add((va)ae[n2]);
        }
        bpv.a(ae);
    }

    private static void d() {
        for (azg azg2 : azg.g) {
            if (azg2 == null) continue;
            int n2 = azg.a(azg2);
            String string = bpv.f(azg2);
            if (string == null) continue;
            bpv.ag[n2] = new va("stat.useItem.", string, new du("stat.useItem", new bhl(azg2).B()), azg2).aE_();
            if (azg2 instanceof ge) continue;
            d.add((va)ag[n2]);
        }
        bpv.a(ag);
    }

    private static void e() {
        for (azg azg2 : azg.g) {
            if (azg2 == null) continue;
            int n2 = azg.a(azg2);
            String string = bpv.f(azg2);
            if (string == null || !azg2.l()) continue;
            bpv.ah[n2] = new va("stat.breakItem.", string, new du("stat.breakItem", new bhl(azg2).B()), azg2).aE_();
        }
        bpv.a(ah);
    }

    private static void f() {
        for (azg azg2 : azg.g) {
            if (azg2 == null) continue;
            int n2 = azg.a(azg2);
            String string = bpv.f(azg2);
            if (string == null) continue;
            bpv.ai[n2] = new va("stat.pickup.", string, new du("stat.pickup", new bhl(azg2).B()), azg2).aE_();
            bpv.aj[n2] = new va("stat.drop.", string, new du("stat.drop", new bhl(azg2).B()), azg2).aE_();
        }
        bpv.a(ah);
    }

    private static String f(azg azg2) {
        bpx bpx2 = (bpx)azg.g.b(azg2);
        if (bpx2 != null) {
            return bpx2.toString().replace(':', '.');
        }
        return null;
    }

    private static void a(cyd[] arrcyd) {
        bpv.a(arrcyd, blg.j, blg.i);
        bpv.a(arrcyd, blg.l, blg.k);
        bpv.a(arrcyd, blg.aZ, blg.aU);
        bpv.a(arrcyd, blg.am, blg.al);
        bpv.a(arrcyd, blg.aD, blg.aC);
        bpv.a(arrcyd, blg.bc, blg.bb);
        bpv.a(arrcyd, blg.ck, blg.cj);
        bpv.a(arrcyd, blg.aF, blg.aE);
        bpv.a(arrcyd, blg.bK, blg.bJ);
        bpv.a(arrcyd, blg.T, blg.U);
        bpv.a(arrcyd, blg.bL, blg.bM);
        bpv.a(arrcyd, blg.cO, blg.cP);
        bpv.a(arrcyd, blg.c, blg.d);
        bpv.a(arrcyd, blg.ak, blg.d);
    }

    private static void a(cyd[] arrcyd, bfa bfa2, bfa bfa3) {
        int n2 = bfa.c(bfa2);
        int n3 = bfa.c(bfa3);
        if (arrcyd[n2] != null && arrcyd[n3] == null) {
            arrcyd[n3] = arrcyd[n2];
            return;
        }
        b.remove(arrcyd[n2]);
        e.remove(arrcyd[n2]);
        c.remove(arrcyd[n2]);
        arrcyd[n2] = arrcyd[n3];
    }

    public static cyd a(qb qb2) {
        if (qb2.a == null) {
            return null;
        }
        return new cyd("stat.killEntity." + qb2.a, new du("stat.entityKill", new du("entity." + qb2.a + ".name", new Object[0]))).aE_();
    }

    public static cyd b(qb qb2) {
        if (qb2.a == null) {
            return null;
        }
        return new cyd("stat.entityKilledBy." + qb2.a, new du("stat.entityKilledBy", new du("entity." + qb2.a + ".name", new Object[0]))).aE_();
    }

    public static cyd a(String string) {
        return (cyd)a.get(string);
    }
}

