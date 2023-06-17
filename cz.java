/*
 * Decompiled with CFR 0.150.
 */
public class cz {
    private final short b;
    private final dbk c;
    final /* synthetic */ czi a;

    public cz(czi czi2, short s2, dbk dbk2) {
        this.a = czi2;
        this.b = s2;
        this.c = dbk2;
    }

    public cz(czi czi2, short s2, bhm bhm2) {
        this.a = czi2;
        this.b = s2;
        this.c = bhm2.c(this.a());
    }

    public cmz a() {
        return new cmz(czi.a(this.a).a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
    }

    public short b() {
        return this.b;
    }

    public dbk c() {
        return this.c;
    }
}

