/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class awe
implements Comparator {
    final /* synthetic */ gx a;

    awe(gx gx2) {
        this.a = gx2;
    }

    public int a(aho aho2, aho aho3) {
        if (aho2 instanceof boc && aho3 instanceof dbj) {
            return 1;
        }
        if (aho3 instanceof boc && aho2 instanceof dbj) {
            return -1;
        }
        if (aho3.a() < aho2.a()) {
            return -1;
        }
        if (aho3.a() > aho2.a()) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aho)object, (aho)object2);
    }
}

