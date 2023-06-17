/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.at;

public enum ae implements cm,
at
{
    a("x", ag.a),
    b("y", ag.b),
    c("z", ag.a);

    private static final Map d;
    private final String e;
    private final ag f;

    static {
        d = sz.c();
        for (ae ae2 : ae.values()) {
            d.put(ae2.b().toLowerCase(), ae2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private ae() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public static ae a(String string) {
        return string == null ? null : (ae)d.get(string.toLowerCase());
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.f == ag.b;
    }

    public boolean d() {
        return this.f == ag.a;
    }

    public String toString() {
        return this.e;
    }

    public boolean a(ad ad2) {
        return ad2 != null && ad2.l() == this;
    }

    public ag e() {
        return this.f;
    }

    @Override
    public String a() {
        return this.e;
    }
}

