/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.w.a.b;
import net.minecraft.w.c.g;
import net.minecraft.w.c.i;
import net.minecraft.w.c.j;
import net.minecraft.w.c.m;
import net.minecraft.w.c.o;
import net.minecraft.w.c.r;
import net.minecraft.w.e.aj;
import net.minecraft.w.e.ao;
import net.minecraft.w.e.as;
import net.minecraft.w.e.au;
import net.minecraft.w.e.av;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.bb;
import net.minecraft.w.e.be;
import net.minecraft.w.e.bh;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bj;
import net.minecraft.w.e.bk;
import net.minecraft.w.e.bn;
import net.minecraft.w.e.c;
import net.minecraft.w.e.d;
import net.minecraft.w.e.k;
import net.minecraft.w.e.n;
import net.minecraft.w.e.q;
import net.minecraft.w.f;
import net.minecraft.w.f.aa;
import net.minecraft.w.f.ab;
import net.minecraft.w.f.ad;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.af;
import net.minecraft.w.f.e;
import net.minecraft.w.f.l;
import net.minecraft.w.f.s;
import net.minecraft.w.f.u;
import net.minecraft.w.f.x;
import net.minecraft.w.g.a;
import net.minecraft.w.h.ac;
import net.minecraft.w.h.ah;
import net.minecraft.w.h.ak;
import net.minecraft.w.h.al;
import net.minecraft.w.h.am;
import net.minecraft.w.h.w;
import net.minecraft.w.p;

public class h {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private static final Map c = sz.c();
    private static final Map d = sz.c();
    private static final Map e = sz.c();
    private static final Map f = sz.c();
    private static final Map g = sz.c();
    public static final Map a = sz.d();

