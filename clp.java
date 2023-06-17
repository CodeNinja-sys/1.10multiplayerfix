/*
 * Decompiled with CFR 0.150.
 */
public class clp
implements akc {
    @Override
    public int a() {
        return 100;
    }

    @Override
    public bvp a(bvp bvp2) {
        bmh bmh2;
        bmh bmh3 = bvp2.c("Equipment", 10);
        if (bmh3.b() > 0 && !bvp2.b("HandItems", 10)) {
            bmh2 = new bmh();
            bmh2.a(bmh3.h(0));
            bmh2.a(new bvp());
            bvp2.a("HandItems", bmh2);
        }
        if (bmh3.b() > 1 && !bvp2.b("ArmorItem", 10)) {
            bmh2 = new bmh();
            bmh2.a(bmh3.b(1));
            bmh2.a(bmh3.b(2));
            bmh2.a(bmh3.b(3));
            bmh2.a(bmh3.b(4));
            bvp2.a("ArmorItems", bmh2);
        }
        bvp2.q("Equipment");
        if (bvp2.b("DropChances", 9)) {
            bmh bmh4;
            bmh2 = bvp2.c("DropChances", 5);
            if (!bvp2.b("HandDropChances", 10)) {
                bmh4 = new bmh();
                bmh4.a(new po(bmh2.f(0)));
                bmh4.a(new po(0.0f));
                bvp2.a("HandDropChances", bmh4);
            }
            if (!bvp2.b("ArmorDropChances", 10)) {
                bmh4 = new bmh();
                bmh4.a(new po(bmh2.f(1)));
                bmh4.a(new po(bmh2.f(2)));
                bmh4.a(new po(bmh2.f(3)));
                bmh4.a(new po(bmh2.f(4)));
                bvp2.a("ArmorDropChances", bmh4);
            }
            bvp2.q("DropChances");
        }
        return bvp2;
    }
}

