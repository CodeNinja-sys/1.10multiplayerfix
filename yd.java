/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Random;
import java.util.Set;

public class yd
extends cv {
    private final Set c = aad.a();
    private boolean d;

    public yd() {
    }

    public yd(iu iu2, Random random, int n2, int n3) {
        super(n2, n3);
        this.b(iu2, random, n2, n3);
    }

    private void b(iu iu2, Random random, int n2, int n3) {
        random.setSeed(iu2.y());
        long l2 = random.nextLong();
        long l3 = random.nextLong();
        long l4 = (long)n2 * l2;
        long l5 = (long)n3 * l3;
        random.setSeed(l4 ^ l5 ^ iu2.y());
        int n4 = n2 * 16 + 8 - 29;
        int n5 = n3 * 16 + 8 - 29;
        bqk bqk2 = afj.a.a(random);
        this.a.add(new cii(random, n4, n5, bqk2));
        this.d();
        this.d = true;
    }

    @Override
    public void a(iu iu2, Random random, awx awx2) {
        if (!this.d) {
            this.a.clear();
            this.b(iu2, random, this.e(), this.f());
        }
        super.a(iu2, random, awx2);
    }

    @Override
    public boolean a(zz zz2) {
        if (this.c.contains(zz2)) {
            return false;
        }
        return super.a(zz2);
    }

    @Override
    public void b(zz zz2) {
        super.b(zz2);
        this.c.add(zz2);
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bmh bmh2 = new bmh();
        for (zz zz2 : this.c) {
            bvp bvp3 = new bvp();
            bvp3.a("X", zz2.a);
            bvp3.a("Z", zz2.b);
            bmh2.a(bvp3);
        }
        bvp2.a("Processed", bmh2);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("Processed", 9)) {
            bmh bmh2 = bvp2.c("Processed", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                this.c.add(new zz(bvp3.h("X"), bvp3.h("Z")));
            }
        }
    }
}

