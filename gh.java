/*
 * Decompiled with CFR 0.150.
 */
public class gh
extends bq {
    private final cmx i;

    public gh(cmx cmx2) {
        this.i = cmx2;
    }

    @Override
    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        if (this.i.S.e()) {
            this.b += 1.0f;
            this.c = true;
        } else {
            this.c = false;
        }
        if (this.i.U.e()) {
            this.b -= 1.0f;
            this.d = true;
        } else {
            this.d = false;
        }
        if (this.i.T.e()) {
            this.a += 1.0f;
            this.e = true;
        } else {
            this.e = false;
        }
        if (this.i.V.e()) {
            this.a -= 1.0f;
            this.f = true;
        } else {
            this.f = false;
        }
        this.g = this.i.W.e();
        this.h = this.i.X.e();
        if (this.h) {
            this.a = (float)((double)this.a * 0.3);
            this.b = (float)((double)this.b * 0.3);
        }
    }
}

