/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class i
implements g {
    private static final List a = ov.a("MinecartRideable", "MinecartChest", "MinecartFurnace", "MinecartTNT", "MinecartSpawner", "MinecartHopper", "MinecartCommandBlock");

    @Override
    public int a() {
        return 106;
    }

    @Override
    public e a(e e2) {
        if ("Minecart".equals(e2.l("id"))) {
            String string = "MinecartRideable";
            int n2 = e2.h("Type");
            if (n2 > 0 && n2 < a.size()) {
                string = (String)a.get(n2);
            }
            e2.a("id", string);
            e2.q("Type");
        }
        return e2;
    }
}

