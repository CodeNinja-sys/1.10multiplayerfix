/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bvj
extends azp {
    private final bom a;
    private final int b;

    public bvj(cfv[] arrcfv, bom bom2, int n2) {
        super(arrcfv);
        this.a = bom2;
        this.b = n2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        cpk cpk2 = abe2.c();
        if (cpk2 instanceof bga) {
            int n2 = acz.h((bga)cpk2);
            if (n2 == 0) {
                return bhl2;
            }
            float f2 = (float)n2 * this.a.b(random);
            bhl2.b += Math.round(f2);
            if (this.b != 0 && bhl2.b > this.b) {
                bhl2.b = this.b;
            }
        }
        return bhl2;
    }

    static /* synthetic */ bom a(bvj bvj2) {
        return bvj2.a;
    }

    static /* synthetic */ int b(bvj bvj2) {
        return bvj2.b;
    }
}

