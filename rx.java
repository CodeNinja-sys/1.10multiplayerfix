/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class rx
extends cam {
    public rx(int n2, int n3) {
        super(n2, n3);
    }

    public int a(Random random) {
        if ((Integer)this.a() >= (Integer)this.b()) {
            return (Integer)this.a();
        }
        return (Integer)this.a() + random.nextInt((Integer)this.b() - (Integer)this.a() + 1);
    }
}

