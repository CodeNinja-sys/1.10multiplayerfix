/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class be
extends azp {
    private static final d a = c.c();
    private final bom b;

    public be(cfv[] arrcfv, bom bom2) {
        super(arrcfv);
        this.b = bom2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        if (bhl2.d()) {
            float f2 = 1.0f - this.b.b(random);
            bhl2.b(cmk.d(f2 * (float)bhl2.i()));
        } else {
            a.f("Couldn't set damage of loot item {}", bhl2);
        }
        return bhl2;
    }

    static /* synthetic */ bom a(be be2) {
        return be2.b;
    }
}

