/*
 * Decompiled with CFR 0.150.
 */
public class cmm
implements bcu {
    private final String o;

    public cmm(String string) {
        this.o = string;
        bcu.a.put(string, this);
    }

    @Override
    public String a() {
        return this.o;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public bmb c() {
        return bmb.a;
    }
}

