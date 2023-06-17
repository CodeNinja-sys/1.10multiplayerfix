/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.mq;
import com.a.a.d.ov;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class atc {
    public static Iterable a(Class class_, Iterable iterable) {
        return new bwd(class_, (Iterable[])atc.b(Iterable.class, iterable), null);
    }

    public static Iterable a(Iterable iterable) {
        return atc.b(atc.a(Object.class, iterable));
    }

    private static Iterable b(Iterable iterable) {
        return mq.a(iterable, new te(null));
    }

    private static Object[] b(Class class_, Iterable iterable) {
        ArrayList arrayList = ov.a();
        for (Object t2 : iterable) {
            arrayList.add(t2);
        }
        return arrayList.toArray(atc.b(class_, arrayList.size()));
    }

    private static Object[] b(Class class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    static /* synthetic */ Object[] a(Class class_, int n2) {
        return atc.b(class_, n2);
    }
}

