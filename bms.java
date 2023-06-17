/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bms
implements cui {
    private static final d a = c.c();

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        bvp bvp3 = bvp2.o("tag");
        if (bvp3.b("EntityTag", 10)) {
            boolean bl2;
            String string;
            bvp bvp4 = bvp3.o("EntityTag");
            String string2 = bvp2.l("id");
            if ("minecraft:armor_stand".equals(string2)) {
                string = "ArmorStand";
            } else if ("minecraft:spawn_egg".equals(string2)) {
                string = bvp4.l("id");
            } else {
                return bvp2;
            }
            if (string == null) {
                a.f("Unable to resolve Entity for ItemInstance: {}", string2);
                bl2 = false;
            } else {
                bl2 = !bvp4.b("id", 8);
                bvp4.a("id", string);
            }
            bzs2.a(bst.e, bvp4, n2);
            if (bl2) {
                bvp4.q("id");
            }
        }
        return bvp2;
    }
}

