/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.t;
import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.g;
import com.c.c.b.j;
import com.c.c.b.l;
import com.c.c.b.m;
import com.c.c.b.p;
import com.c.c.b.q;
import com.c.c.b.s;
import com.c.c.e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.s.b;
import org.apache.commons.c.a.y;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class i
extends aa {
    private static final d w = org.apache.logging.log4j.c.c();
    public long a;
    public String b;
    public String c;
    public String d;
    public l e;
    public String f;
    public String g;
    public List h;
    public Map i;
    public String j;
    public boolean k;
    public boolean l;
    public int m;
    public m n;
    public int o;
    public String p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public p v = new p();

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.p;
    }

    public void a(String string) {
        this.c = string;
    }

    public void b(String string) {
        this.d = string;
    }

    public void a(q q2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        for (String string : q2.b) {
            if (string.equals(net.minecraft.s.b.g())) continue;
            String string2 = "";
            try {
                string2 = (String)com.c.c.e.s.a.f(string);
            }
            catch (Exception exception) {
                w.b("Could not get name for " + string, (Throwable)exception);
                continue;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(string2);
            ++n2;
        }
        this.v.a = String.valueOf(n2);
        this.v.b = stringBuilder.toString();
    }

    public static i a(z z2) {
        i i2 = new i();
        try {
            i2.a = com.c.c.e.a.a("id", z2, -1L);
            i2.b = com.c.c.e.a.a("remoteSubscriptionId", z2, null);
            i2.c = com.c.c.e.a.a("name", z2, null);
            i2.d = com.c.c.e.a.a("motd", z2, null);
            i2.e = com.c.c.b.i.d(com.c.c.e.a.a("state", z2, com.c.c.b.l.a.name()));
            i2.f = com.c.c.e.a.a("owner", z2, null);
            if (z2.c("players") != null && z2.c("players").p()) {
                i2.h = com.c.c.b.i.a(z2.c("players").u());
                com.c.c.b.i.a(i2);
            } else {
                i2.h = new ArrayList();
            }
            i2.m = com.c.c.e.a.a("daysLeft", z2, 0);
            i2.j = com.c.c.e.a.a("ip", z2, null);
            i2.k = com.c.c.e.a.a("expired", z2, false);
            i2.l = com.c.c.e.a.a("expiredTrial", z2, false);
            i2.n = com.c.c.b.i.e(com.c.c.e.a.a("worldType", z2, com.c.c.b.m.a.name()));
            i2.g = com.c.c.e.a.a("ownerUUID", z2, "");
            i2.i = z2.c("slots") != null && z2.c("slots").p() ? com.c.c.b.i.b(z2.c("slots").u()) : com.c.c.b.i.e();
            i2.p = com.c.c.e.a.a("minigameName", z2, null);
            i2.o = com.c.c.e.a.a("activeSlot", z2, -1);
            i2.q = com.c.c.e.a.a("minigameId", z2, -1);
            i2.r = com.c.c.e.a.a("minigameImage", z2, null);
            i2.s = com.c.c.e.a.a("resourcePackUrl", z2, null);
            i2.t = com.c.c.e.a.a("resourcePackHash", z2, null);
            i2.u = com.c.c.e.a.a("minecraftVersion", z2, null);
        }
        catch (Exception exception) {
            w.b("Could not parse McoServer: " + exception.getMessage());
        }
        return i2;
    }

    private static void a(i i2) {
        Collections.sort(i2.h, new j());
    }

    private static List a(t t2) {
        ArrayList<g> arrayList = new ArrayList<g>();
        for (w w2 : t2) {
            try {
                z z2 = w2.t();
                g g2 = new g();
                g2.a(com.c.c.e.a.a("name", z2, null));
                g2.b(com.c.c.e.a.a("uuid", z2, null));
                g2.a(com.c.c.e.a.a("operator", z2, false));
                g2.b(com.c.c.e.a.a("accepted", z2, false));
                arrayList.add(g2);
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }

    private static Map b(t t2) {
        HashMap<Integer, s> hashMap = new HashMap<Integer, s>();
        for (w w2 : t2) {
            try {
                z z2 = w2.t();
                ab ab2 = new ab();
                w w3 = ab2.a(z2.c("options").d());
                s s2 = w3 == null ? com.c.c.b.s.a() : com.c.c.b.s.a(w3.t());
                int n2 = com.c.c.e.a.a("slotId", z2, -1);
                hashMap.put(n2, s2);
            }
            catch (Exception exception) {}
        }
        for (int i2 = 1; i2 <= 3; ++i2) {
            if (hashMap.containsKey(i2)) continue;
            hashMap.put(i2, com.c.c.b.s.b());
        }
        return hashMap;
    }

    private static Map e() {
        HashMap<Integer, s> hashMap = new HashMap<Integer, s>();
        hashMap.put(1, com.c.c.b.s.b());
        hashMap.put(2, com.c.c.b.s.b());
        hashMap.put(3, com.c.c.b.s.b());
        return hashMap;
    }

    public static i c(String string) {
        i i2 = new i();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            i2 = com.c.c.b.i.a(z2);
        }
        catch (Exception exception) {
            w.b("Could not parse McoServer: " + exception.getMessage());
        }
        return i2;
    }

    private static l d(String string) {
        try {
            return com.c.c.b.l.valueOf(string);
        }
        catch (Exception exception) {
            return com.c.c.b.l.a;
        }
    }

    private static m e(String string) {
        try {
            return com.c.c.b.m.valueOf(string);
        }
        catch (Exception exception) {
            return com.c.c.b.m.a;
        }
    }

    public int hashCode() {
        return new org.apache.commons.c.a.z(17, 37).a(this.a).d(this.c).d(this.d).d((Object)this.e).d(this.f).a(this.k).c();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        i i2 = (i)object;
        return new y().a(this.a, i2.a).e(this.c, i2.c).e(this.d, i2.d).e((Object)this.e, (Object)i2.e).e(this.f, i2.f).a(this.k, i2.k).e((Object)this.n, (Object)this.n).c();
    }

    public i d() {
        i i2 = new i();
        i2.a = this.a;
        i2.b = this.b;
        i2.c = this.c;
        i2.d = this.d;
        i2.e = this.e;
        i2.f = this.f;
        i2.h = this.h;
        i2.i = this.a(this.i);
        i2.j = this.j;
        i2.k = this.k;
        i2.l = this.l;
        i2.m = this.m;
        i2.v = new p();
        i2.v.a = this.v.a;
        i2.v.b = this.v.b;
        i2.n = this.n;
        i2.g = this.g;
        i2.p = this.p;
        i2.o = this.o;
        i2.q = this.q;
        i2.r = this.r;
        i2.s = this.s;
        i2.t = this.t;
        return i2;
    }

    public Map a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), ((s)entry.getValue()).d());
        }
        return hashMap;
    }

    public /* synthetic */ Object clone() {
        return this.d();
    }
}

