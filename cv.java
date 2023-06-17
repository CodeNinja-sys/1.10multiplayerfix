/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class cv {
    protected List a = ov.b();
    protected awx b;
    private int c;
    private int d;

    public cv() {
    }

    public cv(int n2, int n3) {
        this.c = n2;
        this.d = n3;
    }

    public awx b() {
        return this.b;
    }

    public List c() {
        return this.a;
    }

    public void a(iu iu2, Random random, awx awx2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            pc pc2 = (pc)iterator.next();
            if (!pc2.b().a(awx2) || pc2.a(iu2, random, awx2)) continue;
            iterator.remove();
        }
    }

    protected void d() {
        this.b = awx.a();
        for (pc pc2 : this.a) {
            this.b.b(pc2.b());
        }
    }

    public bvp a(int n2, int n3) {
        bvp bvp2 = new bvp();
        bvp2.a("id", mb.a(this));
        bvp2.a("ChunkX", n2);
        bvp2.a("ChunkZ", n3);
        bvp2.a("BB", this.b.g());
        bmh bmh2 = new bmh();
        for (pc pc2 : this.a) {
            bmh2.a(pc2.a());
        }
        bvp2.a("Children", bmh2);
        this.a(bvp2);
        return bvp2;
    }

    public void a(bvp bvp2) {
    }

    public void a(iu iu2, bvp bvp2) {
        this.c = bvp2.h("ChunkX");
        this.d = bvp2.h("ChunkZ");
        if (bvp2.e("BB")) {
            this.b = new awx(bvp2.n("BB"));
        }
        bmh bmh2 = bvp2.c("Children", 10);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            this.a.add(mb.b(bmh2.b(i2), iu2));
        }
        this.b(bvp2);
    }

    public void b(bvp bvp2) {
    }

    protected void a(iu iu2, Random random, int n2) {
        int n3 = iu2.u() - n2;
        int n4 = this.b.d() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        int n5 = n4 - this.b.e;
        this.b.a(0, n5, 0);
        for (pc pc2 : this.a) {
            pc2.a_(0, n5, 0);
        }
    }

    protected void a(iu iu2, Random random, int n2, int n3) {
        int n4 = n3 - n2 + 1 - this.b.d();
        int n5 = n4 > 1 ? n2 + random.nextInt(n4) : n2;
        int n6 = n5 - this.b.b;
        this.b.a(0, n6, 0);
        for (pc pc2 : this.a) {
            pc2.a_(0, n6, 0);
        }
    }

    public boolean a() {
        return true;
    }

    public boolean a(zz zz2) {
        return true;
    }

    public void b(zz zz2) {
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

