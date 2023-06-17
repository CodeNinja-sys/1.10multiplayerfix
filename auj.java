/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class auj
extends azg {
    @Override
    public boolean a(bhl bhl2) {
        return true;
    }

    @Override
    public boolean c_(bhl bhl2) {
        return false;
    }

    @Override
    public abj b_(bhl bhl2) {
        if (this.h(bhl2).j()) {
            return super.b_(bhl2);
        }
        return abj.b;
    }

    public bmh h(bhl bhl2) {
        bvp bvp2 = bhl2.o();
        if (bvp2 == null || !bvp2.b("StoredEnchantments", 9)) {
            return new bmh();
        }
        return (bmh)bvp2.c("StoredEnchantments");
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        super.a(bhl2, bdl2, list, bl2);
        bmh bmh2 = this.h(bhl2);
        if (bmh2 != null) {
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                short s2 = bmh2.b(i2).g("id");
                short s3 = bmh2.b(i2).g("lvl");
                if (dad.c(s2) == null) continue;
                list.add(dad.c(s2).d(s3));
            }
        }
    }

    public void a(bhl bhl2, bc bc2) {
        bmh bmh2 = this.h(bhl2);
        boolean bl2 = true;
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp2 = bmh2.b(i2);
            if (dad.c(bvp2.g("id")) != bc2.a) continue;
            if (bvp2.g("lvl") < bc2.b) {
                bvp2.a("lvl", (short)bc2.b);
            }
            bl2 = false;
            break;
        }
        if (bl2) {
            bvp bvp3 = new bvp();
            bvp3.a("id", (short)dad.b(bc2.a));
            bvp3.a("lvl", (short)bc2.b);
            bmh2.a(bvp3);
        }
        if (!bhl2.n()) {
            bhl2.d(new bvp());
        }
        bhl2.o().a("StoredEnchantments", bmh2);
    }

    public bhl a(bc bc2) {
        bhl bhl2 = new bhl(this);
        this.a(bhl2, bc2);
        return bhl2;
    }

    public void a(dad dad2, List list) {
        for (int i2 = dad2.e(); i2 <= dad2.a(); ++i2) {
            list.add(this.a(new bc(dad2, i2)));
        }
    }
}

