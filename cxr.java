/*
 * Decompiled with CFR 0.150.
 */
public class cxr {
    public final bdl a;
    private boolean d = true;
    private int e;
    private int f;
    private int g = 127;
    private int h = 127;
    private int i;
    public int b;
    final /* synthetic */ aph c;

    public cxr(aph aph2, bdl bdl2) {
        this.c = aph2;
        this.a = bdl2;
    }

    public ds a(bhl bhl2) {
        if (this.d) {
            this.d = false;
            return new aew(bhl2.h(), this.c.f, this.c.e, this.c.i.values(), this.c.g, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
        }
        if (this.i++ % 5 == 0) {
            return new aew(bhl2.h(), this.c.f, this.c.e, this.c.i.values(), this.c.g, 0, 0, 0, 0);
        }
        return null;
    }

    public void a(int n2, int n3) {
        if (this.d) {
            this.e = Math.min(this.e, n2);
            this.f = Math.min(this.f, n3);
            this.g = Math.max(this.g, n2);
            this.h = Math.max(this.h, n3);
        } else {
            this.d = true;
            this.e = n2;
            this.f = n3;
            this.g = n2;
            this.h = n3;
        }
    }
}

