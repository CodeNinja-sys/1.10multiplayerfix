/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class cjf
implements cax {
    private final a a;
    private final sz b;

    public cjf(a a2, sz sz2) {
        this.a = a2;
        this.b = sz2;
    }

    @Override
    public void a(atm atm2) {
        switch (atm2.a()) {
            case d: {
                this.b.a(dfj.d);
                if (atm2.b() > 210) {
                    aym aym2 = new aym("Outdated server! I'm still on 1.10");
                    this.b.a(new bmg(aym2));
                    this.b.a(aym2);
                    break;
                }
                if (atm2.b() < 210) {
                    aym aym3 = new aym("Outdated client! Please use 1.10");
                    this.b.a(new bmg(aym3));
                    this.b.a(aym3);
                    break;
                }
                this.b.a(new pd(this.a, this.b));
                break;
            }
            case c: {
                this.b.a(dfj.c);
                this.b.a(new czx(this.a, this.b));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)atm2.a()));
            }
        }
    }

    @Override
    public void a(cbg cbg2) {
    }
}

