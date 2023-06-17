/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class ctb
implements ae,
v {
    public bqr a(w w2, Type type, u u2) {
        z z2 = w2.t();
        bqr bqr2 = new bqr();
        try {
            bqr2.b = cwe.a(z2, "coordinateScale", bqr2.b);
            bqr2.c = cwe.a(z2, "heightScale", bqr2.c);
            bqr2.e = cwe.a(z2, "lowerLimitScale", bqr2.e);
            bqr2.d = cwe.a(z2, "upperLimitScale", bqr2.d);
            bqr2.f = cwe.a(z2, "depthNoiseScaleX", bqr2.f);
            bqr2.g = cwe.a(z2, "depthNoiseScaleZ", bqr2.g);
            bqr2.h = cwe.a(z2, "depthNoiseScaleExponent", bqr2.h);
            bqr2.i = cwe.a(z2, "mainNoiseScaleX", bqr2.i);
            bqr2.j = cwe.a(z2, "mainNoiseScaleY", bqr2.j);
            bqr2.k = cwe.a(z2, "mainNoiseScaleZ", bqr2.k);
            bqr2.l = cwe.a(z2, "baseSize", bqr2.l);
            bqr2.m = cwe.a(z2, "stretchY", bqr2.m);
            bqr2.n = cwe.a(z2, "biomeDepthWeight", bqr2.n);
            bqr2.o = cwe.a(z2, "biomeDepthOffset", bqr2.o);
            bqr2.p = cwe.a(z2, "biomeScaleWeight", bqr2.p);
            bqr2.q = cwe.a(z2, "biomeScaleOffset", bqr2.q);
            bqr2.r = cwe.a(z2, "seaLevel", bqr2.r);
            bqr2.s = cwe.a(z2, "useCaves", bqr2.s);
            bqr2.t = cwe.a(z2, "useDungeons", bqr2.t);
            bqr2.u = cwe.a(z2, "dungeonChance", bqr2.u);
            bqr2.v = cwe.a(z2, "useStrongholds", bqr2.v);
            bqr2.w = cwe.a(z2, "useVillages", bqr2.w);
            bqr2.x = cwe.a(z2, "useMineShafts", bqr2.x);
            bqr2.y = cwe.a(z2, "useTemples", bqr2.y);
            bqr2.z = cwe.a(z2, "useMonuments", bqr2.z);
            bqr2.A = cwe.a(z2, "useRavines", bqr2.A);
            bqr2.B = cwe.a(z2, "useWaterLakes", bqr2.B);
            bqr2.C = cwe.a(z2, "waterLakeChance", bqr2.C);
            bqr2.D = cwe.a(z2, "useLavaLakes", bqr2.D);
            bqr2.E = cwe.a(z2, "lavaLakeChance", bqr2.E);
            bqr2.F = cwe.a(z2, "useLavaOceans", bqr2.F);
            bqr2.G = cwe.a(z2, "fixedBiome", bqr2.G);
            if (bqr2.G >= 38 || bqr2.G < -1) {
                bqr2.G = -1;
            } else if (bqr2.G >= anr.a(cff.j)) {
                bqr2.G += 2;
            }
            bqr2.H = cwe.a(z2, "biomeSize", bqr2.H);
            bqr2.I = cwe.a(z2, "riverSize", bqr2.I);
            bqr2.J = cwe.a(z2, "dirtSize", bqr2.J);
            bqr2.K = cwe.a(z2, "dirtCount", bqr2.K);
            bqr2.L = cwe.a(z2, "dirtMinHeight", bqr2.L);
            bqr2.M = cwe.a(z2, "dirtMaxHeight", bqr2.M);
            bqr2.N = cwe.a(z2, "gravelSize", bqr2.N);
            bqr2.O = cwe.a(z2, "gravelCount", bqr2.O);
            bqr2.P = cwe.a(z2, "gravelMinHeight", bqr2.P);
            bqr2.Q = cwe.a(z2, "gravelMaxHeight", bqr2.Q);
            bqr2.R = cwe.a(z2, "graniteSize", bqr2.R);
            bqr2.S = cwe.a(z2, "graniteCount", bqr2.S);
            bqr2.T = cwe.a(z2, "graniteMinHeight", bqr2.T);
            bqr2.U = cwe.a(z2, "graniteMaxHeight", bqr2.U);
            bqr2.V = cwe.a(z2, "dioriteSize", bqr2.V);
            bqr2.W = cwe.a(z2, "dioriteCount", bqr2.W);
            bqr2.X = cwe.a(z2, "dioriteMinHeight", bqr2.X);
            bqr2.Y = cwe.a(z2, "dioriteMaxHeight", bqr2.Y);
            bqr2.Z = cwe.a(z2, "andesiteSize", bqr2.Z);
            bqr2.aa = cwe.a(z2, "andesiteCount", bqr2.aa);
            bqr2.ab = cwe.a(z2, "andesiteMinHeight", bqr2.ab);
            bqr2.ac = cwe.a(z2, "andesiteMaxHeight", bqr2.ac);
            bqr2.ad = cwe.a(z2, "coalSize", bqr2.ad);
            bqr2.ae = cwe.a(z2, "coalCount", bqr2.ae);
            bqr2.af = cwe.a(z2, "coalMinHeight", bqr2.af);
            bqr2.ag = cwe.a(z2, "coalMaxHeight", bqr2.ag);
            bqr2.ah = cwe.a(z2, "ironSize", bqr2.ah);
            bqr2.ai = cwe.a(z2, "ironCount", bqr2.ai);
            bqr2.aj = cwe.a(z2, "ironMinHeight", bqr2.aj);
            bqr2.ak = cwe.a(z2, "ironMaxHeight", bqr2.ak);
            bqr2.al = cwe.a(z2, "goldSize", bqr2.al);
            bqr2.am = cwe.a(z2, "goldCount", bqr2.am);
            bqr2.an = cwe.a(z2, "goldMinHeight", bqr2.an);
            bqr2.ao = cwe.a(z2, "goldMaxHeight", bqr2.ao);
            bqr2.ap = cwe.a(z2, "redstoneSize", bqr2.ap);
            bqr2.aq = cwe.a(z2, "redstoneCount", bqr2.aq);
            bqr2.ar = cwe.a(z2, "redstoneMinHeight", bqr2.ar);
            bqr2.as = cwe.a(z2, "redstoneMaxHeight", bqr2.as);
            bqr2.at = cwe.a(z2, "diamondSize", bqr2.at);
            bqr2.au = cwe.a(z2, "diamondCount", bqr2.au);
            bqr2.av = cwe.a(z2, "diamondMinHeight", bqr2.av);
            bqr2.aw = cwe.a(z2, "diamondMaxHeight", bqr2.aw);
            bqr2.ax = cwe.a(z2, "lapisSize", bqr2.ax);
            bqr2.ay = cwe.a(z2, "lapisCount", bqr2.ay);
            bqr2.az = cwe.a(z2, "lapisCenterHeight", bqr2.az);
            bqr2.aA = cwe.a(z2, "lapisSpread", bqr2.aA);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bqr2;
    }

    public w a(bqr bqr2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("coordinateScale", Float.valueOf(bqr2.b));
        z2.a("heightScale", Float.valueOf(bqr2.c));
        z2.a("lowerLimitScale", Float.valueOf(bqr2.e));
        z2.a("upperLimitScale", Float.valueOf(bqr2.d));
        z2.a("depthNoiseScaleX", Float.valueOf(bqr2.f));
        z2.a("depthNoiseScaleZ", Float.valueOf(bqr2.g));
        z2.a("depthNoiseScaleExponent", Float.valueOf(bqr2.h));
        z2.a("mainNoiseScaleX", Float.valueOf(bqr2.i));
        z2.a("mainNoiseScaleY", Float.valueOf(bqr2.j));
        z2.a("mainNoiseScaleZ", Float.valueOf(bqr2.k));
        z2.a("baseSize", Float.valueOf(bqr2.l));
        z2.a("stretchY", Float.valueOf(bqr2.m));
        z2.a("biomeDepthWeight", Float.valueOf(bqr2.n));
        z2.a("biomeDepthOffset", Float.valueOf(bqr2.o));
        z2.a("biomeScaleWeight", Float.valueOf(bqr2.p));
        z2.a("biomeScaleOffset", Float.valueOf(bqr2.q));
        z2.a("seaLevel", bqr2.r);
        z2.a("useCaves", bqr2.s);
        z2.a("useDungeons", bqr2.t);
        z2.a("dungeonChance", bqr2.u);
        z2.a("useStrongholds", bqr2.v);
        z2.a("useVillages", bqr2.w);
        z2.a("useMineShafts", bqr2.x);
        z2.a("useTemples", bqr2.y);
        z2.a("useMonuments", bqr2.z);
        z2.a("useRavines", bqr2.A);
        z2.a("useWaterLakes", bqr2.B);
        z2.a("waterLakeChance", bqr2.C);
        z2.a("useLavaLakes", bqr2.D);
        z2.a("lavaLakeChance", bqr2.E);
        z2.a("useLavaOceans", bqr2.F);
        z2.a("fixedBiome", bqr2.G);
        z2.a("biomeSize", bqr2.H);
        z2.a("riverSize", bqr2.I);
        z2.a("dirtSize", bqr2.J);
        z2.a("dirtCount", bqr2.K);
        z2.a("dirtMinHeight", bqr2.L);
        z2.a("dirtMaxHeight", bqr2.M);
        z2.a("gravelSize", bqr2.N);
        z2.a("gravelCount", bqr2.O);
        z2.a("gravelMinHeight", bqr2.P);
        z2.a("gravelMaxHeight", bqr2.Q);
        z2.a("graniteSize", bqr2.R);
        z2.a("graniteCount", bqr2.S);
        z2.a("graniteMinHeight", bqr2.T);
        z2.a("graniteMaxHeight", bqr2.U);
        z2.a("dioriteSize", bqr2.V);
        z2.a("dioriteCount", bqr2.W);
        z2.a("dioriteMinHeight", bqr2.X);
        z2.a("dioriteMaxHeight", bqr2.Y);
        z2.a("andesiteSize", bqr2.Z);
        z2.a("andesiteCount", bqr2.aa);
        z2.a("andesiteMinHeight", bqr2.ab);
        z2.a("andesiteMaxHeight", bqr2.ac);
        z2.a("coalSize", bqr2.ad);
        z2.a("coalCount", bqr2.ae);
        z2.a("coalMinHeight", bqr2.af);
        z2.a("coalMaxHeight", bqr2.ag);
        z2.a("ironSize", bqr2.ah);
        z2.a("ironCount", bqr2.ai);
        z2.a("ironMinHeight", bqr2.aj);
        z2.a("ironMaxHeight", bqr2.ak);
        z2.a("goldSize", bqr2.al);
        z2.a("goldCount", bqr2.am);
        z2.a("goldMinHeight", bqr2.an);
        z2.a("goldMaxHeight", bqr2.ao);
        z2.a("redstoneSize", bqr2.ap);
        z2.a("redstoneCount", bqr2.aq);
        z2.a("redstoneMinHeight", bqr2.ar);
        z2.a("redstoneMaxHeight", bqr2.as);
        z2.a("diamondSize", bqr2.at);
        z2.a("diamondCount", bqr2.au);
        z2.a("diamondMinHeight", bqr2.av);
        z2.a("diamondMaxHeight", bqr2.aw);
        z2.a("lapisSize", bqr2.ax);
        z2.a("lapisCount", bqr2.ay);
        z2.a("lapisCenterHeight", bqr2.az);
        z2.a("lapisSpread", bqr2.aA);
        return z2;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((bqr)object, type, ad2);
    }
}

