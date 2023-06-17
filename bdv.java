/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.List;

class bdv
implements Iterable {
    final /* synthetic */ Class a;
    final /* synthetic */ ka b;

    bdv(ka ka2, Class class_) {
        this.b = ka2;
        this.a = class_;
    }

    public Iterator iterator() {
        List list = (List)ka.a(this.b).get(this.b.b(this.a));
        if (list == null) {
            return nj.a();
        }
        Iterator iterator = list.iterator();
        return nj.b(iterator, this.a);
    }
}

