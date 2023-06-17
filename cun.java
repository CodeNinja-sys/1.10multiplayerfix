/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cun
extends cv {
    private cfn c;

    public cun() {
    }

    public cun(iu iu2, Random random, int n2, int n3, cfn cfn2) {
        super(n2, n3);
        this.c = cfn2;
        cdo cdo2 = new cdo(0, random, (n2 << 4) + 2, (n3 << 4) + 2, this.c);
        this.a.add(cdo2);
        cdo2.a(cdo2, this.a, random);
        this.d();
        if (cfn2 == cfn.b) {
            int n4 = -5;
            int n5 = iu2.u() - this.b.e + this.b.d() / 2 - -5;
            this.b.a(0, n5, 0);
            for (pc pc2 : this.a) {
                pc2.a_(0, n5, 0);
            }
        } else {
            this.a(iu2, random, 10);
        }
    }
}

