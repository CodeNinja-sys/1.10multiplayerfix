/*
 * Decompiled with CFR 0.150.
 */
public class eq
extends dec {
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public eq(iu iu2) {
        super(iu2);
    }

    @Override
    public void a() {
        super.a();
        ++this.f;
        long l2 = this.a.z();
        long l3 = l2 / 24000L + 1L;
        if (!this.c && this.f > 20) {
            this.c = true;
            this.b.a.a(new avk(5, 0.0f));
        }
        boolean bl2 = this.d = l2 > 120500L;
        if (this.d) {
            ++this.e;
        }
        if (l2 % 24000L == 500L) {
            if (l3 <= 6L) {
                this.b.a(new du("demo.day." + l3, new Object[0]));
            }
        } else if (l3 == 1L) {
            if (l2 == 100L) {
                this.b.a.a(new avk(5, 101.0f));
            } else if (l2 == 175L) {
                this.b.a.a(new avk(5, 102.0f));
            } else if (l2 == 250L) {
                this.b.a.a(new avk(5, 103.0f));
            }
        } else if (l3 == 5L && l2 % 24000L == 22000L) {
            this.b.a(new du("demo.day.warning", new Object[0]));
        }
    }

    private void f() {
        if (this.e > 100) {
            this.b.a(new du("demo.reminder", new Object[0]));
            this.e = 0;
        }
    }

    @Override
    public void a(cmz cmz2, bqk bqk2) {
        if (this.d) {
            this.f();
            return;
        }
        super.a(cmz2, bqk2);
    }

    @Override
    public void a(cmz cmz2) {
        if (this.d) {
            return;
        }
        super.a(cmz2);
    }

    @Override
    public boolean b(cmz cmz2) {
        if (this.d) {
            return false;
        }
        return super.b(cmz2);
    }

    @Override
    public cey a(bdl bdl2, iu iu2, bhl bhl2, bqp bqp2) {
        if (this.d) {
            this.f();
            return cey.b;
        }
        return super.a(bdl2, iu2, bhl2, bqp2);
    }

    @Override
    public cey a(bdl bdl2, iu iu2, bhl bhl2, bqp bqp2, cmz cmz2, bqk bqk2, float f2, float f3, float f4) {
        if (this.d) {
            this.f();
            return cey.b;
        }
        return super.a(bdl2, iu2, bhl2, bqp2, cmz2, bqk2, f2, f3, f4);
    }
}

