/*
 * Decompiled with CFR 0.150.
 */
class cfd
extends ux {
    private final bdl a;

    public cfd(bdl bdl2, tb tb2, int n2, int n3, int n4) {
        super(tb2, n2, n3, n4);
        this.a = bdl2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return cfd.e(bhl2);
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public void a(bdl bdl2, bhl bhl2) {
        if (anl.c(bhl2) != im.b) {
            this.a.a((cyd)bpa.B);
        }
        super.a(bdl2, bhl2);
    }

    public static boolean e(bhl bhl2) {
        if (bhl2 == null) {
            return false;
        }
        azg azg2 = bhl2.a();
        return azg2 == hp.bG || azg2 == hp.bJ || azg2 == hp.bH || azg2 == hp.bI;
    }
}

