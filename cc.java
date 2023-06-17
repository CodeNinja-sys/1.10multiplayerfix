/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class cc
extends cv {
    public cc() {
    }

    public cc(iu iu2, Random random, int n2, int n3) {
        super(n2, n3);
        bbj.b();
        afk afk2 = new afk(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(afk2);
        afk2.a(afk2, this.a, random);
        List list = afk2.c;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            pc pc2 = (pc)list.remove(n4);
            pc2.a(afk2, this.a, random);
        }
        this.d();
        this.a(iu2, random, 10);
    }
}

