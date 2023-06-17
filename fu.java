/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.c.g;
import com.c.a.c.h;
import com.c.a.e;
import java.util.Map;
import java.util.UUID;

public class fu
extends kh {
    private static final bpx d = new bpx("textures/entity/skeleton/skeleton.png");
    private static final bpx e = new bpx("textures/entity/skeleton/wither_skeleton.png");
    private static final bpx f = new bpx("textures/entity/zombie/zombie.png");
    private static final bpx g = new bpx("textures/entity/creeper/creeper.png");
    private static final bpx h = new bpx("textures/entity/enderdragon/dragon.png");
    private final aan i = new aan(0.0f);
    public static fu a;
    private final bpl j = new bpl(0, 0, 64, 32);
    private final bpl k = new bxd();

    public void a(tr tr2, double d2, double d3, double d4, float f2, int n2) {
        bqk bqk2 = bqk.a(tr2.x() & 7);
        float f3 = tr2.a(f2);
        this.a((float)d2, (float)d3, (float)d4, bqk2, (float)(tr2.g() * 360) / 16.0f, tr2.f(), tr2.d(), n2, f3);
    }

    @Override
    public void a(ccg ccg2) {
        super.a(ccg2);
        a = this;
    }

    public void a(float f2, float f3, float f4, bqk bqk2, float f5, int n2, e e2, int n3, float f6) {
        axg axg2 = this.j;
        if (n3 >= 0) {
            this.a(b[n3]);
            cja.l(5890);
            cja.D();
            cja.b(4.0f, 2.0f, 1.0f);
            cja.c(0.0625f, 0.0625f, 0.0625f);
            cja.l(5888);
        } else {
            switch (n2) {
                default: {
                    this.a(d);
                    break;
                }
                case 1: {
                    this.a(e);
                    break;
                }
                case 2: {
                    this.a(f);
                    axg2 = this.k;
                    break;
                }
                case 3: {
                    axg2 = this.k;
                    bpx bpx2 = ccj.a();
                    if (e2 != null) {
                        bxy bxy2 = bxy.B();
                        Map map = bxy2.aa().a(e2);
                        if (map.containsKey((Object)com.c.a.c.h.a)) {
                            bpx2 = bxy2.aa().a((g)map.get((Object)com.c.a.c.h.a), com.c.a.c.h.a);
                        } else {
                            UUID uUID = bdl.a(e2);
                            bpx2 = ccj.a(uUID);
                        }
                    }
                    this.a(bpx2);
                    break;
                }
                case 4: {
                    this.a(g);
                    break;
                }
                case 5: {
                    this.a(h);
                    axg2 = this.i;
                }
            }
        }
        cja.D();
        cja.q();
        if (bqk2 == bqk.b) {
            cja.c(f2 + 0.5f, f3, f4 + 0.5f);
        } else {
            switch (bqk2) {
                case c: {
                    cja.c(f2 + 0.5f, f3 + 0.25f, f4 + 0.74f);
                    break;
                }
                case d: {
                    cja.c(f2 + 0.5f, f3 + 0.25f, f4 + 0.26f);
                    f5 = 180.0f;
                    break;
                }
                case e: {
                    cja.c(f2 + 0.74f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 270.0f;
                    break;
                }
                default: {
                    cja.c(f2 + 0.26f, f3 + 0.25f, f4 + 0.5f);
                    f5 = 90.0f;
                }
            }
        }
        float f7 = 0.0625f;
        cja.A();
        cja.b(-1.0f, -1.0f, 1.0f);
        cja.d();
        if (n2 == 3) {
            cja.a(asc.b);
        }
        axg2.a(null, f6, 0.0f, 0.0f, f5, 0.0f, 0.0625f);
        cja.E();
        if (n3 >= 0) {
            cja.l(5890);
            cja.E();
            cja.l(5888);
        }
    }
}

