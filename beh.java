/*
 * Decompiled with CFR 0.150.
 */
class beh
implements awp {
    final /* synthetic */ int[][] a;
    final /* synthetic */ ars b;

    beh(ars ars2, int[][] arrn) {
        this.b = ars2;
        this.a = arrn;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] arrn : this.a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arrn == null ? "null" : Integer.valueOf(arrn.length));
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

