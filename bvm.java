/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Collections;
import java.util.Set;

public class bvm {
    private static final Set as = aad.a();
    private static final Set at = Collections.unmodifiableSet(as);
    public static final bpx a = bvm.a("empty");
    public static final bpx b = bvm.a("chests/spawn_bonus_chest");
    public static final bpx c = bvm.a("chests/end_city_treasure");
    public static final bpx d = bvm.a("chests/simple_dungeon");
    public static final bpx e = bvm.a("chests/village_blacksmith");
    public static final bpx f = bvm.a("chests/abandoned_mineshaft");
    public static final bpx g = bvm.a("chests/nether_bridge");
    public static final bpx h = bvm.a("chests/stronghold_library");
    public static final bpx i = bvm.a("chests/stronghold_crossing");
    public static final bpx j = bvm.a("chests/stronghold_corridor");
    public static final bpx k = bvm.a("chests/desert_pyramid");
    public static final bpx l = bvm.a("chests/jungle_temple");
    public static final bpx m = bvm.a("chests/jungle_temple_dispenser");
    public static final bpx n = bvm.a("chests/igloo_chest");
    public static final bpx o = bvm.a("entities/witch");
    public static final bpx p = bvm.a("entities/blaze");
    public static final bpx q = bvm.a("entities/creeper");
    public static final bpx r = bvm.a("entities/spider");
    public static final bpx s = bvm.a("entities/cave_spider");
    public static final bpx t = bvm.a("entities/giant");
    public static final bpx u = bvm.a("entities/silverfish");
    public static final bpx v = bvm.a("entities/enderman");
    public static final bpx w = bvm.a("entities/guardian");
    public static final bpx x = bvm.a("entities/elder_guardian");
    public static final bpx y = bvm.a("entities/shulker");
    public static final bpx z = bvm.a("entities/iron_golem");
    public static final bpx A = bvm.a("entities/snowman");
    public static final bpx B = bvm.a("entities/rabbit");
    public static final bpx C = bvm.a("entities/chicken");
    public static final bpx D = bvm.a("entities/pig");
    public static final bpx E = bvm.a("entities/polar_bear");
    public static final bpx F = bvm.a("entities/horse");
    public static final bpx G = bvm.a("entities/zombie_horse");
    public static final bpx H = bvm.a("entities/skeleton_horse");
    public static final bpx I = bvm.a("entities/cow");
    public static final bpx J = bvm.a("entities/mushroom_cow");
    public static final bpx K = bvm.a("entities/wolf");
    public static final bpx L = bvm.a("entities/ocelot");
    public static final bpx M = bvm.a("entities/sheep");
    public static final bpx N = bvm.a("entities/sheep/white");
    public static final bpx O = bvm.a("entities/sheep/orange");
    public static final bpx P = bvm.a("entities/sheep/magenta");
    public static final bpx Q = bvm.a("entities/sheep/light_blue");
    public static final bpx R = bvm.a("entities/sheep/yellow");
    public static final bpx S = bvm.a("entities/sheep/lime");
    public static final bpx T = bvm.a("entities/sheep/pink");
    public static final bpx U = bvm.a("entities/sheep/gray");
    public static final bpx V = bvm.a("entities/sheep/silver");
    public static final bpx W = bvm.a("entities/sheep/cyan");
    public static final bpx X = bvm.a("entities/sheep/purple");
    public static final bpx Y = bvm.a("entities/sheep/blue");
    public static final bpx Z = bvm.a("entities/sheep/brown");
    public static final bpx aa = bvm.a("entities/sheep/green");
    public static final bpx ab = bvm.a("entities/sheep/red");
    public static final bpx ac = bvm.a("entities/sheep/black");
    public static final bpx ad = bvm.a("entities/bat");
    public static final bpx ae = bvm.a("entities/slime");
    public static final bpx af = bvm.a("entities/magma_cube");
    public static final bpx ag = bvm.a("entities/ghast");
    public static final bpx ah = bvm.a("entities/squid");
    public static final bpx ai = bvm.a("entities/endermite");
    public static final bpx aj = bvm.a("entities/zombie");
    public static final bpx ak = bvm.a("entities/zombie_pigman");
    public static final bpx al = bvm.a("entities/skeleton");
    public static final bpx am = bvm.a("entities/wither_skeleton");
    public static final bpx an = bvm.a("entities/stray");
    public static final bpx ao = bvm.a("gameplay/fishing");
    public static final bpx ap = bvm.a("gameplay/fishing/junk");
    public static final bpx aq = bvm.a("gameplay/fishing/treasure");
    public static final bpx ar = bvm.a("gameplay/fishing/fish");

    private static bpx a(String string) {
        return bvm.a(new bpx("minecraft", string));
    }

    public static bpx a(bpx bpx2) {
        if (as.add(bpx2)) {
            return bpx2;
        }
        throw new IllegalArgumentException(bpx2 + " is already a registered built-in loot table");
    }

    public static Set a() {
        return at;
    }
}

