/*
 * Decompiled with CFR 0.150.
 */
class ix
extends ck {
    private final aqc a;

    public ix(aqc aqc2) {
        this.a = aqc2;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void e() {
        int n2 = this.a.bb();
        if (n2 > 100) {
            this.a.a(0.0f, 0.0f, 0.0f);
        } else if (this.a.aW().nextInt(50) == 0 || !aqc.a(this.a) || !this.a.M()) {
            float f2 = this.a.aW().nextFloat() * ((float)Math.PI * 2);
            float f3 = cmk.b(f2) * 0.2f;
            float f4 = -0.1f + this.a.aW().nextFloat() * 0.2f;
            float f5 = cmk.a(f2) * 0.2f;
            this.a.a(f3, f4, f5);
        }
    }
}

