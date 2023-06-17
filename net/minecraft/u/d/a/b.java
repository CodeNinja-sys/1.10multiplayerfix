/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d.a;

import com.a.a.d.sz;
import java.util.Map;

public enum b {
    a("open_url", true),
    b("open_file", false),
    c("run_command", true),
    d("suggest_command", true),
    e("change_page", true);

    private static final Map f;
    private final boolean g;
    private final String h;

    static {
        f = sz.c();
        for (b b2 : net.minecraft.u.d.a.b.values()) {
            f.put(b2.b(), b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private b() {
        void var4_2;
        void var3_1;
        this.h = var3_1;
        this.g = var4_2;
    }

    public boolean a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    public static b a(String string) {
        return (b)((Object)f.get(string));
    }
}

