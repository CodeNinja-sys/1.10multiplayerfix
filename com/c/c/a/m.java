/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.a.b.k;
import com.c.c.a.n;
import com.c.c.a.o;
import com.c.c.a.p;
import com.c.c.a.q;
import com.c.c.a.r;
import com.c.c.b.ab;
import com.c.c.b.ad;
import com.c.c.b.ae;
import com.c.c.b.e;
import com.c.c.b.f;
import com.c.c.b.g;
import com.c.c.b.h;
import com.c.c.b.s;
import com.c.c.b.t;
import com.c.c.b.w;
import com.c.c.b.x;
import com.c.c.b.z;
import com.c.c.c.a;
import com.c.c.c.b;
import com.c.c.i;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class m {
    public static o a = com.c.c.a.o.a;
    private static boolean b = false;
    private static final d c = org.apache.logging.log4j.c.c();
    private final String d;
    private final String e;
    private static final String f = "worlds";
    private static final String g = "invites";
    private static final String h = "mco";
    private static final String i = "subscriptions";
    private static final String j = "activities";
    private static final String k = "ops";
    private static final String l = "regions/ping/stat";
    private static final String m = "trial";
    private static final String n = "/$WORLD_ID/initialize";
    private static final String o = "/$WORLD_ID";
    private static final String p = "/liveplayerlist";
    private static final String q = "/$WORLD_ID";
    private static final String r = "/minigames";
    private static final String s = "/$WORLD_ID/$PROFILE_UUID";
    private static final String t = "/minigames/$MINIGAME_ID/$WORLD_ID";
    private static final String u = "/available";
    private static final String v = "/templates/$WORLD_TYPE";
    private static final String w = "/$ID/join";
    private static final String x = "/$ID";
    private static final String y = "/$WORLD_ID";
    private static final String z = "/$WORLD_ID/invite/$UUID";
    private static final String A = "/count/pending";
    private static final String B = "/pending";
    private static final String C = "/accept/$INVITATION_ID";
    private static final String D = "/reject/$INVITATION_ID";
    private static final String E = "/$WORLD_ID";
    private static final String F = "/$WORLD_ID";
    private static final String G = "/$WORLD_ID/slot/$SLOT_ID";
    private static final String H = "/$WORLD_ID/open";
    private static final String I = "/$WORLD_ID/close";
    private static final String J = "/$WORLD_ID/reset";
    private static final String K = "/$WORLD_ID";
    private static final String L = "/$WORLD_ID/backups";
    private static final String M = "/$WORLD_ID/slot/$SLOT_ID/download";
    private static final String N = "/$WORLD_ID/backups/upload";
    private static final String O = "/client/compatible";
    private static final String P = "/tos/agreed";
    private static final String Q = "/stageAvailable";
    private static k R = new k();

    public static m a() {
        String string = net.minecraft.s.b.d();
        String string2 = net.minecraft.s.b.c();
        if (string == null || string2 == null) {
            return null;
        }
        if (!b) {
            b = true;
            String string3 = System.getenv("realms.environment");
            if (string3 == null) {
                string3 = System.getProperty("realms.environment");
            }
            if (string3 != null) {
                if (string3.equals("LOCAL")) {
                    com.c.c.a.m.d();
                } else if (string3.equals("STAGE")) {
                    com.c.c.a.m.b();
                }
            }
        }
        return new m(string2, string, net.minecraft.s.b.b());
    }

    public static void b() {
        a = com.c.c.a.o.b;
    }

    public static void c() {
        a = com.c.c.a.o.a;
    }

    public static void d() {
        a = com.c.c.a.o.c;
    }

    public m(String string, String string2, Proxy proxy) {
        this.d = string;
        this.e = string2;
        com.c.c.a.p.a(proxy);
    }

    public com.c.c.b.o e() {
        String string = this.c(f);
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.o.a(string2);
    }

    public com.c.c.b.i a(long l2) {
        String string = this.c(f + x.replace("$ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.i.c(string2);
    }

    public w b(long l2) {
        String string = this.c(j + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.w.a(string2);
    }

    public com.c.c.b.r f() {
        String string = this.c("activities/liveplayerlist");
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.r.a(string2);
    }

    public com.c.c.b.n c(long l2) {
        String string = this.c(f + w.replace("$ID", "" + l2));
        String string2 = this.a(com.c.c.a.r.a(string, 5000, 30000));
        return com.c.c.b.n.a(string2);
    }

    public void a(long l2, String string, String string2) {
        h h2 = new h(string, string2);
        String string3 = this.c(f + n.replace("$WORLD_ID", String.valueOf(l2)));
        String string4 = R.b(h2);
        this.a(com.c.c.a.r.a(string3, string4, 5000, 10000));
    }

    public Boolean g() {
        String string = this.c("mco/available");
        String string2 = this.a(com.c.c.a.r.a(string));
        return Boolean.valueOf(string2);
    }

    public Boolean h() {
        String string = this.c("mco/stageAvailable");
        String string2 = this.a(com.c.c.a.r.a(string));
        return Boolean.valueOf(string2);
    }

    public n i() {
        n n2;
        String string = this.c("mco/client/compatible");
        String string2 = this.a(com.c.c.a.r.a(string));
        try {
            n2 = com.c.c.a.n.valueOf(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new b(500, "Could not check compatible version, got response: " + string2, -1, "");
        }
        return n2;
    }

    public void a(long l2, String string) {
        String string2 = this.c(g + z.replace("$WORLD_ID", String.valueOf(l2)).replace("$UUID", string));
        this.a(com.c.c.a.r.b(string2));
    }

    public void d(long l2) {
        String string = this.c(g + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        this.a(com.c.c.a.r.b(string));
    }

    public com.c.c.b.i b(long l2, String string) {
        g g2 = new g();
        g2.a(string);
        String string2 = this.c(g + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        String string3 = this.a(com.c.c.a.r.c(string2, R.b(g2)));
        return com.c.c.b.i.c(string3);
    }

    public com.c.c.b.b e(long l2) {
        String string = this.c(f + L.replace("$WORLD_ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.b.a(string2);
    }

    public void b(long l2, String string, String string2) {
        h h2 = new h(string, string2);
        String string3 = this.c(f + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        this.a(com.c.c.a.r.c(string3, R.b(h2)));
    }

    public void a(long l2, int n2, s s2) {
        String string = this.c(f + G.replace("$WORLD_ID", String.valueOf(l2)).replace("$SLOT_ID", String.valueOf(n2)));
        String string2 = s2.c();
        this.a(com.c.c.a.r.c(string, string2));
    }

    public boolean a(long l2, int n2) {
        String string = this.c(f + G.replace("$WORLD_ID", String.valueOf(l2)).replace("$SLOT_ID", String.valueOf(n2)));
        String string2 = this.a(com.c.c.a.r.d(string, ""));
        return Boolean.valueOf(string2);
    }

    public void c(long l2, String string) {
        String string2 = this.b(f + L.replace("$WORLD_ID", String.valueOf(l2)), "backupId=" + string);
        this.a(com.c.c.a.r.b(string2, "", 40000, 40000));
    }

    public ae a(int n2, int n3, com.c.c.b.m m2) {
        String string = this.b(f + v.replace("$WORLD_TYPE", m2.toString()), String.format("page=%d&pageSize=%d", n2, n3));
        String string2 = this.a(com.c.c.a.r.a(string));
        return ae.a(string2);
    }

    public ad j() {
        String string = this.c("worlds/minigames");
        String string2 = this.a(com.c.c.a.r.a(string));
        return ad.a(string2);
    }

    public Boolean d(long l2, String string) {
        String string2 = t.replace("$MINIGAME_ID", string).replace("$WORLD_ID", String.valueOf(l2));
        String string3 = this.c(f + string2);
        return Boolean.valueOf(this.a(com.c.c.a.r.d(string3, "")));
    }

    public com.c.c.b.c e(long l2, String string) {
        String string2 = s.replace("$WORLD_ID", String.valueOf(l2)).replace("$PROFILE_UUID", string);
        String string3 = this.c(k + string2);
        return com.c.c.b.c.a(this.a(com.c.c.a.r.c(string3, "")));
    }

    public com.c.c.b.c f(long l2, String string) {
        String string2 = s.replace("$WORLD_ID", String.valueOf(l2)).replace("$PROFILE_UUID", string);
        String string3 = this.c(k + string2);
        return com.c.c.b.c.a(this.a(com.c.c.a.r.b(string3)));
    }

    public Boolean f(long l2) {
        String string = this.c(f + H.replace("$WORLD_ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.d(string, ""));
        return Boolean.valueOf(string2);
    }

    public Boolean g(long l2) {
        String string = this.c(f + I.replace("$WORLD_ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.d(string, ""));
        return Boolean.valueOf(string2);
    }

    public Boolean a(long l2, String string, Integer n2, boolean bl2) {
        t t2 = new t(string, -1L, n2, bl2);
        String string2 = this.c(f + J.replace("$WORLD_ID", String.valueOf(l2)));
        String string3 = this.a(com.c.c.a.r.a(string2, R.b(t2), 30000, 80000));
        return Boolean.valueOf(string3);
    }

    public Boolean g(long l2, String string) {
        t t2 = new t(null, Long.valueOf(string), -1, false);
        String string2 = this.c(f + J.replace("$WORLD_ID", String.valueOf(l2)));
        String string3 = this.a(com.c.c.a.r.a(string2, R.b(t2), 30000, 80000));
        return Boolean.valueOf(string3);
    }

    public x h(long l2) {
        String string = this.c(i + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.x.a(string2);
    }

    public int k() {
        String string = this.c("invites/count/pending");
        String string2 = this.a(com.c.c.a.r.a(string));
        return Integer.parseInt(string2);
    }

    public e l() {
        String string = this.c("invites/pending");
        String string2 = this.a(com.c.c.a.r.a(string));
        return com.c.c.b.e.a(string2);
    }

    public void a(String string) {
        String string2 = this.c(g + C.replace("$INVITATION_ID", string));
        this.a(com.c.c.a.r.d(string2, ""));
    }

    public ab b(long l2, int n2) {
        String string = this.c(f + M.replace("$WORLD_ID", String.valueOf(l2)).replace("$SLOT_ID", String.valueOf(n2)));
        String string2 = this.a(com.c.c.a.r.a(string));
        return ab.a(string2);
    }

    public z h(long l2, String string) {
        String string2 = this.c(f + N.replace("$WORLD_ID", String.valueOf(l2)));
        z z2 = new z();
        if (string != null) {
            z2.b(string);
        }
        com.a.b.r r2 = new com.a.b.r();
        r2.b();
        k k2 = r2.i();
        String string3 = k2.b(z2);
        return com.c.c.b.z.a(this.a(com.c.c.a.r.d(string2, string3)));
    }

    public void b(String string) {
        String string2 = this.c(g + D.replace("$INVITATION_ID", string));
        this.a(com.c.c.a.r.d(string2, ""));
    }

    public void m() {
        String string = this.c("mco/tos/agreed");
        this.a(com.c.c.a.r.c(string, ""));
    }

    public void a(f f2) {
        String string = this.c(l);
        this.a(com.c.c.a.r.c(string, R.b(f2)));
    }

    public Boolean n() {
        String string = this.c(m);
        String string2 = this.a(com.c.c.a.r.a(string));
        return Boolean.valueOf(string2);
    }

    public com.c.c.b.i a(String string, String string2) {
        h h2 = new h(string, string2);
        String string3 = R.b(h2);
        String string4 = this.c(m);
        String string5 = this.a(com.c.c.a.r.a(string4, string3, 5000, 10000));
        return com.c.c.b.i.c(string5);
    }

    public void i(long l2) {
        String string = this.c(f + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l2)));
        this.a(com.c.c.a.r.b(string));
    }

    private String c(String string) {
        return this.b(string, null);
    }

    private String b(String string, String string2) {
        try {
            URI uRI = new URI(com.c.c.a.m.a.e, com.c.c.a.m.a.d, "/" + string, string2, null);
            return uRI.toASCIIString();
        }
        catch (URISyntaxException uRISyntaxException) {
            uRISyntaxException.printStackTrace();
            return null;
        }
    }

    private String a(r r2) {
        r2.a("sid", this.d);
        r2.a("user", this.e);
        r2.a("version", net.minecraft.s.q.c);
        String string = com.c.c.i.a();
        if (string != null) {
            r2.a("realms_version", string);
        }
        try {
            int n2 = r2.b();
            if (n2 == 503) {
                int n3 = r2.a();
                throw new com.c.c.c.c(n3);
            }
            String string2 = r2.c();
            if (n2 < 200 || n2 >= 300) {
                if (n2 == 401) {
                    String string3 = r2.c("WWW-Authenticate");
                    c.d("Could not authorize you against Realms server: " + string3);
                    throw new b(n2, string3, -1, string3);
                }
                if (string2 == null || string2.length() == 0) {
                    c.b("Realms error code: " + n2 + " message: " + string2);
                    throw new b(n2, string2, n2, "");
                }
                q q2 = new q(string2);
                c.b("Realms http code: " + n2 + " -  error code: " + q2.b() + " -  message: " + q2.a() + " - raw body: " + string2);
                throw new b(n2, string2, q2);
            }
            return string2;
        }
        catch (a a2) {
            throw new b(500, "Could not connect to Realms: " + a2.getMessage(), -1, "");
        }
    }
}

