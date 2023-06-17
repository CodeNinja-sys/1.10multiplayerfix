/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class im {
    private static final Set K;
    public static final hy a;
    public static final hy b;
    public static final hy c;
    public static final hy d;
    public static final hy e;
    public static final hy f;
    public static final hy g;
    public static final hy h;
    public static final hy i;
    public static final hy j;
    public static final hy k;
    public static final hy l;
    public static final hy m;
    public static final hy n;
    public static final hy o;
    public static final hy p;
    public static final hy q;
    public static final hy r;
    public static final hy s;
    public static final hy t;
    public static final hy u;
    public static final hy v;
    public static final hy w;
    public static final hy x;
    public static final hy y;
    public static final hy z;
    public static final hy A;
    public static final hy B;
    public static final hy C;
    public static final hy D;
    public static final hy E;
    public static final hy F;
    public static final hy G;
    public static final hy H;
    public static final hy I;
    public static final hy J;

    private static hy a(String string) {
        hy hy2 = (hy)hy.a.c(new bpx(string));
        if (!K.add(hy2)) {
            throw new IllegalStateException("Invalid Potion requested: " + string);
        }
        return hy2;
    }

    static {
        if (!bht.a()) {
            throw new RuntimeException("Accessed Potions before Bootstrap!");
        }
        K = aad.a();
        a = im.a("empty");
        b = im.a("water");
        c = im.a("mundane");
        d = im.a("thick");
        e = im.a("awkward");
        f = im.a("night_vision");
        g = im.a("long_night_vision");
        h = im.a("invisibility");
        i = im.a("long_invisibility");
        j = im.a("leaping");
        k = im.a("long_leaping");
        l = im.a("strong_leaping");
        m = im.a("fire_resistance");
        n = im.a("long_fire_resistance");
        o = im.a("swiftness");
        p = im.a("long_swiftness");
        q = im.a("strong_swiftness");
        r = im.a("slowness");
        s = im.a("long_slowness");
        t = im.a("water_breathing");
        u = im.a("long_water_breathing");
        v = im.a("healing");
        w = im.a("strong_healing");
        x = im.a("harming");
        y = im.a("strong_harming");
        z = im.a("poison");
        A = im.a("long_poison");
        B = im.a("strong_poison");
        C = im.a("regeneration");
        D = im.a("long_regeneration");
        E = im.a("strong_regeneration");
        F = im.a("strength");
        G = im.a("long_strength");
        H = im.a("strong_strength");
        I = im.a("weakness");
        J = im.a("long_weakness");
        K.clear();
    }
}

