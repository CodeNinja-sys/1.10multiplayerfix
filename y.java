/*
 * Decompiled with CFR 0.150.
 */
class y
implements nf {
    final /* synthetic */ bxy a;

    y(bxy bxy2) {
        this.a = bxy2;
    }

    @Override
    public String a(String string) {
        try {
            return String.format(string, cmx.a(this.a.u.Z.j()));
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}

