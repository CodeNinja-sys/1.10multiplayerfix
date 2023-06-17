/*
 * Decompiled with CFR 0.150.
 */
public class ctf
extends bye {
    private int e;
    private final cwp f;

    public ctf(cwp cwp2) {
        super(cwp2, cwp.class, 3.0f, 0.02f);
        this.f = cwp2;
    }

    @Override
    public void c() {
        super.c();
        this.e = this.f.bT() && this.b instanceof cwp && ((cwp)this.b).bU() ? 10 : 0;
    }

    @Override
    public void e() {
        super.e();
        if (this.e > 0) {
            --this.e;
            if (this.e == 0) {
                al al2 = this.f.bR();
                for (int i2 = 0; i2 < al2.aI_(); ++i2) {
                    bhl bhl2 = al2.a(i2);
                    bhl bhl3 = null;
                    if (bhl2 != null) {
                        int n2;
                        azg azg2 = bhl2.a();
                        if ((azg2 == hp.R || azg2 == hp.cc || azg2 == hp.cb || azg2 == hp.cV) && bhl2.b > 3) {
                            n2 = bhl2.b / 2;
                            bhl2.b -= n2;
                            bhl3 = new bhl(azg2, n2, bhl2.h());
                        } else if (azg2 == hp.Q && bhl2.b > 5) {
                            n2 = bhl2.b / 2 / 3 * 3;
                            int n3 = n2 / 3;
                            bhl2.b -= n2;
                            bhl3 = new bhl(hp.R, n3, 0);
                        }
                        if (bhl2.b <= 0) {
                            al2.a(i2, null);
                        }
                    }
                    if (bhl3 == null) continue;
                    double d2 = this.f.aV - (double)0.3f + (double)this.f.A();
                    er er2 = new er(this.f.aQ, this.f.aU, d2, this.f.aW, bhl3);
                    float f2 = 0.3f;
                    float f3 = this.f.aj;
                    float f4 = this.f.bb;
                    er2.aX = -cmk.a(f3 * ((float)Math.PI / 180)) * cmk.b(f4 * ((float)Math.PI / 180)) * 0.3f;
                    er2.aZ = cmk.b(f3 * ((float)Math.PI / 180)) * cmk.b(f4 * ((float)Math.PI / 180)) * 0.3f;
                    er2.aY = -cmk.a(f4 * ((float)Math.PI / 180)) * 0.3f + 0.1f;
                    er2.l();
                    this.f.aQ.b(er2);
                    break;
                }
            }
        }
    }
}

