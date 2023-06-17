/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class xm
extends azp {
    private final bom a;

    public xm(cfv[] arrcfv, bom bom2) {
        super(arrcfv);
        this.a = bom2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        bhl2.b = this.a.a(random);
        return bhl2;
    }

    static /* synthetic */ bom a(xm xm2) {
        return xm2.a;
    }
}

