/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class ccu
implements ala {
    private final StringBuffer a = new StringBuffer();
    private final a b;

    public ccu(a a2) {
        this.b = a2;
    }

    @Override
    public String i_() {
        return "Rcon";
    }

    @Override
    public cbg v() {
        return new aym(this.i_());
    }

    @Override
    public void a(cbg cbg2) {
        this.a.append(cbg2.i());
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public cmz k_() {
        return cmz.e;
    }

    @Override
    public amj l_() {
        return amj.a;
    }

    @Override
    public iu m_() {
        return this.b.e();
    }

    @Override
    public cpk n_() {
        return null;
    }

    @Override
    public boolean C_() {
        return true;
    }

    @Override
    public void a(bnw bnw2, int n2) {
    }

    @Override
    public a o_() {
        return this.b;
    }
}

