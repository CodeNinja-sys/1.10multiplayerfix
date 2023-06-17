/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class bsv {
    private static final int a = bnw.values().length;
    private static final String[] b = new String[a];
    private String[] c = b;
    private String[] d = b;

    public void a(a a2, ala ala2, bnw bnw2, int n2) {
        String string;
        String string2 = this.c[bnw2.a()];
        if (string2 == null) {
            return;
        }
        apm apm2 = new apm(this, ala2);
        try {
            string = mn.e(a2, apm2, string2);
        }
        catch (bbg bbg2) {
            return;
        }
        String string3 = this.d[bnw2.a()];
        if (string3 == null) {
            return;
        }
        bzt bzt2 = ala2.m_().P();
        bhi bhi2 = bzt2.b(string3);
        if (bhi2 == null) {
            return;
        }
        if (!bzt2.b(string, bhi2)) {
            return;
        }
        czu czu2 = bzt2.c(string, bhi2);
        czu2.c(n2);
    }

    public void a(bvp bvp2) {
        if (!bvp2.b("CommandStats", 10)) {
            return;
        }
        bvp bvp3 = bvp2.o("CommandStats");
        for (bnw bnw2 : bnw.values()) {
            String string = bnw2.b() + "Name";
            String string2 = bnw2.b() + "Objective";
            if (!bvp3.b(string, 8) || !bvp3.b(string2, 8)) continue;
            String string3 = bvp3.l(string);
            String string4 = bvp3.l(string2);
            bsv.a(this, bnw2, string3, string4);
        }
    }

    public void b(bvp bvp2) {
        bvp bvp3 = new bvp();
        for (bnw bnw2 : bnw.values()) {
            String string = this.c[bnw2.a()];
            String string2 = this.d[bnw2.a()];
            if (string == null || string2 == null) continue;
            bvp3.a(bnw2.b() + "Name", string);
            bvp3.a(bnw2.b() + "Objective", string2);
        }
        if (!bvp3.j()) {
            bvp2.a("CommandStats", bvp3);
        }
    }

    public static void a(bsv bsv2, bnw bnw2, String string, String string2) {
        if (string == null || string.isEmpty() || string2 == null || string2.isEmpty()) {
            bsv.a(bsv2, bnw2);
            return;
        }
        if (bsv2.c == b || bsv2.d == b) {
            bsv2.c = new String[a];
            bsv2.d = new String[a];
        }
        bsv2.c[bnw2.a()] = string;
        bsv2.d[bnw2.a()] = string2;
    }

    private static void a(bsv bsv2, bnw bnw2) {
        if (bsv2.c == b || bsv2.d == b) {
            return;
        }
        bsv2.c[bnw2.a()] = null;
        bsv2.d[bnw2.a()] = null;
        boolean bl2 = true;
        for (bnw bnw3 : bnw.values()) {
            if (bsv2.c[bnw3.a()] == null || bsv2.d[bnw3.a()] == null) continue;
            bl2 = false;
            break;
        }
        if (bl2) {
            bsv2.c = b;
            bsv2.d = b;
        }
    }

    public void a(bsv bsv2) {
        for (bnw bnw2 : bnw.values()) {
            bsv.a(this, bnw2, bsv2.c[bnw2.a()], bsv2.d[bnw2.a()]);
        }
    }
}

