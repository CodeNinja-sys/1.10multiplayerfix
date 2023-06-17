/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class vb {
    private static final d b = org.apache.logging.log4j.c.c();
    private static final Map c = sz.c();
    private static final Map d = sz.c();
    private static final Map e = sz.c();
    private static final Map f = sz.c();
    private static final Map g = sz.c();
    public static final Map a = sz.d();

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
        vb.a(class_, string, n2);
        a.put(string, new qb(string, n3, n4));
    }

    public static cpk a(String string, iu iu2) {
        cpk cpk2 = null;
        try {
            Class class_ = (Class)c.get(string);
            if (class_ != null) {
                cpk2 = (cpk)class_.getConstructor(iu.class).newInstance(iu2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return cpk2;
    }

    public static cpk a(bvp bvp2, iu iu2) {
        cpk cpk2 = null;
        try {
            Class class_ = (Class)c.get(bvp2.l("id"));
            if (class_ != null) {
                cpk2 = (cpk)class_.getConstructor(iu.class).newInstance(iu2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (cpk2 != null) {
            cpk2.f(bvp2);
        } else {
            b.f("Skipping Entity with id {}", bvp2.l("id"));
        }
        return cpk2;
    }

    public static cpk a(int n2, iu iu2) {
        cpk cpk2 = null;
        try {
            Class class_ = vb.a(n2);
            if (class_ != null) {
                cpk2 = (cpk)class_.getConstructor(iu.class).newInstance(iu2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (cpk2 == null) {
            b.f("Skipping Entity with id {}", n2);
        }
        return cpk2;
    }

    public static cpk b(String string, iu iu2) {
        return vb.a(vb.a(string), iu2);
    }

    public static int a(cpk cpk2) {
        Integer n2 = (Integer)f.get(cpk2.getClass());
        return n2 == null ? 0 : n2;
    }

    public static Class a(int n2) {
        return (Class)e.get(n2);
    }

    public static String b(cpk cpk2) {
        return vb.a(cpk2.getClass());
    }

    public static String a(Class class_) {
        return (String)d.get(class_);
    }

    public static int a(String string) {
        Integer n2 = (Integer)g.get(string);
        if (n2 == null) {
            return 90;
        }
        return n2;
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

    public static boolean a(cpk cpk2, String string) {
        String string2 = vb.b(cpk2);
        if (string2 == null) {
            if (cpk2 instanceof bdl) {
                string2 = "Player";
            } else if (cpk2 instanceof tz) {
                string2 = "LightningBolt";
            } else {
                return false;
            }
        }
        return string.equals(string2);
    }

    public static boolean b(String string) {
        return "Player".equals(string) || vb.b().contains(string);
    }

    static {
        vb.a(er.class, "Item", 1);
        vb.a(cvs.class, "XPOrb", 2);
        vb.a(gw.class, "AreaEffectCloud", 3);
        vb.a(xe.class, "ThrownEgg", 7);
        vb.a(ahe.class, "LeashKnot", 8);
        vb.a(cbk.class, "Painting", 9);
        vb.a(bib.class, "Arrow", 10);
        vb.a(bef.class, "Snowball", 11);
        vb.a(cyk.class, "Fireball", 12);
        vb.a(bx.class, "SmallFireball", 13);
        vb.a(ddg.class, "ThrownEnderpearl", 14);
        vb.a(cnd.class, "EyeOfEnderSignal", 15);
        vb.a(tp.class, "ThrownPotion", 16);
        vb.a(bgc.class, "ThrownExpBottle", 17);
        vb.a(cvr.class, "ItemFrame", 18);
        vb.a(nm.class, "WitherSkull", 19);
        vb.a(cgg.class, "PrimedTnt", 20);
        vb.a(azb.class, "FallingSand", 21);
        vb.a(p.class, "FireworksRocketEntity", 22);
        vb.a(bno.class, "SpectralArrow", 24);
        vb.a(dcg.class, "ShulkerBullet", 25);
        vb.a(ckd.class, "DragonFireball", 26);
        vb.a(bdi.class, "ArmorStand", 30);
        vb.a(cor.class, "Boat", 41);
        vb.a(rg.class, cta.a.b(), 42);
        vb.a(cxa.class, cta.b.b(), 43);
        vb.a(ww.class, cta.c.b(), 44);
        vb.a(ji.class, cta.d.b(), 45);
        vb.a(dfc.class, cta.f.b(), 46);
        vb.a(bnc.class, cta.e.b(), 47);
        vb.a(dbu.class, cta.g.b(), 40);
        vb.a(xy.class, "Mob", 48);
        vb.a(acm.class, "Monster", 49);
        vb.a(ddh.class, "Creeper", 50, 894731, 0);
        vb.a(azy.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        vb.a(yi.class, "Spider", 52, 3419431, 11013646);
        vb.a(aah.class, "Giant", 53);
        vb.a(oe.class, "Zombie", 54, 44975, 7969893);
        vb.a(akr.class, "Slime", 55, 5349438, 8306542);
        vb.a(ha.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        vb.a(csq.class, "PigZombie", 57, 15373203, 5009705);
        vb.a(bgv.class, "Enderman", 58, 0x161616, 0);
        vb.a(bys.class, "CaveSpider", 59, 803406, 11013646);
        vb.a(zv.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        vb.a(abs.class, "Blaze", 61, 16167425, 16775294);
        vb.a(clw.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        vb.a(brd.class, "EnderDragon", 63);
        vb.a(dga.class, "WitherBoss", 64);
        vb.a(azc.class, "Bat", 65, 4996656, 986895);
        vb.a(byl.class, "Witch", 66, 0x340000, 5349438);
        vb.a(cjo.class, "Endermite", 67, 0x161616, 0x6E6E6E);
        vb.a(bym.class, "Guardian", 68, 5931634, 15826224);
        vb.a(aoa.class, "Shulker", 69, 9725844, 5060690);
        vb.a(cna.class, "Pig", 90, 15771042, 14377823);
        vb.a(ne.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        vb.a(cof.class, "Cow", 92, 4470310, 0xA1A1A1);
        vb.a(jp.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        vb.a(aqc.class, "Squid", 94, 2243405, 7375001);
        vb.a(cqw.class, "Wolf", 95, 0xD7D3D3, 13545366);
        vb.a(blx.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        vb.a(cce.class, "SnowMan", 97);
        vb.a(fl.class, "Ozelot", 98, 15720061, 5653556);
        vb.a(hx.class, "VillagerGolem", 99);
        vb.a(it.class, "EntityHorse", 100, 12623485, 0xEEE500);
        vb.a(amq.class, "Rabbit", 101, 10051392, 7555121);
        vb.a(cmg.class, "PolarBear", 102, 0xF2F2F2, 0x959590);
        vb.a(cwp.class, "Villager", 120, 5651507, 12422002);
        vb.a(abi.class, "EnderCrystal", 200);
    }
}

