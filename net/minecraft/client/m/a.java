/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.ay;

public enum a {
    a("vertex", ".vsh", ay.o),
    b("fragment", ".fsh", ay.p);

    private final String c;
    private final String d;
    private final int e;
    private final Map f = sz.c();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a(int n2) {
        void var5_3;
        void var4_2;
        this.c = (String)n2;
        this.d = var4_2;
        this.e = var5_3;
    }

    public String a() {
        return this.c;
    }

    private String b() {
        return this.d;
    }

    private int c() {
        return this.e;
    }

    private Map d() {
        return this.f;
    }

    static /* synthetic */ Map a(a a2) {
        return a2.d();
    }

    static /* synthetic */ String b(a a2) {
        return a2.b();
    }

    static /* synthetic */ int c(a a2) {
        return a2.c();
    }
}

