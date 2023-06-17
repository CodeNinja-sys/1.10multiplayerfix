/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;

class cvp
extends ayy {
    final /* synthetic */ bjs A;

    public cvp(bjs bjs2, bxy bxy2) {
        this.A = bjs2;
        super(bjs2, bxy2);
        this.b = ov.a();
        for (va va2 : bpv.e) {
            boolean bl2 = false;
            azg azg2 = va2.a();
            if (bjs.b(bjs2).a(va2) > 0) {
                bl2 = true;
            } else if (bpv.b(azg2) != null && bjs.b(bjs2).a(bpv.b(azg2)) > 0) {
                bl2 = true;
            } else if (bpv.a(azg2) != null && bjs.b(bjs2).a(bpv.a(azg2)) > 0) {
                bl2 = true;
            } else if (bpv.d(azg2) != null && bjs.b(bjs2).a(bpv.d(azg2)) > 0) {
                bl2 = true;
            } else if (bpv.e(azg2) != null && bjs.b(bjs2).a(bpv.e(azg2)) > 0) {
                bl2 = true;
            }
            if (!bl2) continue;
            this.b.add(va2);
        }
        this.w = new dcx(this, bjs2);
    }

    @Override
    protected void a(int n2, int n3, bha bha2) {
        super.a(n2, n3, bha2);
        if (this.a == 0) {
            bjs.a(this.A, n2 + 115 - 18 + 1, n3 + 1 + 1, 18, 18);
        } else {
            bjs.a(this.A, n2 + 115 - 18, n3 + 1, 18, 18);
        }
        if (this.a == 1) {
            bjs.a(this.A, n2 + 165 - 18 + 1, n3 + 1 + 1, 36, 18);
        } else {
            bjs.a(this.A, n2 + 165 - 18, n3 + 1, 36, 18);
        }
        if (this.a == 2) {
            bjs.a(this.A, n2 + 215 - 18 + 1, n3 + 1 + 1, 54, 18);
        } else {
            bjs.a(this.A, n2 + 215 - 18, n3 + 1, 54, 18);
        }
        if (this.a == 3) {
            bjs.a(this.A, n2 + 265 - 18 + 1, n3 + 1 + 1, 90, 18);
        } else {
            bjs.a(this.A, n2 + 265 - 18, n3 + 1, 90, 18);
        }
        if (this.a == 4) {
            bjs.a(this.A, n2 + 315 - 18 + 1, n3 + 1 + 1, 108, 18);
        } else {
            bjs.a(this.A, n2 + 315 - 18, n3 + 1, 108, 18);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        va va2 = this.b(n2);
        azg azg2 = va2.a();
        bjs.a(this.A, n3 + 40, n4, azg2);
        this.a(bpv.a(azg2), n3 + 115, n4, n2 % 2 == 0);
        this.a(bpv.b(azg2), n3 + 165, n4, n2 % 2 == 0);
        this.a(va2, n3 + 215, n4, n2 % 2 == 0);
        this.a(bpv.d(azg2), n3 + 265, n4, n2 % 2 == 0);
        this.a(bpv.e(azg2), n3 + 315, n4, n2 % 2 == 0);
    }

    @Override
    protected String c(int n2) {
        if (n2 == 0) {
            return "stat.crafted";
        }
        if (n2 == 1) {
            return "stat.used";
        }
        if (n2 == 3) {
            return "stat.pickup";
        }
        if (n2 == 4) {
            return "stat.dropped";
        }
        return "stat.mined";
    }
}

