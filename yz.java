/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class yz
implements wu {
    public bhl a;
    public rx b;
    public bhl c;
    public rx d;

    public yz(azg azg2, rx rx2, azg azg3, rx rx3) {
        this.a = new bhl(azg2);
        this.b = rx2;
        this.c = new bhl(azg3);
        this.d = rx3;
    }

    @Override
    public void a(beo beo2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        int n3 = 1;
        if (this.d != null) {
            n3 = this.d.a(random);
        }
        beo2.add(new jc(new bhl(this.a.a(), n2, this.a.h()), new bhl(hp.bY), new bhl(this.c.a(), n3, this.c.h())));
    }
}

