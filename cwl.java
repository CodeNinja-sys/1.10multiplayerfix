/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cwl {
    private cdk a = cdk.a;
    private ih b = ih.a;
    private boolean c = false;
    private bfa d;
    private zz e;
    private awx f;
    private boolean g = true;
    private float h = 1.0f;
    private Random i;
    private Long j;

    public cwl a() {
        cwl cwl2 = new cwl();
        cwl2.a = this.a;
        cwl2.b = this.b;
        cwl2.c = this.c;
        cwl2.d = this.d;
        cwl2.e = this.e;
        cwl2.f = this.f;
        cwl2.g = this.g;
        cwl2.h = this.h;
        cwl2.i = this.i;
        cwl2.j = this.j;
        return cwl2;
    }

    public cwl a(cdk cdk2) {
        this.a = cdk2;
        return this;
    }

    public cwl a(ih ih2) {
        this.b = ih2;
        return this;
    }

    public cwl a(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public cwl a(bfa bfa2) {
        this.d = bfa2;
        return this;
    }

    public cwl a(zz zz2) {
        this.e = zz2;
        return this;
    }

    public cwl a(awx awx2) {
        this.f = awx2;
        return this;
    }

    public cwl a(Long l2) {
        this.j = l2;
        return this;
    }

    public cwl a(Random random) {
        this.i = random;
        return this;
    }

    public cwl a(float f2) {
        this.h = f2;
        return this;
    }

    public cdk b() {
        return this.a;
    }

    public cwl b(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public ih c() {
        return this.b;
    }

    public Random a(cmz cmz2) {
        if (this.i != null) {
            return this.i;
        }
        if (this.j != null) {
            if (this.j == 0L) {
                return new Random(System.currentTimeMillis());
            }
            return new Random(this.j);
        }
        if (cmz2 == null) {
            return new Random(System.currentTimeMillis());
        }
        int n2 = cmz2.a();
        int n3 = cmz2.c();
        return new Random((long)(n2 * n2 * 4987142 + n2 * 5947611) + (long)(n3 * n3) * 4392871L + (long)(n3 * 389711) ^ 0x3AD8025FL);
    }

    public float d() {
        return this.h;
    }

    public boolean e() {
        return this.c;
    }

    public bfa f() {
        return this.d;
    }

    public awx g() {
        if (this.f == null && this.e != null) {
            this.i();
        }
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    void i() {
        this.f = this.b(this.e);
    }

    private awx b(zz zz2) {
        if (zz2 == null) {
            return null;
        }
        int n2 = zz2.a * 16;
        int n3 = zz2.b * 16;
        return new awx(n2, 0, n3, n2 + 16 - 1, 255, n3 + 16 - 1);
    }
}

