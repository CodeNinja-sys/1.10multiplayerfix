/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import java.util.UUID;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ce
extends azp {
    private static final d a = c.c();
    private final cji[] b;

    public ce(cfv[] arrcfv, cji[] arrcji) {
        super(arrcfv);
        this.b = arrcji;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        for (cji cji2 : this.b) {
            UUID uUID = cji.a(cji2);
            if (uUID == null) {
                uUID = UUID.randomUUID();
            }
            dfm dfm2 = cji.b(cji2)[random.nextInt(cji.b(cji2).length)];
            bhl2.a(cji.c(cji2), new cs(uUID, cji.d(cji2), cji.e(cji2).b(random), cji.f(cji2)), dfm2);
        }
        return bhl2;
    }

    static /* synthetic */ cji[] a(ce ce2) {
        return ce2.b;
    }
}

