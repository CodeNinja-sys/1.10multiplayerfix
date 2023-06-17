/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class cxm
extends azg {
    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (!iu2.C) {
            p p2 = new p(iu2, (float)cmz2.a() + f2, (float)cmz2.b() + f3, (float)cmz2.c() + f4, bhl2);
            iu2.b(p2);
            if (!bdl2.G.d) {
                --bhl2.b;
            }
        }
        return cey.a;
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        bmh bmh2;
        if (!bhl2.n()) {
            return;
        }
        bvp bvp2 = bhl2.o().o("Fireworks");
        if (bvp2 == null) {
            return;
        }
        if (bvp2.b("Flight", 99)) {
            list.add(caf.a("item.fireworks.flight") + " " + bvp2.f("Flight"));
        }
        if ((bmh2 = bvp2.c("Explosions", 10)) != null && !bmh2.j()) {
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                ArrayList arrayList = ov.a();
                avm.a(bvp3, arrayList);
                if (arrayList.isEmpty()) continue;
                for (int i3 = 1; i3 < arrayList.size(); ++i3) {
                    arrayList.set(i3, "  " + (String)arrayList.get(i3));
                }
                list.addAll(arrayList);
            }
        }
    }
}

