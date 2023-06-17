/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public abstract class cft {
    private int a = 20;
    private final List b = ov.a();
    private wr c = new wr();
    private double d;
    private double e;
    private int f = 200;
    private int g = 800;
    private int h = 4;
    private cpk i;
    private int j = 6;
    private int k = 16;
    private int l = 4;

    private String g() {
        return this.c.b().l("id");
    }

    public void a(String string) {
        this.c.b().a("id", string);
    }

    private boolean h() {
        cmz cmz2 = this.b();
        return this.a().a((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, (double)this.k);
    }

    public void c() {
        if (!this.h()) {
            this.e = this.d;
            return;
        }
        cmz cmz2 = this.b();
        if (this.a().C) {
            double d2 = (float)cmz2.a() + this.a().p.nextFloat();
            double d3 = (float)cmz2.b() + this.a().p.nextFloat();
            double d4 = (float)cmz2.c() + this.a().p.nextFloat();
            this.a().a(lz.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            this.a().a(lz.A, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
            if (this.a > 0) {
                --this.a;
            }
            this.e = this.d;
            this.d = (this.d + (double)(1000.0f / ((float)this.a + 200.0f))) % 360.0;
        } else {
            if (this.a == -1) {
                this.i();
            }
            if (this.a > 0) {
                --this.a;
                return;
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < this.h; ++i2) {
                double d5;
                double d6;
                int n2;
                double d7;
                bvp bvp2 = this.c.b();
                bmh bmh2 = bvp2.c("Pos", 6);
                iu iu2 = this.a();
                cpk cpk2 = aqz.a(bvp2, iu2, d7 = (n2 = bmh2.b()) >= 1 ? bmh2.e(0) : (double)cmz2.a() + (iu2.p.nextDouble() - iu2.p.nextDouble()) * (double)this.l + 0.5, d6 = n2 >= 2 ? bmh2.e(1) : (double)(cmz2.b() + iu2.p.nextInt(3) - 1), d5 = n2 >= 3 ? bmh2.e(2) : (double)cmz2.c() + (iu2.p.nextDouble() - iu2.p.nextDouble()) * (double)this.l + 0.5, false);
                if (cpk2 == null) {
                    return;
                }
                int n3 = iu2.a(cpk2.getClass(), new cxt(cmz2.a(), cmz2.b(), cmz2.c(), cmz2.a() + 1, cmz2.b() + 1, cmz2.c() + 1).b(this.l)).size();
                if (n3 >= this.j) {
                    this.i();
                    return;
                }
                xy xy2 = cpk2 instanceof xy ? (xy)cpk2 : null;
                cpk2.a_(cpk2.aU, cpk2.aV, cpk2.aW, iu2.p.nextFloat() * 360.0f, 0.0f);
                if (xy2 != null && (!xy2.h() || !xy2.i())) continue;
                if (this.c.b().c() == 1 && this.c.b().b("id", 8) && cpk2 instanceof xy) {
                    ((xy)cpk2).a(iu2.C(new cmz(cpk2)), null);
                }
                aqz.a(cpk2, iu2);
                iu2.b(2004, cmz2, 0);
                if (xy2 != null) {
                    xy2.at();
                }
                bl2 = true;
            }
            if (bl2) {
                this.i();
            }
        }
    }

    private void i() {
        this.a = this.g <= this.f ? this.f : this.f + this.a().p.nextInt(this.g - this.f);
        if (!this.b.isEmpty()) {
            this.a((wr)ctt.a(this.a().p, this.b));
        }
        this.a(1);
    }

    public void a(bvp bvp2) {
        azt azt2;
        this.a = bvp2.g("Delay");
        this.b.clear();
        if (bvp2.b("SpawnPotentials", 9)) {
            azt2 = bvp2.c("SpawnPotentials", 10);
            for (int i2 = 0; i2 < ((bmh)azt2).b(); ++i2) {
                this.b.add(new wr(((bmh)azt2).b(i2)));
            }
        }
        if (!((bvp)(azt2 = bvp2.o("SpawnData"))).b("id", 8)) {
            ((bvp)azt2).a("id", "Pig");
        }
        this.a(new wr(1, (bvp)azt2));
        if (bvp2.b("MinSpawnDelay", 99)) {
            this.f = bvp2.g("MinSpawnDelay");
            this.g = bvp2.g("MaxSpawnDelay");
            this.h = bvp2.g("SpawnCount");
        }
        if (bvp2.b("MaxNearbyEntities", 99)) {
            this.j = bvp2.g("MaxNearbyEntities");
            this.k = bvp2.g("RequiredPlayerRange");
        }
        if (bvp2.b("SpawnRange", 99)) {
            this.l = bvp2.g("SpawnRange");
        }
        if (this.a() != null) {
            this.i = null;
        }
    }

    public bvp b(bvp bvp2) {
        String string = this.g();
        if (aco.b(string)) {
            return bvp2;
        }
        bvp2.a("Delay", (short)this.a);
        bvp2.a("MinSpawnDelay", (short)this.f);
        bvp2.a("MaxSpawnDelay", (short)this.g);
        bvp2.a("SpawnCount", (short)this.h);
        bvp2.a("MaxNearbyEntities", (short)this.j);
        bvp2.a("RequiredPlayerRange", (short)this.k);
        bvp2.a("SpawnRange", (short)this.l);
        bvp2.a("SpawnData", this.c.b().d());
        bmh bmh2 = new bmh();
        if (this.b.isEmpty()) {
            bmh2.a(this.c.a());
        } else {
            for (wr wr2 : this.b) {
                bmh2.a(wr2.a());
            }
        }
        bvp2.a("SpawnPotentials", bmh2);
        return bvp2;
    }

    public cpk d() {
        if (this.i == null) {
            this.i = aqz.a(this.c.b(), this.a(), false);
            if (this.c.b().c() == 1 && this.c.b().b("id", 8) && this.i instanceof xy) {
                ((xy)this.i).a(this.a().C(new cmz(this.i)), null);
            }
        }
        return this.i;
    }

    public boolean b(int n2) {
        if (n2 == 1 && this.a().C) {
            this.a = this.f;
            return true;
        }
        return false;
    }

    public void a(wr wr2) {
        this.c = wr2;
    }

    public abstract void a(int var1);

    public abstract iu a();

    public abstract cmz b();

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }
}

