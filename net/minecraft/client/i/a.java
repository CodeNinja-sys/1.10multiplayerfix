/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import net.minecraft.client.i.f;
import net.minecraft.e.e;

public class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public int f = 210;
    public String g = "1.10 Multiplayer Fix";
    public boolean h;
    public String i;
    private f j = net.minecraft.client.i.f.c;
    private String k;
    private boolean l;

    public a(String string, String string2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.l = bl2;
    }

    public e a() {
        e e2 = new e();
        e2.a("name", this.a);
        e2.a("ip", this.b);
        if (this.k != null) {
            e2.a("icon", this.k);
        }
        if (this.j == net.minecraft.client.i.f.a) {
            e2.a("acceptTextures", true);
        } else if (this.j == net.minecraft.client.i.f.b) {
            e2.a("acceptTextures", false);
        }
        return e2;
    }

    public f b() {
        return this.j;
    }

    public void a(f f2) {
        this.j = f2;
    }

    public static a a(e e2) {
        a a2 = new a(e2.l("name"), e2.l("ip"), false);
        if (e2.b("icon", 8)) {
            a2.a(e2.l("icon"));
        }
        if (e2.b("acceptTextures", 1)) {
            if (e2.p("acceptTextures")) {
                a2.a(net.minecraft.client.i.f.a);
            } else {
                a2.a(net.minecraft.client.i.f.b);
            }
        } else {
            a2.a(net.minecraft.client.i.f.c);
        }
        return a2;
    }

    public String c() {
        return this.k;
    }

    public void a(String string) {
        this.k = string;
    }

    public boolean d() {
        return this.l;
    }

    public void a(a a2) {
        this.b = a2.b;
        this.a = a2.a;
        this.a(a2.b());
        this.k = a2.k;
        this.l = a2.l;
    }
}

