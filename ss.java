/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.d.mq;
import java.util.Collection;
import java.util.Iterator;

public abstract class ss
implements dbk {
    private static final bx a = bx.a(',');
    private static final bl b = new am();

    @Override
    public dbk a(bvs bvs2) {
        return this.a(bvs2, (Comparable)ss.a(bvs2.a(), this.b(bvs2)));
    }

    protected static Object a(Collection collection, Object object) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(object)) continue;
            if (iterator.hasNext()) {
                return iterator.next();
            }
            return collection.iterator().next();
        }
        return iterator.next();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bfa.v.b(this.t()));
        if (!this.s().isEmpty()) {
            stringBuilder.append("[");
            a.a(stringBuilder, mq.a((Iterable)this.s().e(), b));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

