/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.d.a;
import com.c.a.e;
import java.util.Map;
import java.util.UUID;

public final class ayj {
    public static e a(bvp bvp2) {
        String string = null;
        String string2 = null;
        if (bvp2.b("Name", 8)) {
            string = bvp2.l("Name");
        }
        if (bvp2.b("Id", 8)) {
            string2 = bvp2.l("Id");
        }
        if (!aco.b(string) || !aco.b(string2)) {
            UUID uUID;
            try {
                uUID = UUID.fromString(string2);
            }
            catch (Throwable throwable) {
                uUID = null;
            }
            e e2 = new e(uUID, string);
            if (bvp2.b("Properties", 10)) {
                bvp bvp3 = bvp2.o("Properties");
                for (String string3 : bvp3.b()) {
                    bmh bmh2 = bvp3.c(string3, 10);
                    for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                        bvp bvp4 = bmh2.b(i2);
                        String string4 = bvp4.l("Value");
                        if (bvp4.b("Signature", 8)) {
                            e2.c().a(string3, new a(string3, string4, bvp4.l("Signature")));
                            continue;
                        }
                        e2.c().a(string3, new a(string3, string4));
                    }
                }
            }
            return e2;
        }
        return null;
    }

    public static bvp a(bvp bvp2, e e2) {
        if (!aco.b(e2.b())) {
            bvp2.a("Name", e2.b());
        }
        if (e2.a() != null) {
            bvp2.a("Id", e2.a().toString());
        }
        if (!e2.c().o()) {
            bvp bvp3 = new bvp();
            for (String string : e2.c().q()) {
                bmh bmh2 = new bmh();
                for (a a2 : e2.c().c(string)) {
                    bvp bvp4 = new bvp();
                    bvp4.a("Value", a2.b());
                    if (a2.d()) {
                        bvp4.a("Signature", a2.c());
                    }
                    bmh2.a(bvp4);
                }
                bvp3.a(string, bmh2);
            }
            bvp2.a("Properties", bvp3);
        }
        return bvp2;
    }

    public static boolean a(azt azt2, azt azt3, boolean bl2) {
        if (azt2 == azt3) {
            return true;
        }
        if (azt2 == null) {
            return true;
        }
        if (azt3 == null) {
            return false;
        }
        if (!azt2.getClass().equals(azt3.getClass())) {
            return false;
        }
        if (azt2 instanceof bvp) {
            bvp bvp2 = (bvp)azt2;
            bvp bvp3 = (bvp)azt3;
            for (String string : bvp2.b()) {
                azt azt4 = bvp2.c(string);
                if (ayj.a(azt4, bvp3.c(string), bl2)) continue;
                return false;
            }
            return true;
        }
        if (azt2 instanceof bmh && bl2) {
            bmh bmh2 = (bmh)azt2;
            bmh bmh3 = (bmh)azt3;
            if (bmh2.b() == 0) {
                return bmh3.b() == 0;
            }
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                azt azt5 = bmh2.h(i2);
                boolean bl3 = false;
                for (int i3 = 0; i3 < bmh3.b(); ++i3) {
                    if (!ayj.a(azt5, bmh3.h(i3), bl2)) continue;
                    bl3 = true;
                    break;
                }
                if (bl3) continue;
                return false;
            }
            return true;
        }
        return azt2.equals(azt3);
    }

    public static bvp a(UUID uUID) {
        bvp bvp2 = new bvp();
        bvp2.a("M", uUID.getMostSignificantBits());
        bvp2.a("L", uUID.getLeastSignificantBits());
        return bvp2;
    }

    public static UUID b(bvp bvp2) {
        return new UUID(bvp2.i("M"), bvp2.i("L"));
    }

    public static cmz c(bvp bvp2) {
        return new cmz(bvp2.h("X"), bvp2.h("Y"), bvp2.h("Z"));
    }

    public static bvp a(cmz cmz2) {
        bvp bvp2 = new bvp();
        bvp2.a("X", cmz2.a());
        bvp2.a("Y", cmz2.b());
        bvp2.a("Z", cmz2.c());
        return bvp2;
    }

    public static dbk d(bvp bvp2) {
        if (!bvp2.b("Name", 8)) {
            return blg.a.s();
        }
        bfa bfa2 = (bfa)bfa.v.c(new bpx(bvp2.l("Name")));
        dbk dbk2 = bfa2.s();
        if (bvp2.b("Properties", 10)) {
            bvp bvp3 = bvp2.o("Properties");
            bkp bkp2 = bfa2.r();
            for (String string : bvp3.b()) {
                bvs bvs2 = bkp2.a(string);
                if (bvs2 == null) continue;
                dbk2 = ayj.a(dbk2, bvs2, bvp3.l(string));
            }
        }
        return dbk2;
    }

    private static dbk a(dbk dbk2, bvs bvs2, String string) {
        return dbk2.a(bvs2, (Comparable)bvs2.a(string).c());
    }

    public static bvp a(bvp bvp2, dbk dbk2) {
        bvp2.a("Name", ((bpx)bfa.v.b(dbk2.t())).toString());
        if (!dbk2.s().isEmpty()) {
            bvp bvp3 = new bvp();
            for (Map.Entry entry : dbk2.s().e()) {
                bvs bvs2 = (bvs)entry.getKey();
                bvp3.a(bvs2.b(), ayj.a(bvs2, (Comparable)entry.getValue()));
            }
            bvp2.a("Properties", bvp3);
        }
        return bvp2;
    }

    private static String a(bvs bvs2, Comparable comparable) {
        return bvs2.a(comparable);
    }
}

