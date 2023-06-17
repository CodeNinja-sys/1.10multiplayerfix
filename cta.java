/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum cta {
    a(0, "MinecartRideable"),
    b(1, "MinecartChest"),
    c(2, "MinecartFurnace"),
    d(3, "MinecartTNT"),
    e(4, "MinecartSpawner"),
    f(5, "MinecartHopper"),
    g(6, "MinecartCommandBlock");

    private static final Map h;
    private final int i;
    private final String j;

    /*
     * WARNING - void declaration
     */
    private cta() {
        void var4_2;
        void var3_1;
        this.i = var3_1;
        this.j = var4_2;
    }

    public int a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public static cta a(int n2) {
        cta cta2 = (cta)((Object)h.get(n2));
        return cta2 == null ? a : cta2;
    }

    static {
        h = sz.c();
        for (cta cta2 : cta.values()) {
            h.put(cta2.a(), cta2);
        }
    }
}

