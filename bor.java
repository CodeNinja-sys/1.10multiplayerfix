/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bor
extends azp {
    private static final d a = c.c();
    private final bom b;

    public bor(cfv[] arrcfv, bom bom2) {
        super(arrcfv);
        this.b = bom2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        if (bhl2.d()) {
            a.f("Couldn't set data of loot item {}", bhl2);
        } else {
            bhl2.b(this.b.a(random));
        }
        return bhl2;
    }

    static /* synthetic */ bom a(bor bor2) {
        return bor2.b;
    }
}

