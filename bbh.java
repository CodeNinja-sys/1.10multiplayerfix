/*
 * Decompiled with CFR 0.150.
 */
public class bbh {
    public static final dad a = bbh.a("protection");
    public static final dad b = bbh.a("fire_protection");
    public static final dad c = bbh.a("feather_falling");
    public static final dad d = bbh.a("blast_protection");
    public static final dad e = bbh.a("projectile_protection");
    public static final dad f = bbh.a("respiration");
    public static final dad g = bbh.a("aqua_affinity");
    public static final dad h = bbh.a("thorns");
    public static final dad i = bbh.a("depth_strider");
    public static final dad j = bbh.a("frost_walker");
    public static final dad k = bbh.a("sharpness");
    public static final dad l = bbh.a("smite");
    public static final dad m = bbh.a("bane_of_arthropods");
    public static final dad n = bbh.a("knockback");
    public static final dad o = bbh.a("fire_aspect");
    public static final dad p = bbh.a("looting");
    public static final dad q = bbh.a("efficiency");
    public static final dad r = bbh.a("silk_touch");
    public static final dad s = bbh.a("unbreaking");
    public static final dad t = bbh.a("fortune");
    public static final dad u = bbh.a("power");
    public static final dad v = bbh.a("punch");
    public static final dad w = bbh.a("flame");
    public static final dad x = bbh.a("infinity");
    public static final dad y = bbh.a("luck_of_the_sea");
    public static final dad z = bbh.a("lure");
    public static final dad A = bbh.a("mending");

    private static dad a(String string) {
        dad dad2 = (dad)dad.b.c(new bpx(string));
        if (dad2 == null) {
            throw new IllegalStateException("Invalid Enchantment requested: " + string);
        }
        return dad2;
    }

    static {
        if (!bht.a()) {
            throw new RuntimeException("Accessed MobEffects before Bootstrap!");
        }
    }
}

