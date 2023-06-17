/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.z;
import net.minecraft.q.b.q;
import net.minecraft.u.bp;

public abstract class i {
    public static final q a;
    public static final q b;
    public static final q c;
    public static final q d;
    public static final q e;
    public static final q f;
    public static final q g;
    public static final q h;
    public static final q i;
    public static final q j;
    public static final q k;
    public static final q l;
    public static final q m;
    public static final q n;
    public static final q o;
    public static final q p;
    public static final q q;
    public static final q r;
    public static final q s;
    public static final q t;
    public static final q u;
    public static final q v;
    public static final q w;
    public static final q x;
    public static final q y;
    public static final q z;
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q D;
    public static final q E;
    public static final q F;
    public static final q G;
    public static final q H;
    public static final q I;
    public static final q J;
    public static final q K;
    public static final q L;
    public static final q M;
    public static final q N;
    public static final q O;
    public static final q P;
    public static final q Q;
    public static final q R;
    public static final q S;
    public static final q T;
    public static final q U;
    public static final q V;
    public static final q W;
    public static final q X;
    public static final q Y;
    public static final q Z;
    public static final q aa;
    public static final q ab;
    public static final q ac;
    public static final q ad;
    public static final q ae;
    public static final q af;
    public static final q ag;
    public static final q ah;
    public static final q ai;
    public static final q aj;
    public static final q ak;

    static {
        if (!net.minecraft.a.z.a()) {
            throw new RuntimeException("Accessed Biomes before Bootstrap!");
        }
        b = a = net.minecraft.a.i.a("ocean");
        c = net.minecraft.a.i.a("plains");
        d = net.minecraft.a.i.a("desert");
        e = net.minecraft.a.i.a("extreme_hills");
        f = net.minecraft.a.i.a("forest");
        g = net.minecraft.a.i.a("taiga");
        h = net.minecraft.a.i.a("swampland");
        i = net.minecraft.a.i.a("river");
        j = net.minecraft.a.i.a("hell");
        k = net.minecraft.a.i.a("sky");
        l = net.minecraft.a.i.a("frozen_ocean");
        m = net.minecraft.a.i.a("frozen_river");
        n = net.minecraft.a.i.a("ice_flats");
        o = net.minecraft.a.i.a("ice_mountains");
        p = net.minecraft.a.i.a("mushroom_island");
        q = net.minecraft.a.i.a("mushroom_island_shore");
        r = net.minecraft.a.i.a("beaches");
        s = net.minecraft.a.i.a("desert_hills");
        t = net.minecraft.a.i.a("forest_hills");
        u = net.minecraft.a.i.a("taiga_hills");
        v = net.minecraft.a.i.a("smaller_extreme_hills");
        w = net.minecraft.a.i.a("jungle");
        x = net.minecraft.a.i.a("jungle_hills");
        y = net.minecraft.a.i.a("jungle_edge");
        z = net.minecraft.a.i.a("deep_ocean");
        A = net.minecraft.a.i.a("stone_beach");
        B = net.minecraft.a.i.a("cold_beach");
        C = net.minecraft.a.i.a("birch_forest");
        D = net.minecraft.a.i.a("birch_forest_hills");
        E = net.minecraft.a.i.a("roofed_forest");
        F = net.minecraft.a.i.a("taiga_cold");
        G = net.minecraft.a.i.a("taiga_cold_hills");
        H = net.minecraft.a.i.a("redwood_taiga");
        I = net.minecraft.a.i.a("redwood_taiga_hills");
        J = net.minecraft.a.i.a("extreme_hills_with_trees");
        K = net.minecraft.a.i.a("savanna");
        L = net.minecraft.a.i.a("savanna_rock");
        M = net.minecraft.a.i.a("mesa");
        N = net.minecraft.a.i.a("mesa_rock");
        O = net.minecraft.a.i.a("mesa_clear_rock");
        P = net.minecraft.a.i.a("void");
        Q = net.minecraft.a.i.a("mutated_plains");
        R = net.minecraft.a.i.a("mutated_desert");
        S = net.minecraft.a.i.a("mutated_extreme_hills");
        T = net.minecraft.a.i.a("mutated_forest");
        U = net.minecraft.a.i.a("mutated_taiga");
        V = net.minecraft.a.i.a("mutated_swampland");
        W = net.minecraft.a.i.a("mutated_ice_flats");
        X = net.minecraft.a.i.a("mutated_jungle");
        Y = net.minecraft.a.i.a("mutated_jungle_edge");
        Z = net.minecraft.a.i.a("mutated_birch_forest");
        aa = net.minecraft.a.i.a("mutated_birch_forest_hills");
        ab = net.minecraft.a.i.a("mutated_roofed_forest");
        ac = net.minecraft.a.i.a("mutated_taiga_cold");
        ad = net.minecraft.a.i.a("mutated_redwood_taiga");
        ae = net.minecraft.a.i.a("mutated_redwood_taiga_hills");
        af = net.minecraft.a.i.a("mutated_extreme_hills_with_trees");
        ag = net.minecraft.a.i.a("mutated_savanna");
        ah = net.minecraft.a.i.a("mutated_savanna_rock");
        ai = net.minecraft.a.i.a("mutated_mesa");
        aj = net.minecraft.a.i.a("mutated_mesa_rock");
        ak = net.minecraft.a.i.a("mutated_mesa_clear_rock");
    }

    private static q a(String string) {
        q q2 = (q)net.minecraft.q.b.q.t.a(new bp(string));
        if (q2 == null) {
            throw new IllegalStateException("Invalid Biome requested: " + string);
        }
        return q2;
    }
}

