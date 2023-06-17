/*
 * Decompiled with CFR 0.150.
 */
public class ccc
implements bcu {
    private final String o;

    public ccc(String string, aug aug2) {
        this.o = string + aug2.d();
        bcu.a.put(this.o, this);
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

