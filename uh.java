/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.vi;
import java.util.List;
import java.util.UUID;

public class uh
extends azg {
    private static final int[] n = new int[]{13, 15, 16, 11};
    private static final UUID[] o = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public static final String[] a = new String[]{"minecraft:items/empty_armor_slot_boots", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_helmet"};
    public static final atl b = new co();
    public final dfm c;
    public final int d;
    public final float e;
    public final int f;
    private final in p;

    public static bhl a(bcl bcl2, bhl bhl2) {
        cmz cmz2 = bcl2.e().c((bqk)((Object)bcl2.f().b(crh.a)));
        List list = bcl2.a().a(bga.class, new cxt(cmz2), cn.a(auxx.e, (cm)new bqx(bhl2)));
        if (list.isEmpty()) {
            return null;
        }
        bga bga2 = (bga)list.get(0);
        dfm dfm2 = xy.c(bhl2);
        bhl bhl3 = bhl2.j();
        bhl3.b = 1;
        bga2.a(dfm2, bhl3);
        if (bga2 instanceof xy) {
            ((xy)bga2).a(dfm2, 2.0f);
        }
        --bhl2.b;
        return bhl2;
    }

    public uh(in in2, int n2, dfm dfm2) {
        this.p = in2;
        this.c = dfm2;
        this.f = n2;
        this.d = in2.b(dfm2);
        this.e(in2.a(dfm2));
        this.e = in2.e();
        this.k = 1;
        this.a(zm.j);
        crh.c.a(this, b);
    }

    public dfm e() {
        return this.c;
    }

    @Override
    public int d() {
        return this.p.a();
    }

    public in f() {
        return this.p;
    }

    public boolean e(bhl bhl2) {
        if (this.p != in.a) {
            return false;
        }
        bvp bvp2 = bhl2.o();
        if (bvp2 != null && bvp2.b("display", 10)) {
            return bvp2.o("display").b("color", 3);
        }
        return false;
    }

    public int f(bhl bhl2) {
        bvp bvp2;
        if (this.p != in.a) {
            return 0xFFFFFF;
        }
        bvp bvp3 = bhl2.o();
        if (bvp3 != null && (bvp2 = bvp3.o("display")) != null && bvp2.b("color", 3)) {
            return bvp2.h("color");
        }
        return 10511680;
    }

    public void g(bhl bhl2) {
        if (this.p != in.a) {
            return;
        }
        bvp bvp2 = bhl2.o();
        if (bvp2 == null) {
            return;
        }
        bvp bvp3 = bvp2.o("display");
        if (bvp3.e("color")) {
            bvp3.q("color");
        }
    }

    public void a(bhl bhl2, int n2) {
        if (this.p != in.a) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        bvp bvp2 = bhl2.o();
        if (bvp2 == null) {
            bvp2 = new bvp();
            bhl2.d(bvp2);
        }
        bvp bvp3 = bvp2.o("display");
        if (!bvp2.b("display", 10)) {
            bvp2.a("display", bvp3);
        }
        bvp3.a("color", n2);
    }

    @Override
    public boolean a(bhl bhl2, bhl bhl3) {
        if (this.p.c() == bhl3.a()) {
            return true;
        }
        return super.a(bhl2, bhl3);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        dfm dfm2 = xy.c(bhl2);
        bhl bhl3 = bdl2.a(dfm2);
        if (bhl3 == null) {
            bdl2.a(dfm2, bhl2.j());
            bhl2.b = 0;
            return new wx(cey.a, bhl2);
        }
        return new wx(cey.c, bhl2);
    }

    @Override
    public vi a(dfm dfm2) {
        vi vi2 = super.a(dfm2);
        if (dfm2 == this.c) {
            vi2.a(cgz.g.b(), new cs(o[dfm2.b()], "Armor modifier", this.d, 0));
            vi2.a(cgz.h.b(), new cs(o[dfm2.b()], "Armor toughness", this.e, 0));
        }
        return vi2;
    }

    static /* synthetic */ int[] g() {
        return n;
    }
}

