/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import net.minecraft.client.e.b;
import net.minecraft.client.g.ay;
import net.minecraft.client.m.c;
import org.apache.logging.log4j.d;

public class g {
    private static final d a = org.apache.logging.log4j.c.c();
    private static g b;

    public static void a() {
        b = new g();
    }

    public static g b() {
        return b;
    }

    public void a(c c2) {
        c2.f().b(c2);
        c2.e().b(c2);
        ay.e(c2.g());
    }

    public int c() {
        int n2 = ay.d();
        if (n2 <= 0) {
            throw new b("Could not create shader program (returned program ID " + n2 + ")");
        }
        return n2;
    }

    public void b(c c2) {
        c2.f().a(c2);
        c2.e().a(c2);
        ay.f(c2.g());
        int n2 = ay.a(c2.g(), ay.m);
        if (n2 == 0) {
            a.f("Error encountered when linking program containing VS {} and FS {}. Log output:", c2.e().a(), c2.f().a());
            a.f(ay.e(c2.g(), 32768));
        }
    }
}

