/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ac
extends aa {
    private static final d j = org.apache.logging.log4j.c.c();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f = false;
    public String g;
    public String h;
    public String i;

    public static ac a(z z2) {
        ac ac2 = new ac();
        try {
            ac2.a = com.c.c.e.a.a("id", z2, "");
            ac2.b = com.c.c.e.a.a("name", z2, "");
            ac2.c = com.c.c.e.a.a("version", z2, "");
            ac2.d = com.c.c.e.a.a("author", z2, "");
            ac2.e = com.c.c.e.a.a("link", z2, "");
            ac2.g = com.c.c.e.a.a("image", z2, null);
            ac2.h = com.c.c.e.a.a("trailer", z2, "");
            ac2.i = com.c.c.e.a.a("recommendedPlayers", z2, "");
        }
        catch (Exception exception) {
            j.b("Could not parse WorldTemplate: " + exception.getMessage());
        }
        return ac2;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }
}

