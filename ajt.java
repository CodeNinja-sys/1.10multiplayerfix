/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class ajt
extends dbd
implements cem {
    protected bpx a;
    protected long b;

    protected boolean c(bvp bvp2) {
        if (bvp2.b("LootTable", 8)) {
            this.a = new bpx(bvp2.l("LootTable"));
            this.b = bvp2.i("LootTableSeed");
            return true;
        }
        return false;
    }

    protected boolean d(bvp bvp2) {
        if (this.a != null) {
            bvp2.a("LootTable", this.a.toString());
            if (this.b != 0L) {
                bvp2.a("LootTableSeed", this.b);
            }
            return true;
        }
        return false;
    }

    protected void d(bdl bdl2) {
        if (this.a != null) {
            cse cse2 = this.k.V().a(this.a);
            this.a = null;
            Random random = this.b == 0L ? new Random() : new Random(this.b);
            bcn bcn2 = new bcn((alj)this.k);
            if (bdl2 != null) {
                bcn2.a(bdl2.aT());
            }
            cse2.a(this, random, bcn2.a());
        }
    }

    @Override
    public bpx h() {
        return this.a;
    }

    public void a(bpx bpx2, long l2) {
        this.a = bpx2;
        this.b = l2;
    }
}

