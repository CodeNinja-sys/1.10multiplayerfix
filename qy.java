/*
 * Decompiled with CFR 0.150.
 */
class qy
implements czo {
    final /* synthetic */ cmn a;

    private qy(cmn cmn2) {
        this.a = cmn2;
    }

    public void a(aoa aoa2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cja.D();
        switch (aoa2.M()) {
            case a: {
                break;
            }
            case f: {
                cja.b(90.0f, 0.0f, 0.0f, 1.0f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.c(1.0f, -1.0f, 0.0f);
                cja.b(180.0f, 0.0f, 1.0f, 0.0f);
                break;
            }
            case e: {
                cja.b(-90.0f, 0.0f, 0.0f, 1.0f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.c(-1.0f, -1.0f, 0.0f);
                cja.b(180.0f, 0.0f, 1.0f, 0.0f);
                break;
            }
            case c: {
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.c(0.0f, -1.0f, -1.0f);
                break;
            }
            case d: {
                cja.b(180.0f, 0.0f, 0.0f, 1.0f);
                cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                cja.c(0.0f, -1.0f, 1.0f);
                break;
            }
            case b: {
                cja.b(180.0f, 1.0f, 0.0f, 0.0f);
                cja.c(0.0f, -2.0f, 0.0f);
            }
        }
        abd abd2 = ((io)this.a.c()).a;
        abd2.g = f6 * ((float)Math.PI / 180);
        abd2.f = f7 * ((float)Math.PI / 180);
        this.a.a(cmn.b());
        abd2.a(f8);
        cja.E();
    }

    @Override
    public boolean a() {
        return false;
    }

    /* synthetic */ qy(cmn cmn2, tk tk2) {
        this(cmn2);
    }
}

