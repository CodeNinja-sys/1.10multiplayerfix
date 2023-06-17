/*
 * Decompiled with CFR 0.150.
 */
public class dag
extends ahg {
    private final bxy g = bxy.B();

    public dag(cld cld2) {
        super(cld2, false);
    }

    @Override
    public void a() {
        super.a();
        if (this.f.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : this.f) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string);
            }
            this.g.r.c().a(new aym(stringBuilder.toString()), 1);
        }
    }

    @Override
    public cmz b() {
        cmz cmz2 = null;
        if (this.g.t != null && this.g.t.a == bmw.b) {
            cmz2 = this.g.t.a();
        }
        return cmz2;
    }
}

