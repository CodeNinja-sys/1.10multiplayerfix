/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.cv;
import java.util.Comparator;

class kq
implements Comparator {
    private kq() {
    }

    public int a(bae bae2, bae bae3) {
        ef ef2 = bae2.i();
        ef ef3 = bae3.i();
        return cv.a().a(bae2.b() != bvh.e, bae3.b() != bvh.e).a((Comparable)((Object)(ef2 != null ? ef2.a() : "")), (Comparable)((Object)(ef3 != null ? ef3.a() : ""))).a((Comparable)((Object)bae2.a().b()), (Comparable)((Object)bae3.a().b())).b();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bae)object, (bae)object2);
    }

    /* synthetic */ kq(apz apz2) {
        this();
    }
}

