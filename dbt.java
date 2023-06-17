/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class dbt
implements wu {
    public bhl a;
    public rx b;

    public dbt(azg azg2, rx rx2) {
        this.a = new bhl(azg2);
        this.b = rx2;
    }

    @Override
    public void a(beo beo2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        bhl bhl2 = new bhl(hp.bY, n2, 0);
        bhl bhl3 = new bhl(this.a.a(), 1, this.a.h());
        bhl3 = acz.a(random, bhl3, 5 + random.nextInt(15), false);
        beo2.add(new jc(bhl2, bhl3));
    }
}

