/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class bpa {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static final List e;
    public static final box f;
    public static final box g;
    public static final box h;
    public static final box i;
    public static final box j;
    public static final box k;
    public static final box l;
    public static final box m;
    public static final box n;
    public static final box o;
    public static final box p;
    public static final box q;
    public static final box r;
    public static final box s;
    public static final box t;
    public static final box u;
    public static final box v;
    public static final box w;
    public static final box x;
    public static final box y;
    public static final box z;
    public static final box A;
    public static final box B;
    public static final box C;
    public static final box D;
    public static final box E;
    public static final box F;
    public static final box G;
    public static final box H;
    public static final box I;
    public static final box J;
    public static final box K;
    public static final box L;
    public static final box M;

    public static void a() {
    }

    static {
        e = ov.a();
        f = new box("achievement.openInventory", "openInventory", 0, 0, hp.aS, null).b().d();
        g = new box("achievement.mineWood", "mineWood", 2, 1, blg.r, f).d();
        h = new box("achievement.buildWorkBench", "buildWorkBench", 4, -1, blg.ai, g).d();
        i = new box("achievement.buildPickaxe", "buildPickaxe", 4, 2, hp.q, h).d();
        j = new box("achievement.buildFurnace", "buildFurnace", 3, 4, blg.al, i).d();
        k = new box("achievement.acquireIron", "acquireIron", 1, 4, hp.l, j).d();
        l = new box("achievement.buildHoe", "buildHoe", 2, -3, hp.K, h).d();
        m = new box("achievement.makeBread", "makeBread", -1, -3, hp.R, l).d();
        n = new box("achievement.bakeCake", "bakeCake", 0, -5, hp.bg, l).d();
        o = new box("achievement.buildBetterPickaxe", "buildBetterPickaxe", 6, 2, hp.u, i).d();
        p = new box("achievement.cookFish", "cookFish", 2, 6, hp.bc, j).d();
        q = new box("achievement.onARail", "onARail", 2, 3, blg.av, k).c().d();
        r = new box("achievement.buildSword", "buildSword", 6, -1, hp.o, h).d();
        s = new box("achievement.killEnemy", "killEnemy", 8, -1, hp.be, r).d();
        t = new box("achievement.killCow", "killCow", 7, -3, hp.aM, r).d();
        u = new box("achievement.flyPig", "flyPig", 9, -3, hp.aC, t).c().d();
        v = new box("achievement.snipeSkeleton", "snipeSkeleton", 7, 0, hp.f, s).c().d();
        w = new box("achievement.diamonds", "diamonds", -1, 5, blg.ag, k).d();
        x = new box("achievement.diamondsToYou", "diamondsToYou", -1, 2, hp.k, w).d();
        y = new box("achievement.portal", "portal", -1, 7, blg.Z, w).d();
        z = new box("achievement.ghast", "ghast", -4, 8, hp.bD, y).c().d();
        A = new box("achievement.blazeRod", "blazeRod", 0, 9, hp.bC, y).d();
        B = new box("achievement.potion", "potion", 2, 8, hp.bG, A).d();
        C = new box("achievement.theEnd", "theEnd", 3, 10, hp.bR, A).c().d();
        D = new box("achievement.theEnd2", "theEnd2", 4, 13, blg.bI, C).c().d();
        E = new box("achievement.enchantments", "enchantments", -4, 4, blg.bC, w).d();
        F = new box("achievement.overkill", "overkill", -4, 1, hp.w, E).c().d();
        G = new box("achievement.bookcase", "bookcase", -3, 6, blg.X, E).d();
        H = new box("achievement.breedCow", "breedCow", 7, -5, hp.Q, t).d();
        I = new box("achievement.spawnWither", "spawnWither", 7, 12, new bhl(hp.ch, 1, 1), D).d();
        J = new box("achievement.killWither", "killWither", 7, 10, hp.cj, I).d();
        K = new box("achievement.fullBeacon", "fullBeacon", 7, 8, blg.bY, J).c().d();
        L = new box("achievement.exploreAllBiomes", "exploreAllBiomes", 4, 8, hp.ah, C).a(cav.class).c().d();
        M = new box("achievement.overpowered", "overpowered", 6, 4, new bhl(hp.aq, 1, 1), o).c().d();
    }
}

