/*
 * Decompiled with CFR 0.150.
 */
class zt
implements awp {
    final /* synthetic */ cvn a;

    zt(cvn cvn2) {
        this.a = cvn2;
    }

    public String a() {
        String string = "Unknown?";
        try {
            switch (cvn.j(this.a)) {
                case 19133: {
                    string = "Anvil";
                    break;
                }
                case 19132: {
                    string = "McRegion";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format("0x%05X - %s", cvn.j(this.a), string);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

