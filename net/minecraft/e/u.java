/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import java.util.Map;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.g.b.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.u.bp;
import net.minecraft.u.bw;

public final class u {
    public static com.c.a.e a(e e2) {
        UUID uUID;
        String string = null;
        String string2 = null;
        if (e2.b("Name", 8)) {
            string = e2.l("Name");
        }
        if (e2.b("Id", 8)) {
            string2 = e2.l("Id");
        }
        if (bw.b(string) && bw.b(string2)) {
            return null;
        }
        try {
            uUID = UUID.fromString(string2);
        }
        catch (Throwable throwable) {
            uUID = null;
        }
        com.c.a.e e3 = new com.c.a.e(uUID, string);
        if (e2.b("Properties", 10)) {
            e e4 = e2.o("Properties");
            for (String string3 : e4.e()) {
                q q2 = e4.c(string3, 10);
                for (int i2 = 0; i2 < q2.e(); ++i2) {
                    e e5 = q2.b(i2);
                    String string4 = e5.l("Value");
                    if (e5.b("Signature", 8)) {
                        e3.c().a(string3, new com.c.a.d.a(string3, string4, e5.l("Signature")));
                        continue;
                    }
                    e3.c().a(string3, new com.c.a.d.a(string3, string4));
                }
            }
        }
        return e3;
    }

    public static e a(e e2, com.c.a.e e3) {
        if (!bw.b(e3.b())) {
            e2.a("Name", e3.b());
        }
        if (e3.a() != null) {
            e2.a("Id", e3.a().toString());
        }
        if (!e3.c().o()) {
            e e4 = new e();
            for (String string : e3.c().q()) {
                q q2 = new q();
                for (com.c.a.d.a a2 : e3.c().c(string)) {
                    e e5 = new e();
                    e5.a("Value", a2.b());
                    if (a2.d()) {
                        e5.a("Signature", a2.c());
                    }
                    q2.a(e5);
                }
                e4.a(string, q2);
            }
            e2.a("Properties", e4);
        }
        return e2;
    }

    public static boolean a(a a2, a a3, boolean bl2) {
        if (a2 == a3) {
            return true;
        }
        if (a2 == null) {
            return true;
        }
        if (a3 == null) {
            return false;
        }
        if (!a2.getClass().equals(a3.getClass())) {
            return false;
        }
        if (a2 instanceof e) {
            e e2 = (e)a2;
            e e3 = (e)a3;
            for (String string : e2.e()) {
                a a4 = e2.c(string);
                if (u.a(a4, e3.c(string), bl2)) continue;
                return false;
            }
            return true;
        }
        if (a2 instanceof q && bl2) {
            q q2 = (q)a2;
            q q3 = (q)a3;
            if (q2.e() == 0) {
                return q3.e() == 0;
            }
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                a a5 = q2.h(i2);
                boolean bl3 = false;
                for (int i3 = 0; i3 < q3.e(); ++i3) {
                    if (!u.a(a5, q3.h(i3), bl2)) continue;
                    bl3 = true;
                    break;
                }
                if (bl3) continue;
                return false;
            }
            return true;
        }
        return a2.equals(a3);
    }

    public static e a(UUID uUID) {
        e e2 = new e();
        e2.a("M", uUID.getMostSignificantBits());
        e2.a("L", uUID.getLeastSignificantBits());
        return e2;
    }

    public static UUID b(e e2) {
        return new UUID(e2.i("M"), e2.i("L"));
    }

    public static net.minecraft.u.b.b c(e e2) {
        return new net.minecraft.u.b.b(e2.h("X"), e2.h("Y"), e2.h("Z"));
    }

    public static e a(net.minecraft.u.b.b b2) {
        e e2 = new e();
        e2.a("X", b2.cy_());
        e2.a("Y", b2.k());
        e2.a("Z", b2.l());
        return e2;
    }

    public static net.minecraft.g.c.b d(e e2) {
        if (!e2.b("Name", 8)) {
            return p.a.v();
        }
        cn cn2 = (cn)cn.v.a(new bp(e2.l("Name")));
        net.minecraft.g.c.b b2 = cn2.v();
        if (e2.b("Properties", 10)) {
            e e3 = e2.o("Properties");
            i i2 = cn2.u();
            for (String string : e3.e()) {
                b b3 = i2.a(string);
                if (b3 == null) continue;
                b2 = u.a(b2, b3, e3.l(string));
            }
        }
        return b2;
    }

    private static net.minecraft.g.c.b a(net.minecraft.g.c.b b2, b b3, String string) {
        return b2.a(b3, (Comparable)b3.a(string).c());
    }

    public static e a(e e2, net.minecraft.g.c.b b2) {
        e2.a("Name", ((bp)cn.v.b(b2.c())).toString());
        if (!b2.b().isEmpty()) {
            e e3 = new e();
            for (Map.Entry entry : b2.b().e()) {
                b b3 = (b)entry.getKey();
                e3.a(b3.a(), u.a(b3, (Comparable)entry.getValue()));
            }
            e2.a("Properties", e3);
        }
        return e2;
    }

    private static String a(b b2, Comparable comparable) {
        return b2.a(comparable);
    }
}

