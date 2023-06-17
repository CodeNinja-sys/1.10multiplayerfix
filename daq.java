/*
 * Decompiled with CFR 0.150.
 */
public class daq
implements ds {
    private cpl a;

    public daq() {
    }

    public daq(cpl cpl2) {
        this.a = cpl2;
    }

    @Override
    public void a(si si2) {
        this.a = (cpl)si2.a(cpl.class);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cpl a() {
        return this.a;
    }
}

