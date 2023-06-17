/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

final class ow
implements Comparator {
    ow() {
    }

    public int a(czu czu2, czu czu3) {
        if (czu2.b() > czu3.b()) {
            return 1;
        }
        if (czu2.b() < czu3.b()) {
            return -1;
        }
        return czu3.d().compareToIgnoreCase(czu2.d());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((czu)object, (czu)object2);
    }
}

