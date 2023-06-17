/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cgz {
    private static final d j = org.apache.logging.log4j.c.c();
    public static final cmb a = new ot(null, "generic.maxHealth", 20.0, 0.0, 1024.0).a("Max Health").a(true);
    public static final cmb b = new ot(null, "generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
    public static final cmb c = new ot(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
    public static final cmb d = new ot(null, "generic.movementSpeed", 0.7f, 0.0, 1024.0).a("Movement Speed").a(true);
    public static final cmb e = new ot(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
    public static final cmb f = new ot(null, "generic.attackSpeed", 4.0, 0.0, 1024.0).a(true);
    public static final cmb g = new ot(null, "generic.armor", 0.0, 0.0, 30.0).a(true);
    public static final cmb h = new ot(null, "generic.armorToughness", 0.0, 0.0, 20.0).a(true);
    public static final cmb i = new ot(null, "generic.luck", 0.0, -1024.0, 1024.0).a(true);

    public static bmh a(anu anu2) {
        bmh bmh2 = new bmh();
        for (cp cp2 : anu2.c()) {
            bmh2.a(cgz.a(cp2));
        }
        return bmh2;
    }

    private static bvp a(cp cp2) {
        bvp bvp2 = new bvp();
        cmb cmb2 = cp2.a();
        bvp2.a("Name", cmb2.b());
        bvp2.a("Base", cp2.b());
        Collection collection = cp2.c();
        if (collection != null && !collection.isEmpty()) {
            bmh bmh2 = new bmh();
            for (cs cs2 : collection) {
                if (!cs2.e()) continue;
                bmh2.a(cgz.a(cs2));
            }
            bvp2.a("Modifiers", bmh2);
        }
        return bvp2;
    }

    public static bvp a(cs cs2) {
        bvp bvp2 = new bvp();
        bvp2.a("Name", cs2.b());
        bvp2.a("Amount", cs2.d());
        bvp2.a("Operation", cs2.c());
        bvp2.a("UUID", cs2.a());
        return bvp2;
    }

    public static void a(anu anu2, bmh bmh2) {
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp2 = bmh2.b(i2);
            cp cp2 = anu2.b(bvp2.l("Name"));
            if (cp2 != null) {
                cgz.a(cp2, bvp2);
                continue;
            }
            j.f("Ignoring unknown attribute '{}'", bvp2.l("Name"));
        }
    }

    private static void a(cp cp2, bvp bvp2) {
        cp2.a(bvp2.k("Base"));
        if (bvp2.b("Modifiers", 9)) {
            bmh bmh2 = bvp2.c("Modifiers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                cs cs2 = cgz.a(bmh2.b(i2));
                if (cs2 == null) continue;
                cs cs3 = cp2.a(cs2.a());
                if (cs3 != null) {
                    cp2.c(cs3);
                }
                cp2.b(cs2);
            }
        }
    }

    public static cs a(bvp bvp2) {
        UUID uUID = bvp2.a("UUID");
        try {
            return new cs(uUID, bvp2.l("Name"), bvp2.k("Amount"), bvp2.h("Operation"));
        }
        catch (Exception exception) {
            j.f("Unable to create attribute: {}", exception.getMessage());
            return null;
        }
    }
}

