/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import java.util.Collection;
import java.util.UUID;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.w.b.a.b;
import net.minecraft.w.b.a.c;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;

public class d {
    private static final org.apache.logging.log4j.d j = org.apache.logging.log4j.c.c();
    public static final f a = new c(null, "generic.maxHealth", 20.0, 0.0, 1024.0).a("Max Health").a(true);
    public static final f b = new c(null, "generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
    public static final f c = new c(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
    public static final f d = new c(null, "generic.movementSpeed", 0.7f, 0.0, 1024.0).a("Movement Speed").a(true);
    public static final f e = new c(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
    public static final f f = new c(null, "generic.attackSpeed", 4.0, 0.0, 1024.0).a(true);
    public static final f g = new c(null, "generic.armor", 0.0, 0.0, 30.0).a(true);
    public static final f h = new c(null, "generic.armorToughness", 0.0, 0.0, 20.0).a(true);
    public static final f i = new c(null, "generic.luck", 0.0, -1024.0, 1024.0).a(true);

    public static q a(b b2) {
        q q2 = new q();
        for (i i2 : b2.a()) {
            q2.a(net.minecraft.w.d.a(i2));
        }
        return q2;
    }

    private static e a(i i2) {
        e e2 = new e();
        f f2 = i2.a();
        e2.a("Name", f2.b());
        e2.a("Base", i2.b());
        Collection collection = i2.c();
        if (collection != null && !collection.isEmpty()) {
            q q2 = new q();
            for (h h2 : collection) {
                if (!h2.e()) continue;
                q2.a(net.minecraft.w.d.a(h2));
            }
            e2.a("Modifiers", q2);
        }
        return e2;
    }

    public static e a(h h2) {
        e e2 = new e();
        e2.a("Name", h2.b());
        e2.a("Amount", h2.d());
        e2.a("Operation", h2.c());
        e2.a("UUID", h2.a());
        return e2;
    }

    public static void a(b b2, q q2) {
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e2 = q2.b(i2);
            i i3 = b2.a(e2.l("Name"));
            if (i3 != null) {
                net.minecraft.w.d.a(i3, e2);
                continue;
            }
            j.f("Ignoring unknown attribute '{}'", e2.l("Name"));
        }
    }

    private static void a(i i2, e e2) {
        i2.a(e2.k("Base"));
        if (e2.b("Modifiers", 9)) {
            q q2 = e2.c("Modifiers", 10);
            for (int i3 = 0; i3 < q2.e(); ++i3) {
                h h2 = net.minecraft.w.d.a(q2.b(i3));
                if (h2 == null) continue;
                h h3 = i2.a(h2.a());
                if (h3 != null) {
                    i2.c(h3);
                }
                i2.b(h2);
            }
        }
    }

    public static h a(e e2) {
        UUID uUID = e2.a("UUID");
        try {
            return new h(uUID, e2.l("Name"), e2.k("Amount"), e2.h("Operation"));
        }
        catch (Exception exception) {
            j.f("Unable to create attribute: {}", exception.getMessage());
            return null;
        }
    }
}

