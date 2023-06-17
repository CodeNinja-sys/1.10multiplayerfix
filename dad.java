/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public abstract class dad {
    public static final apg b = new apg();
    private final dfm[] a;
    private final bkl e;
    public mo c;
    protected String d;

    public static dad c(int n2) {
        return (dad)b.a(n2);
    }

    public static int b(dad dad2) {
        return b.a(dad2);
    }

    public static dad a(String string) {
        return (dad)b.c(new bpx(string));
    }

    protected dad(bkl bkl2, mo mo2, dfm[] arrdfm) {
        this.e = bkl2;
        this.c = mo2;
        this.a = arrdfm;
    }

    public Iterable a(bga bga2) {
        ArrayList arrayList = ov.a();
        for (dfm dfm2 : this.a) {
            bhl bhl2 = bga2.a(dfm2);
            if (bhl2 == null) continue;
            arrayList.add(bhl2);
        }
        return arrayList.size() > 0 ? arrayList : null;
    }

    public bkl d() {
        return this.e;
    }

    public int e() {
        return 1;
    }

    public int a() {
        return 1;
    }

    public int a(int n2) {
        return 1 + n2 * 10;
    }

    public int b(int n2) {
        return this.a(n2) + 5;
    }

    public int a(int n2, ahy ahy2) {
        return 0;
    }

    public float a(int n2, agh agh2) {
        return 0.0f;
    }

    public boolean a(dad dad2) {
        return this != dad2;
    }

    public dad b(String string) {
        this.d = string;
        return this;
    }

    public String c() {
        return "enchantment." + this.d;
    }

    public String d(int n2) {
        String string = caf.a(this.c());
        if (n2 == 1 && this.a() == 1) {
            return string;
        }
        return string + " " + caf.a("enchantment.level." + n2);
    }

    public boolean a(bhl bhl2) {
        return this.c.a(bhl2.a());
    }

    public void a(bga bga2, cpk cpk2, int n2) {
    }

    public void b(bga bga2, cpk cpk2, int n2) {
    }

    public boolean b() {
        return false;
    }

    public static void f() {
        dfm[] arrdfm = new dfm[]{dfm.f, dfm.e, dfm.d, dfm.c};
        b.a(0, new bpx("protection"), new cqc(bkl.a, byv.a, arrdfm));
        b.a(1, new bpx("fire_protection"), new cqc(bkl.b, byv.b, arrdfm));
        b.a(2, new bpx("feather_falling"), new cqc(bkl.b, byv.c, arrdfm));
        b.a(3, new bpx("blast_protection"), new cqc(bkl.c, byv.d, arrdfm));
        b.a(4, new bpx("projectile_protection"), new cqc(bkl.b, byv.e, arrdfm));
        b.a(5, new bpx("respiration"), new azl(bkl.c, arrdfm));
        b.a(6, new bpx("aqua_affinity"), new crv(bkl.c, arrdfm));
        b.a(7, new bpx("thorns"), new bur(bkl.d, arrdfm));
        b.a(8, new bpx("depth_strider"), new akw(bkl.c, arrdfm));
        b.a(9, new bpx("frost_walker"), new eg(bkl.c, dfm.c));
        b.a(16, new bpx("sharpness"), new ank(bkl.a, 0, dfm.a));
        b.a(17, new bpx("smite"), new ank(bkl.b, 1, dfm.a));
        b.a(18, new bpx("bane_of_arthropods"), new ank(bkl.b, 2, dfm.a));
        b.a(19, new bpx("knockback"), new cpu(bkl.b, dfm.a));
        b.a(20, new bpx("fire_aspect"), new cf(bkl.c, dfm.a));
        b.a(21, new bpx("looting"), new ahi(bkl.c, mo.g, dfm.a));
        b.a(32, new bpx("efficiency"), new bxv(bkl.a, dfm.a));
        b.a(33, new bpx("silk_touch"), new hf(bkl.d, dfm.a));
        b.a(34, new bpx("unbreaking"), new czp(bkl.b, dfm.a));
        b.a(35, new bpx("fortune"), new ahi(bkl.c, mo.h, dfm.a));
        b.a(48, new bpx("power"), new bjh(bkl.a, dfm.a));
        b.a(49, new bpx("punch"), new bls(bkl.c, dfm.a));
        b.a(50, new bpx("flame"), new ass(bkl.c, dfm.a));
        b.a(51, new bpx("infinity"), new cvx(bkl.d, dfm.a));
        b.a(61, new bpx("luck_of_the_sea"), new ahi(bkl.c, mo.i, dfm.a));
        b.a(62, new bpx("lure"), new sa(bkl.c, mo.i, dfm.a));
        b.a(70, new bpx("mending"), new cbc(bkl.c, dfm.values()));
    }
}

