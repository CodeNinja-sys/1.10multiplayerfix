/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.jl;
import java.util.List;

public class hy {
    private static final bpx b = new bpx("water");
    public static final abl a = new abl(b);
    private static int c;
    private final String d;
    private final jl e;

    public static hy a(int n2) {
        return (hy)a.a(n2);
    }

    public static int a(hy hy2) {
        return a.a(hy2);
    }

    public static hy a(String string) {
        return (hy)a.c(new bpx(string));
    }

    public hy(cko ... arrcko) {
        this((String)null, arrcko);
    }

    public hy(String string, cko ... arrcko) {
        this.d = string;
        this.e = jl.a(arrcko);
    }

    public String b(String string) {
        return this.d == null ? string + ((bpx)a.b(this)).b() : string + this.d;
    }

    public List a() {
        return this.e;
    }

    public static void b() {
        hy.a("empty", new hy(new cko[0]));
        hy.a("water", new hy(new cko[0]));
        hy.a("mundane", new hy(new cko[0]));
        hy.a("thick", new hy(new cko[0]));
        hy.a("awkward", new hy(new cko[0]));
        hy.a("night_vision", new hy(new cko(ake.p, 3600)));
        hy.a("long_night_vision", new hy("night_vision", new cko(ake.p, 9600)));
        hy.a("invisibility", new hy(new cko(ake.n, 3600)));
        hy.a("long_invisibility", new hy("invisibility", new cko(ake.n, 9600)));
        hy.a("leaping", new hy(new cko(ake.h, 3600)));
        hy.a("long_leaping", new hy("leaping", new cko(ake.h, 9600)));
        hy.a("strong_leaping", new hy("leaping", new cko(ake.h, 1800, 1)));
        hy.a("fire_resistance", new hy(new cko(ake.l, 3600)));
        hy.a("long_fire_resistance", new hy("fire_resistance", new cko(ake.l, 9600)));
        hy.a("swiftness", new hy(new cko(ake.a, 3600)));
        hy.a("long_swiftness", new hy("swiftness", new cko(ake.a, 9600)));
        hy.a("strong_swiftness", new hy("swiftness", new cko(ake.a, 1800, 1)));
        hy.a("slowness", new hy(new cko(ake.b, 1800)));
        hy.a("long_slowness", new hy("slowness", new cko(ake.b, 4800)));
        hy.a("water_breathing", new hy(new cko(ake.m, 3600)));
        hy.a("long_water_breathing", new hy("water_breathing", new cko(ake.m, 9600)));
        hy.a("healing", new hy(new cko(ake.f, 1)));
        hy.a("strong_healing", new hy("healing", new cko(ake.f, 1, 1)));
        hy.a("harming", new hy(new cko(ake.g, 1)));
        hy.a("strong_harming", new hy("harming", new cko(ake.g, 1, 1)));
        hy.a("poison", new hy(new cko(ake.s, 900)));
        hy.a("long_poison", new hy("poison", new cko(ake.s, 1800)));
        hy.a("strong_poison", new hy("poison", new cko(ake.s, 432, 1)));
        hy.a("regeneration", new hy(new cko(ake.j, 900)));
        hy.a("long_regeneration", new hy("regeneration", new cko(ake.j, 1800)));
        hy.a("strong_regeneration", new hy("regeneration", new cko(ake.j, 450, 1)));
        hy.a("strength", new hy(new cko(ake.e, 3600)));
        hy.a("long_strength", new hy("strength", new cko(ake.e, 9600)));
        hy.a("strong_strength", new hy("strength", new cko(ake.e, 1800, 1)));
        hy.a("weakness", new hy(new cko(ake.r, 1800)));
        hy.a("long_weakness", new hy("weakness", new cko(ake.r, 4800)));
        hy.a("luck", new hy("luck", new cko(ake.z, 6000)));
        a.a();
    }

    protected static void a(String string, hy hy2) {
        a.a(c++, new bpx(string), hy2);
    }

    public boolean c() {
        if (!this.e.isEmpty()) {
            for (cko cko2 : this.e) {
                if (!cko2.a().a()) continue;
                return true;
            }
        }
        return false;
    }
}

