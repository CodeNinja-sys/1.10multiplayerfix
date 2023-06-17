/*
 * Decompiled with CFR 0.150.
 */
public class ak
extends cpy {
    public static final bpx a = new bpx("textures/entity/projectiles/arrow.png");
    public static final bpx b = new bpx("textures/entity/projectiles/tipped_arrow.png");

    public ak(bid bid2) {
        super(bid2);
    }

    protected bpx a(bib bib2) {
        return bib2.n() > 0 ? b : a;
    }
}

