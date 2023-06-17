/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class xn
implements akc {
    private static final List a = ov.a("MinecartRideable", "MinecartChest", "MinecartFurnace", "MinecartTNT", "MinecartSpawner", "MinecartHopper", "MinecartCommandBlock");

    @Override
    public int a() {
        return 106;
    }

    @Override
    public bvp a(bvp bvp2) {
        if ("Minecart".equals(bvp2.l("id"))) {
            String string = "MinecartRideable";
            int n2 = bvp2.h("Type");
            if (n2 > 0 && n2 < a.size()) {
                string = (String)a.get(n2);
            }
            bvp2.a("id", string);
            bvp2.q("Type");
        }
        return bvp2;
    }
}

