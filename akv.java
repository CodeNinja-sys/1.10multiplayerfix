/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

final class akv
implements Iterable {
    final /* synthetic */ cmz a;
    final /* synthetic */ cmz b;

    akv(cmz cmz2, cmz cmz3) {
        this.a = cmz2;
        this.b = cmz3;
    }

    public Iterator iterator() {
        return new bmn(this);
    }
}

