/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aru
extends azp {
    private static final d a = c.c();

    public aru(cfv[] arrcfv) {
        super(arrcfv);
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        bhl bhl3 = gu.a().a(bhl2);
        if (bhl3 == null) {
            a.f("Couldn't smelt {} because there is no smelting recipe", bhl2);
            return bhl2;
        }
        bhl bhl4 = bhl3.j();
        bhl4.b = bhl2.b;
        return bhl4;
    }
}