    static {
        h.a(ae.class, "Item", 1);
        h.a(e.class, "XPOrb", 2);
        h.a(net.minecraft.w.a.class, "AreaEffectCloud", 3);
        h.a(m.class, "ThrownEgg", 7);
        h.a(p.class, "LeashKnot", 8);
        h.a(net.minecraft.w.f.q.class, "Painting", 9);
        h.a(i.class, "Arrow", 10);
        h.a(r.class, "Snowball", 11);
        h.a(g.class, "Fireball", 12);
        h.a(net.minecraft.w.c.d.class, "SmallFireball", 13);
        h.a(net.minecraft.w.f.k.class, "ThrownEnderpearl", 14);
        h.a(net.minecraft.w.f.a.class, "EyeOfEnderSignal", 15);
        h.a(net.minecraft.w.c.k.class, "ThrownPotion", 16);
        h.a(net.minecraft.w.f.p.class, "ThrownExpBottle", 17);
        h.a(l.class, "ItemFrame", 18);
        h.a(net.minecraft.w.c.b.class, "WitherSkull", 19);
        h.a(af.class, "PrimedTnt", 20);
        h.a(net.minecraft.w.f.n.class, "FallingSand", 21);
        h.a(net.minecraft.w.f.h.class, "FireworksRocketEntity", 22);
        h.a(net.minecraft.w.c.h.class, "SpectralArrow", 24);
        h.a(j.class, "ShulkerBullet", 25);
        h.a(o.class, "DragonFireball", 26);
        h.a(net.minecraft.w.f.j.class, "ArmorStand", 30);
        h.a(ab.class, "Boat", 41);
        h.a(s.class, net.minecraft.w.f.m.a.b(), 42);
        h.a(net.minecraft.w.f.d.class, net.minecraft.w.f.m.b.b(), 43);
        h.a(u.class, net.minecraft.w.f.m.c.b(), 44);
        h.a(net.minecraft.w.f.c.class, net.minecraft.w.f.m.d.b(), 45);
        h.a(x.class, net.minecraft.w.f.m.f.b(), 46);
        h.a(aa.class, net.minecraft.w.f.m.e.b(), 47);
        h.a(net.minecraft.w.f.w.class, net.minecraft.w.f.m.g.b(), 40);
        h.a(f.class, "Mob", 48);
        h.a(k.class, "Monster", 49);
        h.a(bi.class, "Creeper", 50, 894731, 0);
        h.a(ay.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        h.a(c.class, "Spider", 52, 3419431, 11013646);
        h.a(be.class, "Giant", 53);
        h.a(d.class, "Zombie", 54, 44975, 7969893);
        h.a(av.class, "Slime", 55, 5349438, 8306542);
        h.a(bn.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        h.a(ao.class, "PigZombie", 57, 15373203, 5009705);
        h.a(au.class, "Enderman", 58, 0x161616, 0);
        h.a(bk.class, "CaveSpider", 59, 803406, 11013646);
        h.a(aj.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        h.a(net.minecraft.w.e.aa.class, "Blaze", 61, 16167425, 16775294);
        h.a(bh.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        h.a(net.minecraft.w.d.a.class, "EnderDragon", 63);
        h.a(net.minecraft.w.d.e.class, "WitherBoss", 64);
        h.a(net.minecraft.w.h.aj.class, "Bat", 65, 4996656, 986895);
        h.a(net.minecraft.w.e.u.class, "Witch", 66, 0x340000, 5349438);
        h.a(q.class, "Endermite", 67, 0x161616, 0x6E6E6E);
        h.a(net.minecraft.w.e.g.class, "Guardian", 68, 5931634, 15826224);
        h.a(as.class, "Shulker", 69, 9725844, 5060690);
        h.a(net.minecraft.w.h.l.class, "Pig", 90, 15771042, 14377823);
        h.a(net.minecraft.w.h.ad.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        h.a(net.minecraft.w.h.ab.class, "Cow", 92, 4470310, 0xA1A1A1);
        h.a(ah.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        h.a(ac.class, "Squid", 94, 2243405, 7375001);
        h.a(net.minecraft.w.h.e.class, "Wolf", 95, 0xD7D3D3, 13545366);
        h.a(w.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        h.a(bb.class, "SnowMan", 97);
        h.a(net.minecraft.w.h.u.class, "Ozelot", 98, 15720061, 5653556);
        h.a(bj.class, "VillagerGolem", 99);
        h.a(al.class, "EntityHorse", 100, 12623485, 0xEEE500);
        h.a(am.class, "Rabbit", 101, 10051392, 7555121);
        h.a(n.class, "PolarBear", 102, 0xF2F2F2, 0x959590);
        h.a(ak.class, "Villager", 120, 5651507, 12422002);
        h.a(ad.class, "EnderCrystal", 200);
        h.a(net.minecraft.l.b.b.class, "VLLR", 121, 5651507, 12422002);
    }

    private static void a(Class class_, String string, int n2) {
        if (c.containsKey(string)) {
            throw new IllegalArgumentException("ID is already registered: " + string);
        }
        if (e.containsKey(n2)) {
            throw new IllegalArgumentException("ID is already registered: " + n2);
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot register to reserved id: " + n2);
        }
        if (class_ == null) {
            throw new IllegalArgumentException("Cannot register null clazz for id: " + n2);
        }
        c.put(string, class_);
        d.put(class_, string);
        e.put(n2, class_);
        f.put(class_, n2);
        g.put(string, n2);
    }

    private static void a(Class class_, String string, int n2, int n3, int n4) {
        h.a(class_, string, n2);
        if (string != "VLLR") {
            a.put(string, new net.minecraft.w.q(string, n3, n4));
        }
    }

    public static net.minecraft.w.n a(String string, net.minecraft.q.k k2) {
        net.minecraft.w.n n2 = null;
        try {
            Class class_ = (Class)c.get(string);
            if (class_ != null) {
                n2 = (net.minecraft.w.n)class_.getConstructor(net.minecraft.q.k.class).newInstance(k2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n2;
    }

    public static net.minecraft.w.n a(net.minecraft.e.e e2, net.minecraft.q.k k2) {
        net.minecraft.w.n n2 = null;
        try {
            Class class_ = (Class)c.get(e2.l("id"));
            if (class_ != null) {
                n2 = (net.minecraft.w.n)class_.getConstructor(net.minecraft.q.k.class).newInstance(k2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (n2 != null) {
            n2.f(e2);
        } else {
            b.f("Skipping Entity with id {}", e2.l("id"));
        }
        return n2;
    }

    public static net.minecraft.w.n a(int n2, net.minecraft.q.k k2) {
        net.minecraft.w.n n3 = null;
        try {
            Class class_ = h.a(n2);
            if (class_ != null) {
                n3 = (net.minecraft.w.n)class_.getConstructor(net.minecraft.q.k.class).newInstance(k2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (n3 == null) {
            b.f("Skipping Entity with id {}", n2);
        }
        return n3;
    }

    public static net.minecraft.w.n b(String string, net.minecraft.q.k k2) {
        return h.a(h.a(string), k2);
    }

    public static int a(net.minecraft.w.n n2) {
        Integer n3 = (Integer)f.get(n2.getClass());
        return n3 == null ? 0 : n3;
    }

    public static Class a(int n2) {
        return (Class)e.get(n2);
    }

    public static String b(net.minecraft.w.n n2) {
        return h.a(n2.getClass());
    }

    public static String a(Class class_) {
        return (String)d.get(class_);
    }

    public static int a(String string) {
        Integer n2 = (Integer)g.get(string);
        return n2 == null ? 90 : n2;
    }

    public static void a() {
    }

    public static List b() {
        Set set = c.keySet();
        ArrayList arrayList = ov.a();
        for (String string : set) {
            Class class_ = (Class)c.get(string);
            if ((class_.getModifiers() & 0x400) == 1024) continue;
            arrayList.add(string);
        }
        arrayList.add("LightningBolt");
        return arrayList;
    }

    public static boolean a(net.minecraft.w.n n2, String string) {
        String string2 = h.b(n2);
        if (string2 == null) {
            if (n2 instanceof b) {
                string2 = "Player";
            } else {
                if (!(n2 instanceof a)) {
                    return false;
                }
                string2 = "LightningBolt";
            }
        }
        return string.equals(string2);
    }

    public static boolean b(String string) {
        return "Player".equals(string) || h.b().contains(string);
    }
}

