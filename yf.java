/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.b.bx;
import com.a.a.d.aad;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.yk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class yf {
    private static final Set b = aad.a(new bpx("blocks/water_flow"), new bpx("blocks/water_still"), new bpx("blocks/lava_flow"), new bpx("blocks/lava_still"), new bpx("blocks/water_overlay"), new bpx("blocks/destroy_stage_0"), new bpx("blocks/destroy_stage_1"), new bpx("blocks/destroy_stage_2"), new bpx("blocks/destroy_stage_3"), new bpx("blocks/destroy_stage_4"), new bpx("blocks/destroy_stage_5"), new bpx("blocks/destroy_stage_6"), new bpx("blocks/destroy_stage_7"), new bpx("blocks/destroy_stage_8"), new bpx("blocks/destroy_stage_9"), new bpx("items/empty_armor_slot_helmet"), new bpx("items/empty_armor_slot_chestplate"), new bpx("items/empty_armor_slot_leggings"), new bpx("items/empty_armor_slot_boots"), new bpx("items/empty_armor_slot_shield"));
    private static final d c = org.apache.logging.log4j.c.c();
    protected static final up a = new up("builtin/missing", "missing");
    private static final String d = "{    'textures': {       'particle': 'missingno',       'missingno': 'missingno'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}".replaceAll("'", "\"");
    private static final Map e = sz.c();
    private static final bx f;
    private final akx g;
    private final Map h = sz.c();
    private final Map i = sz.d();
    private final Map j = sz.d();
    private final Map k = sz.d();
    private final dam l;
    private final bax m;
    private final dha n = new dha();
    private final uy o = new uy();
    private final dai p = new dai();
    private static final String q;
    private static final bfg r;
    private static final bfg s;
    private final Map t = sz.d();
    private final Map u = sz.c();
    private final Map v = sz.g();

    public yf(akx akx2, dam dam2, bax bax2) {
        this.g = akx2;
        this.l = dam2;
        this.m = bax2;
    }

    public avt a() {
        this.b();
        this.c();
        this.k();
        this.m();
        this.o();
        this.h();
        this.i();
        return this.p;
    }

    private void b() {
        bvz bvz2 = this.m.a();
        for (bfa bfa2 : bfa.v) {
            for (bpx bpx2 : bvz2.a(bfa2)) {
                try {
                    aum aum2 = this.a(bpx2);
                    Map map = bvz2.b(bfa2);
                    if (aum2.b()) {
                        HashSet hashSet = aad.b(map.values());
                        aum2.c().a(bfa2.r());
                        this.k.put(aum2, ov.a(mq.c((Iterable)hashSet, new apw(this, bpx2))));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        up up2 = (up)entry.getValue();
                        if (!bpx2.equals(up2)) continue;
                        try {
                            this.j.put(up2, aum2.b(up2.a()));
                        }
                        catch (RuntimeException runtimeException) {
                            if (aum2.b()) continue;
                            c.f("Unable to load variant: {} from {}", up2.a(), up2);
                        }
                    }
                }
                catch (Exception exception) {
                    c.f("Unable to load definition {}", bpx2, exception);
                }
            }
        }
    }

    private void c() {
        this.j.put(a, new agm(ov.a(new cbn(new bpx(a.b()), avo.a, false, 1))));
        bpx bpx2 = new bpx("item_frame");
        aum aum2 = this.a(bpx2);
        this.a(aum2, new up(bpx2, "normal"));
        this.a(aum2, new up(bpx2, "map"));
        this.d();
        this.e();
        this.f();
    }

    private void a(aum aum2, up up2) {
        this.j.put(up2, aum2.b(up2.a()));
    }

    private aum a(bpx bpx2) {
        bpx bpx3 = this.b(bpx2);
        aum aum2 = (aum)this.u.get(bpx3);
        if (aum2 == null) {
            aum2 = this.a(bpx2, bpx3);
            this.u.put(bpx3, aum2);
        }
        return aum2;
    }

    private aum a(bpx bpx2, bpx bpx3) {
        ArrayList arrayList = ov.a();
        try {
            for (dbr dbr2 : this.g.b(bpx3)) {
                arrayList.add(this.a(bpx2, dbr2));
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Encountered an exception when loading model definition of model " + bpx3, iOException);
        }
        return new aum(arrayList);
    }

    private aum a(bpx bpx2, dbr dbr2) {
        InputStream inputStream = null;
        try {
            inputStream = dbr2.b();
            aum aum2 = aum.a(new InputStreamReader(inputStream, aj.c));
            return aum2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Encountered an exception when loading model definition of '" + bpx2 + "' from: '" + dbr2.a() + "' in resourcepack: '" + dbr2.d() + "'", exception);
        }
        finally {
            org.apache.commons.b.t.a(inputStream);
        }
    }

    private bpx b(bpx bpx2) {
        return new bpx(bpx2.c(), "blockstates/" + bpx2.b() + ".json");
    }

    private void d() {
        for (Map.Entry entry : this.j.entrySet()) {
            this.a((up)entry.getKey(), (agm)entry.getValue());
        }
    }

    private void e() {
        for (Map.Entry entry : this.k.entrySet()) {
            up up2 = (up)((Collection)entry.getValue()).iterator().next();
            for (agm agm2 : ((aum)entry.getKey()).a()) {
                this.a(up2, agm2);
            }
        }
    }

    private void a(up up2, agm agm2) {
        for (cbn cbn2 : agm2.a()) {
            bpx bpx2 = cbn2.a();
            if (this.i.get(bpx2) != null) continue;
            try {
                this.i.put(bpx2, this.c(bpx2));
            }
            catch (Exception exception) {
                c.f("Unable to load block model: '{}' for variant: '{}': {} ", bpx2, up2, exception);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private bfg c(bpx bpx2) {
        Object object;
        Object object2;
        String string;
        dbr dbr2;
        Reader reader;
        block8: {
            block7: {
                bfg bfg2;
                reader = null;
                dbr2 = null;
                try {
                    string = bpx2.b();
                    if (!"builtin/generated".equals(string)) break block7;
                    bfg2 = r;
                }
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(reader);
                    org.apache.commons.b.t.a(dbr2);
                    throw throwable;
                }
                org.apache.commons.b.t.a(reader);
                org.apache.commons.b.t.a(dbr2);
                return bfg2;
            }
            if (!"builtin/entity".equals(string)) break block8;
            bfg bfg3 = s;
            org.apache.commons.b.t.a(reader);
            org.apache.commons.b.t.a(dbr2);
            return bfg3;
        }
        if (string.startsWith("builtin/")) {
            object2 = string.substring("builtin/".length());
            object = (String)e.get(object2);
            if (object == null) {
                throw new FileNotFoundException(bpx2.toString());
            }
            reader = new StringReader((String)object);
        } else {
            dbr2 = this.g.a(this.d(bpx2));
            reader = new InputStreamReader(dbr2.b(), aj.c);
        }
        object2 = bfg.a(reader);
        ((bfg)object2).b = bpx2.toString();
        object = object2;
        org.apache.commons.b.t.a(reader);
        org.apache.commons.b.t.a(dbr2);
        return object;
    }

    private bpx d(bpx bpx2) {
        return new bpx(bpx2.c(), "models/" + bpx2.b() + ".json");
    }

    private void f() {
        this.g();
        for (azg azg2 : azg.g) {
            List list = this.a(azg2);
            for (String string : list) {
                bfg bfg2;
                bpx bpx2 = this.a(string);
                bpx bpx3 = (bpx)azg.g.b(azg2);
                this.a(string, bpx2, bpx3);
                if (!azg2.h() || (bfg2 = (bfg)this.i.get(bpx2)) == null) continue;
                for (bpx bpx4 : bfg2.e()) {
                    this.a(bpx4.toString(), bpx4, bpx3);
                }
            }
        }
    }

    private void a(String string, bpx bpx2, bpx bpx3) {
        this.t.put(string, bpx2);
        if (this.i.get(bpx2) != null) {
            return;
        }
        try {
            bfg bfg2 = this.c(bpx2);
            this.i.put(bpx2, bfg2);
        }
        catch (Exception exception) {
            c.f("Unable to load item model: '{}' for item: '{}'", bpx2, bpx3, exception);
        }
    }

    private void g() {
        this.v.put(azg.a(blg.b), ov.a("stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"));
        this.v.put(azg.a(blg.d), ov.a("dirt", "coarse_dirt", "podzol"));
        this.v.put(azg.a(blg.f), ov.a("oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"));
        this.v.put(azg.a(blg.g), ov.a("oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"));
        this.v.put(azg.a(blg.m), ov.a("sand", "red_sand"));
        this.v.put(azg.a(blg.r), ov.a("oak_log", "spruce_log", "birch_log", "jungle_log"));
        this.v.put(azg.a(blg.t), ov.a("oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"));
        this.v.put(azg.a(blg.v), ov.a("sponge", "sponge_wet"));
        this.v.put(azg.a(blg.A), ov.a("sandstone", "chiseled_sandstone", "smooth_sandstone"));
        this.v.put(azg.a(blg.cM), ov.a("red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"));
        this.v.put(azg.a(blg.H), ov.a("dead_bush", "tall_grass", "fern"));
        this.v.put(azg.a(blg.I), ov.a(new String[]{"dead_bush"}));
        this.v.put(azg.a(blg.L), ov.a("black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"));
        this.v.put(azg.a(blg.N), ov.a(new String[]{"dandelion"}));
        this.v.put(azg.a(blg.O), ov.a("poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"));
        this.v.put(azg.a(blg.U), ov.a("stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"));
        this.v.put(azg.a(blg.cP), ov.a(new String[]{"red_sandstone_slab"}));
        this.v.put(azg.a(blg.cG), ov.a("black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"));
        this.v.put(azg.a(blg.be), ov.a("stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"));
        this.v.put(azg.a(blg.bf), ov.a("stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"));
        this.v.put(azg.a(blg.bM), ov.a("oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"));
        this.v.put(azg.a(blg.bZ), ov.a("cobblestone_wall", "mossy_cobblestone_wall"));
        this.v.put(azg.a(blg.cf), ov.a("anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"));
        this.v.put(azg.a(blg.cq), ov.a("quartz_block", "chiseled_quartz_block", "quartz_column"));
        this.v.put(azg.a(blg.cu), ov.a("black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"));
        this.v.put(azg.a(blg.cH), ov.a("black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"));
        this.v.put(azg.a(blg.u), ov.a("acacia_leaves", "dark_oak_leaves"));
        this.v.put(azg.a(blg.s), ov.a("acacia_log", "dark_oak_log"));
        this.v.put(azg.a(blg.cI), ov.a("prismarine", "prismarine_bricks", "dark_prismarine"));
        this.v.put(azg.a(blg.cy), ov.a("black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"));
        this.v.put(azg.a(blg.cF), ov.a("sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"));
        this.v.put(hp.j, ov.a("coal", "charcoal"));
        this.v.put(hp.bb, ov.a("cod", "salmon", "clownfish", "pufferfish"));
        this.v.put(hp.bc, ov.a("cooked_cod", "cooked_salmon"));
        this.v.put(hp.bd, ov.a("dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"));
        this.v.put(hp.bG, ov.a(new String[]{"bottle_drinkable"}));
        this.v.put(hp.ch, ov.a("skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"));
        this.v.put(hp.bH, ov.a(new String[]{"bottle_splash"}));
        this.v.put(hp.bI, ov.a(new String[]{"bottle_lingering"}));
        this.v.put(azg.a(blg.bo), ov.a(new String[]{"oak_fence_gate"}));
        this.v.put(azg.a(blg.aO), ov.a(new String[]{"oak_fence"}));
        this.v.put(hp.as, ov.a(new String[]{"oak_door"}));
        this.v.put(hp.aG, ov.a(new String[]{"oak_boat"}));
    }

    private List a(azg azg2) {
        List<String> list = (List<String>)this.v.get(azg2);
        if (list == null) {
            list = Collections.singletonList(((bpx)azg.g.b(azg2)).toString());
        }
        return list;
    }

    private bpx a(String string) {
        bpx bpx2 = new bpx(string);
        return new bpx(bpx2.c(), "item/" + bpx2.b());
    }

    private void h() {
        Object object;
        for (up object2 : this.j.keySet()) {
            object = this.a((agm)this.j.get(object2), object2.toString());
            if (object == null) continue;
            this.p.a(object2, object);
        }
        for (Map.Entry entry : this.k.entrySet()) {
            Object object2;
            Object object32;
            object = (aum)entry.getKey();
            clu clu2 = ((aum)object).c();
            String string = ((bpx)bfa.v.b(clu2.c().c())).toString();
            cgn cgn2 = new cgn();
            for (Object object32 : clu2.a()) {
                object2 = this.a(((bey)object32).a(), "selector of " + string);
                if (object2 == null) continue;
                cgn2.a(((bey)object32).a(clu2.c()), (bpi)object2);
            }
            bpi bpi2 = cgn2.a();
            object32 = ((Collection)entry.getValue()).iterator();
            while (object32.hasNext()) {
                object2 = (up)object32.next();
                if (((aum)object).a(((up)object2).a())) continue;
                this.p.a(object2, bpi2);
            }
        }
    }

    private bpi a(agm agm2, String string) {
        if (agm2.a().isEmpty()) {
            return null;
        }
        pf pf2 = new pf();
        int n2 = 0;
        for (cbn cbn2 : agm2.a()) {
            bfg bfg2 = (bfg)this.i.get(cbn2.a());
            if (bfg2 == null || !bfg2.d()) {
                c.f("Missing model for: {}", string);
                continue;
            }
            if (bfg2.a().isEmpty()) {
                c.f("Missing elements for: {}", string);
                continue;
            }
            bpi bpi2 = this.a(bfg2, cbn2.b(), cbn2.c());
            if (bpi2 == null) continue;
            ++n2;
            pf2.a(bpi2, cbn2.d());
        }
        Object object = null;
        if (n2 == 0) {
            c.f("No weighted models for: {}", string);
        } else {
            object = n2 == 1 ? pf2.b() : pf2.a();
        }
        return object;
    }

    private void i() {
        for (Map.Entry entry : this.t.entrySet()) {
            bpx bpx2 = (bpx)entry.getValue();
            up up2 = new up((String)entry.getKey(), "inventory");
            bfg bfg2 = (bfg)this.i.get(bpx2);
            if (bfg2 == null || !bfg2.d()) {
                c.f("Missing model for: {}", bpx2);
                continue;
            }
            if (bfg2.a().isEmpty()) {
                c.f("Missing elements for: {}", bpx2);
                continue;
            }
            if (this.c(bfg2)) {
                this.p.a(up2, new acc(bfg2.j(), bfg2.g()));
                continue;
            }
            bpi bpi2 = this.a(bfg2, avo.a, false);
            if (bpi2 == null) continue;
            this.p.a(up2, bpi2);
        }
    }

    private Set j() {
        HashSet hashSet = aad.a();
        ArrayList arrayList = ov.a(this.j.keySet());
        Collections.sort(arrayList, new dhd(this));
        for (Object object : arrayList) {
            agm agm2 = (agm)this.j.get(object);
            for (Object object2 : agm2.a()) {
                Object object3 = (bfg)this.i.get(((cbn)object2).a());
                if (object3 == null) {
                    c.f("Missing model for: {}", object);
                    continue;
                }
                hashSet.addAll(this.a((bfg)object3));
            }
        }
        for (Object object : this.k.keySet()) {
            for (Object object4 : ((aum)object).c().b()) {
                for (Object object3 : ((agm)object4).a()) {
                    bfg bfg2 = (bfg)this.i.get(((cbn)object3).a());
                    if (bfg2 == null) {
                        c.f("Missing model for: {}", bfa.v.b(((aum)object).c().c().c()));
                        continue;
                    }
                    hashSet.addAll(this.a(bfg2));
                }
            }
        }
        hashSet.addAll(b);
        return hashSet;
    }

    private bpi a(bfg bfg2, avo avo2, boolean bl2) {
        ars ars2 = (ars)this.h.get(new bpx(bfg2.c("particle")));
        ckp ckp2 = new ckp(bfg2, bfg2.g()).a(ars2);
        if (bfg2.a().isEmpty()) {
            return null;
        }
        for (vo vo2 : bfg2.a()) {
            for (bqk bqk2 : vo2.c.keySet()) {
                cvf cvf2 = (cvf)vo2.c.get(bqk2);
                ars ars3 = (ars)this.h.get(new bpx(bfg2.c(cvf2.d)));
                if (cvf2.b == null) {
                    ckp2.a(this.a(vo2, cvf2, ars3, bqk2, avo2, bl2));
                    continue;
                }
                ckp2.a(avo2.a(cvf2.b), this.a(vo2, cvf2, ars3, bqk2, avo2, bl2));
            }
        }
        return ckp2.a();
    }

    private crz a(vo vo2, cvf cvf2, ars ars2, bqk bqk2, avo avo2, boolean bl2) {
        return this.n.a(vo2.a, vo2.b, cvf2, ars2, bqk2, avo2, vo2.d, bl2, vo2.e);
    }

    private void k() {
        this.l();
        for (bfg bfg2 : this.i.values()) {
            bfg2.a(this.i);
        }
        bfg.b(this.i);
    }

    private void l() {
        ArrayDeque arrayDeque = yk.a();
        HashSet hashSet = aad.a();
        for (Object object : this.i.keySet()) {
            hashSet.add(object);
            this.a(arrayDeque, hashSet, (bfg)this.i.get(object));
        }
        while (!arrayDeque.isEmpty()) {
            bpx bpx2 = (bpx)arrayDeque.pop();
            try {
                Object object;
                if (this.i.get(bpx2) != null) continue;
                object = this.c(bpx2);
                this.i.put(bpx2, object);
                this.a(arrayDeque, hashSet, (bfg)object);
            }
            catch (Exception exception) {
                c.f("In parent chain: {}; unable to load model: '{}'", f.a(this.e(bpx2)), bpx2, exception);
            }
            hashSet.add(bpx2);
        }
    }

    private void a(Deque deque, Set set, bfg bfg2) {
        bpx bpx2 = bfg2.h();
        if (bpx2 != null && !set.contains(bpx2)) {
            deque.add(bpx2);
        }
    }

    private List e(bpx bpx2) {
        ArrayList arrayList = ov.a(bpx2);
        bpx bpx3 = bpx2;
        while ((bpx3 = this.f(bpx3)) != null) {
            arrayList.add(0, bpx3);
        }
        return arrayList;
    }

    private bpx f(bpx bpx2) {
        for (Map.Entry entry : this.i.entrySet()) {
            bfg bfg2 = (bfg)entry.getValue();
            if (bfg2 == null || !bpx2.equals(bfg2.h())) continue;
            return (bpx)entry.getKey();
        }
        return null;
    }

    private Set a(bfg bfg2) {
        HashSet hashSet = aad.a();
        for (vo vo2 : bfg2.a()) {
            for (cvf cvf2 : vo2.c.values()) {
                bpx bpx2 = new bpx(bfg2.c(cvf2.d));
                hashSet.add(bpx2);
            }
        }
        hashSet.add(new bpx(bfg2.c("particle")));
        return hashSet;
    }

    private void m() {
        Set set = this.j();
        set.addAll(this.n());
        set.remove(dam.f);
        dgt dgt2 = new dgt(this, set);
        this.l.a(this.g, dgt2);
        this.h.put(new bpx("missingno"), this.l.c());
    }

    private Set n() {
        HashSet hashSet = aad.a();
        for (bpx bpx2 : this.t.values()) {
            bfg bfg2 = (bfg)this.i.get(bpx2);
            if (bfg2 == null) continue;
            hashSet.add(new bpx(bfg2.c("particle")));
            if (this.b(bfg2)) {
                for (Object object : uy.a) {
                    hashSet.add(new bpx(bfg2.c((String)object)));
                }
                continue;
            }
            if (this.c(bfg2)) continue;
            for (Object object : bfg2.a()) {
                for (cvf cvf2 : ((vo)object).c.values()) {
                    bpx bpx3 = new bpx(bfg2.c(cvf2.d));
                    hashSet.add(bpx3);
                }
            }
        }
        return hashSet;
    }

    private boolean b(bfg bfg2) {
        if (bfg2 == null) {
            return false;
        }
        return bfg2.i() == r;
    }

    private boolean c(bfg bfg2) {
        if (bfg2 == null) {
            return false;
        }
        bfg bfg3 = bfg2.i();
        return bfg3 == s;
    }

    private void o() {
        for (Object object : this.t.values()) {
            bfg bfg2 = (bfg)this.i.get(object);
            if (this.b(bfg2)) {
                bfg bfg3 = this.d(bfg2);
                if (bfg3 != null) {
                    bfg3.b = ((bpx)object).toString();
                }
                this.i.put(object, bfg3);
                continue;
            }
            if (!this.c(bfg2)) continue;
            this.i.put(object, bfg2);
        }
        for (Object object : this.h.values()) {
            if (((ars)object).m()) continue;
            ((ars)object).l();
        }
    }

    private bfg d(bfg bfg2) {
        return this.o.a(this.l, bfg2);
    }

    static /* synthetic */ Map a(yf yf2) {
        return yf2.h;
    }

    static {
        e.put("missing", d);
        f = bx.a(" -> ");
        q = "{    'elements': [        {   'from': [0, 0, 0],            'to': [16, 16, 16],            'faces': {                'down': {'uv': [0, 0, 16, 16], 'texture': '' }            }        }    ]}".replaceAll("'", "\"");
        r = bfg.a(q);
        s = bfg.a(q);
        yf.r.b = "generation marker";
        yf.s.b = "block entity marker";
    }
}

