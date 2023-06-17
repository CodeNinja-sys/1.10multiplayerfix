/*
 * Decompiled with CFR 0.150.
 */
public class ake {
    public static final bfv a;
    public static final bfv b;
    public static final bfv c;
    public static final bfv d;
    public static final bfv e;
    public static final bfv f;
    public static final bfv g;
    public static final bfv h;
    public static final bfv i;
    public static final bfv j;
    public static final bfv k;
    public static final bfv l;
    public static final bfv m;
    public static final bfv n;
    public static final bfv o;
    public static final bfv p;
    public static final bfv q;
    public static final bfv r;
    public static final bfv s;
    public static final bfv t;
    public static final bfv u;
    public static final bfv v;
    public static final bfv w;
    public static final bfv x;
    public static final bfv y;
    public static final bfv z;
    public static final bfv A;

    private static bfv a(String string) {
        bfv bfv2 = (bfv)bfv.a.c(new bpx(string));
        if (bfv2 == null) {
            throw new IllegalStateException("Invalid MobEffect requested: " + string);
        }
        return bfv2;
    }

    static {
        if (!bht.a()) {
            throw new RuntimeException("Accessed MobEffects before Bootstrap!");
        }
        a = ake.a("speed");
        b = ake.a("slowness");
        c = ake.a("haste");
        d = ake.a("mining_fatigue");
        e = ake.a("strength");
        f = ake.a("instant_health");
        g = ake.a("instant_damage");
        h = ake.a("jump_boost");
        i = ake.a("nausea");
        j = ake.a("regeneration");
        k = ake.a("resistance");
        l = ake.a("fire_resistance");
        m = ake.a("water_breathing");
        n = ake.a("invisibility");
        o = ake.a("blindness");
        p = ake.a("night_vision");
        q = ake.a("hunger");
        r = ake.a("weakness");
        s = ake.a("poison");
        t = ake.a("wither");
        u = ake.a("health_boost");
        v = ake.a("absorption");
        w = ake.a("saturation");
        x = ake.a("glowing");
        y = ake.a("levitation");
        z = ake.a("luck");
        A = ake.a("unluck");
    }
}

