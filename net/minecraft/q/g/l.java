/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.a.i;
import net.minecraft.q.b.q;
import net.minecraft.q.g.h;
import net.minecraft.u.bc;

public class l
implements ae,
v {
    public h a(w w2, Type type, u u2) {
        z z2 = w2.t();
        h h2 = new h();
        try {
            h2.b = bc.a(z2, "coordinateScale", h2.b);
            h2.c = bc.a(z2, "heightScale", h2.c);
            h2.e = bc.a(z2, "lowerLimitScale", h2.e);
            h2.d = bc.a(z2, "upperLimitScale", h2.d);
            h2.f = bc.a(z2, "depthNoiseScaleX", h2.f);
            h2.g = bc.a(z2, "depthNoiseScaleZ", h2.g);
            h2.h = bc.a(z2, "depthNoiseScaleExponent", h2.h);
            h2.i = bc.a(z2, "mainNoiseScaleX", h2.i);
            h2.j = bc.a(z2, "mainNoiseScaleY", h2.j);
            h2.k = bc.a(z2, "mainNoiseScaleZ", h2.k);
            h2.l = bc.a(z2, "baseSize", h2.l);
            h2.m = bc.a(z2, "stretchY", h2.m);
            h2.n = bc.a(z2, "biomeDepthWeight", h2.n);
            h2.o = bc.a(z2, "biomeDepthOffset", h2.o);
            h2.p = bc.a(z2, "biomeScaleWeight", h2.p);
            h2.q = bc.a(z2, "biomeScaleOffset", h2.q);
            h2.r = bc.a(z2, "seaLevel", h2.r);
            h2.s = bc.a(z2, "useCaves", h2.s);
            h2.t = bc.a(z2, "useDungeons", h2.t);
            h2.u = bc.a(z2, "dungeonChance", h2.u);
            h2.v = bc.a(z2, "useStrongholds", h2.v);
            h2.w = bc.a(z2, "useVillages", h2.w);
            h2.x = bc.a(z2, "useMineShafts", h2.x);
            h2.y = bc.a(z2, "useTemples", h2.y);
            h2.z = bc.a(z2, "useMonuments", h2.z);
            h2.A = bc.a(z2, "useRavines", h2.A);
            h2.B = bc.a(z2, "useWaterLakes", h2.B);
            h2.C = bc.a(z2, "waterLakeChance", h2.C);
            h2.D = bc.a(z2, "useLavaLakes", h2.D);
            h2.E = bc.a(z2, "lavaLakeChance", h2.E);
            h2.F = bc.a(z2, "useLavaOceans", h2.F);
            h2.G = bc.a(z2, "fixedBiome", h2.G);
            if (h2.G < 38 && h2.G >= -1) {
                if (h2.G >= q.a(i.j)) {
                    h2.G += 2;
                }
            } else {
                h2.G = -1;
            }
            h2.H = bc.a(z2, "biomeSize", h2.H);
            h2.I = bc.a(z2, "riverSize", h2.I);
            h2.J = bc.a(z2, "dirtSize", h2.J);
            h2.K = bc.a(z2, "dirtCount", h2.K);
            h2.L = bc.a(z2, "dirtMinHeight", h2.L);
            h2.M = bc.a(z2, "dirtMaxHeight", h2.M);
            h2.N = bc.a(z2, "gravelSize", h2.N);
            h2.O = bc.a(z2, "gravelCount", h2.O);
            h2.P = bc.a(z2, "gravelMinHeight", h2.P);
            h2.Q = bc.a(z2, "gravelMaxHeight", h2.Q);
            h2.R = bc.a(z2, "graniteSize", h2.R);
            h2.S = bc.a(z2, "graniteCount", h2.S);
            h2.T = bc.a(z2, "graniteMinHeight", h2.T);
            h2.U = bc.a(z2, "graniteMaxHeight", h2.U);
            h2.V = bc.a(z2, "dioriteSize", h2.V);
            h2.W = bc.a(z2, "dioriteCount", h2.W);
            h2.X = bc.a(z2, "dioriteMinHeight", h2.X);
            h2.Y = bc.a(z2, "dioriteMaxHeight", h2.Y);
            h2.Z = bc.a(z2, "andesiteSize", h2.Z);
            h2.aa = bc.a(z2, "andesiteCount", h2.aa);
            h2.ab = bc.a(z2, "andesiteMinHeight", h2.ab);
            h2.ac = bc.a(z2, "andesiteMaxHeight", h2.ac);
            h2.ad = bc.a(z2, "coalSize", h2.ad);
            h2.ae = bc.a(z2, "coalCount", h2.ae);
            h2.af = bc.a(z2, "coalMinHeight", h2.af);
            h2.ag = bc.a(z2, "coalMaxHeight", h2.ag);
            h2.ah = bc.a(z2, "ironSize", h2.ah);
            h2.ai = bc.a(z2, "ironCount", h2.ai);
            h2.aj = bc.a(z2, "ironMinHeight", h2.aj);
            h2.ak = bc.a(z2, "ironMaxHeight", h2.ak);
            h2.al = bc.a(z2, "goldSize", h2.al);
            h2.am = bc.a(z2, "goldCount", h2.am);
            h2.an = bc.a(z2, "goldMinHeight", h2.an);
            h2.ao = bc.a(z2, "goldMaxHeight", h2.ao);
            h2.ap = bc.a(z2, "redstoneSize", h2.ap);
            h2.aq = bc.a(z2, "redstoneCount", h2.aq);
            h2.ar = bc.a(z2, "redstoneMinHeight", h2.ar);
            h2.as = bc.a(z2, "redstoneMaxHeight", h2.as);
            h2.at = bc.a(z2, "diamondSize", h2.at);
            h2.au = bc.a(z2, "diamondCount", h2.au);
            h2.av = bc.a(z2, "diamondMinHeight", h2.av);
            h2.aw = bc.a(z2, "diamondMaxHeight", h2.aw);
            h2.ax = bc.a(z2, "lapisSize", h2.ax);
            h2.ay = bc.a(z2, "lapisCount", h2.ay);
            h2.az = bc.a(z2, "lapisCenterHeight", h2.az);
            h2.aA = bc.a(z2, "lapisSpread", h2.aA);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return h2;
    }

    public w a(h h2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("coordinateScale", Float.valueOf(h2.b));
        z2.a("heightScale", Float.valueOf(h2.c));
        z2.a("lowerLimitScale", Float.valueOf(h2.e));
        z2.a("upperLimitScale", Float.valueOf(h2.d));
        z2.a("depthNoiseScaleX", Float.valueOf(h2.f));
        z2.a("depthNoiseScaleZ", Float.valueOf(h2.g));
        z2.a("depthNoiseScaleExponent", Float.valueOf(h2.h));
        z2.a("mainNoiseScaleX", Float.valueOf(h2.i));
        z2.a("mainNoiseScaleY", Float.valueOf(h2.j));
        z2.a("mainNoiseScaleZ", Float.valueOf(h2.k));
        z2.a("baseSize", Float.valueOf(h2.l));
        z2.a("stretchY", Float.valueOf(h2.m));
        z2.a("biomeDepthWeight", Float.valueOf(h2.n));
        z2.a("biomeDepthOffset", Float.valueOf(h2.o));
        z2.a("biomeScaleWeight", Float.valueOf(h2.p));
        z2.a("biomeScaleOffset", Float.valueOf(h2.q));
        z2.a("seaLevel", h2.r);
        z2.a("useCaves", h2.s);
        z2.a("useDungeons", h2.t);
        z2.a("dungeonChance", h2.u);
        z2.a("useStrongholds", h2.v);
        z2.a("useVillages", h2.w);
        z2.a("useMineShafts", h2.x);
        z2.a("useTemples", h2.y);
        z2.a("useMonuments", h2.z);
        z2.a("useRavines", h2.A);
        z2.a("useWaterLakes", h2.B);
        z2.a("waterLakeChance", h2.C);
        z2.a("useLavaLakes", h2.D);
        z2.a("lavaLakeChance", h2.E);
        z2.a("useLavaOceans", h2.F);
        z2.a("fixedBiome", h2.G);
        z2.a("biomeSize", h2.H);
        z2.a("riverSize", h2.I);
        z2.a("dirtSize", h2.J);
        z2.a("dirtCount", h2.K);
        z2.a("dirtMinHeight", h2.L);
        z2.a("dirtMaxHeight", h2.M);
        z2.a("gravelSize", h2.N);
        z2.a("gravelCount", h2.O);
        z2.a("gravelMinHeight", h2.P);
        z2.a("gravelMaxHeight", h2.Q);
        z2.a("graniteSize", h2.R);
        z2.a("graniteCount", h2.S);
        z2.a("graniteMinHeight", h2.T);
        z2.a("graniteMaxHeight", h2.U);
        z2.a("dioriteSize", h2.V);
        z2.a("dioriteCount", h2.W);
        z2.a("dioriteMinHeight", h2.X);
        z2.a("dioriteMaxHeight", h2.Y);
        z2.a("andesiteSize", h2.Z);
        z2.a("andesiteCount", h2.aa);
        z2.a("andesiteMinHeight", h2.ab);
        z2.a("andesiteMaxHeight", h2.ac);
        z2.a("coalSize", h2.ad);
        z2.a("coalCount", h2.ae);
        z2.a("coalMinHeight", h2.af);
        z2.a("coalMaxHeight", h2.ag);
        z2.a("ironSize", h2.ah);
        z2.a("ironCount", h2.ai);
        z2.a("ironMinHeight", h2.aj);
        z2.a("ironMaxHeight", h2.ak);
        z2.a("goldSize", h2.al);
        z2.a("goldCount", h2.am);
        z2.a("goldMinHeight", h2.an);
        z2.a("goldMaxHeight", h2.ao);
        z2.a("redstoneSize", h2.ap);
        z2.a("redstoneCount", h2.aq);
        z2.a("redstoneMinHeight", h2.ar);
        z2.a("redstoneMaxHeight", h2.as);
        z2.a("diamondSize", h2.at);
        z2.a("diamondCount", h2.au);
        z2.a("diamondMinHeight", h2.av);
        z2.a("diamondMaxHeight", h2.aw);
        z2.a("lapisSize", h2.ax);
        z2.a("lapisCount", h2.ay);
        z2.a("lapisCenterHeight", h2.az);
        z2.a("lapisSpread", h2.aA);
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((h)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

