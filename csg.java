/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.Set;

public enum csg {
    a("master"),
    b("music"),
    c("record"),
    d("weather"),
    e("block"),
    f("hostile"),
    g("neutral"),
    h("player"),
    i("ambient"),
    j("voice");

    private static final Map k;
    private final String l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private csg() {
        void var3_1;
        this.l = var3_1;
    }

    public String a() {
        return this.l;
    }

    public static csg a(String string) {
        return (csg)((Object)k.get(string));
    }

    public static Set b() {
        return k.keySet();
    }

    static {
        k = sz.c();
        for (csg csg2 : csg.values()) {
            if (k.containsKey(csg2.a())) {
                throw new Error("Clash in Sound Category name pools! Cannot insert " + (Object)((Object)csg2));
            }
            k.put(csg2.a(), csg2);
        }
    }
}

