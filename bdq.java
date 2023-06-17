/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class bdq
implements wu {
    public bhl a;
    public rx b;

    public bdq(azg azg2, rx rx2) {
        this.a = new bhl(azg2);
        this.b = rx2;
    }

    public bdq(bhl bhl2, rx rx2) {
        this.a = bhl2;
        this.b = rx2;
    }

    @Override
    public void a(beo beo2, Random random) {
        bhl bhl2;
        bhl bhl3;
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        if (n2 < 0) {
            bhl3 = new bhl(hp.bY);
            bhl2 = new bhl(this.a.a(), -n2, this.a.h());
        } else {
            bhl3 = new bhl(hp.bY, n2, 0);
            bhl2 = new bhl(this.a.a(), 1, this.a.h());
        }
        beo2.add(new jc(bhl3, bhl2));
    }
}

