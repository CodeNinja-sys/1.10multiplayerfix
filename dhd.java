/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class dhd
implements Comparator {
    final /* synthetic */ yf a;

    dhd(yf yf2) {
        this.a = yf2;
    }

    public int a(up up2, up up3) {
        return up2.toString().compareTo(up3.toString());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((up)object, (up)object2);
    }
}

