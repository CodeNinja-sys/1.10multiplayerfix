/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bci {
    protected int c = 8;
    protected Random d = new Random();
    protected iu e;

    public void a(iu iu2, int n2, int n3, cnb cnb2) {
        int n4 = this.c;
        this.e = iu2;
        this.d.setSeed(iu2.y());
        long l2 = this.d.nextLong();
        long l3 = this.d.nextLong();
        for (int i2 = n2 - n4; i2 <= n2 + n4; ++i2) {
            for (int i3 = n3 - n4; i3 <= n3 + n4; ++i3) {
                long l4 = (long)i2 * l2;
                long l5 = (long)i3 * l3;
                this.d.setSeed(l4 ^ l5 ^ iu2.y());
                this.a(iu2, i2, i3, n2, n3, cnb2);
            }
        }
    }

    protected void a(iu iu2, int n2, int n3, int n4, int n5, cnb cnb2) {
    }
}

