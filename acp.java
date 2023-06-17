/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.an;
import com.a.a.c.f;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class acp
extends bku {
    private static final an M = com.a.a.c.f.a().a(5L, TimeUnit.MINUTES).a(new ciu(null));
    private final rq N = new rq();

    @Override
    protected void a(anr anr2, iu iu2, Random random) {
        ajp[] arrajp;
        this.a(iu2, random);
        for (ajp ajp2 : arrajp = acp.a(iu2)) {
            if (!ajp2.a(this.b)) continue;
            this.N.a(ajp2);
            this.N.a(iu2, random, new cmz(ajp2.a(), 45, ajp2.b()));
        }
    }

    public static ajp[] a(iu iu2) {
        Random random = new Random(iu2.y());
        long l2 = random.nextLong() & 0xFFFFL;
        return (ajp[])M.c(l2);
    }
}

