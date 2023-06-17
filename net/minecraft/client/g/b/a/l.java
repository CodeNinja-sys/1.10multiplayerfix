/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

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
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.client.f.an;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.a.i;
import net.minecraft.client.g.b.a.aa;
import net.minecraft.client.g.b.a.ab;
import net.minecraft.client.g.b.a.ad;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.ai;
import net.minecraft.client.g.b.a.aj;
import net.minecraft.client.g.b.a.ak;
import net.minecraft.client.g.b.a.al;
import net.minecraft.client.g.b.a.am;
import net.minecraft.client.g.b.a.ap;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.b;
import net.minecraft.client.g.b.a.ba;
import net.minecraft.client.g.b.a.j;
import net.minecraft.client.g.b.a.m;
import net.minecraft.client.g.b.a.r;
import net.minecraft.client.g.b.a.t;
import net.minecraft.client.g.b.a.y;
import net.minecraft.client.g.b.a.z;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.u.bp;
import net.minecraft.u.c.a;
import net.minecraft.u.c.e;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class l {
    private static final Set b = aad.a(new bp("blocks/water_flow"), new bp("blocks/water_still"), new bp("blocks/lava_flow"), new bp("blocks/lava_still"), new bp("blocks/water_overlay"), new bp("blocks/destroy_stage_0"), new bp("blocks/destroy_stage_1"), new bp("blocks/destroy_stage_2"), new bp("blocks/destroy_stage_3"), new bp("blocks/destroy_stage_4"), new bp("blocks/destroy_stage_5"), new bp("blocks/destroy_stage_6"), new bp("blocks/destroy_stage_7"), new bp("blocks/destroy_stage_8"), new bp("blocks/destroy_stage_9"), new bp("items/empty_armor_slot_helmet"), new bp("items/empty_armor_slot_chestplate"), new bp("items/empty_armor_slot_leggings"), new bp("items/empty_armor_slot_boots"), new bp("items/empty_armor_slot_shield"));
    private static final d c = org.apache.logging.log4j.c.c();
    protected static final ag a = new ag("builtin/missing", "missing");
    private static final String d = "{    'textures': {       'particle': 'missingno',       'missingno': 'missingno'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}".replaceAll("'", "\"");
    private static final Map e = sz.c();
    private static final bx f = bx.a(" -> ");
    private final s g;
    private final Map h = sz.c();
    private final Map i = sz.d();
    private final Map j = sz.d();
    private final Map k = sz.d();
    private final f l;
    private final ac m;
    private final m n = new m();
    private final aj o = new aj();
    private final e p = new e();
    private static final String q = "{    'elements': [        {   'from': [0, 0, 0],            'to': [16, 16, 16],            'faces': {                'down': {'uv': [0, 0, 16, 16], 'texture': '' }            }        }    ]}".replaceAll("'", "\"");
    private static final r r = net.minecraft.client.g.b.a.r.a(q);
    private static final r s = net.minecraft.client.g.b.a.r.a(q);
    private final Map t = sz.d();
    private final Map u = sz.c();
    private final Map v = sz.g();

    static {
        e.put("missing", d);
        net.minecraft.client.g.b.a.l.r.b = "generation marker";
        net.minecraft.client.g.b.a.l.s.b = "block entity marker";
    }

    public l(s s2, f f2, ac ac2) {
        this.g = s2;
        this.l = f2;
        this.m = ac2;
    }

    public a a() {
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
        net.minecraft.client.g.b.b.b b2 = this.m.a();
        for (cn cn2 : cn.v) {
            for (bp bp2 : b2.a(cn2)) {
                try {
                    ai ai2 = this.a(bp2);
                    Map map = b2.b(cn2);
                    if (ai2.b()) {
                        Map.Entry entry = aad.b(map.values());
                        ai2.c().a(cn2.u());
                        this.k.put(ai2, ov.a(mq.c((Iterable)((Object)entry), new ba(this, bp2))));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        ag ag2 = (ag)entry.getValue();
                        if (!bp2.equals(ag2)) continue;
                        try {
                            this.j.put(ag2, ai2.b(ag2.a()));
                        }
                        catch (RuntimeException runtimeException) {
                            if (ai2.b()) continue;
                            c.f("Unable to load variant: {} from {}", ag2.a(), ag2);
                        }
                    }
                }
                catch (Exception exception) {
                    c.f("Unable to load definition {}", bp2, exception);
                }
            }
        }
    }

    private void c() {
        this.j.put(a, new al(ov.a(new am(new bp(a.b()), y.a, false, 1))));
        bp bp2 = new bp("item_frame");
        ai ai2 = this.a(bp2);
        this.a(ai2, new ag(bp2, "normal"));
        this.a(ai2, new ag(bp2, "map"));
        this.d();
        this.e();
        this.f();
    }

    private void a(ai ai2, ag ag2) {
        this.j.put(ag2, ai2.b(ag2.a()));
    }

    private ai a(bp bp2) {
        bp bp3 = this.b(bp2);
        ai ai2 = (ai)this.u.get(bp3);
        if (ai2 == null) {
            ai2 = this.a(bp2, bp3);
            this.u.put(bp3, ai2);
        }
        return ai2;
    }

    private ai a(bp bp2, bp bp3) {
        ArrayList arrayList = ov.a();
        try {
            for (an an2 : this.g.b(bp3)) {
                arrayList.add(this.a(bp2, an2));
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Encountered an exception when loading model definition of model " + bp3, iOException);
        }
        return new ai(arrayList);
    }

    private ai a(bp bp2, an an2) {
        ai ai2;
        InputStream inputStream = null;
        try {
            try {
                inputStream = an2.b();
                ai2 = ai.a(new InputStreamReader(inputStream, com.a.a.b.aj.c));
            }
            catch (Exception exception) {
                throw new RuntimeException("Encountered an exception when loading model definition of '" + bp2 + "' from: '" + an2.a() + "' in resourcepack: '" + an2.d() + "'", exception);
            }
        }
        finally {
            org.apache.commons.b.t.a(inputStream);
        }
        return ai2;
    }

    private bp b(bp bp2) {
        return new bp(bp2.c(), "blockstates/" + bp2.b() + ".json");
    }

    private void d() {
        for (Map.Entry entry : this.j.entrySet()) {
            this.a((ag)entry.getKey(), (al)entry.getValue());
        }
    }

    private void e() {
        for (Map.Entry entry : this.k.entrySet()) {
            ag ag2 = (ag)((Collection)entry.getValue()).iterator().next();
            for (al al2 : ((ai)entry.getKey()).a()) {
                this.a(ag2, al2);
            }
        }
    }

    private void a(ag ag2, al al2) {
        for (am am2 : al2.a()) {
            bp bp2 = am2.a();
            if (this.i.get(bp2) != null) continue;
            try {
                this.i.put(bp2, this.c(bp2));
            }
            catch (Exception exception) {
                c.f("Unable to load block model: '{}' for variant: '{}': {} ", bp2, ag2, exception);
            }
        }
    }

    private r c(bp bp2) {
        r r2;
        an an2;
        Reader reader;
        block8: {
            Object object;
            String string;
            block9: {
                r r3;
                reader = null;
                an2 = null;
                string = bp2.b();
                if ("builtin/generated".equals(string)) break block8;
                if (!"builtin/entity".equals(string)) break block9;
                r r4 = r3 = s;
                org.apache.commons.b.t.a(reader);
                org.apache.commons.b.t.a(an2);
                return r4;
            }
            if (string.startsWith("builtin/")) {
                object = string.substring("builtin/".length());
                String string2 = (String)e.get(object);
                if (string2 == null) {
                    throw new FileNotFoundException(bp2.toString());
                }
                reader = new StringReader(string2);
            } else {
                an2 = this.g.a(this.d(bp2));
                reader = new InputStreamReader(an2.b(), com.a.a.b.aj.c);
            }
            r r5 = net.minecraft.client.g.b.a.r.a(reader);
            r5.b = bp2.toString();
            Object object2 = object = r5;
            org.apache.commons.b.t.a(reader);
            org.apache.commons.b.t.a(an2);
            return object2;
        }
        try {
            r2 = r;
        }
        finally {
            org.apache.commons.b.t.a(reader);
            org.apache.commons.b.t.a(an2);
        }
        return r2;
    }

    private bp d(bp bp2) {
        return new bp(bp2.c(), "models/" + bp2.b() + ".json");
    }

    private void f() {
        this.g();
        for (cg cg2 : cg.e) {
            for (String string : this.a(cg2)) {
                r r2;
                bp bp2 = this.a(string);
                bp bp3 = (bp)cg.e.b(cg2);
                this.a(string, bp2, bp3);
                if (!cg2.h() || (r2 = (r)this.i.get(bp2)) == null) continue;
                for (bp bp4 : r2.e()) {
                    this.a(bp4.toString(), bp4, bp3);
                }
            }
        }
    }

    private void a(String string, bp bp2, bp bp3) {
        this.t.put(string, bp2);
        if (this.i.get(bp2) == null) {
            try {
                r r2 = this.c(bp2);
                this.i.put(bp2, r2);
            }
            catch (Exception exception) {
                c.f("Unable to load item model: '{}' for item: '{}'", bp2, bp3, exception);
            }
        }
    }

    private void g() {
        this.v.put(cg.a(net.minecraft.a.p.b), ov.a("stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"));
        this.v.put(cg.a(net.minecraft.a.p.d), ov.a("dirt", "coarse_dirt", "podzol"));
        this.v.put(cg.a(net.minecraft.a.p.f), ov.a("oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"));
        this.v.put(cg.a(net.minecraft.a.p.g), ov.a("oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"));
        this.v.put(cg.a(net.minecraft.a.p.m), ov.a("sand", "red_sand"));
        this.v.put(cg.a(net.minecraft.a.p.r), ov.a("oak_log", "spruce_log", "birch_log", "jungle_log"));
        this.v.put(cg.a(net.minecraft.a.p.t), ov.a("oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"));
        this.v.put(cg.a(net.minecraft.a.p.v), ov.a("sponge", "sponge_wet"));
        this.v.put(cg.a(net.minecraft.a.p.A), ov.a("sandstone", "chiseled_sandstone", "smooth_sandstone"));
        this.v.put(cg.a(net.minecraft.a.p.cM), ov.a("red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"));
        this.v.put(cg.a(net.minecraft.a.p.H), ov.a("dead_bush", "tall_grass", "fern"));
        this.v.put(cg.a(net.minecraft.a.p.I), ov.a(new String[]{"dead_bush"}));
        this.v.put(cg.a(net.minecraft.a.p.L), ov.a("black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"));
        this.v.put(cg.a(net.minecraft.a.p.N), ov.a(new String[]{"dandelion"}));
        this.v.put(cg.a(net.minecraft.a.p.O), ov.a("poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"));
        this.v.put(cg.a(net.minecraft.a.p.U), ov.a("stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"));
        this.v.put(cg.a(net.minecraft.a.p.cP), ov.a(new String[]{"red_sandstone_slab"}));
        this.v.put(cg.a(net.minecraft.a.p.cG), ov.a("black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"));
        this.v.put(cg.a(net.minecraft.a.p.be), ov.a("stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"));
        this.v.put(cg.a(net.minecraft.a.p.bf), ov.a("stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"));
        this.v.put(cg.a(net.minecraft.a.p.bM), ov.a("oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"));
        this.v.put(cg.a(net.minecraft.a.p.bZ), ov.a("cobblestone_wall", "mossy_cobblestone_wall"));
        this.v.put(cg.a(net.minecraft.a.p.cf), ov.a("anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"));
        this.v.put(cg.a(net.minecraft.a.p.cq), ov.a("quartz_block", "chiseled_quartz_block", "quartz_column"));
        this.v.put(cg.a(net.minecraft.a.p.cu), ov.a("black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"));
        this.v.put(cg.a(net.minecraft.a.p.cH), ov.a("black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"));
        this.v.put(cg.a(net.minecraft.a.p.u), ov.a("acacia_leaves", "dark_oak_leaves"));
        this.v.put(cg.a(net.minecraft.a.p.s), ov.a("acacia_log", "dark_oak_log"));
        this.v.put(cg.a(net.minecraft.a.p.cI), ov.a("prismarine", "prismarine_bricks", "dark_prismarine"));
        this.v.put(cg.a(net.minecraft.a.p.cy), ov.a("black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"));
        this.v.put(cg.a(net.minecraft.a.p.cF), ov.a("sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"));
        this.v.put(w.j, ov.a("coal", "charcoal"));
        this.v.put(w.bb, ov.a("cod", "salmon", "clownfish", "pufferfish"));
        this.v.put(w.bc, ov.a("cooked_cod", "cooked_salmon"));
        this.v.put(w.bd, ov.a("dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"));
        this.v.put(w.bG, ov.a(new String[]{"bottle_drinkable"}));
        this.v.put(w.ch, ov.a("skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"));
        this.v.put(w.bH, ov.a(new String[]{"bottle_splash"}));
        this.v.put(w.bI, ov.a(new String[]{"bottle_lingering"}));
        this.v.put(cg.a(net.minecraft.a.p.bo), ov.a(new String[]{"oak_fence_gate"}));
        this.v.put(cg.a(net.minecraft.a.p.aO), ov.a(new String[]{"oak_fence"}));
        this.v.put(w.as, ov.a(new String[]{"oak_door"}));
        this.v.put(w.aG, ov.a(new String[]{"oak_boat"}));
    }

    private List a(cg cg2) {
        List<String> list = (List<String>)this.v.get(cg2);
        if (list == null) {
            list = Collections.singletonList(((bp)cg.e.b(cg2)).toString());
        }
        return list;
    }

    private bp a(String string) {
        bp bp2 = new bp(string);
        return new bp(bp2.c(), "item/" + bp2.b());
    }

    private void h() {
        Object object;
        for (ag object2 : this.j.keySet()) {
            object = this.a((al)this.j.get(object2), object2.toString());
            if (object == null) continue;
            this.p.a(object2, object);
        }
        for (Map.Entry entry : this.k.entrySet()) {
            Object object22;
            object = (ai)entry.getKey();
            i i2 = ((ai)object).c();
            String string = ((bp)cn.v.b(i2.c().c())).toString();
            aa aa2 = new aa();
            for (Object object22 : i2.a()) {
                aq aq2 = this.a(((net.minecraft.client.g.b.a.a.j)object22).a(), "selector of " + string);
                if (aq2 == null) continue;
                aa2.a(((net.minecraft.client.g.b.a.a.j)object22).a(i2.c()), aq2);
            }
            object22 = aa2.a();
            for (Object object3 : (Collection)entry.getValue()) {
                if (((ai)object).a(((ag)object3).a())) continue;
                this.p.a(object3, object22);
            }
        }
    }

    private aq a(al al2, String string) {
        Object object2;
        if (al2.a().isEmpty()) {
            return null;
        }
        ap ap2 = new ap();
        int n2 = 0;
        for (Object object2 : al2.a()) {
            r r2 = (r)this.i.get(((am)object2).a());
            if (r2 != null && r2.d()) {
                if (r2.a().isEmpty()) {
                    c.f("Missing elements for: {}", string);
                    continue;
                }
                aq aq2 = this.a(r2, ((am)object2).b(), ((am)object2).c());
                if (aq2 == null) continue;
                ++n2;
                ap2.a(aq2, ((am)object2).d());
                continue;
            }
            c.f("Missing model for: {}", string);
        }
        object2 = null;
        if (n2 == 0) {
            c.f("No weighted models for: {}", string);
        } else {
            object2 = n2 == 1 ? ap2.b() : ap2.a();
        }
        return object2;
    }

    private void i() {
        for (Map.Entry entry : this.t.entrySet()) {
            bp bp2 = (bp)entry.getValue();
            ag ag2 = new ag((String)entry.getKey(), "inventory");
            r r2 = (r)this.i.get(bp2);
            if (r2 != null && r2.d()) {
                if (r2.a().isEmpty()) {
                    c.f("Missing elements for: {}", bp2);
                    continue;
                }
                if (this.c(r2)) {
                    this.p.a(ag2, new z(r2.j(), r2.g()));
                    continue;
                }
                aq aq2 = this.a(r2, y.a, false);
                if (aq2 == null) continue;
                this.p.a(ag2, aq2);
                continue;
            }
            c.f("Missing model for: {}", bp2);
        }
    }

    private Set j() {
        HashSet hashSet = aad.a();
        ArrayList arrayList = ov.a(this.j.keySet());
        Collections.sort(arrayList, new j(this));
        for (Object object : arrayList) {
            al al2 = (al)this.j.get(object);
            for (Object object2 : al2.a()) {
                r r2 = (r)this.i.get(((am)object2).a());
                if (r2 == null) {
                    c.f("Missing model for: {}", object);
                    continue;
                }
                hashSet.addAll(this.a(r2));
            }
        }
        for (Object object : this.k.keySet()) {
            for (al al2 : ((ai)object).c().b()) {
                for (Object object3 : al2.a()) {
                    r r3 = (r)this.i.get(((am)object3).a());
                    if (r3 == null) {
                        c.f("Missing model for: {}", cn.v.b(((ai)object).c().c().c()));
                        continue;
                    }
                    hashSet.addAll(this.a(r3));
                }
            }
        }
        hashSet.addAll(b);
        return hashSet;
    }

    private aq a(r r2, y y2, boolean bl2) {
        net.minecraft.client.g.a.d d2 = (net.minecraft.client.g.a.d)this.h.get(new bp(r2.c("particle")));
        ad ad2 = new ad(r2, r2.g()).a(d2);
        if (r2.a().isEmpty()) {
            return null;
        }
        for (ak ak2 : r2.a()) {
            for (net.minecraft.u.ad ad3 : ak2.c.keySet()) {
                b b2 = (b)ak2.c.get(ad3);
                net.minecraft.client.g.a.d d3 = (net.minecraft.client.g.a.d)this.h.get(new bp(r2.c(b2.d)));
                if (b2.b == null) {
                    ad2.a(this.a(ak2, b2, d3, ad3, y2, bl2));
                    continue;
                }
                ad2.a(y2.a(b2.b), this.a(ak2, b2, d3, ad3, y2, bl2));
            }
        }
        return ad2.a();
    }

    private t a(ak ak2, b b2, net.minecraft.client.g.a.d d2, net.minecraft.u.ad ad2, y y2, boolean bl2) {
        return this.n.a(ak2.a, ak2.b, b2, d2, ad2, y2, ak2.d, bl2, ak2.e);
    }

    private void k() {
        this.l();
        for (r r2 : this.i.values()) {
            r2.a(this.i);
        }
        net.minecraft.client.g.b.a.r.b(this.i);
    }

    private void l() {
        ArrayDeque arrayDeque = yk.a();
        HashSet hashSet = aad.a();
        for (bp bp2 : this.i.keySet()) {
            hashSet.add(bp2);
            this.a(arrayDeque, hashSet, (r)this.i.get(bp2));
        }
        while (!arrayDeque.isEmpty()) {
            bp bp2;
            bp2 = (bp)arrayDeque.pop();
            try {
                if (this.i.get(bp2) != null) continue;
                r r2 = this.c(bp2);
                this.i.put(bp2, r2);
                this.a(arrayDeque, hashSet, r2);
            }
            catch (Exception exception) {
                c.f("In parent chain: {}; unable to load model: '{}'", f.a(this.e(bp2)), bp2, exception);
            }
            hashSet.add(bp2);
        }
    }

    private void a(Deque deque, Set set, r r2) {
        bp bp2 = r2.h();
        if (bp2 != null && !set.contains(bp2)) {
            deque.add(bp2);
        }
    }

    private List e(bp bp2) {
        ArrayList arrayList = ov.a(bp2);
        bp bp3 = bp2;
        while ((bp3 = this.f(bp3)) != null) {
            arrayList.add(0, bp3);
        }
        return arrayList;
    }

    private bp f(bp bp2) {
        for (Map.Entry entry : this.i.entrySet()) {
            r r2 = (r)entry.getValue();
            if (r2 == null || !bp2.equals(r2.h())) continue;
            return (bp)entry.getKey();
        }
        return null;
    }

    private Set a(r r2) {
        HashSet hashSet = aad.a();
        for (ak ak2 : r2.a()) {
            for (b b2 : ak2.c.values()) {
                bp bp2 = new bp(r2.c(b2.d));
                hashSet.add(bp2);
            }
        }
        hashSet.add(new bp(r2.c("particle")));
        return hashSet;
    }

    private void m() {
        Set set = this.j();
        set.addAll(this.n());
        set.remove(net.minecraft.client.g.a.f.a);
        ab ab2 = new ab(this, set);
        this.l.a(this.g, ab2);
        this.h.put(new bp("missingno"), this.l.c());
    }

    private Set n() {
        HashSet hashSet = aad.a();
        for (bp bp2 : this.t.values()) {
            r r2 = (r)this.i.get(bp2);
            if (r2 == null) continue;
            hashSet.add(new bp(r2.c("particle")));
            if (this.b(r2)) {
                for (Object object : aj.a) {
                    hashSet.add(new bp(r2.c((String)object)));
                }
                continue;
            }
            if (this.c(r2)) continue;
            for (Object object : r2.a()) {
                for (b b2 : ((ak)object).c.values()) {
                    bp bp3 = new bp(r2.c(b2.d));
                    hashSet.add(bp3);
                }
            }
        }
        return hashSet;
    }

    private boolean b(r r2) {
        return r2 == null ? false : r2.i() == r;
    }

    private boolean c(r r2) {
        if (r2 == null) {
            return false;
        }
        r r3 = r2.i();
        return r3 == s;
    }

    private void o() {
        for (Object object : this.t.values()) {
            r r2 = (r)this.i.get(object);
            if (this.b(r2)) {
                r r3 = this.d(r2);
                if (r3 != null) {
                    r3.b = ((bp)object).toString();
                }
                this.i.put(object, r3);
                continue;
            }
            if (!this.c(r2)) continue;
            this.i.put(object, r2);
        }
        for (Object object : this.h.values()) {
            if (((net.minecraft.client.g.a.d)object).m()) continue;
            ((net.minecraft.client.g.a.d)object).l();
        }
    }

    private r d(r r2) {
        return this.o.a(this.l, r2);
    }

    static /* synthetic */ Map a(l l2) {
        return l2.h;
    }
}

