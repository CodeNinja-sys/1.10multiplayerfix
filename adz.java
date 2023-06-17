/*
 * Decompiled with CFR 0.150.
 */
class adz
implements awp {
    final /* synthetic */ int a;
    final /* synthetic */ atx b;

    adz(atx atx2, int n2) {
        this.b = atx2;
        this.a = n2;
    }

    public String a() {
        if (this.a == 0) {
            return "MISC_TEXTURE";
        }
        if (this.a == 1) {
            return "TERRAIN_TEXTURE";
        }
        if (this.a == 3) {
            return "ENTITY_PARTICLE_TEXTURE";
        }
        return "Unknown - " + this.a;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

