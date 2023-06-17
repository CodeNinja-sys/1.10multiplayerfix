/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d.a;

import com.a.a.d.sz;
import java.util.Map;

public enum d {
    a("show_text", true),
    b("show_achievement", true),
    c("show_item", true),
    d("show_entity", true);

    private static final Map e;
    private final boolean f;
    private final String g;

    static {
        e = sz.c();
        for (d d2 : net.minecraft.u.d.a.d.values()) {
            e.put(d2.b(), d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private d() {
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

    public static d a(String string) {
        return (d)((Object)e.get(string));
    }
}

