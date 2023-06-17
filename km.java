/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum km {
    a("show_text", true),
    b("show_achievement", true),
    c("show_item", true),
    d("show_entity", true);

    private static final Map e;
    private final boolean f;
    private final String g;

    /*
     * WARNING - void declaration
     */
    private km() {
        void var4_2;
        void var3_1;
        this.g = var3_1;
        this.f = var4_2;
    }

    public boolean a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public static km a(String string) {
        return (km)((Object)e.get(string));
    }

    static {
        e = sz.c();
        for (km km2 : km.values()) {
            e.put(km2.b(), km2);
        }
    }
}

