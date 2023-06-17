/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public abstract class zm {
    public static final zm[] a = new zm[12];
    public static final zm b = new der(0, "buildingBlocks");
    public static final zm c = new bzm(1, "decorations");
    public static final zm d = new csh(2, "redstone");
    public static final zm e = new ayu(3, "transportation");
    public static final zm f = new brk(4, "misc").a(new mo[]{mo.a});
    public static final zm g = new cqq(5, "search").a("item_search.png");
    public static final zm h = new aqe(6, "food");
    public static final zm i = new bny(7, "tools").a(mo.h, mo.i, mo.j);
    public static final zm j = new pa(8, "combat").a(mo.b, mo.c, mo.f, mo.d, mo.e, mo.k, mo.g);
    public static final zm k = new avz(9, "brewing");
    public static final zm l = new bjd(10, "materials");
    public static final zm m = new crb(11, "inventory").a("inventory.png").k().i();
    private final int n;
    private final String o;
    private String p = "items.png";
    private boolean q = true;
    private boolean r = true;
    private mo[] s;
    private bhl t;

    public zm(int n2, String string) {
        this.n = n2;
        this.o = string;
        zm.a[n2] = this;
    }

    public int b() {
        return this.n;
    }

    public String c() {
        return this.o;
    }

    public String d() {
        return "itemGroup." + this.c();
    }

    public bhl e() {
        if (this.t == null) {
            this.t = new bhl(this.a(), 1, this.f());
        }
        return this.t;
    }

    public abstract azg a();

    public int f() {
        return 0;
    }

    public String g() {
        return this.p;
    }

    public zm a(String string) {
        this.p = string;
        return this;
    }

    public boolean h() {
        return this.r;
    }

    public zm i() {
        this.r = false;
        return this;
    }

    public boolean j() {
        return this.q;
    }

    public zm k() {
        this.q = false;
        return this;
    }

    public int l() {
        return this.n % 6;
    }

    public boolean m() {
        return this.n < 6;
    }

    public mo[] n() {
        return this.s;
    }

    public zm a(mo ... arrmo) {
        this.s = arrmo;
        return this;
    }

    public boolean a(mo mo2) {
        if (this.s == null) {
            return false;
        }
        for (mo mo3 : this.s) {
            if (mo3 != mo2) continue;
            return true;
        }
        return false;
    }

    public void a(List list) {
        for (azg azg2 : azg.g) {
            if (azg2 == null || azg2.b() != this) continue;
            azg2.a(azg2, this, list);
        }
        if (this.n() != null) {
            this.a(list, this.n());
        }
    }

    public void a(List list, mo ... arrmo) {
        for (dad dad2 : dad.b) {
            if (dad2 == null || dad2.c == null) continue;
            boolean bl2 = false;
            for (int i2 = 0; i2 < arrmo.length && !bl2; ++i2) {
                if (dad2.c != arrmo[i2]) continue;
                bl2 = true;
            }
            if (!bl2) continue;
            list.add(hp.cn.a(new bc(dad2, dad2.a())));
        }
    }
}

