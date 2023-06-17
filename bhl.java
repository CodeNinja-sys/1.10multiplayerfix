/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.io;
import com.a.a.d.ov;
import com.a.a.d.vi;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class bhl {
    public static final DecimalFormat a = new DecimalFormat("#.##");
    public int b;
    public int c;
    private azg d;
    private bvp e;
    private int f;
    private cvr g;
    private bfa h;
    private boolean i;
    private bfa j;
    private boolean k;

    public bhl(bfa bfa2) {
        this(bfa2, 1);
    }

    public bhl(bfa bfa2, int n2) {
        this(bfa2, n2, 0);
    }

    public bhl(bfa bfa2, int n2, int n3) {
        this(azg.a(bfa2), n2, n3);
    }

    public bhl(azg azg2) {
        this(azg2, 1);
    }

    public bhl(azg azg2, int n2) {
        this(azg2, n2, 0);
    }

    public bhl(azg azg2, int n2, int n3) {
        this.d = azg2;
        this.b = n2;
        this.f = n3;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public static bhl a(bvp bvp2) {
        bhl bhl2 = new bhl();
        bhl2.c(bvp2);
        return bhl2.a() != null ? bhl2 : null;
    }

    private bhl() {
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.f, (cui)new cvq());
        cgy2.a(bst.f, (cui)new bms());
    }

    public bhl a(int n2) {
        n2 = Math.min(n2, this.b);
        bhl bhl2 = new bhl(this.d, n2, this.f);
        if (this.e != null) {
            bhl2.e = this.e.d();
        }
        this.b -= n2;
        return bhl2;
    }

    public azg a() {
        return this.d;
    }

    public cey a(bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        cey cey2 = this.a().a(this, bdl2, iu2, cmz2, bqp2, bqk2, f2, f3, f4);
        if (cey2 == cey.a) {
            bdl2.a(bpv.b(this.d));
        }
        return cey2;
    }

    public float a(dbk dbk2) {
        return this.a().a(this, dbk2);
    }

    public wx a(iu iu2, bdl bdl2, bqp bqp2) {
        return this.a().a(this, iu2, bdl2, bqp2);
    }

    public bhl a(iu iu2, bga bga2) {
        return this.a().a(this, iu2, bga2);
    }

    public bvp b(bvp bvp2) {
        bpx bpx2 = (bpx)azg.g.b(this.d);
        bvp2.a("id", bpx2 == null ? "minecraft:air" : bpx2.toString());
        bvp2.a("Count", (byte)this.b);
        bvp2.a("Damage", (short)this.f);
        if (this.e != null) {
            bvp2.a("tag", this.e);
        }
        return bvp2;
    }

    public void c(bvp bvp2) {
        this.d = azg.c(bvp2.l("id"));
        this.b = bvp2.f("Count");
        this.f = bvp2.g("Damage");
        if (this.f < 0) {
            this.f = 0;
        }
        if (bvp2.b("tag", 10)) {
            this.e = bvp2.o("tag");
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }

    public int b() {
        return this.a().i();
    }

    public boolean c() {
        return this.b() > 1 && (!this.d() || !this.f());
    }

    public boolean d() {
        if (this.d == null) {
            return false;
        }
        if (this.d.k() <= 0) {
            return false;
        }
        return !this.n() || !this.o().p("Unbreakable");
    }

    public boolean e() {
        return this.d.j();
    }

    public boolean f() {
        return this.d() && this.f > 0;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.f;
    }

    public void b(int n2) {
        this.f = n2;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public int i() {
        return this.d == null ? 0 : this.d.k();
    }

    public boolean a(int n2, Random random) {
        if (!this.d()) {
            return false;
        }
        if (n2 > 0) {
            int n3 = acz.a(bbh.s, this);
            int n4 = 0;
            for (int i2 = 0; n3 > 0 && i2 < n2; ++i2) {
                if (!czp.a(this, n3, random)) continue;
                ++n4;
            }
            if ((n2 -= n4) <= 0) {
                return false;
            }
        }
        this.f += n2;
        return this.f > this.i();
    }

    public void a(int n2, bga bga2) {
        if (bga2 instanceof bdl && ((bdl)bga2).G.d) {
            return;
        }
        if (!this.d()) {
            return;
        }
        if (this.a(n2, bga2.aW())) {
            bga2.e(this);
            --this.b;
            if (bga2 instanceof bdl) {
                bdl bdl2 = (bdl)bga2;
                bdl2.a(bpv.c(this.d));
            }
            if (this.b < 0) {
                this.b = 0;
            }
            this.f = 0;
        }
    }

    public void a(bga bga2, bdl bdl2) {
        boolean bl2 = this.d.a(this, bga2, (bga)bdl2);
        if (bl2) {
            bdl2.a(bpv.b(this.d));
        }
    }

    public void a(iu iu2, dbk dbk2, cmz cmz2, bdl bdl2) {
        boolean bl2 = this.d.a(this, iu2, dbk2, cmz2, bdl2);
        if (bl2) {
            bdl2.a(bpv.b(this.d));
        }
    }

    public boolean b(dbk dbk2) {
        return this.d.a(dbk2);
    }

    public boolean a(bdl bdl2, bga bga2, bqp bqp2) {
        return this.d.a(this, bdl2, bga2, bqp2);
    }

    public bhl j() {
        bhl bhl2 = new bhl(this.d, this.b, this.f);
        if (this.e != null) {
            bhl2.e = this.e.d();
        }
        return bhl2;
    }

    public static boolean a(bhl bhl2, bhl bhl3) {
        if (bhl2 == null && bhl3 == null) {
            return true;
        }
        if (bhl2 == null || bhl3 == null) {
            return false;
        }
        if (bhl2.e == null && bhl3.e != null) {
            return false;
        }
        return bhl2.e == null || bhl2.e.equals(bhl3.e);
    }

    public static boolean b(bhl bhl2, bhl bhl3) {
        if (bhl2 == null && bhl3 == null) {
            return true;
        }
        if (bhl2 == null || bhl3 == null) {
            return false;
        }
        return bhl2.d(bhl3);
    }

    private boolean d(bhl bhl2) {
        if (this.b != bhl2.b) {
            return false;
        }
        if (this.d != bhl2.d) {
            return false;
        }
        if (this.f != bhl2.f) {
            return false;
        }
        if (this.e == null && bhl2.e != null) {
            return false;
        }
        return this.e == null || this.e.equals(bhl2.e);
    }

    public static boolean c(bhl bhl2, bhl bhl3) {
        if (bhl2 == bhl3) {
            return true;
        }
        if (bhl2 != null && bhl3 != null) {
            return bhl2.a(bhl3);
        }
        return false;
    }

    public static boolean d(bhl bhl2, bhl bhl3) {
        if (bhl2 == bhl3) {
            return true;
        }
        if (bhl2 != null && bhl3 != null) {
            return bhl2.b(bhl3);
        }
        return false;
    }

    public boolean a(bhl bhl2) {
        return bhl2 != null && this.d == bhl2.d && this.f == bhl2.f;
    }

    public boolean b(bhl bhl2) {
        if (this.d()) {
            return bhl2 != null && this.d == bhl2.d;
        }
        return this.a(bhl2);
    }

    public String k() {
        return this.d.b(this);
    }

    public static bhl c(bhl bhl2) {
        return bhl2 == null ? null : bhl2.j();
    }

    public String toString() {
        return this.b + "x" + this.d.a() + "@" + this.f;
    }

    public void a(iu iu2, cpk cpk2, int n2, boolean bl2) {
        if (this.c > 0) {
            --this.c;
        }
        if (this.d != null) {
            this.d.a(this, iu2, cpk2, n2, bl2);
        }
    }

    public void a(iu iu2, bdl bdl2, int n2) {
        bdl2.a(bpv.a(this.d), n2);
        this.d.b(this, iu2, bdl2);
    }

    public int l() {
        return this.a().e_(this);
    }

    public cga m() {
        return this.a().d_(this);
    }

    public void a(iu iu2, bga bga2, int n2) {
        this.a().a(this, iu2, bga2, n2);
    }

    public boolean n() {
        return this.e != null;
    }

    public bvp o() {
        return this.e;
    }

    public bvp a(String string, boolean bl2) {
        if (this.e == null || !this.e.b(string, 10)) {
            if (bl2) {
                bvp bvp2 = new bvp();
                this.a(string, bvp2);
                return bvp2;
            }
            return null;
        }
        return this.e.o(string);
    }

    public bmh p() {
        if (this.e == null) {
            return null;
        }
        return this.e.c("ench", 10);
    }

    public void d(bvp bvp2) {
        this.e = bvp2;
    }

    public String q() {
        bvp bvp2;
        String string = this.a().c(this);
        if (this.e != null && this.e.b("display", 10) && (bvp2 = this.e.o("display")).b("Name", 8)) {
            string = bvp2.l("Name");
        }
        return string;
    }

    public bhl a(String string) {
        if (this.e == null) {
            this.e = new bvp();
        }
        if (!this.e.b("display", 10)) {
            this.e.a("display", new bvp());
        }
        this.e.o("display").a("Name", string);
        return this;
    }

    public void r() {
        if (this.e == null) {
            return;
        }
        if (!this.e.b("display", 10)) {
            return;
        }
        bvp bvp2 = this.e.o("display");
        bvp2.q("Name");
        if (bvp2.j()) {
            this.e.q("display");
            if (this.e.j()) {
                this.d((bvp)null);
            }
        }
    }

    public boolean s() {
        if (this.e == null) {
            return false;
        }
        if (!this.e.b("display", 10)) {
            return false;
        }
        return this.e.o("display").b("Name", 8);
    }

    public List a(bdl bdl2, boolean bl2) {
        int n2;
        int n3;
        ArrayList arrayList = ov.a();
        String string = this.q();
        if (this.s()) {
            string = (Object)((Object)aug.u) + string;
        }
        string = string + (Object)((Object)aug.v);
        if (bl2) {
            String string2 = "";
            if (!string.isEmpty()) {
                string = string + " (";
                string2 = ")";
            }
            int n4 = azg.a(this.d);
            string = this.e() ? string + String.format("#%04d/%d%s", n4, this.f, string2) : string + String.format("#%04d%s", n4, string2);
        } else if (!this.s() && this.d == hp.bk) {
            string = string + " #" + this.f;
        }
        arrayList.add(string);
        int n5 = 0;
        if (this.n() && this.e.b("HideFlags", 99)) {
            n5 = this.e.h("HideFlags");
        }
        if ((n5 & 0x20) == 0) {
            this.d.a(this, bdl2, arrayList, bl2);
        }
        if (this.n()) {
            bmh bmh2;
            if ((n5 & 1) == 0 && (bmh2 = this.p()) != null) {
                for (n3 = 0; n3 < bmh2.b(); ++n3) {
                    n2 = bmh2.b(n3).g("id");
                    short s2 = bmh2.b(n3).g("lvl");
                    if (dad.c(n2) == null) continue;
                    arrayList.add(dad.c(n2).d(s2));
                }
            }
            if (this.e.b("display", 10)) {
                bmh bmh3;
                bvp bvp2 = this.e.o("display");
                if (bvp2.b("color", 3)) {
                    if (bl2) {
                        arrayList.add("Color: #" + String.format("%06X", bvp2.h("color")));
                    } else {
                        arrayList.add((Object)((Object)aug.u) + caf.a("item.dyed"));
                    }
                }
                if (bvp2.d("Lore") == 9 && !(bmh3 = bvp2.c("Lore", 8)).j()) {
                    for (n2 = 0; n2 < bmh3.b(); ++n2) {
                        arrayList.add((Object)((Object)aug.f) + "" + (Object)((Object)aug.u) + bmh3.g(n2));
                    }
                }
            }
        }
        Object object = dfm.values();
        n3 = ((dfm[])object).length;
        for (n2 = 0; n2 < n3; ++n2) {
            dfm dfm2 = object[n2];
            vi vi2 = this.a(dfm2);
            if (vi2.o() || (n5 & 2) != 0) continue;
            arrayList.add("");
            arrayList.add(caf.a("item.modifiers." + dfm2.d()));
            for (Map.Entry entry : vi2.l()) {
                cs cs2 = (cs)entry.getValue();
                double d2 = cs2.d();
                boolean bl3 = false;
                if (cs2.a() == azg.h) {
                    d2 += bdl2.a(cgz.e).b();
                    d2 += (double)acz.a(this, agh.a);
                    bl3 = true;
                } else if (cs2.a() == azg.i) {
                    d2 += bdl2.a(cgz.f).b();
                    bl3 = true;
                }
                double d3 = cs2.c() == 1 || cs2.c() == 2 ? d2 * 100.0 : d2;
                if (bl3) {
                    arrayList.add(" " + caf.a("attribute.modifier.equals." + cs2.c(), a.format(d3), caf.a("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (d2 > 0.0) {
                    arrayList.add((Object)((Object)aug.j) + " " + caf.a("attribute.modifier.plus." + cs2.c(), a.format(d3), caf.a("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                arrayList.add((Object)((Object)aug.m) + " " + caf.a("attribute.modifier.take." + cs2.c(), a.format(d3 *= -1.0), caf.a("attribute.name." + (String)entry.getKey())));
            }
        }
        if (this.n() && this.o().p("Unbreakable") && (n5 & 4) == 0) {
            arrayList.add((Object)((Object)aug.j) + caf.a("item.unbreakable"));
        }
        if (this.n() && this.e.b("CanDestroy", 9) && (n5 & 8) == 0 && !((bmh)(object = this.e.c("CanDestroy", 8))).j()) {
            arrayList.add("");
            arrayList.add((Object)((Object)aug.h) + caf.a("item.canBreak"));
            for (n3 = 0; n3 < ((bmh)object).b(); ++n3) {
                bfa bfa2 = bfa.a(((bmh)object).g(n3));
                if (bfa2 != null) {
                    arrayList.add((Object)((Object)aug.i) + bfa2.az_());
                    continue;
                }
                arrayList.add((Object)((Object)aug.i) + "missingno");
            }
        }
        if (this.n() && this.e.b("CanPlaceOn", 9) && (n5 & 0x10) == 0 && !((bmh)(object = this.e.c("CanPlaceOn", 8))).j()) {
            arrayList.add("");
            arrayList.add((Object)((Object)aug.h) + caf.a("item.canPlace"));
            for (n3 = 0; n3 < ((bmh)object).b(); ++n3) {
                bfa bfa3 = bfa.a(((bmh)object).g(n3));
                if (bfa3 != null) {
                    arrayList.add((Object)((Object)aug.i) + bfa3.az_());
                    continue;
                }
                arrayList.add((Object)((Object)aug.i) + "missingno");
            }
        }
        if (bl2) {
            if (this.f()) {
                arrayList.add("Durability: " + (this.i() - this.g()) + " / " + this.i());
            }
            arrayList.add((Object)((Object)aug.i) + ((bpx)azg.g.b(this.d)).toString());
            if (this.n()) {
                arrayList.add((Object)((Object)aug.i) + "NBT: " + this.o().b().size() + " tag(s)");
            }
        }
        return arrayList;
    }

    public boolean t() {
        return this.a().a(this);
    }

    public abj u() {
        return this.a().b_(this);
    }

    public boolean v() {
        if (!this.a().c_(this)) {
            return false;
        }
        return !this.w();
    }

    public void a(dad dad2, int n2) {
        if (this.e == null) {
            this.d(new bvp());
        }
        if (!this.e.b("ench", 9)) {
            this.e.a("ench", new bmh());
        }
        bmh bmh2 = this.e.c("ench", 10);
        bvp bvp2 = new bvp();
        bvp2.a("id", (short)dad.b(dad2));
        bvp2.a("lvl", (short)((byte)n2));
        bmh2.a(bvp2);
    }

    public boolean w() {
        return this.e != null && this.e.b("ench", 9);
    }

    public void a(String string, azt azt2) {
        if (this.e == null) {
            this.d(new bvp());
        }
        this.e.a(string, azt2);
    }

    public boolean x() {
        return this.a().r();
    }

    public boolean y() {
        return this.g != null;
    }

    public void a(cvr cvr2) {
        this.g = cvr2;
    }

    public cvr z() {
        return this.g;
    }

    public int A() {
        if (this.n() && this.e.b("RepairCost", 3)) {
            return this.e.h("RepairCost");
        }
        return 0;
    }

    public void c(int n2) {
        if (!this.n()) {
            this.e = new bvp();
        }
        this.e.a("RepairCost", n2);
    }

    public vi a(dfm dfm2) {
        vi vi2;
        if (this.n() && this.e.b("AttributeModifiers", 9)) {
            vi2 = io.v();
            bmh bmh2 = this.e.c("AttributeModifiers", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp2 = bmh2.b(i2);
                cs cs2 = cgz.a(bvp2);
                if (cs2 == null || bvp2.b("Slot", 8) && !bvp2.l("Slot").equals(dfm2.d()) || cs2.a().getLeastSignificantBits() == 0L || cs2.a().getMostSignificantBits() == 0L) continue;
                vi2.a(bvp2.l("AttributeName"), cs2);
            }
        } else {
            vi2 = this.a().a(dfm2);
        }
        return vi2;
    }

    public void a(String string, cs cs2, dfm dfm2) {
        if (this.e == null) {
            this.e = new bvp();
        }
        if (!this.e.b("AttributeModifiers", 9)) {
            this.e.a("AttributeModifiers", new bmh());
        }
        bmh bmh2 = this.e.c("AttributeModifiers", 10);
        bvp bvp2 = cgz.a(cs2);
        bvp2.a("AttributeName", string);
        if (dfm2 != null) {
            bvp2.a("Slot", dfm2.d());
        }
        bmh2.a(bvp2);
    }

    public void a(azg azg2) {
        this.d = azg2;
    }

    public cbg B() {
        aym aym2 = new aym(this.q());
        if (this.s()) {
            aym2.h().b(true);
        }
        cbg cbg2 = new aym("[").a(aym2).b("]");
        if (this.d != null) {
            bvp bvp2 = this.b(new bvp());
            cbg2.h().a(new dex(km.c, new aym(bvp2.toString())));
            cbg2.h().a(this.u().e);
        }
        return cbg2;
    }

    public boolean a(bfa bfa2) {
        if (bfa2 == this.h) {
            return this.i;
        }
        this.h = bfa2;
        if (this.n() && this.e.b("CanDestroy", 9)) {
            bmh bmh2 = this.e.c("CanDestroy", 8);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bfa bfa3 = bfa.a(bmh2.g(i2));
                if (bfa3 != bfa2) continue;
                this.i = true;
                return true;
            }
        }
        this.i = false;
        return false;
    }

    public boolean b(bfa bfa2) {
        if (bfa2 == this.j) {
            return this.k;
        }
        this.j = bfa2;
        if (this.n() && this.e.b("CanPlaceOn", 9)) {
            bmh bmh2 = this.e.c("CanPlaceOn", 8);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bfa bfa3 = bfa.a(bmh2.g(i2));
                if (bfa3 != bfa2) continue;
                this.k = true;
                return true;
            }
        }
        this.k = false;
        return false;
    }
}

