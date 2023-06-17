/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.j.j;
import net.minecraft.j.r;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.ba;
import net.minecraft.n.br;
import net.minecraft.n.p;

public class ap {
    private static final int a = br.values().length;
    private static final String[] b = new String[a];
    private String[] c = b;
    private String[] d = b;

    public void a(a a2, az az2, br br2, int n2) {
        String string = this.c[br2.a()];
        if (string != null) {
            r r2;
            j j2;
            String string2;
            p p2 = new p(this, az2);
            try {
                string2 = aa.e(a2, p2, string);
            }
            catch (ba ba2) {
                return;
            }
            String string3 = this.d[br2.a()];
            if (string3 != null && (j2 = (r2 = az2.aE().Q()).b(string3)) != null && r2.b(string2, j2)) {
                net.minecraft.j.p p3 = r2.c(string2, j2);
                p3.c(n2);
            }
        }
    }

    public void a(e e2) {
        if (e2.b("CommandStats", 10)) {
            e e3 = e2.o("CommandStats");
            for (br br2 : br.values()) {
                String string = String.valueOf(br2.b()) + "Name";
                String string2 = String.valueOf(br2.b()) + "Objective";
                if (!e3.b(string, 8) || !e3.b(string2, 8)) continue;
                String string3 = e3.l(string);
                String string4 = e3.l(string2);
                ap.a(this, br2, string3, string4);
            }
        }
    }

    public void b(e e2) {
        e e3 = new e();
        for (br br2 : br.values()) {
            String string = this.c[br2.a()];
            String string2 = this.d[br2.a()];
            if (string == null || string2 == null) continue;
            e3.a(String.valueOf(br2.b()) + "Name", string);
            e3.a(String.valueOf(br2.b()) + "Objective", string2);
        }
        if (!e3.c()) {
            e2.a("CommandStats", e3);
        }
    }

    public static void a(ap ap2, br br2, String string, String string2) {
        if (string != null && !string.isEmpty() && string2 != null && !string2.isEmpty()) {
            if (ap2.c == b || ap2.d == b) {
                ap2.c = new String[a];
                ap2.d = new String[a];
            }
            ap2.c[br2.a()] = string;
            ap2.d[br2.a()] = string2;
        } else {
            ap.a(ap2, br2);
        }
    }

    private static void a(ap ap2, br br2) {
        if (ap2.c != b && ap2.d != b) {
            ap2.c[br2.a()] = null;
            ap2.d[br2.a()] = null;
            boolean bl2 = true;
            for (br br3 : br.values()) {
                if (ap2.c[br3.a()] == null || ap2.d[br3.a()] == null) continue;
                bl2 = false;
                break;
            }
            if (bl2) {
                ap2.c = b;
                ap2.d = b;
            }
        }
    }

    public void a(ap ap2) {
        for (br br2 : br.values()) {
            ap.a(this, br2, ap2.c[br2.a()], ap2.d[br2.a()]);
        }
    }
}

