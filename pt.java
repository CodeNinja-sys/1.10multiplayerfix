/*
 * Decompiled with CFR 0.150.
 */
public class pt
implements akc {
    @Override
    public int a() {
        return 135;
    }

    @Override
    public bvp a(bvp bvp2) {
        while (bvp2.b("Riding", 10)) {
            bvp bvp3 = this.b(bvp2);
            this.a(bvp2, bvp3);
            bvp2 = bvp3;
        }
        return bvp2;
    }

    protected void a(bvp bvp2, bvp bvp3) {
        bmh bmh2 = new bmh();
        bmh2.a(bvp2);
        bvp3.a("Passengers", bmh2);
    }

    protected bvp b(bvp bvp2) {
        bvp bvp3 = bvp2.o("Riding");
        bvp2.q("Riding");
        return bvp3;
    }
}

