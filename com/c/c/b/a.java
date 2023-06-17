/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class a
extends aa {
    private static final d f = org.apache.logging.log4j.c.c();
    public String a;
    public Date b;
    public long c;
    private boolean g = false;
    public Map d = new HashMap();
    public Map e = new HashMap();

    public static a a(w w2) {
        z z2 = w2.t();
        a a2 = new a();
        try {
            a2.a = com.c.c.e.a.a("backupId", z2, "");
            a2.b = com.c.c.e.a.a("lastModifiedDate", z2);
            a2.c = com.c.c.e.a.a("size", z2, 0L);
            if (z2.b("metadata")) {
                z z3 = z2.f("metadata");
                Set set = z3.b();
                for (Map.Entry entry : set) {
                    if (((w)entry.getValue()).s()) continue;
                    a2.d.put(com.c.c.b.a.a((String)entry.getKey()), ((w)entry.getValue()).d());
                }
            }
        }
        catch (Exception exception) {
            f.b("Could not parse Backup: " + exception.getMessage());
        }
        return a2;
    }

    private static String a(String string) {
        String[] arrstring = string.split("_");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : arrstring) {
            if (string2 == null || string2.length() < 1) continue;
            if (string2.equals("of")) {
                stringBuilder.append(string2).append(" ");
                continue;
            }
            char c2 = Character.toUpperCase(string2.charAt(0));
            stringBuilder.append(c2).append(string2.substring(1, string2.length())).append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean a() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }
}

