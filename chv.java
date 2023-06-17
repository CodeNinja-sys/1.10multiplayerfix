/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class chv
extends cv {
    private boolean c;

    public chv() {
    }

    public chv(iu iu2, Random random, int n2, int n3, int n4) {
        super(n2, n3);
        int n5;
        List list = ccv.a(random, n4);
        yj yj2 = new yj(iu2.t_(), 0, random, (n2 << 4) + 2, (n3 << 4) + 2, list, n4);
        this.a.add(yj2);
        yj2.a(yj2, this.a, random);
        List list2 = yj2.f;
        List list3 = yj2.e;
        while (!list2.isEmpty() || !list3.isEmpty()) {
            Object object;
            if (list2.isEmpty()) {
                n5 = random.nextInt(list3.size());
                object = (pc)list3.remove(n5);
                ((pc)object).a(yj2, this.a, random);
                continue;
            }
            n5 = random.nextInt(list2.size());
            object = (pc)list2.remove(n5);
            ((pc)object).a(yj2, this.a, random);
        }
        this.d();
        n5 = 0;
        for (pc pc2 : this.a) {
            if (pc2 instanceof acf) continue;
            ++n5;
        }
        this.c = n5 > 2;
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Valid", this.c);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.c = bvp2.p("Valid");
    }
}

