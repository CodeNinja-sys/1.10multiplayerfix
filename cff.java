/*
 * Decompiled with CFR 0.150.
 */
public abstract class cff {
    public static final anr a;
    public static final anr b;
    public static final anr c;
    public static final anr d;
    public static final anr e;
    public static final anr f;
    public static final anr g;
    public static final anr h;
    public static final anr i;
    public static final anr j;
    public static final anr k;
    public static final anr l;
    public static final anr m;
    public static final anr n;
    public static final anr o;
    public static final anr p;
    public static final anr q;
    public static final anr r;
    public static final anr s;
    public static final anr t;
    public static final anr u;
    public static final anr v;
    public static final anr w;
    public static final anr x;
    public static final anr y;
    public static final anr z;
    public static final anr A;
    public static final anr B;
    public static final anr C;
    public static final anr D;
    public static final anr E;
    public static final anr F;
    public static final anr G;
    public static final anr H;
    public static final anr I;
    public static final anr J;
    public static final anr K;
    public static final anr L;
    public static final anr M;
    public static final anr N;
    public static final anr O;
    public static final anr P;
    public static final anr Q;
    public static final anr R;
    public static final anr S;
    public static final anr T;
    public static final anr U;
    public static final anr V;
    public static final anr W;
    public static final anr X;
    public static final anr Y;
    public static final anr Z;
    public static final anr aa;
    public static final anr ab;
    public static final anr ac;
    public static final anr ad;
    public static final anr ae;
    public static final anr af;
    public static final anr ag;
    public static final anr ah;
    public static final anr ai;
    public static final anr aj;
    public static final anr ak;

    private static anr a(String string) {
        anr anr2 = (anr)anr.w.c(new bpx(string));
        if (anr2 == null) {
            throw new IllegalStateException("Invalid Biome requested: " + string);
        }
        return anr2;
    }

    static {
        if (!bht.a()) {
            throw new RuntimeException("Accessed Biomes before Bootstrap!");
        }
        b = a = cff.a("ocean");
        c = cff.a("plains");
        d = cff.a("desert");
        e = cff.a("extreme_hills");
        f = cff.a("forest");
        g = cff.a("taiga");
        h = cff.a("swampland");
        i = cff.a("river");
        j = cff.a("hell");
        k = cff.a("sky");
        l = cff.a("frozen_ocean");
        m = cff.a("frozen_river");
        n = cff.a("ice_flats");
        o = cff.a("ice_mountains");
        p = cff.a("mushroom_island");
        q = cff.a("mushroom_island_shore");
        r = cff.a("beaches");
        s = cff.a("desert_hills");
        t = cff.a("forest_hills");
        u = cff.a("taiga_hills");
        v = cff.a("smaller_extreme_hills");
        w = cff.a("jungle");
        x = cff.a("jungle_hills");
        y = cff.a("jungle_edge");
        z = cff.a("deep_ocean");
        A = cff.a("stone_beach");
        B = cff.a("cold_beach");
        C = cff.a("birch_forest");
        D = cff.a("birch_forest_hills");
        E = cff.a("roofed_forest");
        F = cff.a("taiga_cold");
        G = cff.a("taiga_cold_hills");
        H = cff.a("redwood_taiga");
        I = cff.a("redwood_taiga_hills");
        J = cff.a("extreme_hills_with_trees");
        K = cff.a("savanna");
        L = cff.a("savanna_rock");
        M = cff.a("mesa");
        N = cff.a("mesa_rock");
        O = cff.a("mesa_clear_rock");
        P = cff.a("void");
        Q = cff.a("mutated_plains");
        R = cff.a("mutated_desert");
        S = cff.a("mutated_extreme_hills");
        T = cff.a("mutated_forest");
        U = cff.a("mutated_taiga");
        V = cff.a("mutated_swampland");
        W = cff.a("mutated_ice_flats");
        X = cff.a("mutated_jungle");
        Y = cff.a("mutated_jungle_edge");
        Z = cff.a("mutated_birch_forest");
        aa = cff.a("mutated_birch_forest_hills");
        ab = cff.a("mutated_roofed_forest");
        ac = cff.a("mutated_taiga_cold");
        ad = cff.a("mutated_redwood_taiga");
        ae = cff.a("mutated_redwood_taiga_hills");
        af = cff.a("mutated_extreme_hills_with_trees");
        ag = cff.a("mutated_savanna");
        ah = cff.a("mutated_savanna_rock");
        ai = cff.a("mutated_mesa");
        aj = cff.a("mutated_mesa_rock");
        ak = cff.a("mutated_mesa_clear_rock");
    }
}

