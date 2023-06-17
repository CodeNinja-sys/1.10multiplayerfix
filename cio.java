/*
 * Decompiled with CFR 0.150.
 */
class cio
implements awp {
    final /* synthetic */ bxy a;

    cio(bxy bxy2) {
        this.a = bxy2;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.a.u.l) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
            if (!this.a.u.m.contains(string)) continue;
            stringBuilder.append(" (incompatible)");
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

