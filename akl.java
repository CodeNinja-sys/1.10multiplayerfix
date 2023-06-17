/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class akl
implements wu {
    public azg a;
    public rx b;

    public akl(azg azg2, rx rx2) {
        this.a = azg2;
        this.b = rx2;
    }

    @Override
    public void a(beo beo2, Random random) {
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        beo2.add(new jc(new bhl(this.a, n2, 0), hp.bY));
    }
}

