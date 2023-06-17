/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class chq
extends azp {
    private static final d a = c.c();
    private final List b;

    public chq(cfv[] arrcfv, List list) {
        super(arrcfv);
        this.b = list;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        dad dad2;
        if (this.b == null || this.b.isEmpty()) {
            ArrayList arrayList = ov.a();
            for (dad dad3 : dad.b) {
                if (bhl2.a() != hp.aS && !dad3.a(bhl2)) continue;
                arrayList.add(dad3);
            }
            if (arrayList.isEmpty()) {
                a.f("Couldn't find a compatible enchantment for {}", bhl2);
                return bhl2;
            }
            dad2 = (dad)arrayList.get(random.nextInt(arrayList.size()));
        } else {
            dad2 = (dad)this.b.get(random.nextInt(this.b.size()));
        }
        int n2 = cmk.a(random, dad2.e(), dad2.a());
        if (bhl2.a() == hp.aS) {
            bhl2.a(hp.cn);
            hp.cn.a(bhl2, new bc(dad2, n2));
        } else {
            bhl2.a(dad2, n2);
        }
        return bhl2;
    }

    static /* synthetic */ List a(chq chq2) {
        return chq2.b;
    }
}

