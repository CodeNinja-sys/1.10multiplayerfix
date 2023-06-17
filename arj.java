/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class arj
extends cv {
    public arj() {
    }

    public arj(iu iu2, Random random, int n2, int n3) {
        super(n2, n3);
        ud ud2 = new ud(random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(ud2);
        ud2.a(ud2, this.a, random);
        List list = ud2.d;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            pc pc2 = (pc)list.remove(n4);
            pc2.a(ud2, this.a, random);
        }
        this.d();
        this.a(iu2, random, 48, 70);
    }
}

